package defpackage;
/* compiled from: PG */
/* renamed from: aqrg  reason: default package */
/* loaded from: classes2.dex */
public final class aqrg extends aopi implements aoqv {
    public static final aqrg a;
    private static volatile aorb i;
    public int b;
    public Object d;
    public arag e;
    public arhs f;
    public arag g;
    public boolean h;
    private apzg j;
    private arag k;
    public int c = 0;
    private byte l = 2;

    static {
        aqrg aqrgVar = new aqrg();
        a = aqrgVar;
        aopi.registerDefaultInstance(aqrg.class, aqrgVar);
    }

    private aqrg() {
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
                return newMessageInfo(a, "\u0001\b\u0001\u0001\u0001\n\b\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004့\u0000\u0005ျ\u0000\u0006ဇ\u0005\tᐉ\b\nᐉ\t", new Object[]{"d", "c", "b", "e", "f", "g", "h", "j", "k"});
            case 3:
                return new aqrg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (aqrg.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
