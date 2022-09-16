package defpackage;
/* compiled from: PG */
/* renamed from: asax  reason: default package */
/* loaded from: classes2.dex */
public final class asax extends aopi implements aoqv {
    public static final asax a;
    private static volatile aorb i;
    public int b;
    public aroy c;
    public int g;
    private byte j = 2;
    public String d = "";
    public aopu e = aopi.emptyProtobufList();
    public String f = "";
    public String h = "";

    static {
        asax asaxVar = new asax();
        a = asaxVar;
        aopi.registerDefaultInstance(asax.class, asaxVar);
    }

    private asax() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဈ\u0002\u0003\u001a\u0004ဌ\u0004\u0006ဈ\u0003\u0007ဈ\u0006", new Object[]{"b", "c", "d", "e", "g", auca.p, "f", "h"});
            case 3:
                return new asax();
            case 4:
                return new aopa((char[][][]) null, (byte[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (asax.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
