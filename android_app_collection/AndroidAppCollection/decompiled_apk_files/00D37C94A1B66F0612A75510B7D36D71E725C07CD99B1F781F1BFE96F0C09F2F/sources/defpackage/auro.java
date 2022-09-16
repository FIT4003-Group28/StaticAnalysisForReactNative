package defpackage;
/* compiled from: PG */
/* renamed from: auro  reason: default package */
/* loaded from: classes2.dex */
public final class auro extends aopi implements aoqv {
    public static final auro a;
    private static volatile aorb h;
    public int b;
    public boolean f;
    public apzg g;
    private aoux i;
    private byte j = 2;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        auro auroVar = new auro();
        a = auroVar;
        aopi.registerDefaultInstance(auro.class, auroVar);
    }

    private auro() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0002\u0001ဈ\u0000\u0002ဈ\u0002\u0003ဇ\u0003\u0004ᐉ\u0004\u0005ဈ\u0001\u0006ᐉ\u0005", new Object[]{"b", "c", "e", "f", "g", "d", "i"});
            case 3:
                return new auro();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (auro.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
