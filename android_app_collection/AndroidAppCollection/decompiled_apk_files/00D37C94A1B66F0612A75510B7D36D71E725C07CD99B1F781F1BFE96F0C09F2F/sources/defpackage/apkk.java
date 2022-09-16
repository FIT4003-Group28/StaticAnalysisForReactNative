package defpackage;
/* compiled from: PG */
/* renamed from: apkk  reason: default package */
/* loaded from: classes.dex */
public final class apkk extends aopi implements aoqv {
    public static final apkk a;
    private static volatile aorb g;
    public int b;
    public aqmu c;
    public avvh d;
    public apka e;
    public atpl f;
    private byte h = 2;

    static {
        apkk apkkVar = new apkk();
        a = apkkVar;
        aopi.registerDefaultInstance(apkk.class, apkkVar);
    }

    private apkk() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001ﱃ\u196fﮣⵇ\u0004\u0000\u0000\u0004ﱃ\u196fᐉ\u0000\ufe1a⌶ᐉ\u0003\ue607⨅ᐉ\u0001ﮣⵇᐉ\u0002", new Object[]{"b", "c", "f", "d", "e"});
            case 3:
                return new apkk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (apkk.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
