package defpackage;
/* compiled from: PG */
/* renamed from: awny  reason: default package */
/* loaded from: classes2.dex */
public final class awny extends aopi implements aoqv {
    public static final awny a;
    private static volatile aorb g;
    public int b;
    public int d;
    public boolean e;
    public int f;
    private awnz h;
    private byte i = 2;
    public aopu c = emptyProtobufList();

    static {
        awny awnyVar = new awny();
        a = awnyVar;
        aopi.registerDefaultInstance(awny.class, awnyVar);
    }

    private awny() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001\u001b\u0002ဌ\u0000\u0003ᐉ\u0001\u0004ဇ\u0002\u0005ဌ\u0003", new Object[]{"b", "c", awoa.class, "d", awkk.p, "h", "e", "f", awkk.q});
            case 3:
                return new awny();
            case 4:
                return new aopa((char[][]) null, (char[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (awny.class) {
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
