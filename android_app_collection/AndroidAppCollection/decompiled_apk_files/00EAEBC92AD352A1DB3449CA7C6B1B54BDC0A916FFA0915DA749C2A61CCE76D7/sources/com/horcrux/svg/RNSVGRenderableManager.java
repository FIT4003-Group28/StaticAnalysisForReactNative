package com.horcrux.svg;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.graphics.Region;
import com.BV.LinearGradient.LinearGradientManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
/* loaded from: classes.dex */
class RNSVGRenderableManager extends ReactContextBaseJavaModule {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int EOF = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RNSVGRenderableManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getBBox(int i, ReadableMap readableMap) {
        RenderableView renderableViewByTag = RenderableViewManager.getRenderableViewByTag(i);
        if (renderableViewByTag == null) {
            return Arguments.createMap();
        }
        boolean z = readableMap.getBoolean("fill");
        boolean z2 = readableMap.getBoolean("stroke");
        boolean z3 = readableMap.getBoolean("markers");
        boolean z4 = readableMap.getBoolean("clipped");
        try {
            renderableViewByTag.getPath(null, null);
            float f2 = renderableViewByTag.mScale;
            renderableViewByTag.initBounds();
            RectF rectF = new RectF();
            RectF rectF2 = renderableViewByTag.mFillBounds;
            RectF rectF3 = renderableViewByTag.mStrokeBounds;
            RectF rectF4 = renderableViewByTag.mMarkerBounds;
            RectF rectF5 = renderableViewByTag.mClipBounds;
            if (z && rectF2 != null) {
                rectF.union(rectF2);
            }
            if (z2 && rectF3 != null) {
                rectF.union(rectF3);
            }
            if (z3 && rectF4 != null) {
                rectF.union(rectF4);
            }
            if (z4 && rectF5 != null) {
                rectF.intersect(rectF5);
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("x", rectF.left / f2);
            createMap.putDouble("y", rectF.top / f2);
            createMap.putDouble("width", rectF.width() / f2);
            createMap.putDouble("height", rectF.height() / f2);
            return createMap;
        } catch (NullPointerException unused) {
            renderableViewByTag.invalidate();
            return Arguments.createMap();
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getCTM(int i) {
        RenderableView renderableViewByTag = RenderableViewManager.getRenderableViewByTag(i);
        if (renderableViewByTag == null) {
            return Arguments.createMap();
        }
        float f2 = renderableViewByTag.mScale;
        Matrix matrix = new Matrix(renderableViewByTag.mCTM);
        matrix.preConcat(renderableViewByTag.getSvgView().mInvViewBoxMatrix);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("a", fArr[0]);
        createMap.putDouble("b", fArr[3]);
        createMap.putDouble("c", fArr[1]);
        createMap.putDouble("d", fArr[4]);
        createMap.putDouble("e", fArr[2] / f2);
        createMap.putDouble("f", fArr[5] / f2);
        return createMap;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSVGRenderableManager";
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getPointAtLength(int i, ReadableMap readableMap) {
        RenderableView renderableViewByTag = RenderableViewManager.getRenderableViewByTag(i);
        if (renderableViewByTag == null) {
            return Arguments.createMap();
        }
        try {
            PathMeasure pathMeasure = new PathMeasure(renderableViewByTag.getPath(null, null), false);
            float f2 = (float) readableMap.getDouble("length");
            float f3 = renderableViewByTag.mScale;
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            pathMeasure.getPosTan(Math.max(0.0f, Math.min(f2, pathMeasure.getLength())), fArr, fArr2);
            double atan2 = Math.atan2(fArr2[1], fArr2[0]);
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("x", fArr[0] / f3);
            createMap.putDouble("y", fArr[1] / f3);
            createMap.putDouble(LinearGradientManager.PROP_ANGLE, atan2);
            return createMap;
        } catch (NullPointerException unused) {
            renderableViewByTag.invalidate();
            return Arguments.createMap();
        }
    }

    @ReactMethod
    public void getRawResource(String str, Promise promise) {
        try {
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Resources resources = reactApplicationContext.getResources();
            InputStream openRawResource = resources.openRawResource(resources.getIdentifier(str, "raw", reactApplicationContext.getPackageName()));
            InputStreamReader inputStreamReader = new InputStreamReader(openRawResource, com.facebook.react.common.h.f5457a);
            char[] cArr = new char[DEFAULT_BUFFER_SIZE];
            StringBuilder sb = new StringBuilder();
            while (true) {
                int read = inputStreamReader.read(cArr, 0, DEFAULT_BUFFER_SIZE);
                if (read == -1) {
                    promise.resolve(sb.toString());
                    try {
                        openRawResource.close();
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
                sb.append(cArr, 0, read);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            promise.reject(e2);
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getScreenCTM(int i) {
        RenderableView renderableViewByTag = RenderableViewManager.getRenderableViewByTag(i);
        if (renderableViewByTag == null) {
            return Arguments.createMap();
        }
        float[] fArr = new float[9];
        renderableViewByTag.mCTM.getValues(fArr);
        float f2 = renderableViewByTag.mScale;
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("a", fArr[0]);
        createMap.putDouble("b", fArr[3]);
        createMap.putDouble("c", fArr[1]);
        createMap.putDouble("d", fArr[4]);
        createMap.putDouble("e", fArr[2] / f2);
        createMap.putDouble("f", fArr[5] / f2);
        return createMap;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public float getTotalLength(int i) {
        RenderableView renderableViewByTag = RenderableViewManager.getRenderableViewByTag(i);
        if (renderableViewByTag == null) {
            return 0.0f;
        }
        try {
            return new PathMeasure(renderableViewByTag.getPath(null, null), false).getLength() / renderableViewByTag.mScale;
        } catch (NullPointerException unused) {
            renderableViewByTag.invalidate();
            return -1.0f;
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isPointInFill(int i, ReadableMap readableMap) {
        RenderableView renderableViewByTag = RenderableViewManager.getRenderableViewByTag(i);
        if (renderableViewByTag == null) {
            return false;
        }
        float f2 = renderableViewByTag.mScale;
        return renderableViewByTag.hitTest(new float[]{((float) readableMap.getDouble("x")) * f2, ((float) readableMap.getDouble("y")) * f2}) != -1;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isPointInStroke(int i, ReadableMap readableMap) {
        RenderableView renderableViewByTag = RenderableViewManager.getRenderableViewByTag(i);
        if (renderableViewByTag == null) {
            return false;
        }
        try {
            renderableViewByTag.getPath(null, null);
            renderableViewByTag.initBounds();
            double d2 = renderableViewByTag.mScale;
            int i2 = (int) (readableMap.getDouble("x") * d2);
            int i3 = (int) (readableMap.getDouble("y") * d2);
            Region region = renderableViewByTag.mStrokeRegion;
            return region != null && region.contains(i2, i3);
        } catch (NullPointerException unused) {
            renderableViewByTag.invalidate();
            return false;
        }
    }
}
