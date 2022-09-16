package defpackage;
/* compiled from: PG */
/* renamed from: auqi  reason: default package */
/* loaded from: classes2.dex */
public final class auqi extends aopi implements aoqv {
    public static final auqi a;
    private static volatile aorb j;
    public int b;
    public apuj c;
    public aupp d;
    public auxr e;
    public aspe f;
    public apsv g;
    public auov h;
    public aqtb i;
    private byte k = 2;

    static {
        auqi auqiVar = new auqi();
        a = auqiVar;
        aopi.registerDefaultInstance(auqi.class, auqiVar);
    }

    private auqi() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001ﶝ\u171d\uf492䤳\u0007\u0000\u0000\u0007ﶝ\u171dᐉ\u0004\ue7a7ᦌᐉ\u0000龜ℶᐉ\u0001\ue952⒡ᐉ\u0002\ueda0⣽ᐉ\u0003\ue8b0㻿ᐉ\u0005\uf492䤳ᐉ\u0006", new Object[]{"b", "g", "c", "d", "e", "f", "h", "i"});
            case 3:
                return new auqi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (auqi.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
