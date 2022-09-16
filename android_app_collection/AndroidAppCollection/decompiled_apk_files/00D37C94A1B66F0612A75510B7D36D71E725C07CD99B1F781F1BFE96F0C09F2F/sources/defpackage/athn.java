package defpackage;
/* compiled from: PG */
/* renamed from: athn  reason: default package */
/* loaded from: classes2.dex */
public final class athn extends aopi implements aoqv {
    public static final athn a;
    private static volatile aorb d;
    public int c;
    private int e;
    private arag f;
    private byte g = 2;
    public aopu b = emptyProtobufList();

    static {
        athn athnVar = new athn();
        a = athnVar;
        aopi.registerDefaultInstance(athn.class, athnVar);
    }

    private athn() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000\u0003ဌ\u0001", new Object[]{"e", "b", athm.class, "f", "c", atdq.j});
            case 3:
                return new athn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (athn.class) {
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
