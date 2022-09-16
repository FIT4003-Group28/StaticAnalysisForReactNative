package defpackage;
/* compiled from: PG */
/* renamed from: auzj  reason: default package */
/* loaded from: classes2.dex */
public final class auzj extends aopi implements aoqv {
    public static final auzj a;
    private static volatile aorb d;
    public int c;
    private int e;
    private byte f = 2;
    public aopu b = emptyProtobufList();

    static {
        auzj auzjVar = new auzj();
        a = auzjVar;
        aopi.registerDefaultInstance(auzj.class, auzjVar);
    }

    private auzj() {
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0001\u0001Л\u0003င\u0000", new Object[]{"e", "b", aunb.class, "c"});
            case 3:
                return new auzj();
            case 4:
                return new aopa((float[][]) null, (short[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (auzj.class) {
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
