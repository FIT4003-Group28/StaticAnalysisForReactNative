package defpackage;
/* compiled from: PG */
/* renamed from: anfi  reason: default package */
/* loaded from: classes.dex */
public final class anfi extends aopd implements aope {
    public static final anfi a;
    private static volatile aorb m;
    public int b;
    public int c;
    public int g;
    public aouf h;
    public int i;
    public anfa k;
    private byte n = 2;
    public int d = -1;
    public aopq e = emptyIntList();
    public String f = "";
    public int j = -1;

    static {
        anfi anfiVar = new anfi();
        a = anfiVar;
        aopi.registerDefaultInstance(anfi.class, anfiVar);
    }

    private anfi() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.n = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001è\t\u0000\u0001\u0002\u0001င\u0000\u0003င\u0001\u0004\u0016\u0005ဈ\u0002\u0006ဌ\u0005\u0007င\u0003\u000bᐉ\u0004\u0095င\u0007èᐉ\b", new Object[]{"b", "c", "d", "e", "f", "i", adzd.s, "g", "h", "j", "k"});
            case 3:
                return new anfi();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (anfi.class) {
                        aorbVar = m;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            m = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
