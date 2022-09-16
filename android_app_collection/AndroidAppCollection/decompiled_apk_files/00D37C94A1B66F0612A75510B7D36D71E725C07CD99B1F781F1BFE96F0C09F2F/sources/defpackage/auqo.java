package defpackage;
/* compiled from: PG */
/* renamed from: auqo  reason: default package */
/* loaded from: classes2.dex */
public final class auqo extends aopi implements aoqv {
    public static final auqo a;
    public static final aopg b;
    private static volatile aorb c;
    private int d;
    private apzg e;
    private byte f = 2;

    static {
        auqo auqoVar = new auqo();
        a = auqoVar;
        aopi.registerDefaultInstance(auqo.class, auqoVar);
        b = aopi.newSingularGeneratedExtension(apzg.a, auqoVar, auqoVar, null, 141229392, aosj.MESSAGE, auqo.class);
    }

    private auqo() {
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.f = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0000", new Object[]{"d", "e"});
            case 3:
                return new auqo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (auqo.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
