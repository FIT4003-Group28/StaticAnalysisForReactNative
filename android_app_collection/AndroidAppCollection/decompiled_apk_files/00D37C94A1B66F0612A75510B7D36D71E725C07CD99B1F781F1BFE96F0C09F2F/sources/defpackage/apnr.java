package defpackage;
/* compiled from: PG */
/* renamed from: apnr  reason: default package */
/* loaded from: classes.dex */
public final class apnr extends aopi implements aoqv {
    public static final apnr a;
    private static volatile aorb i;
    public int b;
    public Object d;
    public aopu e;
    public aunb f;
    public aunb g;
    public aoob h;
    private apaq j;
    private aoux k;
    public int c = 0;
    private byte l = 2;

    static {
        apnr apnrVar = new apnr();
        a = apnrVar;
        aopi.registerDefaultInstance(apnr.class, apnrVar);
    }

    private apnr() {
        emptyProtobufList();
        this.e = emptyProtobufList();
        emptyProtobufList();
        this.h = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0001\u0001\u0007\u0014\b\u0000\u0001\u0007\u0007ᐉ\u0007\bᐼ\u0000\nЛ\rᐉ\r\u000eᐉ\u000e\u000fᐉ\u000f\u0010ည\u0010\u0014ᐼ\u0000", new Object[]{"d", "c", "b", "j", apaq.class, "e", apzg.class, "f", "g", "k", "h", aunb.class});
            case 3:
                return new apnr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (apnr.class) {
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
