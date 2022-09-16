package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: aovx */
/* loaded from: classes.dex */
public final class aovx extends aopi implements aoqv {
    private static final aopr a = new uil(7);
    private static final aovx b;
    private static volatile aorb c;
    private aopq d = emptyIntList();

    static {
        aovx aovxVar = new aovx();
        b = aovxVar;
        aopi.registerDefaultInstance(aovx.class, aovxVar);
    }

    private aovx() {
    }

    public static aovw a() {
        return (aovw) b.createBuilder();
    }

    public static /* synthetic */ void c(aovx aovxVar, Iterable iterable) {
        aovxVar.d(iterable);
    }

    public void d(Iterable iterable) {
        e();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.d.g(((aovv) it.next()).h);
        }
    }

    private void e() {
        aopq aopqVar = this.d;
        if (!aopqVar.c()) {
            this.d = aopi.mutableCopy(aopqVar);
        }
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
                return newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"d", aovv.a()});
            case 3:
                return new aovx();
            case 4:
                return new aovw();
            case 5:
                return b;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (aovx.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(b);
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
