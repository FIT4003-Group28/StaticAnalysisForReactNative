package defpackage;
/* compiled from: PG */
/* renamed from: awnk  reason: default package */
/* loaded from: classes2.dex */
public final class awnk extends aopi implements aoqv {
    public static final awnk a;
    public static final aopg b;
    private static volatile aorb e;
    public awmy c;
    public awlp d;
    private int f;
    private byte g = 2;

    static {
        awnk awnkVar = new awnk();
        a = awnkVar;
        aopi.registerDefaultInstance(awnk.class, awnkVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, awnkVar, awnkVar, null, 206181248, aosj.MESSAGE, awnk.class);
    }

    private awnk() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.g = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"f", "c", "d"});
            case 3:
                return new awnk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (awnk.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
