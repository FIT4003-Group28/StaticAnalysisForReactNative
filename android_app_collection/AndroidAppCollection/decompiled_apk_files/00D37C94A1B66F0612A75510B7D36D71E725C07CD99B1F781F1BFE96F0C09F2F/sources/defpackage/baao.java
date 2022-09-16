package defpackage;
/* compiled from: PG */
/* renamed from: baao  reason: default package */
/* loaded from: classes2.dex */
public final class baao extends aopi implements aoqv {
    public static final baao a;
    private static volatile aorb o;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public aopu j = emptyProtobufList();
    public int k;
    public int l;
    public int m;
    public baar n;

    static {
        baao baaoVar = new baao();
        a = baaoVar;
        aopi.registerDefaultInstance(baao.class, baaoVar);
    }

    private baao() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0006\u0005\u001b\u0006င\b\u0007င\u0002\bင\u0004\tင\u0005\u000bင\t\fင\n\rဉ\u000b", new Object[]{"b", "c", "d", "f", "i", "j", baan.class, "k", "e", "g", "h", "l", "m", "n"});
            case 3:
                return new baao();
            case 4:
                return new aopa((float[][]) null, (int[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = o;
                if (aorbVar == null) {
                    synchronized (baao.class) {
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
