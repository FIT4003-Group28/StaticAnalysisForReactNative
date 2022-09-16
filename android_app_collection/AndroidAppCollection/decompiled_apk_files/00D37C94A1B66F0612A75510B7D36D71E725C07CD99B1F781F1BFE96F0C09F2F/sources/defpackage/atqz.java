package defpackage;
/* compiled from: PG */
/* renamed from: atqz  reason: default package */
/* loaded from: classes2.dex */
public final class atqz extends aopi implements aoqv {
    public static final atqz a;
    public static final aopg b;
    private static volatile aorb d;
    private byte e = 2;
    public aopu c = emptyProtobufList();

    static {
        atqz atqzVar = new atqz();
        a = atqzVar;
        aopi.registerDefaultInstance(atqz.class, atqzVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, atqzVar, atqzVar, null, 289177740, aosj.MESSAGE, atqz.class);
    }

    private atqz() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.e = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"c", atrf.class});
            case 3:
                return new atqz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (atqz.class) {
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
