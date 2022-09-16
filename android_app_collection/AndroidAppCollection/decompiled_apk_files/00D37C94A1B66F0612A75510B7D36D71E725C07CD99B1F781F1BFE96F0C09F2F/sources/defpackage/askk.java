package defpackage;
/* compiled from: PG */
/* renamed from: askk  reason: default package */
/* loaded from: classes2.dex */
public final class askk extends aopi implements aoqv {
    public static final askk a;
    private static volatile aorb m;
    public int b;
    public Object d;
    public arag e;
    public arag f;
    public arag g;
    public avhn i;
    public arag k;
    public aunb l;
    public int c = 0;
    private byte n = 2;
    public aopu h = emptyProtobufList();
    public aopu j = emptyProtobufList();

    static {
        askk askkVar = new askk();
        a = askkVar;
        aopi.registerDefaultInstance(askk.class, askkVar);
    }

    private askk() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.n = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0001\u0001\u0002\n\t\u0000\u0002\t\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005Л\u0006ᐼ\u0000\u0007ᐉ\u0005\bЛ\tᐉ\u0006\nᐉ\u0007", new Object[]{"d", "c", "b", "e", "f", "g", "h", aunb.class, avhn.class, "i", "j", aunb.class, "k", "l"});
            case 3:
                return new askk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (askk.class) {
                        aorbVar = m;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            m = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
