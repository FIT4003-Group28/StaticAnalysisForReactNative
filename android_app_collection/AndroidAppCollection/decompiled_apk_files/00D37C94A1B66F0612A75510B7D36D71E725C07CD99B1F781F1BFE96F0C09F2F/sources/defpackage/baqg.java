package defpackage;
/* compiled from: PG */
/* renamed from: baqg  reason: default package */
/* loaded from: classes2.dex */
public final class baqg extends aopi implements aoqv {
    public static final baqg a;
    private static volatile aorb c;
    public aoqp b = aoqp.a;

    static {
        baqg baqgVar = new baqg();
        a = baqgVar;
        aopi.registerDefaultInstance(baqg.class, baqgVar);
    }

    private baqg() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", baqf.a});
            case 3:
                return new baqg();
            case 4:
                return new aopa((byte[]) null, (int[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (baqg.class) {
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
