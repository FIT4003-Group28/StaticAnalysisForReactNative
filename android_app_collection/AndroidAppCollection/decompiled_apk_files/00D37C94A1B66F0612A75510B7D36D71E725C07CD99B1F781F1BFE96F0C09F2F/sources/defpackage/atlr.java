package defpackage;
/* compiled from: PG */
/* renamed from: atlr  reason: default package */
/* loaded from: classes2.dex */
public final class atlr extends aopi implements aoqv {
    public static final atlr a;
    private static volatile aorb h;
    public int b;
    public avhn c;
    public arag d;
    public arag e;
    public atlq f;
    private aoux i;
    private byte j = 2;
    public aoob g = aoob.b;

    static {
        atlr atlrVar = new atlr();
        a = atlrVar;
        aopi.registerDefaultInstance(atlr.class, atlrVar);
    }

    private atlr() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ည\u0005\u0006ဉ\u0003", new Object[]{"b", "c", "d", "e", "i", "g", "f"});
            case 3:
                return new atlr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (atlr.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
