package defpackage;
/* compiled from: PG */
/* renamed from: apwx  reason: default package */
/* loaded from: classes2.dex */
public final class apwx extends aopi implements aoqv {
    public static final apwx a;
    private static volatile aorb h;
    public int b;
    public arag c;
    public arag g;
    private aoux i;
    private byte j = 2;
    public aopu d = emptyProtobufList();
    public aoob e = aoob.b;
    public aopu f = emptyProtobufList();

    static {
        apwx apwxVar = new apwx();
        a = apwxVar;
        aopi.registerDefaultInstance(apwx.class, apwxVar);
    }

    private apwx() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0005\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0001\u0004ည\u0002\u0005Л\u0006ᐉ\u0003", new Object[]{"b", "c", "d", apwv.class, "i", "e", "f", apok.class, "g"});
            case 3:
                return new apwx();
            case 4:
                return new aopa((short[][]) null, (boolean[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (apwx.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
