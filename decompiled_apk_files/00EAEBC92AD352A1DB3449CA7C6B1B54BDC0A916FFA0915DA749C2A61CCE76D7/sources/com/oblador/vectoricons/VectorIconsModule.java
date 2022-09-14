package com.oblador.vectoricons;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.views.text.i;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class VectorIconsModule extends ReactContextBaseJavaModule {
    public static final String REACT_CLASS = "RNVectorIconsModule";
    private static final Map<String, Typeface> sTypefaceCache = new HashMap();

    public VectorIconsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void getImageForFont(String str, String str2, Integer num, Integer num2, Callback callback) {
        FileOutputStream fileOutputStream;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        File cacheDir = reactApplicationContext.getCacheDir();
        String str3 = cacheDir.getAbsolutePath() + "/";
        float f2 = reactApplicationContext.getResources().getDisplayMetrics().density;
        StringBuilder sb = new StringBuilder();
        sb.append("@");
        int i = (int) f2;
        sb.append(f2 == ((float) i) ? Integer.toString(i) : Float.toString(f2));
        sb.append("x");
        String sb2 = sb.toString();
        int round = Math.round(num.intValue() * f2);
        String str4 = str3 + Integer.toString((str + ":" + str2 + ":" + num2).hashCode(), 32) + "_" + Integer.toString(num.intValue()) + sb2 + ".png";
        String str5 = "file://" + str4;
        File file = new File(str4);
        FileOutputStream fileOutputStream2 = null;
        if (file.exists()) {
            callback.invoke(null, str5);
            return;
        }
        Typeface a2 = i.a().a(str, 0, reactApplicationContext.getAssets());
        Paint paint = new Paint();
        paint.setTypeface(a2);
        paint.setColor(num2.intValue());
        paint.setTextSize(round);
        paint.setAntiAlias(true);
        paint.getTextBounds(str2, 0, str2.length(), new Rect());
        int i2 = round - ((int) paint.getFontMetrics().bottom);
        Bitmap createBitmap = Bitmap.createBitmap(round, round, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawText(str2, 0, i2, paint);
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            } catch (FileNotFoundException e3) {
                e = e3;
            } catch (IOException e4) {
                e = e4;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            createBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            callback.invoke(null, str5);
        } catch (FileNotFoundException e5) {
            fileOutputStream2 = fileOutputStream;
            e = e5;
            callback.invoke(e.getMessage());
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
        } catch (IOException e6) {
            fileOutputStream2 = fileOutputStream;
            e = e6;
            callback.invoke(e.getMessage());
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
        } catch (Throwable th2) {
            fileOutputStream2 = fileOutputStream;
            th = th2;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e7) {
                    e7.printStackTrace();
                }
            }
            throw th;
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }
}
