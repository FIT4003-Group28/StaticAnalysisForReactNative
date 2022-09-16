package defpackage;

import android.view.View;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: inl  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class inl implements ayqe {
    private final /* synthetic */ int v;
    public static final /* synthetic */ inl u = new inl(20);
    public static final /* synthetic */ inl t = new inl(19);
    public static final /* synthetic */ inl s = new inl(18);
    public static final /* synthetic */ inl r = new inl(17);
    public static final /* synthetic */ inl q = new inl(16);
    public static final /* synthetic */ inl p = new inl(15);
    public static final /* synthetic */ inl o = new inl(14);
    public static final /* synthetic */ inl n = new inl(13);
    public static final /* synthetic */ inl m = new inl(12);
    public static final /* synthetic */ inl l = new inl(11);
    public static final /* synthetic */ inl k = new inl(10);
    public static final /* synthetic */ inl j = new inl(9);
    public static final /* synthetic */ inl i = new inl(8);
    public static final /* synthetic */ inl h = new inl(7);
    public static final /* synthetic */ inl g = new inl(6);
    public static final /* synthetic */ inl f = new inl(5);
    public static final /* synthetic */ inl e = new inl(4);
    public static final /* synthetic */ inl d = new inl(3);
    public static final /* synthetic */ inl c = new inl(2);
    public static final /* synthetic */ inl b = new inl(1);
    public static final /* synthetic */ inl a = new inl();

    private /* synthetic */ inl() {
    }

    private /* synthetic */ inl(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        switch (this.v) {
            case 0:
                return meq.a((atxn) obj);
            case 1:
                return ((meq) obj).e;
            case 2:
                ayoi ayoiVar = (ayoi) obj;
                int i2 = iou.cp;
                return ayoiVar;
            case 3:
                return (View) ((Optional) obj).get();
            case 4:
                return (meq) ((Optional) obj).get();
            case 5:
                obj.getClass();
                return new iot(Optional.of(obj), Optional.empty());
            case 6:
                Throwable th = (Throwable) obj;
                if (th instanceof cff) {
                    return new iot(Optional.empty(), Optional.of((cff) th));
                }
                throw new zhw(th);
            case 7:
                zbb zbbVar = (zbb) obj;
                return Integer.valueOf(zbbVar instanceof zbd ? ((zbd) zbbVar).a : 0);
            case 8:
                asxp asxpVar = ((arhd) obj).e;
                if (asxpVar == null) {
                    asxpVar = asxp.a;
                }
                return Boolean.valueOf(asxpVar.bk);
            case 9:
                aawr aawrVar = (aawr) obj;
                return new ewo();
            case 10:
                return ((aaws) obj).a;
            case 11:
                return (aawr) ((ampq) obj).c();
            case 12:
                ampr amprVar = (ampr) obj;
                return zhx.a;
            case 13:
                return ((ayos) obj).e().L().D(s);
            case 14:
                ayos ayosVar = (ayos) obj;
                return new ewp();
            case 15:
                return ((ayos) obj).j().z();
            case 16:
                return ((ayos) obj).j().z();
            case 17:
                Boolean bool = (Boolean) obj;
                return zhx.a;
            case 18:
                return (Throwable) obj;
            case 19:
                Throwable th2 = (Throwable) obj;
                return new ewn();
            default:
                atdn atdnVar = ((arhd) obj).l;
                if (atdnVar == null) {
                    atdnVar = atdn.a;
                }
                return Boolean.valueOf(atdnVar.g);
        }
    }
}
