package defpackage;
/* compiled from: PG */
/* renamed from: aihl  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aihl implements ampg {
    private final /* synthetic */ int v;
    public static final /* synthetic */ aihl u = new aihl(20);
    public static final /* synthetic */ aihl t = new aihl(19);
    public static final /* synthetic */ aihl s = new aihl(18);
    public static final /* synthetic */ aihl r = new aihl(17);
    public static final /* synthetic */ aihl q = new aihl(16);
    public static final /* synthetic */ aihl p = new aihl(15);
    public static final /* synthetic */ aihl o = new aihl(14);
    public static final /* synthetic */ aihl n = new aihl(13);
    public static final /* synthetic */ aihl m = new aihl(12);
    public static final /* synthetic */ aihl l = new aihl(11);
    public static final /* synthetic */ aihl k = new aihl(10);
    public static final /* synthetic */ aihl j = new aihl(9);
    public static final /* synthetic */ aihl i = new aihl(8);
    public static final /* synthetic */ aihl h = new aihl(7);
    public static final /* synthetic */ aihl g = new aihl(6);
    public static final /* synthetic */ aihl f = new aihl(5);
    public static final /* synthetic */ aihl e = new aihl(4);
    public static final /* synthetic */ aihl d = new aihl(3);
    public static final /* synthetic */ aihl c = new aihl(2);
    public static final /* synthetic */ aihl b = new aihl(1);
    public static final /* synthetic */ aihl a = new aihl();

    private /* synthetic */ aihl() {
    }

    private /* synthetic */ aihl(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        boolean z = false;
        switch (this.v) {
            case 0:
                return ((ajff) obj).J();
            case 1:
                return ((airw) obj).ab();
            case 2:
                return ((ajff) obj).J();
            case 3:
                return ((airw) obj).V();
            case 4:
                return ((ajff) obj).J();
            case 5:
                aopa aopaVar = (aopa) obj;
                aopaVar.copyOnWrite();
                awvh awvhVar = (awvh) aopaVar.instance;
                awvh awvhVar2 = awvh.a;
                awvhVar.b |= 1;
                awvhVar.c = 1;
                return aopaVar;
            case 6:
                if (((awvh) obj).c > 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
                return ((ajff) obj).t();
            case 8:
                return ((ajff) obj).u();
            case 9:
                return ((ajff) obj).G();
            case 10:
                return ((ajff) obj).M();
            case 11:
                return ((ajff) obj).U();
            case 12:
                return ((ajff) obj).V();
            case 13:
                return ((ajff) obj).W();
            case 14:
                return Boolean.valueOf(((awve) obj).c);
            case 15:
                return ((awve) obj).d;
            case 16:
                if (1 == (((awve) obj).b & 1)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 17:
                return ((ajff) obj).I();
            case 18:
                return ((ajff) obj).M();
            case 19:
                return ((ajff) obj).C();
            default:
                return ((ajff) obj).P();
        }
    }
}
