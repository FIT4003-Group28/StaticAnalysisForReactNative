package defpackage;
/* compiled from: PG */
/* renamed from: ilt  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ilt implements ayqe {
    private final /* synthetic */ int v;
    public static final /* synthetic */ ilt u = new ilt(20);
    public static final /* synthetic */ ilt t = new ilt(19);
    public static final /* synthetic */ ilt s = new ilt(18);
    public static final /* synthetic */ ilt r = new ilt(17);
    public static final /* synthetic */ ilt q = new ilt(16);
    public static final /* synthetic */ ilt p = new ilt(15);
    public static final /* synthetic */ ilt o = new ilt(14);
    public static final /* synthetic */ ilt n = new ilt(13);
    public static final /* synthetic */ ilt m = new ilt(12);
    public static final /* synthetic */ ilt l = new ilt(11);
    public static final /* synthetic */ ilt k = new ilt(10);
    public static final /* synthetic */ ilt j = new ilt(9);
    public static final /* synthetic */ ilt i = new ilt(8);
    public static final /* synthetic */ ilt h = new ilt(7);
    public static final /* synthetic */ ilt g = new ilt(6);
    public static final /* synthetic */ ilt f = new ilt(5);
    public static final /* synthetic */ ilt e = new ilt(4);
    public static final /* synthetic */ ilt d = new ilt(3);
    public static final /* synthetic */ ilt c = new ilt(2);
    public static final /* synthetic */ ilt b = new ilt(1);
    public static final /* synthetic */ ilt a = new ilt();

    private /* synthetic */ ilt() {
    }

    private /* synthetic */ ilt(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        boolean z = true;
        switch (this.v) {
            case 0:
                ilo iloVar = (ilo) obj;
                return zhx.a;
            case 1:
                return ilo.a((aajp) obj);
            case 2:
                return ilo.a((aajp) obj);
            case 3:
                return azib.c((ayoi) obj).e(0);
            case 4:
                ilo iloVar2 = (ilo) obj;
                return zhx.a;
            case 5:
                avvb avvbVar = ((ilo) obj).b;
                if (avvbVar == null || avvbVar.getNumVideosFailed().intValue() <= 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                return ilo.a((aajp) obj);
            case 7:
                return azib.c((ayoi) obj).e(0);
            case 8:
                return false;
            case 9:
                ilo iloVar3 = (ilo) obj;
                avvb avvbVar2 = iloVar3.b;
                avvb avvbVar3 = iloVar3.a;
                if (avvbVar2 == null) {
                    return imm.a();
                }
                if (avvbVar3 == null) {
                    if (avvbVar2.getNumVideosFailed().intValue() > 0) {
                        return iml.a(avvbVar2.getNumVideosFailed().intValue(), avvbVar2.getNumVideosFailed().intValue() + avvbVar2.getNumVideosCompleted().intValue() + avvbVar2.getNumVideosInProgress().intValue());
                    }
                    if (avvbVar2.getNumVideosInProgress().intValue() > 0) {
                        return imn.a(avvbVar2.getUploadProgress().floatValue(), avvbVar2.getNumVideosInProgress().intValue(), avvbVar2.getNumVideosCompleted().intValue(), avvbVar2.getNumVideosFailed().intValue());
                    }
                    if (avvbVar2.getNumVideosCompleted().intValue() > 0) {
                        return imk.a(avvbVar2.getNumVideosCompleted().intValue(), avvbVar2.getNumVideosInProgress().intValue(), avvbVar2.getNumVideosFailed().intValue());
                    }
                } else if (avvbVar2.getNumVideosFailed().intValue() > avvbVar3.getNumVideosFailed().intValue()) {
                    return iml.a(avvbVar2.getNumVideosFailed().intValue(), avvbVar2.getNumVideosFailed().intValue() + avvbVar2.getNumVideosCompleted().intValue() + avvbVar2.getNumVideosInProgress().intValue());
                } else {
                    if (avvbVar2.getNumVideosInProgress().intValue() > 0) {
                        return imn.a(avvbVar2.getUploadProgress().floatValue(), avvbVar2.getNumVideosInProgress().intValue(), avvbVar2.getNumVideosCompleted().intValue(), avvbVar2.getNumVideosFailed().intValue());
                    }
                    if (avvbVar2.getNumVideosCompleted().intValue() > avvbVar3.getNumVideosCompleted().intValue()) {
                        return imk.a(avvbVar2.getNumVideosCompleted().intValue(), avvbVar2.getNumVideosInProgress().intValue(), avvbVar2.getNumVideosFailed().intValue());
                    }
                }
                return imm.a();
            case 10:
                return Boolean.valueOf(!(((imj) obj) instanceof imm));
            case 11:
                imm immVar = (imm) obj;
                return "";
            case 12:
                return ilo.a((aajp) obj);
            case 13:
                return (imj) ((ampq) obj).b(gvq.o).e(imm.a());
            case 14:
                ampq ampqVar = (ampq) obj;
                return ampqVar.f() instanceof avvb ? ampqVar.b(gvq.n) : amon.a;
            case 15:
                return (ayoi) obj;
            case 16:
                return (ayoi) obj;
            case 17:
                Boolean bool = (Boolean) obj;
                return imm.a();
            case 18:
                Boolean bool2 = (Boolean) obj;
                return imm.a();
            case 19:
                aajj aajjVar = ((aajp) ((ampr) obj).a).c;
                aajjVar.getClass();
                return aajjVar;
            default:
                return ((aqzd) obj).b;
        }
    }
}
