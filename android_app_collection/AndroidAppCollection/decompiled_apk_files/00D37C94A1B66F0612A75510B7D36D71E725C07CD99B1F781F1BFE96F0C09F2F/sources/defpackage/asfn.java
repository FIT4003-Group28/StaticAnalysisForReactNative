package defpackage;
/* compiled from: PG */
/* renamed from: asfn  reason: default package */
/* loaded from: classes2.dex */
public final class asfn extends aopi implements aoqv {
    public static final asfn a;
    private static volatile aorb m;
    public int b;
    public aroy c;
    public avxr d;
    public asvk e;
    public int g;
    public int h;
    public boolean i;
    public avtq j;
    public boolean k;
    public asfm l;
    private byte n = 2;
    public aopu f = emptyProtobufList();

    static {
        asfn asfnVar = new asfn();
        a = asfnVar;
        aopi.registerDefaultInstance(asfn.class, asfnVar);
    }

    private asfn() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0001\u0002\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဉ\u0003\u0004Л\u0005ဌ\u0004\u0006ဌ\u0005\tဇ\u0006\nဉ\u0007\u000bဇ\b\fဉ\t", new Object[]{"b", "c", "d", "e", "f", asmc.class, "g", auca.p, "h", asev.a, "i", "j", "k", "l"});
            case 3:
                return new asfn();
            case 4:
                return new aopa((int[][][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (asfn.class) {
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
