package defpackage;
/* compiled from: PG */
/* renamed from: awni  reason: default package */
/* loaded from: classes2.dex */
public final class awni extends aopi implements aoqv {
    public static final awni a;
    public static final aopg b;
    private static volatile aorb f;
    public int c;
    public float d;
    public awmt e;
    private byte g = 2;

    static {
        awni awniVar = new awni();
        a = awniVar;
        aopi.registerDefaultInstance(awni.class, awniVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, awniVar, awniVar, null, 182590845, aosj.MESSAGE, awni.class);
    }

    private awni() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ခ\u0000\u0002ᐉ\u0001", new Object[]{"c", "d", "e"});
            case 3:
                return new awni();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (awni.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
