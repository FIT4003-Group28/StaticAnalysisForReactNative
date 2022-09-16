package defpackage;
/* compiled from: PG */
/* renamed from: jfv  reason: default package */
/* loaded from: classes.dex */
public final class jfv {
    public static ckqc a(String str) {
        if (dsna.e(str)) {
            return d();
        }
        return ckqc.FULLY_QUALIFIED;
    }

    public static final ckqc c(int i) {
        if (i != 1) {
            if (i != 2) {
                return ckqc.FIFE;
            }
            return ckqc.FIFE_REPLACEMENT;
        }
        return ckqc.FULLY_QUALIFIED;
    }

    private static ckqc d() {
        ((bvjq) btsr.a(bvjq.class)).rB();
        btvo rp = ((btvq) btsr.a(btvq.class)).rp();
        int a = duuo.a(rp.getImageQualityParameters().b);
        if (a == 0) {
            a = 2;
        }
        if (!rp.getImageQualityParameters().a) {
            return ckqc.FIFE;
        }
        int i = a - 1;
        if (i == 1) {
            return ckqc.FIFE;
        }
        if (i == 2) {
            return ckqc.FIFE_GOOD_QUALITY;
        }
        if (i == 3) {
            return ckqc.FIFE_LOWER_QUALITY;
        }
        if (i == 4) {
            return ckqc.FIFE_LOW_QUALITY;
        }
        return ckqc.FIFE;
    }

    public static ckqc b(dwfl dwflVar) {
        int a = dwfk.a(dwflVar.i);
        if (a == 0 || a != 2) {
            return a(dwflVar.h);
        }
        return d();
    }
}
