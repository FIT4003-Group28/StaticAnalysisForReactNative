package defpackage;
/* compiled from: PG */
/* renamed from: araq  reason: default package */
/* loaded from: classes2.dex */
public final class araq extends aopi implements aoqv {
    public static final araq a;
    private static volatile aorb g;
    public int b;
    public int c;
    public apzg e;
    public boolean f;
    private byte h = 2;
    public String d = "";

    static {
        araq araqVar = new araq();
        a = araqVar;
        aopi.registerDefaultInstance(araq.class, araqVar);
    }

    private araq() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ဌ\u0000\u0002ဈ\u0001\u0004ᐉ\u0003\u0005ဇ\u0004", new Object[]{"b", "c", arpt.f, "d", "e", "f"});
            case 3:
                return new araq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (araq.class) {
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
