package defpackage;
/* compiled from: PG */
/* renamed from: auym  reason: default package */
/* loaded from: classes2.dex */
public final class auym extends aopi implements aoqv {
    public static final auym a;
    private static volatile aorb f;
    public int b;
    public arag c;
    private byte g = 2;
    public aopu d = emptyProtobufList();
    public int e = -1;

    static {
        auym auymVar = new auym();
        a = auymVar;
        aopi.registerDefaultInstance(auym.class, auymVar);
    }

    private auym() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ᐉ\u0000\u0002Л\u0003င\u0001", new Object[]{"b", "c", "d", aunb.class, "e"});
            case 3:
                return new auym();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (auym.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
