package defpackage;
/* compiled from: PG */
/* renamed from: aqkn  reason: default package */
/* loaded from: classes2.dex */
public final class aqkn extends aopi implements aoqv {
    public static final aqkn a;
    private static volatile aorb j;
    public int b;
    public arag c;
    public aunb e;
    public arag f;
    public arag g;
    public arag h;
    private aunb k;
    private byte l = 2;
    public aopu d = emptyProtobufList();
    public String i = "";

    static {
        aqkn aqknVar = new aqkn();
        a = aqknVar;
        aopi.registerDefaultInstance(aqkn.class, aqknVar);
    }

    private aqkn() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0006\u0001ᐉ\u0000\u0003\u001b\u0004ᐉ\u0002\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0003\tဈ\u0007", new Object[]{"b", "c", "d", aqko.class, "e", "f", "g", "h", "k", "i"});
            case 3:
                return new aqkn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (aqkn.class) {
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
