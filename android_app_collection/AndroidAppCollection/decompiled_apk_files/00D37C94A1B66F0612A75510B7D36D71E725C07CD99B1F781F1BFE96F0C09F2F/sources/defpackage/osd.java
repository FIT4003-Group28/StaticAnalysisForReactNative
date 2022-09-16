package defpackage;
/* compiled from: PG */
/* renamed from: osd  reason: default package */
/* loaded from: classes4.dex */
public final class osd extends aopi implements aoqv {
    public static final osd a;
    private static volatile aorb k;
    public int e;
    public int h;
    public int i;
    private int l;
    public String b = "";
    public aopu c = aopi.emptyProtobufList();
    public String d = "";
    public aopu f = aopi.emptyProtobufList();
    public String g = "";
    public aopq j = emptyIntList();

    static {
        osd osdVar = new osd();
        a = osdVar;
        aopi.registerDefaultInstance(osd.class, osdVar);
    }

    private osd() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001Ϫ\t\u0000\u0003\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဈ\u0001\bဌ\u0002\n\u001a\u000bဈ\u0003\rင\u0004ϩင\u0005Ϫ\u0016", new Object[]{"l", "b", "c", "d", "e", dnn.n, "f", "g", "h", "i", "j"});
            case 3:
                return new osd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (osd.class) {
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
