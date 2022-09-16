package defpackage;
/* compiled from: PG */
/* renamed from: ases  reason: default package */
/* loaded from: classes2.dex */
public final class ases extends aopi implements aoqv {
    public static final ases a;
    private static volatile aorb f;
    public int b;
    public aroy c;
    private byte g = 2;
    public String d = "";
    public String e = "";

    static {
        ases asesVar = new ases();
        a = asesVar;
        aopi.registerDefaultInstance(ases.class, asesVar);
    }

    private ases() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new ases();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (ases.class) {
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
