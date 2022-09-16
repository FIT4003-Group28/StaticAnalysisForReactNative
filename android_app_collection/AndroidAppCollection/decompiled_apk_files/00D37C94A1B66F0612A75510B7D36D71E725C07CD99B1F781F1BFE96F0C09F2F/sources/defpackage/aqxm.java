package defpackage;
/* compiled from: PG */
/* renamed from: aqxm  reason: default package */
/* loaded from: classes2.dex */
public final class aqxm extends aopi implements aoqv {
    public static final aqxm a;
    private static volatile aorb g;
    public awfh c;
    public int e;
    private int h;
    private byte i = 2;
    public aopu b = aopi.emptyProtobufList();
    public String d = "";
    public String f = "";

    static {
        aqxm aqxmVar = new aqxm();
        a = aqxmVar;
        aopi.registerDefaultInstance(aqxm.class, aqxmVar);
    }

    private aqxm() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001a\u0002ဉ\u0000\u0003ဈ\u0001\u0004ဌ\u0002\u0005ဈ\u0003", new Object[]{"h", "b", "c", "d", "e", aqvj.t, "f"});
            case 3:
                return new aqxm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aqxm.class) {
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
