package defpackage;
/* compiled from: PG */
/* renamed from: aurw  reason: default package */
/* loaded from: classes2.dex */
public final class aurw extends aopi implements aoqv {
    public static final aurw a;
    private static volatile aorb e;
    public arag b;
    public boolean d;
    private int f;
    private arag g;
    private byte h = 2;
    public aopu c = emptyProtobufList();

    static {
        aurw aurwVar = new aurw();
        a = aurwVar;
        aopi.registerDefaultInstance(aurw.class, aurwVar);
    }

    private aurw() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0003\u0001ᐉ\u0001\u0002Л\u0003ᐉ\u0000\u0004ဇ\u0002", new Object[]{"f", "g", "c", aurp.class, "b", "d"});
            case 3:
                return new aurw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aurw.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
