package defpackage;
/* compiled from: PG */
/* renamed from: atzu  reason: default package */
/* loaded from: classes2.dex */
public final class atzu extends aopi implements aoqv {
    public static final atzu a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        atzu atzuVar = new atzu();
        a = atzuVar;
        aopi.registerDefaultInstance(atzu.class, atzuVar);
    }

    private atzu() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0000\uf549᩸\uf7ce䩰\u0005\u0000\u0000\u0005\uf549᩸ᐼ\u0000ﰛỾᐼ\u0000ﲁ㚒ᐼ\u0000\uf492䤳ᐼ\u0000\uf7ce䩰ᐼ\u0000", new Object[]{"c", "b", aqfc.class, apho.class, auuk.class, aqtb.class, atir.class});
            case 3:
                return new atzu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (atzu.class) {
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
