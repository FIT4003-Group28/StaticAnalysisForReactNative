package defpackage;
/* compiled from: PG */
/* renamed from: audo  reason: default package */
/* loaded from: classes2.dex */
public final class audo extends aopi implements aoqv {
    public static final audo a;
    private static volatile aorb d;
    public aunb b;
    public boolean c;
    private int e;
    private arag f;
    private arag g;
    private arag h;
    private aunb i;
    private aunb j;
    private aoux k;
    private byte l = 2;

    static {
        audo audoVar = new audo();
        a = audoVar;
        aopi.registerDefaultInstance(audo.class, audoVar);
    }

    private audo() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\f\b\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0005ᐉ\u0003\u0006ᐉ\n\bᐉ\u0002\nဇ\u0005\u000bᐉ\u0006\fᐉ\u0007", new Object[]{"e", "f", "g", "b", "k", "h", "c", "i", "j"});
            case 3:
                return new audo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (audo.class) {
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
