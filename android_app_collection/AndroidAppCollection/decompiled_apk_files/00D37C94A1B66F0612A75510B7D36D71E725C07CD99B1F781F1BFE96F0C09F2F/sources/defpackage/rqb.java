package defpackage;
/* compiled from: PG */
/* renamed from: rqb  reason: default package */
/* loaded from: classes4.dex */
public final class rqb extends aopi implements aoqv {
    public static final rqb a;
    private static volatile aorb j;
    public int b;
    public long c;
    public boolean h;
    public String d = "";
    public aopu e = emptyProtobufList();
    public aopu f = emptyProtobufList();
    public aopu g = emptyProtobufList();
    public aopu i = emptyProtobufList();

    static {
        rqb rqbVar = new rqb();
        a = rqbVar;
        aopi.registerDefaultInstance(rqb.class, rqbVar);
    }

    private rqb() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0004\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0004\u001b\u0005\u001b\u0006\u001b\bဇ\u0004\t\u001b", new Object[]{"b", "c", "d", "e", rqc.class, "f", rqa.class, "g", rpt.class, "h", "i", rqr.class});
            case 3:
                return new rqb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (rqb.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
