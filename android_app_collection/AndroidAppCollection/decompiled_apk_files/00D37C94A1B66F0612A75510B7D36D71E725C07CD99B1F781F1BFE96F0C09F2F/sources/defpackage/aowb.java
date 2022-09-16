package defpackage;
/* compiled from: PG */
/* renamed from: aowb  reason: default package */
/* loaded from: classes.dex */
public final class aowb extends aopi implements aoqv {
    public static final aowb a;
    private static volatile aorb g;
    public int b;
    public boolean c;
    public apok d;
    public apok e;
    private byte h = 2;
    public String f = "";

    static {
        aowb aowbVar = new aowb();
        a = aowbVar;
        aopi.registerDefaultInstance(aowb.class, aowbVar);
    }

    private aowb() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0002\u0002ဇ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ဈ\u0005", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new aowb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aowb.class) {
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
