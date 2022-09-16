package defpackage;
/* compiled from: PG */
/* renamed from: auvh  reason: default package */
/* loaded from: classes2.dex */
public final class auvh extends aopi implements aoqv {
    public static final auvh a;
    public static final aopg b;
    private static volatile aorb i;
    public int c;
    public awnn d;
    public aqsz e;
    public boolean f;
    public boolean g;
    public awmt h;
    private atid j;
    private aoqp k = aoqp.a;
    private byte l = 2;

    static {
        auvh auvhVar = new auvh();
        a = auvhVar;
        aopi.registerDefaultInstance(auvh.class, auvhVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, auvhVar, auvhVar, null, 221293762, aosj.MESSAGE, auvh.class);
    }

    private auvh() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.l = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0001\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0005ဇ\u0004\u0006ဉ\u0005\u0007ᐉ\u0006\b2", new Object[]{"c", "d", "e", "f", "g", "j", "h", "k", auvg.a});
            case 3:
                return new auvh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (auvh.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
