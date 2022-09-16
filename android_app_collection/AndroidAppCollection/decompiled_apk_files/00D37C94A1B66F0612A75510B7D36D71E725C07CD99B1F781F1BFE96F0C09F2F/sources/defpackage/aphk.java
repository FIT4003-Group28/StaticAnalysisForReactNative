package defpackage;
/* compiled from: PG */
/* renamed from: aphk  reason: default package */
/* loaded from: classes.dex */
public final class aphk extends aopi implements aoqv {
    public static final aphk a;
    private static volatile aorb i;
    public int b;
    public boolean d;
    public boolean e;
    public apzg f;
    public apzg g;
    public apzg h;
    private byte j = 2;
    public String c = "";

    static {
        aphk aphkVar = new aphk();
        a = aphkVar;
        aopi.registerDefaultInstance(aphk.class, aphkVar);
    }

    private aphk() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0003\u0001ဈ\u0000\u0002ဇ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ဇ\u0002", new Object[]{"b", "c", "d", "f", "g", "h", "e"});
            case 3:
                return new aphk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (aphk.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
