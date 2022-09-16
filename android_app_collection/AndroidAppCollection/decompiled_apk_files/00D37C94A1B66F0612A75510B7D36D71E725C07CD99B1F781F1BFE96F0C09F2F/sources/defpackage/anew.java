package defpackage;
/* compiled from: PG */
/* renamed from: anew  reason: default package */
/* loaded from: classes.dex */
public final class anew extends aopi implements aoqv {
    public static final anew a;
    private static volatile aorb h;
    public int b;
    public angg c;
    public angg e;
    public anfh f;
    public anfd g;
    private angg i;
    private byte j = 2;
    public aopu d = emptyProtobufList();

    static {
        anew anewVar = new anew();
        a = anewVar;
        aopi.registerDefaultInstance(anew.class, anewVar);
    }

    private anew() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0001\u0006\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0004\u0007ᐉ\u0006\bᐉ\u0003", new Object[]{"b", "c", "d", anfi.class, "e", "f", "g", "i"});
            case 3:
                return new anew();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (anew.class) {
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
