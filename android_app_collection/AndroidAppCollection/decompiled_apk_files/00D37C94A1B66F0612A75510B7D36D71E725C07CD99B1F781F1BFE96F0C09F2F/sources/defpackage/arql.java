package defpackage;
/* compiled from: PG */
/* renamed from: arql  reason: default package */
/* loaded from: classes2.dex */
public final class arql extends aopi implements aoqv {
    public static final arql a;
    private static volatile aorb e;
    public int b;
    public aroy c;
    private byte f = 2;
    public aopu d = aopi.emptyProtobufList();

    static {
        arql arqlVar = new arql();
        a = arqlVar;
        aopi.registerDefaultInstance(arql.class, arqlVar);
    }

    private arql() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001a", new Object[]{"b", "c", "d"});
            case 3:
                return new arql();
            case 4:
                return new aopa((char[]) null, (char[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (arql.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
