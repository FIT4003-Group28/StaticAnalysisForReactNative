package defpackage;
/* compiled from: PG */
/* renamed from: awda  reason: default package */
/* loaded from: classes2.dex */
public final class awda extends aopd implements aope {
    public static final awda a;
    private static volatile aorb i;
    public int b;
    public awdj c;
    public awdg d;
    public int f;
    public arag g;
    public aqtd h;
    private aoux j;
    private byte k = 2;
    public aopu e = emptyProtobufList();

    static {
        awda awdaVar = new awda();
        a = awdaVar;
        aopi.registerDefaultInstance(awda.class, awdaVar);
    }

    private awda() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0001\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003Л\u0004င\u0002\u0005ᐉ\u0003\bᐉ\u0005\u000bဉ\u0004", new Object[]{"b", "c", "d", "e", awdx.class, "f", "g", "j", "h"});
            case 3:
                return new awda();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (awda.class) {
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
