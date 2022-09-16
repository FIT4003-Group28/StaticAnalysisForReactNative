package defpackage;
/* compiled from: PG */
/* renamed from: atkp  reason: default package */
/* loaded from: classes2.dex */
public final class atkp extends aopi implements aoqv {
    public static final atkp a;
    private static volatile aorb b;
    private int c;
    private int d;
    private atko e;
    private apzg f;
    private byte g = 2;

    static {
        atkp atkpVar = new atkp();
        a = atkpVar;
        aopi.registerDefaultInstance(atkp.class, atkpVar);
    }

    private atkp() {
        aopi.emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.g = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0002\u001di\u0002\u0000\u0000\u0002\u001dᐉ\u0010iᐉ4", new Object[]{"c", "d", "e", "f"});
            case 3:
                return new atkp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atkp.class) {
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
