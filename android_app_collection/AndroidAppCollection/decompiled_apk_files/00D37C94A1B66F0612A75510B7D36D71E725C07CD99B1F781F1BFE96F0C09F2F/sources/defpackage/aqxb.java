package defpackage;
/* compiled from: PG */
/* renamed from: aqxb  reason: default package */
/* loaded from: classes2.dex */
public final class aqxb extends aopi implements aoqv {
    public static final aqxb a;
    private static volatile aorb d;
    private int e;
    private apzg f;
    private aunb g;
    private apzg h;
    private aunb i;
    private aoux j;
    private byte k = 2;
    public aopu b = emptyProtobufList();
    public aoob c = aoob.b;

    static {
        aqxb aqxbVar = new aqxb();
        a = aqxbVar;
        aopi.registerDefaultInstance(aqxb.class, aqxbVar);
    }

    private aqxb() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0006\u0001Л\u0002ᐉ\u0000\u0003ᐉ\u0004\u0004ည\u0005\u0005ᐉ\u0001\u0006ᐉ\u0003\u0007ᐉ\u0002", new Object[]{"e", "b", aunb.class, "f", "j", "c", "g", "i", "h"});
            case 3:
                return new aqxb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aqxb.class) {
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
