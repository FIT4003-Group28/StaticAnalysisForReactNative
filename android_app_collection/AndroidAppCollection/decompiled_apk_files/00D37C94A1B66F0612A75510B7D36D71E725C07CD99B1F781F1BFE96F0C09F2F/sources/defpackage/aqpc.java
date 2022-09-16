package defpackage;
/* compiled from: PG */
/* renamed from: aqpc  reason: default package */
/* loaded from: classes2.dex */
public final class aqpc extends aopi implements aoqv {
    public static final aqpc a;
    public static final aopg b;
    private static volatile aorb i;
    public int c;
    public int e;
    public int f;
    public int h;
    private byte j = 2;
    public String d = "";
    public String g = "";

    static {
        aqpc aqpcVar = new aqpc();
        a = aqpcVar;
        aopi.registerDefaultInstance(aqpc.class, aqpcVar);
        b = aopi.newSingularGeneratedExtension(awnc.a, aqpcVar, aqpcVar, null, 362363524, aosj.MESSAGE, aqpc.class);
    }

    private aqpc() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.j = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0003\b\u0005\u0000\u0000\u0000\u0003ဈ\u0003\u0004ဌ\u0004\u0005င\u0005\u0007ဈ\u0006\bဌ\u0007", new Object[]{"c", "d", "e", aqpa.a(), "f", "g", "h", aqov.e});
            case 3:
                return new aqpc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (aqpc.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
