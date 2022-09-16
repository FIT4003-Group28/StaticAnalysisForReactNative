package defpackage;
/* compiled from: PG */
/* renamed from: anfh  reason: default package */
/* loaded from: classes.dex */
public final class anfh extends aopd implements aope {
    public static final anfh a;
    private static volatile aorb k;
    public int b;
    public angf c;
    public int e;
    public int f;
    public int g;
    public anev j;
    private byte m = 2;
    public int d = -1;
    public int h = -1;
    public aopu i = emptyProtobufList();

    static {
        anfh anfhVar = new anfh();
        a = anfhVar;
        aopi.registerDefaultInstance(anfh.class, anfhVar);
    }

    private anfh() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u0010\b\u0000\u0001\u0003\u0001င\u0002\u0003င\u0004\u0004င\u0005\u0005င\u0006\u0006င\u0007\u000eЛ\u000fᐉ\u000e\u0010ᐉ\u0000", new Object[]{"b", "d", "e", "f", "g", "h", "i", anfi.class, "j", "c"});
            case 3:
                return new anfh();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (anfh.class) {
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
