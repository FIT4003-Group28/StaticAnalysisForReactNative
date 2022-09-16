package defpackage;
/* compiled from: PG */
/* renamed from: aukv  reason: default package */
/* loaded from: classes2.dex */
public final class aukv extends aopi implements aoqv {
    public static final aukv a;
    private static volatile aorb h;
    public int b;
    public Object d;
    public apzg e;
    public aunb f;
    public boolean g;
    private aoux i;
    public int c = 0;
    private byte j = 2;

    static {
        aukv aukvVar = new aukv();
        a = aukvVar;
        aopi.registerDefaultInstance(aukv.class, aukvVar);
    }

    private aukv() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\b\u0006\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐼ\u0000\u0004ᐉ\u0005\u0005ᐉ\u0006\u0006ᐼ\u0000\bဇ\u0007", new Object[]{"d", "c", "b", "e", avyp.class, "i", "f", avef.class, "g"});
            case 3:
                return new aukv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aukv.class) {
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
