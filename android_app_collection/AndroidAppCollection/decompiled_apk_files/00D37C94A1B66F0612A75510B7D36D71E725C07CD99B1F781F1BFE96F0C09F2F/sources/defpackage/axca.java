package defpackage;
/* compiled from: PG */
/* renamed from: axca  reason: default package */
/* loaded from: classes2.dex */
public final class axca extends aopi implements aoqv {
    public static final axca a;
    private static volatile aorb m;
    public int b;
    public String c = "";
    public String d = "";
    public aotk e;
    public aotk f;
    public awzs g;
    public int h;
    public int i;
    public float j;
    public boolean k;
    public aopu l;

    static {
        axca axcaVar = new axca();
        a = axcaVar;
        aopi.registerDefaultInstance(axca.class, axcaVar);
    }

    private axca() {
        aoob aoobVar = aoob.b;
        this.l = emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u0011\n\u0000\u0001\u0000\u0001ဈ\u0000\u0005ဈ\u0002\u0006ဉ\u0003\u0007ဉ\u0004\bဉ\u0007\tဌ\b\nဌ\t\u000bခ\n\u000fဇ\u000e\u0011\u001b", new Object[]{"b", "c", "d", "e", "f", "g", "h", awzo.a(), "i", axak.a(), "j", "k", "l", axbz.class});
            case 3:
                return new axca();
            case 4:
                return new aopa((short[]) null, (byte[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (axca.class) {
                        aorbVar = m;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            m = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
