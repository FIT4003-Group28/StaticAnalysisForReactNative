package defpackage;
/* compiled from: PG */
/* renamed from: ardn  reason: default package */
/* loaded from: classes2.dex */
public final class ardn extends aopi implements aoqv {
    public static final ardn a;
    private static volatile aorb o;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public arag i;
    public int j;
    public int k;
    public arag l;
    public int m;
    public arag n;
    private byte p = 2;

    static {
        ardn ardnVar = new ardn();
        a = ardnVar;
        aopi.registerDefaultInstance(ardn.class, ardnVar);
    }

    private ardn() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.p = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0006\u0011\f\u0000\u0000\u0003\u0006င\u0000\u0007င\u0001\bင\u0002\tင\u0003\nင\u0007\u000bင\b\fင\n\rᐉ\u0006\u000eᐉ\t\u000fᐉ\u000b\u0010င\u0004\u0011င\u0005", new Object[]{"b", "c", "d", "e", "f", "j", "k", "m", "i", "l", "n", "g", "h"});
            case 3:
                return new ardn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = o;
                if (aorbVar == null) {
                    synchronized (ardn.class) {
                        aorbVar = o;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            o = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
