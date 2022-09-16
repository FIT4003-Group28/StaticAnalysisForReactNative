package defpackage;

import j$.util.Optional;
/* compiled from: PG */
/* renamed from: kth  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kth implements ayqf {
    private final /* synthetic */ int v;
    public static final /* synthetic */ kth u = new kth(20);
    public static final /* synthetic */ kth t = new kth(19);
    public static final /* synthetic */ kth s = new kth(18);
    public static final /* synthetic */ kth r = new kth(17);
    public static final /* synthetic */ kth q = new kth(16);
    public static final /* synthetic */ kth p = new kth(15);
    public static final /* synthetic */ kth o = new kth(14);
    public static final /* synthetic */ kth n = new kth(13);
    public static final /* synthetic */ kth m = new kth(12);
    public static final /* synthetic */ kth l = new kth(11);
    public static final /* synthetic */ kth k = new kth(10);
    public static final /* synthetic */ kth j = new kth(9);
    public static final /* synthetic */ kth i = new kth(8);
    public static final /* synthetic */ kth h = new kth(7);
    public static final /* synthetic */ kth g = new kth(6);
    public static final /* synthetic */ kth f = new kth(5);
    public static final /* synthetic */ kth e = new kth(4);
    public static final /* synthetic */ kth d = new kth(3);
    public static final /* synthetic */ kth c = new kth(2);
    public static final /* synthetic */ kth b = new kth(1);
    public static final /* synthetic */ kth a = new kth();

    private /* synthetic */ kth() {
    }

    private /* synthetic */ kth(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ayqf
    public final boolean a(Object obj) {
        switch (this.v) {
            case 0:
                return ((agqv) obj).i() == agqp.PLAYABLE;
            case 1:
                return ((agqh) obj).a.a.startsWith("BL");
            case 2:
                return ((ampq) obj).h();
            case 3:
                return ((arul) obj).b == 123267149;
            case 4:
                return ((arul) obj).b == 123267149;
            case 5:
                return ((arul) obj).b == 117866661;
            case 6:
                return ((Boolean) obj).booleanValue();
            case 7:
                return ((Optional) obj).isPresent();
            case 8:
                return ((Integer) obj).intValue() > 0;
            case 9:
                return ((Optional) obj).isPresent();
            case 10:
                return ((mhl) obj).a != null;
            case 11:
                return ((Boolean) obj).booleanValue();
            case 12:
                return ((aajp) obj).c != null;
            case 13:
                return ((ampq) obj).h();
            case 14:
                return ((ampq) obj).h();
            case 15:
                return ((aajp) obj).c != null;
            case 16:
                return !((Boolean) obj).booleanValue();
            case 17:
                return ((nsr) obj).equals(nsr.HIDDEN);
            case 18:
                int i2 = nnk.c;
                return ((aajp) obj).c != null;
            case 19:
                atad atadVar = (atad) obj;
                int i3 = nnk.c;
                if (atadVar.g() && atadVar.getSyncEnabled().booleanValue()) {
                    int i4 = atadVar.b.c;
                    if ((i4 & 4) != 0 && (i4 & 8) != 0) {
                        return true;
                    }
                }
                return false;
            default:
                return ((nsr) obj).equals(nsr.EXPANDED);
        }
    }
}
