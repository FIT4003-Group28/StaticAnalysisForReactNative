package defpackage;
/* compiled from: PG */
/* renamed from: apke  reason: default package */
/* loaded from: classes.dex */
public final class apke extends aopi implements aoqv {
    public static final apke a;
    private static volatile aorb l;
    public int b;
    public Object d;
    public arag e;
    public arag f;
    public int g;
    public apkd h;
    public apkd i;
    public apkf j;
    private aoux m;
    public int c = 0;
    private byte n = 2;
    public aoob k = aoob.b;

    static {
        apke apkeVar = new apke();
        a = apkeVar;
        aopi.registerDefaultInstance(apke.class, apkeVar);
    }

    private apke() {
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
                return newMessageInfo(a, "\u0001\u000b\u0001\u0001\u0001\u000b\u000b\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ြ\u0000\u0004ဋ\u0005\u0005ᐉ\t\u0006ည\n\u0007ᐼ\u0000\bᐉ\u0006\tဉ\b\nᐉ\u0007\u000bᐼ\u0000", new Object[]{"d", "c", "b", "e", "f", apkg.class, "g", "m", "k", avhn.class, "h", "j", "i", apki.class});
            case 3:
                return new apke();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (apke.class) {
                        aorbVar = l;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            l = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
