package defpackage;
/* compiled from: PG */
/* renamed from: avdv  reason: default package */
/* loaded from: classes2.dex */
public final class avdv extends aopi implements aoqv {
    public static final avdv a;
    private static volatile aorb d;
    public int b;
    public avdu c;
    private arag e;
    private arag f;
    private apzg g;
    private arag h;
    private aoux i;
    private byte j = 2;

    static {
        avdv avdvVar = new avdv();
        a = avdvVar;
        aopi.registerDefaultInstance(avdv.class, avdvVar);
    }

    private avdv() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0006\bᐉ\u0005", new Object[]{"b", "e", "f", "g", "c", "i", "h"});
            case 3:
                return new avdv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (avdv.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
