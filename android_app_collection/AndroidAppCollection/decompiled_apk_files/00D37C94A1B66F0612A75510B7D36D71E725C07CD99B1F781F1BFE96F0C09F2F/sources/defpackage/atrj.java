package defpackage;
/* compiled from: PG */
/* renamed from: atrj  reason: default package */
/* loaded from: classes2.dex */
public final class atrj extends aopi implements aoqv {
    public static final atrj a;
    private static volatile aorb m;
    public int b;
    public atrf d;
    public long e;
    public int k;
    public boolean l;
    private byte n = 2;
    public String c = "";
    public String f = "";
    public String g = "";
    public aopu h = aopi.emptyProtobufList();
    public String i = "";
    public aopu j = aopi.emptyProtobufList();

    static {
        atrj atrjVar = new atrj();
        a = atrjVar;
        aopi.registerDefaultInstance(atrj.class, atrjVar);
    }

    private atrj() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.n = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0002\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006\u001a\u0007ဈ\u0005\b\u001a\tင\u0006\nဇ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
            case 3:
                return new atrj();
            case 4:
                return new aopa((short[][]) null, (int[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (atrj.class) {
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
