package defpackage;
/* compiled from: PG */
/* renamed from: anfu */
/* loaded from: classes.dex */
public final class anfu extends aopi implements aoqv {
    private static final anfu a;
    private static volatile aorb b;
    private int c;
    private aopu d = emptyProtobufList();
    private String e = "";
    private anfl f;

    static {
        anfu anfuVar = new anfu();
        a = anfuVar;
        aopi.registerDefaultInstance(anfu.class, anfuVar);
    }

    private anfu() {
    }

    public static anfj a() {
        return (anfj) a.createBuilder();
    }

    public static anfu c(byte[] bArr) {
        return (anfu) aopi.parseFrom(a, bArr);
    }

    public void e(anfl anflVar) {
        anflVar.getClass();
        this.f = anflVar;
        this.c |= 16777216;
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0019\u0019\u0001\u0000\u0000\u0000\u0019ဉ\u0018", new Object[]{"c", "f"});
            case 3:
                return new anfu();
            case 4:
                return new anfj();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (anfu.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
