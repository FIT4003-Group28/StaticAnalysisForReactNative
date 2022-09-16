package defpackage;
/* compiled from: PG */
/* renamed from: ambp  reason: default package */
/* loaded from: classes.dex */
public final class ambp extends aopd implements aope {
    public static final ambp a;
    private static volatile aorb j;
    public int b;
    public boolean g;
    private byte k = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String h = "";
    public String i = "";

    static {
        ambp ambpVar = new ambp();
        a = ambpVar;
        aopi.registerDefaultInstance(ambp.class, ambpVar);
    }

    private ambp() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0004\u0004ဈ\u0005\u0005ဇ\u0006\u0006ဈ\u0007\u0007ဈ\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new ambp();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (ambp.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
