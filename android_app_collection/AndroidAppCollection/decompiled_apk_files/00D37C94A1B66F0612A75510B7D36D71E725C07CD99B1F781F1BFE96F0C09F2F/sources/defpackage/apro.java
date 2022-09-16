package defpackage;
/* compiled from: PG */
/* renamed from: apro  reason: default package */
/* loaded from: classes2.dex */
public final class apro extends aopi implements aoqv {
    public static final apro a;
    private static volatile aorb f;
    public int b;
    public aprn c;
    public aqft d;
    public aqtb e;
    private byte g = 2;

    static {
        apro aproVar = new apro();
        a = aproVar;
        aopi.registerDefaultInstance(apro.class, aproVar);
    }

    private apro() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\uf321Ẑ\uf492䤳\u0003\u0000\u0000\u0003\uf321Ẑᐉ\u0001\ueb42☡ᐉ\u0000\uf492䤳ᐉ\u0003", new Object[]{"b", "d", "c", "e"});
            case 3:
                return new apro();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (apro.class) {
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
