package defpackage;
/* compiled from: PG */
/* renamed from: aqtn  reason: default package */
/* loaded from: classes2.dex */
public final class aqtn extends aopi implements aoqv {
    public static final aqtn a;
    private static volatile aorb k;
    public int b;
    public Object d;
    public arag e;
    public arag f;
    public avhn g;
    public aunb h;
    public aunb i;
    public aunb j;
    private apok l;
    private aunb m;
    private awgm n;
    public int c = 0;
    private byte o = 2;

    static {
        aqtn aqtnVar = new aqtn();
        a = aqtnVar;
        aopi.registerDefaultInstance(aqtn.class, aqtnVar);
    }

    private aqtn() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.o = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0001\u0001\u0001\u0013\u000b\u0000\u0000\t\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0003\u0006ှ\u0000\u0007ᐉ\u0006\bᐉ\u0007\nျ\u0000\u000bᐉ\b\u0012ᐉ\u000b\u0013ᐉ\t", new Object[]{"d", "c", "b", "e", "f", "g", "l", "h", "i", "j", "n", "m"});
            case 3:
                return new aqtn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (aqtn.class) {
                        aorbVar = k;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            k = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
