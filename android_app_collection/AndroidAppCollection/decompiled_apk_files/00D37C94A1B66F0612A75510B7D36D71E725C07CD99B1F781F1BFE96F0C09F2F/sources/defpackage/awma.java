package defpackage;
/* compiled from: PG */
/* renamed from: awma  reason: default package */
/* loaded from: classes2.dex */
public final class awma extends aopi implements aoqv {
    public static final awma a;
    private static volatile aorb i;
    public int b;
    public int d;
    private byte j = 2;
    public String c = "";
    public aopu e = emptyProtobufList();
    public aopu f = emptyProtobufList();
    public aopu g = emptyProtobufList();
    public aopu h = emptyProtobufList();

    static {
        awma awmaVar = new awma();
        a = awmaVar;
        aopi.registerDefaultInstance(awma.class, awmaVar);
    }

    private awma() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0004\u0004\u0001ဈ\u0000\u0003ဌ\u0002\u0005Л\u0006Л\bЛ\nЛ", new Object[]{"b", "c", "d", awkk.g, "e", awmb.class, "f", awmd.class, "g", awlz.class, "h", awmc.class});
            case 3:
                return new awma();
            case 4:
                return new aopa((char[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (awma.class) {
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
