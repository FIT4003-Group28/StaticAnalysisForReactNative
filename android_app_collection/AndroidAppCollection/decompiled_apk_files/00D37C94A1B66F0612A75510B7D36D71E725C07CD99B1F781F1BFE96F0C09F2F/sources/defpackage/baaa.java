package defpackage;
/* compiled from: PG */
/* renamed from: baaa  reason: default package */
/* loaded from: classes2.dex */
public final class baaa extends aopi implements aoqv {
    public static final baaa a;
    private static volatile aorb g;
    public int b;
    public long c;
    public int d;
    public baae f;
    private byte h = 2;
    public aopu e = emptyProtobufList();

    static {
        baaa baaaVar = new baaa();
        a = baaaVar;
        aopi.registerDefaultInstance(baaa.class, baaaVar);
    }

    private baaa() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0001\u0001စ\u0000\u0002Л\u0003ဌ\u0001\u0006ဉ\u0004", new Object[]{"b", "c", "e", baab.class, "d", axce.s, "f"});
            case 3:
                return new baaa();
            case 4:
                return new aopa((float[][]) null, (char[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (baaa.class) {
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
