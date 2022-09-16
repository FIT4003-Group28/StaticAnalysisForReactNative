package defpackage;
/* compiled from: PG */
/* renamed from: apic  reason: default package */
/* loaded from: classes.dex */
public final class apic extends aopi implements aoqv {
    public static final apic a;
    private static volatile aorb d;
    public int b = 0;
    public Object c;

    static {
        apic apicVar = new apic();
        a = apicVar;
        aopi.registerDefaultInstance(apic.class, apicVar);
    }

    private apic() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002ျ\u0000\u0003ြ\u0000", new Object[]{"c", "b", apib.class});
            case 3:
                return new apic();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (apic.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
