package defpackage;
/* compiled from: PG */
/* renamed from: arze  reason: default package */
/* loaded from: classes2.dex */
public final class arze extends aopi implements aoqv {
    public static final arze a;
    private static volatile aorb k;
    public int b;
    public aroy c;
    public int g;
    public arzd i;
    public apih j;
    private byte l = 2;
    public String d = "";
    public String e = "";
    public String f = "";
    public aoob h = aoob.b;

    static {
        arze arzeVar = new arze();
        a = arzeVar;
        aopi.registerDefaultInstance(arze.class, arzeVar);
    }

    private arze() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0006ဈ\u0004\u0007င\u0005\bည\u0006\tဉ\u0007\nဉ\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new arze();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (arze.class) {
                        aorbVar = k;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            k = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
