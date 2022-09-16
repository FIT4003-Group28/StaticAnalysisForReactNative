package defpackage;
/* compiled from: PG */
/* renamed from: aprq  reason: default package */
/* loaded from: classes2.dex */
public final class aprq extends aopi implements aoqv {
    public static final aprq a;
    private static volatile aorb k;
    public int b;
    public arag c;
    public arag f;
    public arag j;
    private byte l = 2;
    public String d = "";
    public boolean e = true;
    public String g = "";
    public boolean h = true;
    public aopu i = emptyProtobufList();

    static {
        aprq aprqVar = new aprq();
        a = aprqVar;
        aopi.registerDefaultInstance(aprq.class, aprqVar);
    }

    private aprq() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0002\u000b\b\u0000\u0001\u0004\u0002ᐉ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0006ᐉ\u0005\u0007ဈ\u0006\bဇ\u0007\nЛ\u000bᐉ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", arag.class, "j"});
            case 3:
                return new aprq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (aprq.class) {
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
