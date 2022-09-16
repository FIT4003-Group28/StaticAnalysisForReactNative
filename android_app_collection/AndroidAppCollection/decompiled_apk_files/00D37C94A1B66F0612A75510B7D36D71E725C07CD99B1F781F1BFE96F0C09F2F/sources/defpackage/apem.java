package defpackage;
/* compiled from: PG */
/* renamed from: apem  reason: default package */
/* loaded from: classes.dex */
public final class apem extends aopi implements aoqv {
    public static final apem a;
    private static volatile aorb g;
    public int b;
    public apzg f;
    private byte h = 2;
    public String c = "";
    public String d = "";
    public aopu e = emptyProtobufList();

    static {
        apem apemVar = new apem();
        a = apemVar;
        aopi.registerDefaultInstance(apem.class, apemVar);
    }

    private apem() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0003Л\u0004ᐉ\u0002", new Object[]{"b", "c", "d", "e", asmc.class, "f"});
            case 3:
                return new apem();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (apem.class) {
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
