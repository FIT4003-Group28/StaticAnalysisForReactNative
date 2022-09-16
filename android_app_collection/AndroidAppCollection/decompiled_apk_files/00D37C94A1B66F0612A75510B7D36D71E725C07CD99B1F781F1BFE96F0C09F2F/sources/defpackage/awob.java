package defpackage;
/* compiled from: PG */
/* renamed from: awob  reason: default package */
/* loaded from: classes2.dex */
public final class awob extends aopi implements aoqv {
    public static final awob a;
    public static final aopg b;
    private static volatile aorb k;
    public int c;
    public awny d;
    public awmt e;
    public awmt f;
    public awny g;
    public boolean h;
    public int i;
    public int j;
    private byte l = 2;

    static {
        awob awobVar = new awob();
        a = awobVar;
        aopi.registerDefaultInstance(awob.class, awobVar);
        b = aopi.newSingularGeneratedExtension(awow.a, awobVar, awobVar, null, 277808098, aosj.MESSAGE, awob.class);
    }

    private awob() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ဇ\u0004\u0006ဌ\u0005\u0007ဌ\u0006", new Object[]{"c", "d", "e", "f", "g", "h", "i", awkk.s, "j", awkk.r});
            case 3:
                return new awob();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (awob.class) {
                        aorbVar = k;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            k = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
