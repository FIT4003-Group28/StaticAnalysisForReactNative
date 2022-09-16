package defpackage;
/* compiled from: PG */
/* renamed from: avjf  reason: default package */
/* loaded from: classes2.dex */
public final class avjf extends aopi implements aoqv {
    public static final avjf a;
    private static volatile aorb p;
    public int b;
    public auhc c;
    public arag e;
    public arag f;
    public aunb g;
    public aunb h;
    public float i;
    public avjd j;
    public avje k;
    public avjc l;
    public long m;
    public apzg o;
    private aoux q;
    private byte r = 2;
    public String d = "";
    public aoob n = aoob.b;

    static {
        avjf avjfVar = new avjf();
        a = avjfVar;
        aopi.registerDefaultInstance(avjf.class, avjfVar);
    }

    private avjf() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.r = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ခ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဂ\n\fည\u000b\rᐉ\f\u000fᐉ\r", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "q", "o"});
            case 3:
                return new avjf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = p;
                if (aorbVar == null) {
                    synchronized (avjf.class) {
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
