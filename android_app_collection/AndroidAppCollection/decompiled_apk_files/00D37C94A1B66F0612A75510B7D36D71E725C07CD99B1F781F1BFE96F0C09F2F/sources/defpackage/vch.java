package defpackage;
/* compiled from: PG */
/* renamed from: vch  reason: default package */
/* loaded from: classes4.dex */
public final class vch extends aopi implements aoqv {
    public static final vch a;
    private static volatile aorb c;
    public aoqp b = aoqp.a;

    static {
        vch vchVar = new vch();
        a = vchVar;
        aopi.registerDefaultInstance(vch.class, vchVar);
    }

    private vch() {
    }

    public final aoqp a() {
        aoqp aoqpVar = this.b;
        if (!aoqpVar.b) {
            this.b = aoqpVar.a();
        }
        return this.b;
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"b", vcg.a});
            case 3:
                return new vch();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (vch.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
