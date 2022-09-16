package defpackage;
/* compiled from: PG */
/* renamed from: awwm  reason: default package */
/* loaded from: classes2.dex */
public final class awwm extends aopd implements aope {
    public static final awwm a;
    private static volatile aorb i;
    public int b;
    public anuy c;
    public int f;
    public awwi g;
    public awxa h;
    private byte j = 2;
    public String d = "";
    public String e = "";

    static {
        awwm awwmVar = new awwm();
        a = awwmVar;
        aopi.registerDefaultInstance(awwm.class, awwmVar);
    }

    private awwm() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဉ\u0004\u0006ᐉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new awwm();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (awwm.class) {
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
