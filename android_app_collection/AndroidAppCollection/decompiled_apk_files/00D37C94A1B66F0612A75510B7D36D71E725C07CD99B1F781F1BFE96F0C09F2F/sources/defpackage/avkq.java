package defpackage;
/* compiled from: PG */
/* renamed from: avkq  reason: default package */
/* loaded from: classes2.dex */
public final class avkq extends aopi implements aoqv {
    public static final avkq a;
    public static final aopg b;
    private static volatile aorb p;
    public int c;
    public int e;
    public int g;
    public long j;
    public int k;
    public int n;
    public boolean o;
    public String d = "";
    public aopu f = emptyProtobufList();
    public aopu h = aopi.emptyProtobufList();
    public String i = "";
    public String l = "";
    public aopu m = aopi.emptyProtobufList();

    static {
        avkq avkqVar = new avkq();
        a = avkqVar;
        aopi.registerDefaultInstance(avkq.class, avkqVar);
        b = aopi.newSingularGeneratedExtension(aqwe.a, avkqVar, avkqVar, null, 120, aosj.MESSAGE, avkq.class);
    }

    private avkq() {
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
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003\u001b\u0004ဌ\u0002\u0005\u001a\u0006ဈ\u0003\u0007ဂ\u0004\bဌ\u0005\tဈ\u0006\n\u001a\u000bင\u0007\fဇ\b", new Object[]{"c", "d", "e", avkl.a(), "f", auzy.class, "g", avkm.a(), "h", "i", "j", "k", attl.a(), "l", "m", "n", "o"});
            case 3:
                return new avkq();
            case 4:
                return new aopa((byte[][]) null, (char[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = p;
                if (aorbVar == null) {
                    synchronized (avkq.class) {
                        aorbVar = p;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            p = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
