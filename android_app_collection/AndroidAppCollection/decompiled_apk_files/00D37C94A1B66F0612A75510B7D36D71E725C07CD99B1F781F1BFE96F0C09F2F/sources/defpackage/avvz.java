package defpackage;
/* compiled from: PG */
/* renamed from: avvz  reason: default package */
/* loaded from: classes2.dex */
public final class avvz extends aopi implements aoqv {
    public static final avvz a;
    private static volatile aorb h;
    public int b;
    public boolean c;
    public arag d;
    public apzg e;
    public asir f;
    private byte i = 2;
    public aopu g = emptyProtobufList();

    static {
        avvz avvzVar = new avvz();
        a = avvzVar;
        aopi.registerDefaultInstance(avvz.class, avvzVar);
    }

    private avvz() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0003\u0001ဇ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004Л\u0005ဉ\u0003", new Object[]{"b", "c", "d", "e", "g", avvy.class, "f"});
            case 3:
                return new avvz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (avvz.class) {
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
