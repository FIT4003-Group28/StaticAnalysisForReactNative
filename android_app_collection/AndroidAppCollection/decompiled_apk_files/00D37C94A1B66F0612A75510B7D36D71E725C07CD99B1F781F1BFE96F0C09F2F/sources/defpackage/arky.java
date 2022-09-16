package defpackage;
/* compiled from: PG */
/* renamed from: arky  reason: default package */
/* loaded from: classes2.dex */
public final class arky extends aopi implements aoqv {
    public static final arky a;
    private static volatile aorb i;
    public int b;
    public aroy c;
    public boolean d;
    public awhb e;
    public int f;
    public float g;
    public arkx h;
    private byte j = 2;

    static {
        arky arkyVar = new arky();
        a = arkyVar;
        aopi.registerDefaultInstance(arky.class, arkyVar);
    }

    private arky() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0013\u0006\u0000\u0000\u0001\u0001ᐉ\u0000\u0004ဇ\u0005\nဉ\u000b\u000bဌ\f\rခ\r\u0013ဉ\u0011", new Object[]{"b", "c", "d", "e", "f", arka.h, "g", "h"});
            case 3:
                return new arky();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (arky.class) {
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
