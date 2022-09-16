package defpackage;
/* compiled from: PG */
/* renamed from: atgf  reason: default package */
/* loaded from: classes2.dex */
public final class atgf extends aopi implements aoqv {
    public static final atgf a;
    private static volatile aorb f;
    public atgb b;
    public atgc c;
    public atgb d;
    public atgc e;
    private int g;
    private byte h = 2;

    static {
        atgf atgfVar = new atgf();
        a = atgfVar;
        aopi.registerDefaultInstance(atgf.class, atgfVar);
    }

    private atgf() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"g", "b", "c", "d", "e"});
            case 3:
                return new atgf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (atgf.class) {
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
