package defpackage;
/* compiled from: PG */
/* renamed from: aueq  reason: default package */
/* loaded from: classes2.dex */
public final class aueq extends aopi implements aoqv {
    public static final aueq a;
    public static final aopg b;
    private static volatile aorb h;
    public int c;
    public boolean g;
    private apzg i;
    private aunb j;
    private aoux k;
    private byte l = 2;
    public aopu d = emptyProtobufList();
    public aopu e = emptyProtobufList();
    public String f = "";

    static {
        aueq aueqVar = new aueq();
        a = aueqVar;
        aopi.registerDefaultInstance(aueq.class, aueqVar);
        b = aopi.newSingularGeneratedExtension(auna.a, aueqVar, aueqVar, null, 54681060, aosj.MESSAGE, aueq.class);
    }

    private aueq() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.l = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\f\u0007\u0000\u0002\u0005\u0001Л\u0002ဈ\u0000\u0004Л\u0005ဇ\u0002\bᐉ\u0005\u000bᐉ\u0003\fᐉ\u0004", new Object[]{"c", "d", aues.class, "f", "e", auer.class, "g", "k", "i", "j"});
            case 3:
                return new aueq();
            case 4:
                return new aopa((boolean[][]) null, (short[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aueq.class) {
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
