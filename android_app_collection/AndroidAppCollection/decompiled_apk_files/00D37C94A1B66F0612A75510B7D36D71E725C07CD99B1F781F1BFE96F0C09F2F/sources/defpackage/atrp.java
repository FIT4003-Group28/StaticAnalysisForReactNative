package defpackage;
/* compiled from: PG */
/* renamed from: atrp  reason: default package */
/* loaded from: classes2.dex */
public final class atrp extends aopi implements aoqv {
    public static final atrp a;
    private static volatile aorb n;
    public int b;
    public avhn d;
    public atqf e;
    public long i;
    public boolean k;
    public arag l;
    public long m;
    private byte o = 2;
    public String c = "";
    public aopu f = emptyProtobufList();
    public String g = "";
    public String h = "";
    public aopu j = emptyProtobufList();

    static {
        atrp atrpVar = new atrp();
        a = atrpVar;
        aopi.registerDefaultInstance(atrp.class, atrpVar);
    }

    private atrp() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.o = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0002\u0005\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004Л\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bЛ\tဇ\u0006\u000bᐉ\b\fဂ\t", new Object[]{"b", "c", "d", "e", "f", atsm.class, "g", "h", "i", "j", atro.class, "k", "l", "m"});
            case 3:
                return new atrp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = n;
                if (aorbVar == null) {
                    synchronized (atrp.class) {
                        aorbVar = n;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            n = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
