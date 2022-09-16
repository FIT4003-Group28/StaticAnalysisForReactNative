package defpackage;
/* compiled from: PG */
/* renamed from: audw  reason: default package */
/* loaded from: classes2.dex */
public final class audw extends aopi implements aoqv {
    public static final audw a;
    private static volatile aorb g;
    public Object c;
    public aueo d;
    public aued e;
    public aued f;
    private int h;
    private arag i;
    public int b = 0;
    private byte j = 2;

    static {
        audw audwVar = new audw();
        a = audwVar;
        aopi.registerDefaultInstance(audw.class, audwVar);
    }

    private audw() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐼ\u0000\u0005ᐉ\u0001\u0006ᐼ\u0000", new Object[]{"c", "b", "h", "i", "e", "f", auee.class, "d", aunb.class});
            case 3:
                return new audw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (audw.class) {
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
