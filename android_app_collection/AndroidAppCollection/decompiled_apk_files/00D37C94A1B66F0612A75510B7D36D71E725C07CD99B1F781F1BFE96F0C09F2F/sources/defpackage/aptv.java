package defpackage;
/* compiled from: PG */
/* renamed from: aptv  reason: default package */
/* loaded from: classes2.dex */
public final class aptv extends aopi implements aoqv {
    public static final aptv a;
    private static volatile aorb k;
    public int b;
    public arag d;
    public long g;
    public arag i;
    private byte l = 2;
    public String c = "";
    public String e = "";
    public String f = "";
    public String h = "";
    public aopu j = emptyProtobufList();

    static {
        aptv aptvVar = new aptv();
        a = aptvVar;
        aopi.registerDefaultInstance(aptv.class, aptvVar);
    }

    private aptv() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0003\u0001ဈ\u0000\u0002ᐉ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0006\u0007ဈ\u0007\bᐉ\b\tЛ", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", aptx.class});
            case 3:
                return new aptv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (aptv.class) {
                        aorbVar = k;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            k = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
