package defpackage;
/* compiled from: PG */
/* renamed from: anvy  reason: default package */
/* loaded from: classes.dex */
public final class anvy extends aopi implements aoqv {
    public static final anvy a;
    private static volatile aorb j;
    public int b;
    public Object d;
    public Object f;
    public int h;
    public int c = 0;
    public int e = 0;
    private byte k = 2;
    public String g = "";
    public String i = "";

    static {
        anvy anvyVar = new anvy();
        a = anvyVar;
        aopi.registerDefaultInstance(anvy.class, anvyVar);
    }

    private anvy() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0002\u0001\u0001\u000b\u0007\u0000\u0000\u0001\u0001ျ\u0000\u0002ဈ\u0003\u0003ဌ\u0005\u0005ြ\u0001\u0006ြ\u0000\nဈ\u0007\u000bᐼ\u0000", new Object[]{"d", "c", "f", "e", "b", "g", "h", anfo.m, anvx.class, anvv.class, "i", anvw.class});
            case 3:
                return new anvy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (anvy.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
