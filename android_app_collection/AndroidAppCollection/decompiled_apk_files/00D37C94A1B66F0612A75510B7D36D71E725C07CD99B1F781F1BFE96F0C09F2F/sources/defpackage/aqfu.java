package defpackage;
/* compiled from: PG */
/* renamed from: aqfu  reason: default package */
/* loaded from: classes2.dex */
public final class aqfu extends aopi implements aoqv {
    public static final aqfu a;
    private static volatile aorb j;
    public arag b;
    public avhn c;
    public arhs d;
    public arag e;
    public arag f;
    public apok h;
    public apok i;
    private int k;
    private aoux l;
    private byte m = 2;
    public aopu g = emptyProtobufList();

    static {
        aqfu aqfuVar = new aqfu();
        a = aqfuVar;
        aopi.registerDefaultInstance(aqfu.class, aqfuVar);
    }

    private aqfu() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\t\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006Л\u0007ᐉ\u0005\bᐉ\u0006\nᐉ\b", new Object[]{"k", "b", "c", "d", "e", "f", "g", arag.class, "h", "i", "l"});
            case 3:
                return new aqfu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (aqfu.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
