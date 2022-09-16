package defpackage;
/* compiled from: PG */
/* renamed from: armq  reason: default package */
/* loaded from: classes2.dex */
public final class armq extends aopi implements aoqv {
    public static final armq a;
    private static volatile aorb l;
    public int b;
    public aroy c;
    public int g;
    public int h;
    public int i;
    public awle k;
    private arme m;
    private byte n = 2;
    public aoob d = aoob.b;
    public String e = "";
    public String f = "";
    public String j = "";

    static {
        armq armqVar = new armq();
        a = armqVar;
        aopi.registerDefaultInstance(armq.class, armqVar);
    }

    private armq() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.n = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0003\u0001ᐉ\u0000\u0003ည\u0001\u0004ဈ\u0003\u0005ဈ\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tဈ\b\nᐉ\t\u000bᐉ\u0002", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "m"});
            case 3:
                return new armq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (armq.class) {
                        aorbVar = l;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            l = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
