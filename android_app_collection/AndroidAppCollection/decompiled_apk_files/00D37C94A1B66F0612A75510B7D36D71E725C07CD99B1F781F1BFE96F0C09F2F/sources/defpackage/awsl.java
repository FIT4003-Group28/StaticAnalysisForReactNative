package defpackage;
/* compiled from: PG */
/* renamed from: awsl  reason: default package */
/* loaded from: classes2.dex */
public final class awsl extends aopi implements aoqv {
    public static final awsl a;
    public static final aopg b;
    private static volatile aorb q;
    public int c;
    public int d;
    public awmt e;
    public awny f;
    public boolean g;
    public boolean h;
    public awma i;
    public awmt j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public avhe p;
    private byte r = 2;

    static {
        awsl awslVar = new awsl();
        a = awslVar;
        aopi.registerDefaultInstance(awsl.class, awslVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, awslVar, awslVar, null, 217165905, aosj.MESSAGE, awsl.class);
    }

    private awsl() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.r = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0002\u0012\r\u0000\u0000\u0005\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဌ\u0000\u0006ဇ\u0003\u0007ᐉ\u0005\bᐉ\u0006\tဌ\u0007\nဌ\b\u000bဇ\u0004\fဌ\t\rဌ\u000b\u000eᐉ\f\u0012ဌ\n", new Object[]{"c", "e", "f", "d", awsi.d, "g", "i", "j", "k", arjz.a(), "l", arjm.a(), "h", "m", arjo.a(), "o", awkk.p, "p", "n", arjy.a()});
            case 3:
                return new awsl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = q;
                if (aorbVar == null) {
                    synchronized (awsl.class) {
                        aorbVar = q;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            q = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
