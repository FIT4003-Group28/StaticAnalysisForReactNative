package defpackage;
/* compiled from: PG */
/* renamed from: arai  reason: default package */
/* loaded from: classes2.dex */
public final class arai extends aopd implements aope {
    public static final arai a;
    private static volatile aorb o;
    public int b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public apzg m;
    public asvv n;
    private byte p = 2;
    public String c = "";

    static {
        arai araiVar = new arai();
        a = araiVar;
        aopi.registerDefaultInstance(arai.class, araiVar);
    }

    private arai() {
    }

    public static /* synthetic */ void a(arai araiVar) {
        araiVar.b |= 2;
        araiVar.d = true;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.p = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001ϧ\u000b\u0000\u0000\u0002\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ᐉ\t\u0006ဇ\u0004\bဋ\u0006\tဌ\b\nဇ\u0005\u000bဋ\u0007ϧᐉ\n", new Object[]{"b", "c", "d", "e", "f", "m", "g", "i", "k", aqyp.m, "h", "j", "n"});
            case 3:
                return new arai();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = o;
                if (aorbVar == null) {
                    synchronized (arai.class) {
                        aorbVar = o;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            o = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
