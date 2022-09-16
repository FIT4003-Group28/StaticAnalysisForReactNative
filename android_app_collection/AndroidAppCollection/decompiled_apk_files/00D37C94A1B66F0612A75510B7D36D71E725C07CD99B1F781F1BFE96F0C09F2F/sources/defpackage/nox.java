package defpackage;

import j$.util.Optional;
/* compiled from: PG */
/* renamed from: nox  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class nox implements ayqe {
    private final /* synthetic */ int v;
    public static final /* synthetic */ nox u = new nox(20);
    public static final /* synthetic */ nox t = new nox(19);
    public static final /* synthetic */ nox s = new nox(18);
    public static final /* synthetic */ nox r = new nox(17);
    public static final /* synthetic */ nox q = new nox(16);
    public static final /* synthetic */ nox p = new nox(15);
    public static final /* synthetic */ nox o = new nox(14);
    public static final /* synthetic */ nox n = new nox(13);
    public static final /* synthetic */ nox m = new nox(12);
    public static final /* synthetic */ nox l = new nox(11);
    public static final /* synthetic */ nox k = new nox(10);
    public static final /* synthetic */ nox j = new nox(9);
    public static final /* synthetic */ nox i = new nox(8);
    public static final /* synthetic */ nox h = new nox(7);
    public static final /* synthetic */ nox g = new nox(6);
    public static final /* synthetic */ nox f = new nox(5);
    public static final /* synthetic */ nox e = new nox(4);
    public static final /* synthetic */ nox d = new nox(3);
    public static final /* synthetic */ nox c = new nox(2);
    public static final /* synthetic */ nox b = new nox(1);
    public static final /* synthetic */ nox a = new nox();

    private /* synthetic */ nox() {
    }

    private /* synthetic */ nox(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        boolean z = true;
        int i2 = 0;
        switch (this.v) {
            case 0:
                return ((aajp) obj).c;
            case 1:
                ezx ezxVar = (ezx) obj;
                if (ezxVar == ezx.WATCH_WHILE_PICTURE_IN_PICTURE || ezxVar == ezx.VIRTUAL_REALITY_FULLSCREEN) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                return Optional.of((ampr) obj);
            case 3:
                return ((nte) obj).t();
            case 4:
                return ((nte) obj).w();
            case 5:
                return Boolean.valueOf(((ampq) obj).h());
            case 6:
                return (aynx) obj;
            case 7:
                return ampq.j((Integer) obj);
            case 8:
                return (nmc) ((ampq) obj).c();
            case 9:
                if (((nsr) obj) == nsr.HIDDEN) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 10:
                return nst.a((nsr) obj);
            case 11:
                return ((nsu) obj).b;
            case 12:
                return ((nte) obj).v();
            case 13:
                return (nst) ((ampq) obj).c();
            case 14:
                return (nte) ((ampq) obj).c();
            case 15:
                return Boolean.valueOf(((ampq) obj).h());
            case 16:
                return Boolean.valueOf(((nmc) obj).t());
            case 17:
                return (nmc) ((ampq) obj).c();
            case 18:
                return ((nmc) ((ampq) obj).c()).k();
            case 19:
                zbb zbbVar = (zbb) obj;
                if (zbbVar instanceof zbe) {
                    i2 = ((zbe) zbbVar).a;
                }
                return Integer.valueOf(i2);
            default:
                return ((zaw) obj).a.a;
        }
    }
}
