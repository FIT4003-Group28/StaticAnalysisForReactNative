package defpackage;
/* compiled from: PG */
/* renamed from: aqhg  reason: default package */
/* loaded from: classes2.dex */
public final class aqhg extends aopi implements aoqv {
    public static final aqhg a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private ates e;
    private aqhm f;
    private aqhi g;
    private aqhl h;
    private aoux i;
    private apzg j;
    private apzg k;
    private apzg l;
    private arag m;
    private arag n;
    private apzg o;
    private byte p = 2;

    static {
        aqhg aqhgVar = new aqhg();
        a = aqhgVar;
        aopi.registerDefaultInstance(aqhg.class, aqhgVar);
    }

    private aqhg() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.p = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0005\u001b\f\u0000\u0000\f\u0005ᐉ\u0004\u0007ᐉ\u0006\bᐉ\u0007\fᐉ\u000b\rᐉ\f\u000fᐉ\u000e\u0010ᐉ\u000f\u0011ᐉ\u0010\u0015ᐉ\u0014\u0017ᐉ\u0016\u0018ᐉ\u0017\u001bᐉ\u001a", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
            case 3:
                return new aqhg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqhg.class) {
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
