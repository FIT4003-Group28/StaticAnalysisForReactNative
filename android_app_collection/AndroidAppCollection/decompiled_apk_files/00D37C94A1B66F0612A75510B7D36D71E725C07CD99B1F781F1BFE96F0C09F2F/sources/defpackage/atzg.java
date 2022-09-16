package defpackage;
/* compiled from: PG */
/* renamed from: atzg  reason: default package */
/* loaded from: classes2.dex */
public final class atzg extends aopi implements aoqv {
    public static final atzg a;
    private static volatile aorb h;
    public int b;
    public float c;
    public awad d;
    public boolean e;
    public long f;
    public long g;

    static {
        atzg atzgVar = new atzg();
        a = atzgVar;
        aopi.registerDefaultInstance(atzg.class, atzgVar);
    }

    private atzg() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ခ\u0000\u0002ဇ\u0005\u0004ဂ\u0006\u0005ဂ\u0007\u0006ဉ\u0002", new Object[]{"b", "c", "e", "f", "g", "d"});
            case 3:
                return new atzg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (atzg.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
