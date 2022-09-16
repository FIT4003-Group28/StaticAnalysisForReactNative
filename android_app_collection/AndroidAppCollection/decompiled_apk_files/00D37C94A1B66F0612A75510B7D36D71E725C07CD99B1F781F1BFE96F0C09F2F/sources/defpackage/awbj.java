package defpackage;
/* compiled from: PG */
/* renamed from: awbj  reason: default package */
/* loaded from: classes2.dex */
public final class awbj extends aopi implements aoqv {
    public static final awbj a;
    private static volatile aorb i;
    public int b;
    public boolean c;
    public float d;
    public float e;
    public boolean f;
    public int g;
    public float h;

    static {
        awbj awbjVar = new awbj();
        a = awbjVar;
        aopi.registerDefaultInstance(awbj.class, awbjVar);
    }

    private awbj() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\f\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0004ခ\u0001\u0005ခ\u0002\u0007ဇ\u0003\u000bဌ\u0007\fခ\b", new Object[]{"b", "c", "d", "e", "f", "g", awbk.a, "h"});
            case 3:
                return new awbj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (awbj.class) {
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
