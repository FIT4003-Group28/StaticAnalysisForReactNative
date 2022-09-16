package defpackage;
/* compiled from: PG */
/* renamed from: apbv  reason: default package */
/* loaded from: classes.dex */
public final class apbv extends aopi implements aoqv {
    public static final apbv a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        apbv apbvVar = new apbv();
        a = apbvVar;
        aopi.registerDefaultInstance(apbv.class, apbvVar);
    }

    private apbv() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000ﻊ⍒\uf28e園\u0002\u0000\u0000\u0002ﻊ⍒ᐼ\u0000\uf28e園ᐼ\u0000", new Object[]{"c", "b", aucd.class, atmd.class});
            case 3:
                return new apbv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (apbv.class) {
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
