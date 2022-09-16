package defpackage;
/* compiled from: PG */
/* renamed from: aptk  reason: default package */
/* loaded from: classes2.dex */
public final class aptk extends aopi implements aoqv {
    public static final aptk a;
    private static volatile aorb k;
    public int b;
    public aptm c;
    public aptm d;
    public apto e;
    public apto f;
    public apto g;
    public arag h;
    public arag j;
    private byte l = 2;
    public aopu i = emptyProtobufList();

    static {
        aptk aptkVar = new aptk();
        a = aptkVar;
        aopi.registerDefaultInstance(aptk.class, aptkVar);
    }

    private aptk() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u0015\b\u0000\u0001\b\u0001ᐉ\u0000\u000eᐉ\u0002\u000fᐉ\u0004\u0010ᐉ\u0005\u0011Л\u0012ᐉ\u0006\u0013ᐉ\u0001\u0015ᐉ\u0003", new Object[]{"b", "c", "e", "g", "h", "i", aptj.class, "j", "d", "f"});
            case 3:
                return new aptk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (aptk.class) {
                        aorbVar = k;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            k = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
