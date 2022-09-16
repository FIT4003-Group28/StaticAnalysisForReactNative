package defpackage;
/* compiled from: PG */
/* renamed from: arjf  reason: default package */
/* loaded from: classes2.dex */
public final class arjf extends aopi implements aoqv {
    public static final arjf a;
    private static volatile aorb o;
    public int b;
    public arag c;
    public apzg d;
    public avhn e;
    public arag f;
    public arag g;
    public arag h;
    public apzg i;
    public float l;
    public arag m;
    public arje n;
    private aoux p;
    private byte q = 2;
    public aopu j = emptyProtobufList();
    public aoob k = aoob.b;

    static {
        arjf arjfVar = new arjf();
        a = arjfVar;
        aopi.registerDefaultInstance(arjf.class, arjfVar);
    }

    private arjf() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.q = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0001\t\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\bᐉ\u0007\t\u001b\nᐉ\b\u000bည\t\fခ\n\rᐉ\u000b\u000eဉ\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", aswg.class, "p", "k", "l", "m", "n"});
            case 3:
                return new arjf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = o;
                if (aorbVar == null) {
                    synchronized (arjf.class) {
                        aorbVar = o;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            o = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
