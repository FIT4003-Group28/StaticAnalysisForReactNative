package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: efx  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class efx implements ayqf {
    private final /* synthetic */ int t;
    public static final /* synthetic */ efx s = new efx(20);
    public static final /* synthetic */ efx r = new efx(19);
    public static final /* synthetic */ efx q = new efx(18);
    public static final /* synthetic */ efx p = new efx(17);
    public static final /* synthetic */ efx o = new efx(16);
    public static final /* synthetic */ efx n = new efx(15);
    public static final /* synthetic */ efx m = new efx(14);
    public static final /* synthetic */ efx l = new efx(13);
    public static final /* synthetic */ efx k = new efx(12);
    public static final /* synthetic */ efx j = new efx(9);
    public static final /* synthetic */ efx i = new efx(8);
    public static final /* synthetic */ efx h = new efx(7);
    public static final /* synthetic */ efx g = new efx(6);
    public static final /* synthetic */ efx f = new efx(5);
    public static final /* synthetic */ efx e = new efx(4);
    public static final /* synthetic */ efx d = new efx(3);
    public static final /* synthetic */ efx c = new efx(2);
    public static final /* synthetic */ efx b = new efx(1);
    public static final /* synthetic */ efx a = new efx();

    private /* synthetic */ efx() {
    }

    public /* synthetic */ efx(int i2) {
        this.t = i2;
    }

    @Override // defpackage.ayqf
    public final boolean a(Object obj) {
        switch (this.t) {
            case 0:
                return zgt.y(((Long) obj).longValue(), yxf.b);
            case 1:
                return zgt.y(((Long) obj).longValue(), yxf.a);
            case 2:
                List list = (List) obj;
                return list.size() >= 2 && egt.b((ezx) list.get(0)) != egt.b((ezx) list.get(1));
            case 3:
                zep.d("Failed to update bedtime reminder data to store.", (Throwable) obj);
                return true;
            case 4:
                return ((Boolean) obj).booleanValue();
            case 5:
                List list2 = (List) obj;
                return ((Boolean) list2.get(0)).booleanValue() && !((Boolean) list2.get(1)).booleanValue();
            case 6:
                return ((Boolean) obj).booleanValue();
            case 7:
                int i2 = ert.b;
                return !((Boolean) obj).booleanValue();
            case 8:
                return ((ampq) obj).h();
            case 9:
                return ((Boolean) obj).booleanValue();
            case 10:
                ampr amprVar = (ampr) obj;
                fbc fbcVar = (fbc) amprVar.a;
                int i3 = fbcVar.b;
                return !(i3 == 155 || i3 == 261) || !((amvn) amprVar.b).contains(fbcVar.c);
            case 11:
                ampr amprVar2 = (ampr) obj;
                fbc fbcVar2 = (fbc) amprVar2.a;
                return fbcVar2.b != 156 || !((amvn) amprVar2.b).contains(fbcVar2.c);
            case 12:
                return ((aajp) obj).c != null;
            case 13:
                return ((aajp) obj).c != null;
            case 14:
                return ((ampq) obj).h();
            case 15:
                gdm gdmVar = (gdm) obj;
                int i4 = gll.b;
                return gdmVar == gdm.NOT_IN_PIP;
            case 16:
                int i5 = gtm.f;
                return !((Boolean) obj).booleanValue();
            case 17:
                return hhp.D((hhp) obj);
            case 18:
                return !((Boolean) obj).booleanValue();
            case 19:
                return !((Boolean) obj).booleanValue();
            default:
                return hhp.E((hhp) obj);
        }
    }
}
