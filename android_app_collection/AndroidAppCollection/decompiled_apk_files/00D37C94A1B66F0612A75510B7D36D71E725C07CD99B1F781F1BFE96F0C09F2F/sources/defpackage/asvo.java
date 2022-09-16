package defpackage;
/* compiled from: PG */
/* renamed from: asvo  reason: default package */
/* loaded from: classes2.dex */
public final class asvo extends aopi implements aoqv {
    public static final asvo a;
    public static final aopg b;
    private static volatile aorb j;
    public int c;
    public int d;
    public boolean f;
    public boolean g;
    public float h;
    public int i;
    private aoux k;
    private byte l = 2;
    public aoob e = aoob.b;

    static {
        asvo asvoVar = new asvo();
        a = asvoVar;
        aopi.registerDefaultInstance(asvo.class, asvoVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, asvoVar, asvoVar, null, 314600826, aosj.MESSAGE, asvo.class);
    }

    private asvo() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.l = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001ဌ\u0000\u0002ည\u0001\u0003ᐉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ခ\u0005\u0007ဋ\u0006", new Object[]{"c", "d", aqov.i, "e", "k", "f", "g", "h", "i"});
            case 3:
                return new asvo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (asvo.class) {
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
