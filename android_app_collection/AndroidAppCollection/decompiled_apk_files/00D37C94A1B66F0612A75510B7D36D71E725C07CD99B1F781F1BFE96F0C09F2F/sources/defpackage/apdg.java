package defpackage;
/* compiled from: PG */
/* renamed from: apdg  reason: default package */
/* loaded from: classes.dex */
public final class apdg extends aopi implements aoqv {
    public static final apdg a;
    private static volatile aorb h;
    public int b;
    public String c = "";
    public boolean d;
    public apdi e;
    public aopu f;
    public aopu g;

    static {
        apdg apdgVar = new apdg();
        a = apdgVar;
        aopi.registerDefaultInstance(apdg.class, apdgVar);
    }

    private apdg() {
        emptyIntList();
        emptyProtobufList();
        this.f = emptyProtobufList();
        this.g = emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0002\u0000\u0001ဈ\u0000\u0003ဇ\u0001\u0005\u001b\u0006\u001b\u0007ဉ\u0002", new Object[]{"b", "c", "d", "f", apdi.class, "g", apdi.class, "e"});
            case 3:
                return new apdg();
            case 4:
                return new aopa((short[][]) null, (byte[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (apdg.class) {
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
