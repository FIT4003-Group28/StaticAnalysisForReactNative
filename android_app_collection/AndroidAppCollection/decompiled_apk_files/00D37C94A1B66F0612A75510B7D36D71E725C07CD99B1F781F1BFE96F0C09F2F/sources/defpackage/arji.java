package defpackage;
/* compiled from: PG */
/* renamed from: arji  reason: default package */
/* loaded from: classes2.dex */
public final class arji extends aopi implements aoqv {
    public static final arji a;
    private static volatile aorb k;
    public int b;
    public arag c;
    public apzg i;
    public avhn j;
    private aoux l;
    private byte m = 2;
    public aopu d = emptyProtobufList();
    public aopu e = emptyProtobufList();
    public aopu f = emptyProtobufList();
    public aopu g = emptyProtobufList();
    public aoob h = aoob.b;

    static {
        arji arjiVar = new arji();
        a = arjiVar;
        aopi.registerDefaultInstance(arji.class, arjiVar);
    }

    private arji() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0002\u0011\t\u0000\u0004\u0004\u0002ᐉ\u0000\u0004ᐉ\u0002\u0005ည\u0003\t\u001b\n\u001b\u000b\u001b\u000e\u001b\u0010ᐉ\u0006\u0011ᐉ\u0007", new Object[]{"b", "c", "l", "h", "d", aswg.class, "e", aswg.class, "f", aswg.class, "g", aswg.class, "i", "j"});
            case 3:
                return new arji();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (arji.class) {
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
