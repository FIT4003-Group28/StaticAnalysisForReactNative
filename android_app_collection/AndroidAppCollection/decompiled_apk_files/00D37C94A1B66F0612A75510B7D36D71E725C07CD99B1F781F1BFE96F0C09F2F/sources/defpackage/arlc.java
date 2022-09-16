package defpackage;
/* compiled from: PG */
/* renamed from: arlc  reason: default package */
/* loaded from: classes2.dex */
public final class arlc extends aopi implements aoqv {
    public static final arlc a;
    private static volatile aorb f;
    public int b;
    public arlh c;
    public arlj d;
    public arll e;
    private arld g;
    private byte h = 2;

    static {
        arlc arlcVar = new arlc();
        a = arlcVar;
        aopi.registerDefaultInstance(arlc.class, arlcVar);
    }

    private arlc() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\ue7cb㙌\ue171嶍\u0004\u0000\u0000\u0004\ue7cb㙌ᐉ\u0000\ue3dc喠ᐉ\u0001\uebd3坩ᐉ\u0002\ue171嶍ᐉ\u0003", new Object[]{"b", "c", "g", "d", "e"});
            case 3:
                return new arlc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (arlc.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
