package defpackage;
/* compiled from: PG */
/* renamed from: angv  reason: default package */
/* loaded from: classes.dex */
public final class angv extends aopi implements aoqv {
    public static final angv a;
    private static volatile aorb i;
    public int b;
    public angn c;
    public int d;
    public long e;
    public long f;
    public String g = "";
    public int h;

    static {
        angv angvVar = new angv();
        a = angvVar;
        aopi.registerDefaultInstance(angv.class, angvVar);
    }

    private angv() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006င\u0005", new Object[]{"b", "c", "d", anfo.d, "e", "f", "g", "h"});
            case 3:
                return new angv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (angv.class) {
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
