package defpackage;
/* compiled from: PG */
/* renamed from: apkb  reason: default package */
/* loaded from: classes.dex */
public final class apkb extends aopi implements aoqv {
    public static final apkb a;
    private static volatile aorb c;
    private int d;
    private aoxp e;
    private byte f = 2;
    public aopu b = emptyProtobufList();

    static {
        apkb apkbVar = new apkb();
        a = apkbVar;
        aopi.registerDefaultInstance(apkb.class, apkbVar);
    }

    private apkb() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000", new Object[]{"d", "b", apzg.class, "e"});
            case 3:
                return new apkb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (apkb.class) {
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
