package defpackage;
/* compiled from: PG */
/* renamed from: apgz  reason: default package */
/* loaded from: classes.dex */
public final class apgz extends aopi implements aoqv {
    public static final apgz a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        apgz apgzVar = new apgz();
        a = apgzVar;
        aopi.registerDefaultInstance(apgz.class, apgzVar);
    }

    private apgz() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\uf076មﶫ\u17fa\u0002\u0000\u0000\u0001\uf076មᐼ\u0000ﶫ\u17faြ\u0000", new Object[]{"c", "b", aphd.class, aphe.class});
            case 3:
                return new apgz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (apgz.class) {
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
