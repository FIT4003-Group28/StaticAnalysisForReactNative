package defpackage;
/* compiled from: PG */
/* renamed from: arzf  reason: default package */
/* loaded from: classes2.dex */
public final class arzf extends aopi implements aoqv {
    public static final arzf a;
    private static volatile aorb i;
    public int b;
    public arpa c;
    public asaa d;
    public apzg e;
    public long f;
    public arzs g;
    private byte j = 2;
    public aoob h = aoob.b;

    static {
        arzf arzfVar = new arzf();
        a = arzfVar;
        aopi.registerDefaultInstance(arzf.class, arzfVar);
    }

    private arzf() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0006ᐉ\u0004\u0007ဂ\u0005\bဉ\u0006\nည\b", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new arzf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (arzf.class) {
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
