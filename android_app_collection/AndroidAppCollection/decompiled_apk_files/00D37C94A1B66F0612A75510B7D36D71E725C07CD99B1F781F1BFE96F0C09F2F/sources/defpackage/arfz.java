package defpackage;
/* compiled from: PG */
/* renamed from: arfz  reason: default package */
/* loaded from: classes2.dex */
public final class arfz extends aopi implements aoqv {
    public static final arfz a;
    private static volatile aorb d;
    private byte e = 2;
    public aopu b = emptyProtobufList();
    public aopu c = emptyProtobufList();

    static {
        arfz arfzVar = new arfz();
        a = arfzVar;
        aopi.registerDefaultInstance(arfz.class, arfzVar);
    }

    private arfz() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0004\u0005\u0002\u0000\u0002\u0002\u0004Л\u0005Л", new Object[]{"b", aunb.class, "c", aunb.class});
            case 3:
                return new arfz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (arfz.class) {
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
