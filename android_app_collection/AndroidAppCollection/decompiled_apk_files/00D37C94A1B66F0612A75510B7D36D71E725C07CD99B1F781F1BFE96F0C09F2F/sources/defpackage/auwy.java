package defpackage;
/* compiled from: PG */
/* renamed from: auwy  reason: default package */
/* loaded from: classes2.dex */
public final class auwy extends aopi implements aoqv {
    public static final auwy a;
    private static volatile aorb g;
    public int b;
    public boolean c;
    public arag d;
    public arag e;
    public apok f;
    private byte h = 2;

    static {
        auwy auwyVar = new auwy();
        a = auwyVar;
        aopi.registerDefaultInstance(auwy.class, auwyVar);
    }

    private auwy() {
    }

    public static /* synthetic */ void a(auwy auwyVar) {
        auwyVar.b |= 1;
        auwyVar.c = true;
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\f\u0016\u0004\u0000\u0000\u0003\fဇ\u0000\u0013ᐉ\u0001\u0014ᐉ\u0002\u0016ᐉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new auwy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (auwy.class) {
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
