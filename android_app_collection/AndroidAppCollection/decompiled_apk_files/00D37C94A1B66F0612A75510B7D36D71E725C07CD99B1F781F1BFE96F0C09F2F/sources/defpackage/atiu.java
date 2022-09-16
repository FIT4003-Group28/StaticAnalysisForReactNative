package defpackage;
/* compiled from: PG */
/* renamed from: atiu  reason: default package */
/* loaded from: classes2.dex */
public final class atiu extends aopi implements aoqv {
    public static final atiu a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        atiu atiuVar = new atiu();
        a = atiuVar;
        aopi.registerDefaultInstance(atiu.class, atiuVar);
    }

    private atiu() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0000ﻼ⨻ﯥ鴪\u0005\u0000\u0000\u0005ﻼ⨻ᐼ\u0000\ue1ce㩂ᐼ\u0000\uf5b1玨ᐼ\u0000\ue504覴ᐼ\u0000ﯥ鴪ᐼ\u0000", new Object[]{"c", "b", aswu.class, atiz.class, augv.class, aprd.class, aqyw.class});
            case 3:
                return new atiu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (atiu.class) {
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
