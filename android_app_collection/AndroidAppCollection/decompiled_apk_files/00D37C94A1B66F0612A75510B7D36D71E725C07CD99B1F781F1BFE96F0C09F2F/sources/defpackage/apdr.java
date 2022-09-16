package defpackage;
/* compiled from: PG */
/* renamed from: apdr  reason: default package */
/* loaded from: classes.dex */
public final class apdr extends aopi implements aoqv {
    public static final apdr a;
    private static volatile aorb g;
    public int b;
    public apzg f;
    private aoux h;
    private byte i = 2;
    public aoob c = aoob.b;
    public String d = "";
    public String e = "";

    static {
        apdr apdrVar = new apdr();
        a = apdrVar;
        aopi.registerDefaultInstance(apdr.class, apdrVar);
    }

    private apdr() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ᐉ\u0004", new Object[]{"b", "h", "c", "d", "e", "f"});
            case 3:
                return new apdr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (apdr.class) {
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
