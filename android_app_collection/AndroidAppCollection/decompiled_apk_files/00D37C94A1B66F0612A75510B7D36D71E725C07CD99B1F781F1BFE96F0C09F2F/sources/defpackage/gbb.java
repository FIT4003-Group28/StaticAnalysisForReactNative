package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: gbb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gbb implements Callable {
    private final /* synthetic */ int v;
    public static final /* synthetic */ gbb u = new gbb(20);
    public static final /* synthetic */ gbb t = new gbb(19);
    public static final /* synthetic */ gbb s = new gbb(18);
    public static final /* synthetic */ gbb r = new gbb(17);
    public static final /* synthetic */ gbb q = new gbb(16);
    public static final /* synthetic */ gbb p = new gbb(15);
    public static final /* synthetic */ gbb o = new gbb(14);
    public static final /* synthetic */ gbb n = new gbb(13);
    public static final /* synthetic */ gbb m = new gbb(12);
    public static final /* synthetic */ gbb l = new gbb(11);
    public static final /* synthetic */ gbb k = new gbb(10);
    public static final /* synthetic */ gbb j = new gbb(9);
    public static final /* synthetic */ gbb i = new gbb(8);
    public static final /* synthetic */ gbb h = new gbb(7);
    public static final /* synthetic */ gbb g = new gbb(6);
    public static final /* synthetic */ gbb f = new gbb(5);
    public static final /* synthetic */ gbb e = new gbb(4);
    public static final /* synthetic */ gbb d = new gbb(3);
    public static final /* synthetic */ gbb c = new gbb(2);
    public static final /* synthetic */ gbb b = new gbb(1);
    public static final /* synthetic */ gbb a = new gbb();

    private /* synthetic */ gbb() {
    }

    private /* synthetic */ gbb(int i2) {
        this.v = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i2 = this.v;
        if (i2 == 0) {
            ftd a2 = fte.a();
            a2.c(ftf.ACTIVITY_DEFAULT);
            a2.d(ftg.ACTIVITY_DEFAULT);
            return a2.a();
        } else if (i2 == 1) {
            return new dqi();
        } else {
            if (i2 == 2) {
                ftd a3 = fte.a();
                a3.b(false);
                a3.c(ftf.ACTIVITY_DEFAULT);
                return a3.a();
            } else if (i2 == 8) {
                return true;
            } else {
                if (i2 == 12) {
                    boolean z = tvs.a;
                    return null;
                } else if (i2 == 19) {
                    return awvm.ACTION_TYPE_RETRY;
                } else {
                    switch (i2) {
                        case 15:
                            return amuk.f();
                        case 16:
                            return amvn.i();
                        case 17:
                            return new IllegalArgumentException("Can't get InnerTube response flowable for a media-only request.");
                        default:
                            return null;
                    }
                }
            }
        }
    }
}
