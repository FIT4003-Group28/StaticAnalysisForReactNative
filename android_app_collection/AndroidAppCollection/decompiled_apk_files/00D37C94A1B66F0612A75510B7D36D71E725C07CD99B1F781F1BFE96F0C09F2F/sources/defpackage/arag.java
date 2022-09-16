package defpackage;
/* compiled from: PG */
/* renamed from: arag  reason: default package */
/* loaded from: classes2.dex */
public final class arag extends aopd implements aope {
    public static final arag a;
    private static volatile aorb g;
    public int b;
    public boolean e;
    public arah f;
    private byte h = 2;
    public aopu c = emptyProtobufList();
    public String d = "";

    static {
        arag aragVar = new arag();
        a = aragVar;
        aopi.registerDefaultInstance(arag.class, aragVar);
    }

    private arag() {
    }

    public final void a() {
        aopu aopuVar = this.c;
        if (!aopuVar.c()) {
            this.c = aopi.mutableCopy(aopuVar);
        }
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001Л\u0002ဇ\u0001\u0003ဉ\u0002\u0004ဈ\u0000", new Object[]{"b", "c", arai.class, "e", "f", "d"});
            case 3:
                return new arag();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (arag.class) {
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
