package defpackage;
/* compiled from: PG */
/* renamed from: autg  reason: default package */
/* loaded from: classes2.dex */
public final class autg extends aopi implements aoqv {
    public static final autg a;
    private static volatile aorb e;
    public int b;
    public aute c;
    public autf d;
    private byte f = 2;

    static {
        autg autgVar = new autg();
        a = autgVar;
        aopi.registerDefaultInstance(autg.class, autgVar);
    }

    private autg() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001ﱎ␈\uf629⧧\u0002\u0000\u0000\u0002ﱎ␈ᐉ\u0000\uf629⧧ᐉ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new autg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (autg.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
