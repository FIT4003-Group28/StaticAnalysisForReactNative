package defpackage;
/* compiled from: PG */
/* renamed from: azzw  reason: default package */
/* loaded from: classes2.dex */
public final class azzw extends aopi implements aoqv {
    public static final azzw a;
    private static volatile aorb c;
    private byte d = 2;
    public aopu b = emptyProtobufList();

    static {
        azzw azzwVar = new azzw();
        a = azzwVar;
        aopi.registerDefaultInstance(azzw.class, azzwVar);
    }

    private azzw() {
    }

    public final void a() {
        aopu aopuVar = this.b;
        if (!aopuVar.c()) {
            this.b = aopi.mutableCopy(aopuVar);
        }
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", azzv.class});
            case 3:
                return new azzw();
            case 4:
                return new aopa((float[][][]) null, (boolean[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (azzw.class) {
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
