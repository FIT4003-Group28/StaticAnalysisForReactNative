package defpackage;
/* compiled from: PG */
/* renamed from: asnx  reason: default package */
/* loaded from: classes2.dex */
public final class asnx extends aopi implements aoqv {
    public static final asnx a;
    private static volatile aorb k;
    public int b;
    public boolean e;
    public long f;
    public int h;
    public int i;
    public asnv j;
    public aopu c = emptyProtobufList();
    public String d = "";
    public String g = "";

    static {
        asnx asnxVar = new asnx();
        a = asnxVar;
        aopi.registerDefaultInstance(asnx.class, asnxVar);
    }

    private asnx() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0004ဇ\u0002\u0005ဂ\u0003\u0006ဈ\u0004\u0007င\u0005\bင\u0006\nဉ\b", new Object[]{"b", "c", asnw.class, "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new asnx();
            case 4:
                return new aopa((byte[][]) null, (char[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (asnx.class) {
                        aorbVar = k;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            k = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
