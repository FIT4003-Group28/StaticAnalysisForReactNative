package defpackage;
/* compiled from: PG */
/* renamed from: atgr  reason: default package */
/* loaded from: classes2.dex */
public final class atgr extends aopi implements aoqv {
    public static final atgr a;
    private static volatile aorb g;
    public int b;
    public aunb c;
    public arag d;
    public int f;
    private byte h = 2;
    public aopu e = emptyProtobufList();

    static {
        atgr atgrVar = new atgr();
        a = atgrVar;
        aopi.registerDefaultInstance(atgr.class, atgrVar);
    }

    private atgr() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003Л\u0004င\u0002", new Object[]{"b", "c", "d", "e", aunb.class, "f"});
            case 3:
                return new atgr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (atgr.class) {
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
