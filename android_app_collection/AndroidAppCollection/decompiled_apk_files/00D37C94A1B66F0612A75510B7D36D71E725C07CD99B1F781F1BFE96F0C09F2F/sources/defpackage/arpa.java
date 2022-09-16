package defpackage;
/* compiled from: PG */
/* renamed from: arpa  reason: default package */
/* loaded from: classes2.dex */
public final class arpa extends aopd implements aope {
    public static final arpa a;
    private static volatile aorb h;
    public int b;
    public int e;
    public ardu f;
    public aqgk g;
    private byte i = 2;
    public String c = "";
    public aopu d = emptyProtobufList();

    static {
        arpa arpaVar = new arpa();
        a = arpaVar;
        aopi.registerDefaultInstance(arpa.class, arpaVar);
    }

    private arpa() {
        emptyProtobufList();
        aopi.emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\u0016\u0005\u0000\u0001\u0001\u0002ဈ\u0001\u0006Л\u0007ဋ\u0003\u0010ဉ\f\u0016ဉ\u0011", new Object[]{"b", "c", "d", arpb.class, "e", "f", "g"});
            case 3:
                return new arpa();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (arpa.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
