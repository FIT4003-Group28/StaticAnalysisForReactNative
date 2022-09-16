package defpackage;
/* compiled from: PG */
/* renamed from: aqke  reason: default package */
/* loaded from: classes2.dex */
public final class aqke extends aopi implements aoqv {
    public static final aopr a = new uil(16);
    public static final aqke b;
    private static volatile aorb j;
    public int c;
    public long d;
    public aopq e = emptyIntList();
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;

    static {
        aqke aqkeVar = new aqke();
        b = aqkeVar;
        aopi.registerDefaultInstance(aqke.class, aqkeVar);
    }

    private aqke() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(b, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001ဂ\u0000\u0003\u001e\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004\u0007ဇ\u0005", new Object[]{"c", "d", "e", athb.a(), "f", "g", "h", "i"});
            case 3:
                return new aqke();
            case 4:
                return new aopa((byte[][]) null, (short[]) null);
            case 5:
                return b;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (aqke.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(b);
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
