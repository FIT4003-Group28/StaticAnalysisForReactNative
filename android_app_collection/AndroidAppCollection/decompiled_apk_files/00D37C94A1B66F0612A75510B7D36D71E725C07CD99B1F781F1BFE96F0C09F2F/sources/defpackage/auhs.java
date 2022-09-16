package defpackage;
/* compiled from: PG */
/* renamed from: auhs  reason: default package */
/* loaded from: classes2.dex */
public final class auhs extends aopi implements aoqv {
    public static final auhs a;
    private static volatile aorb q;
    public int b;
    public arag c;
    public avhn d;
    public aunb e;
    public float f;
    public int g;
    public int h;
    public aunb i;
    public apzg j;
    public apzg l;
    public aunb m;
    public long n;
    public apnp o;
    public arag p;
    private byte r = 2;
    public aopu k = emptyProtobufList();

    static {
        auhs auhsVar = new auhs();
        a = auhsVar;
        aopi.registerDefaultInstance(auhs.class, auhsVar);
    }

    private auhs() {
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
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0001\t\u0001ᐉ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ခ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bᐉ\u0007\tᐉ\b\nЛ\u000bᐉ\t\fᐉ\n\rဂ\u000b\u000eဉ\f\u000fᐉ\r", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", apzg.class, "l", "m", "n", "o", "p"});
            case 3:
                return new auhs();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = q;
                if (aorbVar == null) {
                    synchronized (auhs.class) {
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
