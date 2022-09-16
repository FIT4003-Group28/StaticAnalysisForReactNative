package defpackage;
/* compiled from: PG */
/* renamed from: arcb  reason: default package */
/* loaded from: classes2.dex */
public final class arcb extends aopi implements aoqv {
    public static final arcb a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private arag g;
    private arag h;
    private arag i;
    private arag j;
    private apzg k;
    private avss l;
    private ates m;
    private arcq n;
    private arca o;
    private aoux p;
    private byte q = 2;

    static {
        arcb arcbVar = new arcb();
        a = arcbVar;
        aopi.registerDefaultInstance(arcb.class, arcbVar);
    }

    private arcb() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.q = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0003\u0015\r\u0000\u0000\r\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bᐉ\n\fᐉ\u000b\u0010ᐉ\f\u0011ᐉ\r\u0014ᐉ\u0011\u0015ᐉ\u000e", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "p", "o"});
            case 3:
                return new arcb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (arcb.class) {
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
