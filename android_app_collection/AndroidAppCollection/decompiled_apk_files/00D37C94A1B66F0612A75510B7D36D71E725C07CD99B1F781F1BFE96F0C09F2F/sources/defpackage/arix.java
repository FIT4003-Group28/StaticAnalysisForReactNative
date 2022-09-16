package defpackage;
/* compiled from: PG */
/* renamed from: arix  reason: default package */
/* loaded from: classes2.dex */
public final class arix extends aopi implements aoqv {
    public static final arix a;
    private static volatile aorb g;
    public ariz b;
    public ariu c;
    public arir e;
    public boolean f;
    private int h;
    private aoux i;
    private byte j = 2;
    public aopu d = emptyProtobufList();

    static {
        arix arixVar = new arix();
        a = arixVar;
        aopi.registerDefaultInstance(arix.class, arixVar);
    }

    private arix() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003\u001b\u0004ᐉ\u0002\u0005ᐉ\u0004\u0007ဇ\u0005", new Object[]{"h", "b", "c", "d", ariv.class, "i", "e", "f"});
            case 3:
                return new arix();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (arix.class) {
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
