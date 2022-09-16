package defpackage;
/* compiled from: PG */
/* renamed from: aumx  reason: default package */
/* loaded from: classes2.dex */
public final class aumx extends aopi implements aoqv {
    public static final aumx a;
    public static final aopg b;
    private static volatile aorb g;
    public int c;
    public boolean e;
    private aoux h;
    private byte i = 2;
    public String d = "";
    public aoob f = aoob.b;

    static {
        aumx aumxVar = new aumx();
        a = aumxVar;
        aopi.registerDefaultInstance(aumx.class, aumxVar);
        b = aopi.newSingularGeneratedExtension(aqgx.a, aumxVar, aumxVar, null, 60487319, aosj.MESSAGE, aumx.class);
    }

    private aumx() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.i = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ည\u0004\u0004ဇ\u0001\u0005ᐉ\u0003", new Object[]{"c", "d", "f", "e", "h"});
            case 3:
                return new aumx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aumx.class) {
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
