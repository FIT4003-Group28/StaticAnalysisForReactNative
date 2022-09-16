package defpackage;
/* compiled from: PG */
/* renamed from: apsm  reason: default package */
/* loaded from: classes2.dex */
public final class apsm extends aopi implements aoqv {
    public static final apsm a;
    private static volatile aorb p;
    public int b;
    public Object d;
    public arag f;
    public avhn g;
    public apzg h;
    public apsl j;
    public apsk k;
    public long o;
    private aoux q;
    public int c = 0;
    private byte r = 2;
    public String e = "";
    public aoob i = aoob.b;
    public aopu l = emptyProtobufList();
    public aopu m = emptyProtobufList();
    public aopu n = emptyProtobufList();

    static {
        apsm apsmVar = new apsm();
        a = apsmVar;
        aopi.registerDefaultInstance(apsm.class, apsmVar);
    }

    private apsm() {
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
                return newMessageInfo(a, "\u0001\u000e\u0001\u0001\u0001\u000e\u000e\u0000\u0003\t\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐼ\u0000\u0005ᐼ\u0000\u0006ᐉ\u0006\u0007ည\u0007\bဉ\b\tЛ\nЛ\u000bЛ\fဈ\u0000\rဂ\n\u000eဉ\t", new Object[]{"d", "c", "b", "f", "g", "h", arag.class, arag.class, "q", "i", "j", "l", apsq.class, "m", apsj.class, "n", apsp.class, "e", "o", "k"});
            case 3:
                return new apsm();
            case 4:
                return new aopa((short[]) null, (float[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = p;
                if (aorbVar == null) {
                    synchronized (apsm.class) {
                        aorbVar = p;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            p = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
