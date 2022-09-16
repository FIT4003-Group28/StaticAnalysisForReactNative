package defpackage;
/* compiled from: PG */
/* renamed from: atbf  reason: default package */
/* loaded from: classes2.dex */
public final class atbf extends aopi implements aoqv {
    public static final atbf a;
    private static volatile aorb i;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public String f = "";
    public int g;
    public int h;

    static {
        atbf atbfVar = new atbf();
        a = atbfVar;
        aopi.registerDefaultInstance(atbf.class, atbfVar);
    }

    private atbf() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဌ\u0004\u0006င\u0005", new Object[]{"b", "c", atck.c, "d", "e", "f", "g", atck.f, "h"});
            case 3:
                return new atbf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (atbf.class) {
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
