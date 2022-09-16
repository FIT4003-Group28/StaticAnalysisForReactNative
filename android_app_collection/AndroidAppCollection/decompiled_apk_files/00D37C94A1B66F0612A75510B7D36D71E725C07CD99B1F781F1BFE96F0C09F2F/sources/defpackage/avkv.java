package defpackage;
/* compiled from: PG */
/* renamed from: avkv  reason: default package */
/* loaded from: classes2.dex */
public final class avkv extends aopi implements aoqv {
    public static final avkv a;
    private static volatile aorb i;
    public arag b;
    public int c;
    public int d;
    public int e;
    public int f;
    public aunb g;
    public boolean h;
    private int j;
    private byte k = 2;

    static {
        avkv avkvVar = new avkv();
        a = avkvVar;
        aopi.registerDefaultInstance(avkv.class, avkvVar);
    }

    private avkv() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ᐉ\u0005\u0007ဇ\u0006", new Object[]{"j", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new avkv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (avkv.class) {
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
