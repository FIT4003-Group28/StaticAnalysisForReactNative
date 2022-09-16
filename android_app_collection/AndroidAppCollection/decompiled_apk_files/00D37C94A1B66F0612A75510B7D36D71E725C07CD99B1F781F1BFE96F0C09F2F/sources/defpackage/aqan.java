package defpackage;
/* compiled from: PG */
/* renamed from: aqan  reason: default package */
/* loaded from: classes2.dex */
public final class aqan extends aopi implements aoqv {
    public static final aqan a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private arag g;
    private arag h;
    private ates i;
    private aplq j;
    private aoux k;
    private byte l = 2;

    static {
        aqan aqanVar = new aqan();
        a = aqanVar;
        aopi.registerDefaultInstance(aqan.class, aqanVar);
    }

    private aqan() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.l = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0003\u0003ᐉ\u0004\u0004ᐉ\u0005\u0005ᐉ\u0006\u0007ᐉ\b\bᐉ\u0001\tᐉ\u0002", new Object[]{"c", "d", "g", "h", "i", "j", "k", "e", "f"});
            case 3:
                return new aqan();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqan.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
