package defpackage;
/* compiled from: PG */
/* renamed from: arkf  reason: default package */
/* loaded from: classes2.dex */
public final class arkf extends aopi implements aoqv {
    public static final arkf a;
    private static volatile aorb o;
    public int b;
    public arhs c;
    public arhs d;
    public apzg e;
    public arag f;
    public arag g;
    public arke h;
    public int i;
    public arkg j;
    public int k;
    public int n;
    private arag p;
    private aoux q;
    private byte r = 2;
    public aopu l = emptyProtobufList();
    public aoob m = aoob.b;

    static {
        arkf arkfVar = new arkf();
        a = arkfVar;
        aopi.registerDefaultInstance(arkf.class, arkfVar);
    }

    private arkf() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.r = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\n\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\b\bᐉ\n\tည\u000b\nဌ\t\u000bᐉ\u0003\fဌ\u0007\rЛ\u000eဌ\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "j", "q", "m", "k", avcd.e, "p", "i", avcd.d, "l", apzg.class, "n", auwh.q});
            case 3:
                return new arkf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = o;
                if (aorbVar == null) {
                    synchronized (arkf.class) {
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
