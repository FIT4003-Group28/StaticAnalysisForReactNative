package defpackage;
/* compiled from: PG */
/* renamed from: aqnq  reason: default package */
/* loaded from: classes2.dex */
public final class aqnq extends aopi implements aoqv {
    public static final aqnq a;
    public static final aopg b;
    private static volatile aorb g;
    public int c;
    public aqnp d;
    public aqnw e;
    private awmh h;
    private byte i = 2;
    public String f = "";

    static {
        aqnq aqnqVar = new aqnq();
        a = aqnqVar;
        aopi.registerDefaultInstance(aqnq.class, aqnqVar);
        b = aopi.newSingularGeneratedExtension(awnc.a, aqnqVar, aqnqVar, null, 372095937, aosj.MESSAGE, aqnq.class);
    }

    private aqnq() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.i = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0005ဉ\u0004\u0007ဈ\u0006", new Object[]{"c", "d", "e", "h", "f"});
            case 3:
                return new aqnq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aqnq.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
