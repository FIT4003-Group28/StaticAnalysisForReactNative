package defpackage;
/* compiled from: PG */
/* renamed from: aqyh  reason: default package */
/* loaded from: classes2.dex */
public final class aqyh extends aopi implements aoqv {
    public static final aqyh a;
    private static volatile aorb j;
    public int b;
    public Object d;
    public apzg h;
    public aqyi i;
    public int c = 0;
    private byte k = 2;
    public String e = "";
    public aopu f = emptyProtobufList();
    public String g = "";

    static {
        aqyh aqyhVar = new aqyh();
        a = aqyhVar;
        aopi.registerDefaultInstance(aqyh.class, aqyhVar);
    }

    private aqyh() {
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0001\u0001\u0001\n\u0007\u0000\u0001\u0002\u0001ဈ\u0000\u0002ဉ\u0006\u0004Л\u0005ဈ\u0002\u0007ဵ\u0000\bဵ\u0000\nᐉ\u0005", new Object[]{"d", "c", "b", "e", "i", "f", apzg.class, "g", "h"});
            case 3:
                return new aqyh();
            case 4:
                return new aopa((byte[][][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (aqyh.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
