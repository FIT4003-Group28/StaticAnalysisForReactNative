package com.teslamotors.plugins.viewsnapshotter;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Environment;
import android.os.Handler;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.baidu.mapapi.map.BaiduMap;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.af;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.al;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class ViewSnapshotterModule extends ReactContextBaseJavaModule {
    private static final Bitmap.CompressFormat COMPRESS_FORMAT = Bitmap.CompressFormat.WEBP;
    private static final String REACT_CLASS = "TMViewSnapshotter";
    private static final String RESULT = "result";
    private static final String TAG = "ViewSnapshotterModule";
    private static final String VALUE = "value";
    private static Float scale;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    public ViewSnapshotterModule(ah ahVar) {
        super(ahVar);
    }

    @al
    public void generateBase64EncodedViewSnapshot(final int i, final int i2, final int i3, final af afVar) {
        new Handler(getReactApplicationContext().getMainLooper()).post(new Runnable() { // from class: com.teslamotors.plugins.viewsnapshotter.ViewSnapshotterModule.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    View findViewById = ViewSnapshotterModule.this.getCurrentActivity().getWindow().getDecorView().findViewById(i);
                    Bitmap viewBitmap = ViewSnapshotterModule.this.getViewBitmap(findViewById, i2);
                    View mapView = ViewSnapshotterModule.this.getMapView(findViewById);
                    if (mapView == null) {
                        ViewSnapshotterModule.invokeResolve(ViewSnapshotterModule.this.bitmapToString(viewBitmap, i3), afVar);
                    } else if (mapView instanceof MapView) {
                        ViewSnapshotterModule.this.getGoogleScreenshot(mapView, findViewById, i2, i3, afVar);
                    } else if (mapView instanceof com.baidu.mapapi.map.MapView) {
                        ViewSnapshotterModule.this.getBaiduScreenshot(mapView, viewBitmap, i3, afVar);
                    }
                } catch (Exception e) {
                    Log.e(ViewSnapshotterModule.TAG, "Failed to dump image:", e);
                    ViewSnapshotterModule.invokeResolve("", afVar);
                }
            }
        });
    }

    static void invokeResolve(String str, af afVar) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putBoolean("result", str != null);
        if (str != null) {
            writableNativeMap.putString(VALUE, str);
        } else {
            writableNativeMap.putNull(VALUE);
        }
        afVar.a(writableNativeMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View getMapView(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        while (!arrayList.isEmpty()) {
            View view2 = (View) arrayList.remove(0);
            if ((view2 instanceof MapView) || (view2 instanceof com.baidu.mapapi.map.MapView)) {
                return view2;
            }
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    arrayList.add(viewGroup.getChildAt(i));
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getGoogleScreenshot(View view, final View view2, final float f, final int i, final af afVar) {
        if (view instanceof MapView) {
            ((MapView) view).getMapAsync(new OnMapReadyCallback() { // from class: com.teslamotors.plugins.viewsnapshotter.ViewSnapshotterModule.2
                @Override // com.google.android.gms.maps.OnMapReadyCallback
                public void onMapReady(GoogleMap googleMap) {
                    googleMap.snapshot(new GoogleMap.SnapshotReadyCallback() { // from class: com.teslamotors.plugins.viewsnapshotter.ViewSnapshotterModule.2.1
                        @Override // com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback
                        public void onSnapshotReady(Bitmap bitmap) {
                            Bitmap bitmap2;
                            try {
                                bitmap2 = ViewSnapshotterModule.this.getViewBitmap(view2, f);
                            } catch (IOException e) {
                                Log.e(ViewSnapshotterModule.TAG, "Error creating screenshot overlay", e);
                                bitmap2 = null;
                            }
                            ViewSnapshotterModule.this.createOverlay(bitmap, bitmap2, i, afVar);
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getBaiduScreenshot(View view, final Bitmap bitmap, final int i, final af afVar) {
        if (view instanceof com.baidu.mapapi.map.MapView) {
            ((com.baidu.mapapi.map.MapView) view).getMap().snapshot(new BaiduMap.SnapshotReadyCallback() { // from class: com.teslamotors.plugins.viewsnapshotter.ViewSnapshotterModule.3
                @Override // com.baidu.mapapi.map.BaiduMap.SnapshotReadyCallback
                public void onSnapshotReady(Bitmap bitmap2) {
                    ViewSnapshotterModule.this.createOverlay(bitmap2, bitmap, i, afVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createOverlay(Bitmap bitmap, Bitmap bitmap2, int i, af afVar) {
        try {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap2.getWidth(), bitmap2.getHeight(), true);
            new Canvas(createScaledBitmap).drawBitmap(bitmap2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new Paint(2));
            invokeResolve(bitmapToString(createScaledBitmap, i), afVar);
            bitmap2.recycle();
            bitmap.recycle();
        } catch (Exception e) {
            Log.e(TAG, "failed to write bitmap", e);
            invokeResolve("", afVar);
        }
    }

    private void writeToDisk(Bitmap bitmap, int i) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(Environment.getExternalStorageDirectory().toString(), "map.jpg"));
            bitmap.compress(COMPRESS_FORMAT, i, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e) {
            Log.e(TAG, "Failed to write bitmap", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap getViewBitmap(View view, float f) {
        scale = Float.valueOf(f / view.getHeight());
        view.setDrawingCacheEnabled(true);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(view.getDrawingCache(), Math.round(view.getWidth() * scale.floatValue()), Math.round(view.getHeight() * scale.floatValue()), false);
        view.setDrawingCacheEnabled(false);
        view.invalidate();
        return createScaledBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String bitmapToString(Bitmap bitmap, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(COMPRESS_FORMAT, i, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        bitmap.recycle();
        return Base64.encodeToString(byteArray, 2);
    }
}
