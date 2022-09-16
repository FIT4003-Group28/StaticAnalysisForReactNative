package defpackage;
/* compiled from: PG */
/* renamed from: atge  reason: default package */
/* loaded from: classes2.dex */
public final class atge extends aopi implements aoqv {
    public static final atge a;
    private static volatile aorb i;
    public int b;
    public atgb c;
    public atgb d;
    public atgg e;
    public atgb f;
    public arag g;
    public atgb h;
    private atgd j;
    private atgb k;
    private aunb l;
    private byte m = 2;

    static {
        atge atgeVar = new atge();
        a = atgeVar;
        aopi.registerDefaultInstance(atge.class, atgeVar);
    }

    private atge() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\t\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b", new Object[]{"b", "j", "c", "k", "d", "e", "f", "l", "g", "h"});
            case 3:
                return new atge();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (atge.class) {
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
