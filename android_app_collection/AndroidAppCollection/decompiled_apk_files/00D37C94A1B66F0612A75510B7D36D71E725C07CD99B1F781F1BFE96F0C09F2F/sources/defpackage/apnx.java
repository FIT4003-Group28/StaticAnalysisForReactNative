package defpackage;
/* compiled from: PG */
/* renamed from: apnx  reason: default package */
/* loaded from: classes.dex */
public final class apnx extends aopi implements aoqv {
    public static final apnx a;
    private static volatile aorb c;
    public apnw b;
    private int d;
    private apnu e;
    private byte f = 2;

    static {
        apnx apnxVar = new apnx();
        a = apnxVar;
        aopi.registerDefaultInstance(apnx.class, apnxVar);
    }

    private apnx() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\uf733䖢\ue98d䙇\u0002\u0000\u0000\u0001\uf733䖢ဉ\u0002\ue98d䙇ᐉ\u0003", new Object[]{"d", "b", "e"});
            case 3:
                return new apnx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (apnx.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
