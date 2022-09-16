package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: aakr  reason: default package */
/* loaded from: classes.dex */
public final class aakr {
    public static aoqu a(aslo asloVar) {
        if (asloVar == null) {
            return null;
        }
        int i = asloVar.b;
        if ((i & 1) != 0) {
            asln aslnVar = asloVar.c;
            return aslnVar == null ? asln.a : aslnVar;
        } else if ((i & 2) != 0) {
            aslp aslpVar = asloVar.d;
            return aslpVar == null ? aslp.a : aslpVar;
        } else if ((i & 4) != 0) {
            aqbx aqbxVar = asloVar.e;
            return aqbxVar == null ? aqbx.a : aqbxVar;
        } else if ((i & 8) != 0) {
            aslv aslvVar = asloVar.f;
            return aslvVar == null ? aslv.a : aslvVar;
        } else if ((i & 16) != 0) {
            aslu asluVar = asloVar.g;
            return asluVar == null ? aslu.a : asluVar;
        } else if ((i & 32) != 0) {
            auxp auxpVar = asloVar.h;
            return auxpVar == null ? auxp.a : auxpVar;
        } else if ((i & 64) != 0) {
            aqtb aqtbVar = asloVar.i;
            return aqtbVar == null ? aqtb.a : aqtbVar;
        } else if ((i & 128) != 0) {
            aumr aumrVar = asloVar.j;
            return aumrVar == null ? aumr.a : aumrVar;
        } else if ((i & 256) == 0) {
            return null;
        } else {
            apvj apvjVar = asloVar.k;
            return apvjVar == null ? apvj.a : apvjVar;
        }
    }

    public static aoqu b(apql apqlVar) {
        if (apqlVar == null) {
            return null;
        }
        int i = apqlVar.b;
        if (i == 144881215) {
            return (aqlb) apqlVar.c;
        }
        if (i != 86135402) {
            return null;
        }
        return (asku) apqlVar.c;
    }

    public static Bitmap c(Context context, View view) {
        float f;
        int i;
        aqxo.y(view.getParent() == null);
        Configuration configuration = context.getResources().getConfiguration();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutDirection(configuration.getLayoutDirection());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(view);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        frameLayout.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredWidth = frameLayout.getMeasuredWidth();
        int measuredHeight = frameLayout.getMeasuredHeight();
        float f2 = measuredWidth;
        float f3 = measuredHeight;
        float f4 = f2 / f3;
        int i2 = 2048;
        if (measuredWidth <= 2048 && measuredHeight <= 2048) {
            i2 = measuredHeight;
            i = measuredWidth;
            f = 1.0f;
        } else if (measuredWidth >= measuredHeight) {
            f = 2048.0f / f2;
            i2 = (int) (2048.0f / f4);
            i = 2048;
        } else {
            f = 2048.0f / f3;
            i = (int) (f4 * 2048.0f);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(frameLayout.getMeasuredWidth(), frameLayout.getMeasuredHeight());
        layoutParams2.gravity = 17;
        view.setLayoutParams(layoutParams2);
        view.setScaleX(f);
        view.setScaleY(f);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(i, i2));
        frameLayout.measure(0, 0);
        frameLayout.layout(0, 0, i, i2);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        frameLayout.draw(new Canvas(createBitmap));
        frameLayout.removeView(view);
        view.setLayoutParams(layoutParams);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        return createBitmap;
    }

    public static final znh d(Context context) {
        return new znh(context, 1, zny.d, zny.h, new zgi());
    }

    public static final void e(Context context, Bitmap bitmap, zov zovVar) {
        int ceil;
        int height = bitmap.getHeight() + 2;
        double width = bitmap.getWidth() + 2;
        Double.isNaN(width);
        Bitmap createBitmap = Bitmap.createBitmap(((int) Math.ceil(width / 4.0d)) * 4, height, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, (ceil - bitmap.getWidth()) / 2, (height - bitmap.getHeight()) / 2, new Paint(2));
        new zox(d(context.getApplicationContext()), zovVar).execute(createBitmap);
    }
}
