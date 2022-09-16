package defpackage;
/* compiled from: PG */
/* renamed from: aoyb  reason: default package */
/* loaded from: classes.dex */
public final class aoyb extends aopi implements aoqv {
    public static final aoyb a;
    private static volatile aorb h;
    public int b;
    public int d;
    private int i;
    private byte j = 2;
    public aopu c = emptyProtobufList();
    public String e = "";
    public aopu f = emptyProtobufList();
    public aopu g = emptyProtobufList();

    static {
        aoyb aoybVar = new aoyb();
        a = aoybVar;
        aopi.registerDefaultInstance(aoyb.class, aoybVar);
    }

    private aoyb() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0003\u0001\u0001ဋ\u0000\u0002Л\u0003ဌ\u0003\u0004ဈ\u0004\u0006\u001b\u0007\u001b", new Object[]{"i", "b", "c", aoyc.class, "d", aoxm.d, "e", "f", apae.class, "g", apae.class});
            case 3:
                return new aoyb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aoyb.class) {
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
