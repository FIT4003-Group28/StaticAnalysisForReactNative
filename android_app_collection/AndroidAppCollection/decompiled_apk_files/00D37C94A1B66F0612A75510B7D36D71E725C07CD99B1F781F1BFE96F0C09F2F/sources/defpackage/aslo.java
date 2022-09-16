package defpackage;
/* compiled from: PG */
/* renamed from: aslo  reason: default package */
/* loaded from: classes2.dex */
public final class aslo extends aopi implements aoqv {
    public static final aslo a;
    private static volatile aorb l;
    public int b;
    public asln c;
    public aslp d;
    public aqbx e;
    public aslv f;
    public aslu g;
    public auxp h;
    public aqtb i;
    public aumr j;
    public apvj k;
    private byte m = 2;

    static {
        aslo asloVar = new aslo();
        a = asloVar;
        aopi.registerDefaultInstance(aslo.class, asloVar);
    }

    private aslo() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\ueb5dᵆ\uf152拄\t\u0000\u0000\t\ueb5dᵆᐉ\u0000\ue1e1⩩ᐉ\u0001履\u2b4eᐉ\b\uf649㊈ᐉ\u0002\uf492䤳ᐉ\u0006\ue29d去ᐉ\u0003\ue61d姑ᐉ\u0007\ue2f4廾ᐉ\u0004\uf152拄ᐉ\u0005", new Object[]{"b", "c", "d", "k", "e", "i", "f", "j", "g", "h"});
            case 3:
                return new aslo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (aslo.class) {
                        aorbVar = l;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            l = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
