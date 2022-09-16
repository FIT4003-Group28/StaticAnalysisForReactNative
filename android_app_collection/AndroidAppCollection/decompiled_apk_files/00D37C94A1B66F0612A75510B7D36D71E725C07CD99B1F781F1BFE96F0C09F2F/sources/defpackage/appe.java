package defpackage;
/* compiled from: PG */
/* renamed from: appe  reason: default package */
/* loaded from: classes2.dex */
public final class appe extends aopi implements aoqv {
    public static final appe a;
    private static volatile aorb f;
    public int b;
    public avaq c;
    public aptb d;
    public avtn e;
    private apoj g;
    private byte h = 2;

    static {
        appe appeVar = new appe();
        a = appeVar;
        aopi.registerDefaultInstance(appe.class, appeVar);
    }

    private appe() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\ue084ᡰ\ueb11ἑ\u0004\u0000\u0000\u0004\ue084ᡰᐉ\u0001\ue2d9ᩭᐉ\u0000\ue61fḖᐉ\u0002\ueb11ἑᐉ\u0003", new Object[]{"b", "d", "c", "e", "g"});
            case 3:
                return new appe();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (appe.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
