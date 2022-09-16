package defpackage;
/* compiled from: PG */
/* renamed from: arrw  reason: default package */
/* loaded from: classes2.dex */
public final class arrw extends aopi implements aoqv {
    public static final arrw a;
    private static volatile aorb f;
    public arpa b;
    private int g;
    private arbf h;
    private aoux i;
    private byte j = 2;
    public aopu c = emptyProtobufList();
    public aopu d = emptyProtobufList();
    public aoob e = aoob.b;

    static {
        arrw arrwVar = new arrw();
        a = arrwVar;
        aopi.registerDefaultInstance(arrw.class, arrwVar);
    }

    private arrw() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001̉\u0006\u0000\u0002\u0005\u0001ᐉ\u0000\u0004Л\u0005Л\u000bᐉ\u0002\fည\u0003̉ᐉ\u0001", new Object[]{"g", "b", "c", arrt.class, "d", apzg.class, "i", "e", "h"});
            case 3:
                return new arrw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (arrw.class) {
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
