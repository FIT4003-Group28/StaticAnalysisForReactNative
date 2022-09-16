package defpackage;
/* compiled from: PG */
/* renamed from: aqch  reason: default package */
/* loaded from: classes2.dex */
public final class aqch extends aopi implements aoqv {
    public static final aqch a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private apzg f;
    private arag g;
    private arag h;
    private arag i;
    private apzg j;
    private aoux k;
    private byte l = 2;

    static {
        aqch aqchVar = new aqch();
        a = aqchVar;
        aopi.registerDefaultInstance(aqch.class, aqchVar);
    }

    private aqch() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.l = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\b\u0004ᐉ\n\u0005ᐉ\u0001\u0007ᐉ\u0003\bᐉ\u0004\nᐉ\u0006\u000bᐉ\u0007", new Object[]{"c", "d", "j", "k", "e", "f", "g", "h", "i"});
            case 3:
                return new aqch();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqch.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
