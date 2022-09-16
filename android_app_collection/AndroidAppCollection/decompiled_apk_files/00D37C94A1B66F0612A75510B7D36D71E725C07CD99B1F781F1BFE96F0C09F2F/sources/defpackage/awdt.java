package defpackage;
/* compiled from: PG */
/* renamed from: awdt  reason: default package */
/* loaded from: classes2.dex */
public final class awdt extends aopi implements aoqv {
    public static final awdt a;
    private static volatile aorb o;
    public int b;
    public Object d;
    public arag e;
    public apzg f;
    public arag g;
    public awcy i;
    public awcy j;
    public aunb k;
    public aunb l;
    public int m;
    private aoux p;
    public int c = 0;
    private byte q = 2;
    public aopu h = emptyProtobufList();
    public aoob n = aoob.b;

    static {
        awdt awdtVar = new awdt();
        a = awdtVar;
        aopi.registerDefaultInstance(awdt.class, awdtVar);
    }

    private awdt() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.q = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000f\u0001\u0001\u0001\u000f\u000f\u0000\u0001\u000b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004Л\u0005ᐼ\u0000\u0006ဉ\u0007\u0007ᐉ\f\bည\r\tᐼ\u0000\nᐼ\u0000\u000bᐉ\t\fᐉ\n\rဉ\b\u000eᐼ\u0000\u000fဌ\u000b", new Object[]{"d", "c", "b", "e", "f", "g", "h", awdf.class, avhn.class, "i", "p", "n", arag.class, apok.class, "k", "l", "j", aunb.class, "m", awbk.g});
            case 3:
                return new awdt();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = o;
                if (aorbVar == null) {
                    synchronized (awdt.class) {
                        aorbVar = o;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            o = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
