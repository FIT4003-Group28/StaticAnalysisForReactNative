package defpackage;
/* compiled from: PG */
/* renamed from: atvi  reason: default package */
/* loaded from: classes2.dex */
public final class atvi extends aopi implements aoqv {
    public static final atvi a;
    private static volatile aorb f;
    public int b;
    public arag d;
    public avhn e;
    private byte g = 2;
    public aopu c = emptyProtobufList();

    static {
        atvi atviVar = new atvi();
        a = atviVar;
        aopi.registerDefaultInstance(atvi.class, atviVar);
    }

    private atvi() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0003\u0001Л\u0002ᐉ\u0000\u0003ᐉ\u0001", new Object[]{"b", "c", avhn.class, "d", "e"});
            case 3:
                return new atvi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (atvi.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
