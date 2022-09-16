package defpackage;

import j$.util.Optional;
/* compiled from: PG */
/* renamed from: ikb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ikb implements ayqf {
    private final /* synthetic */ int v;
    public static final /* synthetic */ ikb u = new ikb(20);
    public static final /* synthetic */ ikb t = new ikb(19);
    public static final /* synthetic */ ikb s = new ikb(18);
    public static final /* synthetic */ ikb r = new ikb(17);
    public static final /* synthetic */ ikb q = new ikb(16);
    public static final /* synthetic */ ikb p = new ikb(15);
    public static final /* synthetic */ ikb o = new ikb(14);
    public static final /* synthetic */ ikb n = new ikb(13);
    public static final /* synthetic */ ikb m = new ikb(12);
    public static final /* synthetic */ ikb l = new ikb(11);
    public static final /* synthetic */ ikb k = new ikb(10);
    public static final /* synthetic */ ikb j = new ikb(9);
    public static final /* synthetic */ ikb i = new ikb(8);
    public static final /* synthetic */ ikb h = new ikb(7);
    public static final /* synthetic */ ikb g = new ikb(6);
    public static final /* synthetic */ ikb f = new ikb(5);
    public static final /* synthetic */ ikb e = new ikb(4);
    public static final /* synthetic */ ikb d = new ikb(3);
    public static final /* synthetic */ ikb c = new ikb(2);
    public static final /* synthetic */ ikb b = new ikb(1);
    public static final /* synthetic */ ikb a = new ikb();

    private /* synthetic */ ikb() {
    }

    private /* synthetic */ ikb(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ayqf
    public final boolean a(Object obj) {
        switch (this.v) {
            case 0:
                return ((ampq) obj).h();
            case 1:
                return ((Throwable) obj) instanceof cff;
            case 2:
                return ((aajp) obj).c != null;
            case 3:
                ilo iloVar = (ilo) obj;
                avvb avvbVar = iloVar.a;
                avvb avvbVar2 = iloVar.b;
                if (avvbVar == null) {
                    if (avvbVar2 != null && avvbVar2.getNumVideosCompleted().intValue() > 0) {
                        return true;
                    }
                } else if (avvbVar2 != null && avvbVar2.getNumVideosCompleted().intValue() > avvbVar.getNumVideosCompleted().intValue()) {
                    return true;
                }
                return false;
            case 4:
                return ((aajp) obj).c != null;
            case 5:
                ilo iloVar2 = (ilo) obj;
                avvb avvbVar3 = iloVar2.a;
                avvb avvbVar4 = iloVar2.b;
                if (avvbVar3 == null) {
                    if (avvbVar4 != null && avvbVar4.getNumVideosFailed().intValue() > 0) {
                        return true;
                    }
                } else if (avvbVar4 != null && avvbVar4.getNumVideosFailed().intValue() > avvbVar3.getNumVideosFailed().intValue()) {
                    return true;
                }
                return false;
            case 6:
                return ((aajp) obj).c != null;
            case 7:
                return ((aajp) obj).c != null;
            case 8:
                return ((Boolean) obj).booleanValue();
            case 9:
                return ((Boolean) obj).booleanValue();
            case 10:
                return ((Boolean) obj).booleanValue();
            case 11:
                return ((aajp) obj).c != null;
            case 12:
                return ((fhf) obj).a();
            case 13:
                int i2 = iou.cp;
                return ((Boolean) obj).booleanValue();
            case 14:
                int i3 = iou.cp;
                return ((Throwable) obj) instanceof cff;
            case 15:
                return ((Optional) obj).isPresent();
            case 16:
                return ((aawr) obj).a != null;
            case 17:
                return ((ampq) obj).h();
            case 18:
                return ((Boolean) ((ampr) obj).a).booleanValue();
            case 19:
                aajp aajpVar = (aajp) obj;
                return (aajpVar == null || aajpVar.c == null) ? false : true;
            default:
                return jcq.a.contains(((jbj) obj).b);
        }
    }
}
