package defpackage;
/* compiled from: PG */
/* renamed from: apvm  reason: default package */
/* loaded from: classes2.dex */
public final class apvm extends aopd implements aope {
    public static final apvm a;
    private static volatile aorb n;
    public int b;
    public Object d;
    public arag e;
    public apzg f;
    public ates g;
    public arag h;
    public int i;
    public arag j;
    public arag k;
    private arag o;
    private apzg p;
    private arag q;
    private apok r;
    private aoux s;
    private arag t;
    public int c = 0;
    private byte u = 2;
    public aoob m = aoob.b;

    static {
        apvm apvmVar = new apvm();
        a = apvmVar;
        aopi.registerDefaultInstance(apvm.class, apvmVar);
    }

    private apvm() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.u);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.u = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0010\u0001\u0001\u0001\u0014\u0010\u0000\u0000\u000e\u0001ᐉ\u0000\u0002ᐼ\u0000\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0005\u0007ည\u0011\bᐉ\u0012\tဌ\u0007\nᐉ\b\u000bᐉ\t\fᐼ\u0000\rᐉ\u0013\u000eᐉ\f\u0010ᐉ\u000f\u0012ᐉ\r\u0014ᐉ\n", new Object[]{"d", "c", "b", "e", avhn.class, "f", "g", "h", "m", "s", "i", apvq.b, "j", "k", arhs.class, "t", "p", "r", "q", "o"});
            case 3:
                return new apvm();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = n;
                if (aorbVar == null) {
                    synchronized (apvm.class) {
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
