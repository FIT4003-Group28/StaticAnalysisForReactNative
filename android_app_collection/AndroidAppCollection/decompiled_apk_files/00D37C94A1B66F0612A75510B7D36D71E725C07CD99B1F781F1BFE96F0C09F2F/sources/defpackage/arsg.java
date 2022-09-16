package defpackage;
/* compiled from: PG */
/* renamed from: arsg  reason: default package */
/* loaded from: classes2.dex */
public final class arsg extends aopi implements aoqv {
    public static final arsg a;
    private static volatile aorb i;
    public int b;
    public arpa c;
    public aunb e;
    public int f;
    public aunb g;
    public aunb h;
    private arbf j;
    private byte k = 2;
    public aopu d = emptyProtobufList();

    static {
        arsg arsgVar = new arsg();
        a = arsgVar;
        aopi.registerDefaultInstance(arsg.class, arsgVar);
    }

    private arsg() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001̉\u0007\u0000\u0001\u0006\u0001ᐉ\u0000\u0003Л\u0004ᐉ\u0001\u0006ဌ\u0002\u0007ᐉ\u0003\bᐉ\u0004̉ᐉ\u0005", new Object[]{"b", "c", "d", aunb.class, "e", "f", atvd.a(), "g", "h", "j"});
            case 3:
                return new arsg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (arsg.class) {
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
