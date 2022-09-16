package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: hqb  reason: default package */
/* loaded from: classes3.dex */
public final class hqb {
    public static Bitmap a(Bitmap bitmap) {
        if (bitmap == null) {
            bitmap = null;
        } else {
            double width = bitmap.getWidth();
            double height = bitmap.getHeight();
            Double.isNaN(width);
            Double.isNaN(height);
            double d = width / height;
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            if (Math.abs((-0.5625d) + d) >= 0.001d) {
                if (d > 0.5625d) {
                    double d2 = height2;
                    Double.isNaN(d2);
                    int max = Math.max((int) Math.round(d2 * 0.5625d), 2);
                    bitmap = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - max) / 2, 0, max, height2);
                } else {
                    double d3 = width2;
                    Double.isNaN(d3);
                    int max2 = Math.max((int) Math.round(d3 / 0.5625d), 2);
                    bitmap = Bitmap.createBitmap(bitmap, 0, (bitmap.getHeight() - max2) / 2, width2, max2);
                }
            }
        }
        return (bitmap.getHeight() <= 1280 || bitmap.getWidth() <= 720) ? bitmap : Bitmap.createScaledBitmap(bitmap, 720, 1280, true);
    }

    public static AnimatorSet b(hpx hpxVar, boolean z, AnimatorSet animatorSet) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(hpxVar);
        return c(arrayList, z, animatorSet, 250L);
    }

    public static AnimatorSet c(List list, boolean z, AnimatorSet animatorSet, long j) {
        aqxo.q(true, "Animation duration must be at least 0.");
        if (animatorSet != null && (animatorSet.isStarted() || animatorSet.isRunning())) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hpx hpxVar = (hpx) it.next();
            View a = hpxVar.a();
            Property property = View.ALPHA;
            float[] fArr = new float[1];
            fArr[0] = true != z ? 0.0f : 1.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(a, property, fArr);
            ofFloat.setDuration(j);
            ofFloat.addListener(new hpw(a, hpxVar, z));
            arrayList.add(ofFloat);
        }
        animatorSet2.playTogether(arrayList);
        animatorSet2.start();
        return animatorSet2;
    }

    public static void d(hpy hpyVar) {
        ArrayList<hpy> arrayList = new ArrayList();
        arrayList.add(hpyVar);
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        for (hpy hpyVar2 : arrayList) {
            View c = hpyVar2.c();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c, View.TRANSLATION_Y, hpyVar2.b(), hpyVar2.a());
            ofFloat.setDuration(250L);
            ofFloat.addListener(new hpv(c, hpyVar2));
            arrayList2.add(ofFloat);
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.start();
    }

    public static void e(String str, Context context, zqw zqwVar) {
        zqv q = zqwVar.q();
        if (q == null) {
            return;
        }
        File file = new File(new File(context.getCacheDir(), "reel_effects"), str);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                zep.b(e.getMessage());
            }
        }
        q.g(file.getPath());
    }

    public static fgd g(aizf aizfVar) {
        return new ffy(aizfVar);
    }

    public static fgd h(aizf aizfVar) {
        return new fga(aizfVar);
    }

    public static fgd i(aizf aizfVar) {
        return new ffw(aizfVar);
    }

    public static fgd j(aizf aizfVar) {
        return new ffx(aizfVar);
    }

    public static int k(long j, long j2, int i, int i2) {
        return i + ((int) (i2 * (((float) zgd.O(j, 0L, j2)) / ((float) j2))));
    }

    public static void l(Canvas canvas, Rect rect, Paint paint, Paint paint2, List list, amxt amxtVar, int i) {
        amzr c = amzr.c();
        c.a(amxt.d(Integer.valueOf(rect.left), Integer.valueOf(rect.right)));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c.b((amxt) it.next());
        }
        for (amxt amxtVar2 : c.d()) {
            if (amxtVar == null || !amxtVar.j(amxtVar2)) {
                canvas.drawRect(((Integer) amxtVar2.g()).intValue(), rect.top, ((Integer) amxtVar2.h()).intValue(), rect.bottom, paint);
            } else {
                float f = i / 2.0f;
                canvas.drawRect(((Integer) amxtVar2.g()).intValue(), rect.top - f, ((Integer) amxtVar2.h()).intValue(), rect.bottom + f, paint2);
            }
        }
    }

    @Deprecated
    public static void m(ezg ezgVar, ezx ezxVar) {
        ezgVar.pa(ezxVar);
    }

    public static Object f(dp dpVar, Class cls) {
        if (dpVar == null) {
            throw new IllegalStateException(String.format("Could not find %s from a parent fragment.", cls.getCanonicalName()));
        }
        if (!cls.isInstance(dpVar)) {
            return f(dpVar.C, cls);
        }
        return cls.cast(dpVar);
    }
}
