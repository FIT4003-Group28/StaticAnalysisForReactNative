package defpackage;

import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: ckqj  reason: default package */
/* loaded from: classes.dex */
public final class ckqj extends dsna<String> {
    private static final dcqe a = dcqe.c("ckqj");

    public static String a(dsnh dsnhVar, String str) {
        if (dbsj.d(str)) {
            return str;
        }
        try {
            return new ckqj().m(dsnhVar, new ckqi(str));
        } catch (dsmx e) {
            bvoo.h("InvalidUrlException: %s, %s", str, e);
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x015e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0161 A[LOOP:2: B:39:0x00a6->B:88:0x0161, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.dsnh b(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckqj.b(java.lang.String):dsnh");
    }

    public static dsnh c(int i, int i2, int i3, @dzsi ImageView.ScaleType scaleType) {
        dsnh dsnhVar = new dsnh();
        d(dsnhVar, i, i2, i3, scaleType);
        return dsnhVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(dsnh dsnhVar, int i, int i2, int i3, @dzsi ImageView.ScaleType scaleType) {
        dsnhVar.l(i);
        dsnhVar.f(i2);
        if (i3 >= 0) {
            dsnhVar.a.d(dsne.QUALITY_BUCKET, Integer.valueOf(i3));
            dsnhVar.a.c(dsne.QUALITY_BUCKET);
        }
        if (scaleType != null) {
            int i4 = ckqh.a[scaleType.ordinal()];
            if (i4 == 1 || i4 == 2) {
                dsnhVar.d();
            } else if (i4 != 3) {
            } else {
                dsnhVar.k();
            }
        }
    }
}
