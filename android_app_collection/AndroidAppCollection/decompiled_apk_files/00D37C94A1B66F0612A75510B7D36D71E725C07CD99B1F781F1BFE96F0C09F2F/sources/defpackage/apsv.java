package defpackage;
/* compiled from: PG */
/* renamed from: apsv  reason: default package */
/* loaded from: classes2.dex */
public final class apsv extends aopi implements aoqv {
    public static final apsv a;
    private static volatile aorb k;
    public int b;
    public Object d;
    public apsu f;
    public int h;
    public apzg i;
    private aoux l;
    public int c = 0;
    private byte m = 2;
    public aopu e = emptyProtobufList();
    public aoob g = aoob.b;
    public int j = 1;

    static {
        apsv apsvVar = new apsv();
        a = apsvVar;
        aopi.registerDefaultInstance(apsv.class, apsvVar);
    }

    private apsv() {
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
                return newMessageInfo(a, "\u0001\t\u0001\u0001\u0001\t\t\u0000\u0001\u0005\u0001Л\u0002ဉ\u0000\u0003ᐼ\u0000\u0004ᐉ\u0003\u0005ည\u0004\u0006ᐼ\u0000\u0007ဌ\u0005\bᐉ\u0006\tဌ\u0007", new Object[]{"d", "c", "b", "e", apsw.class, "f", apzg.class, "l", "g", apok.class, "h", apog.p, "i", "j", apog.s});
            case 3:
                return new apsv();
            case 4:
                return new aopa((short[][][]) null, (char[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (apsv.class) {
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
