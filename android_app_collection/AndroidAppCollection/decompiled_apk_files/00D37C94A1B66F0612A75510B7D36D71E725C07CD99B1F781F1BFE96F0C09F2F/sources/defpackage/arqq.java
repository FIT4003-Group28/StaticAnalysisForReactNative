package defpackage;
/* compiled from: PG */
/* renamed from: arqq  reason: default package */
/* loaded from: classes2.dex */
public final class arqq extends aopi implements aoqv {
    public static final arqq a;
    private static volatile aorb m;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public long i;
    public long j;
    public int k;
    public aopu l = emptyProtobufList();

    static {
        arqq arqqVar = new arqq();
        a = arqqVar;
        aopi.registerDefaultInstance(arqq.class, arqqVar);
    }

    private arqq() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0002\u0003ဋ\u0001\u0006ဇ\u0004\u0007င\u0005\u000bဂ\n\fဂ\u000b\rဌ\f\u000e\u001b\u000fင\u0006", new Object[]{"b", "c", "e", "d", "f", "g", "i", "j", "k", atov.b, "l", arqp.class, "h"});
            case 3:
                return new arqq();
            case 4:
                return new aopa((int[][]) null, (short[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (arqq.class) {
                        aorbVar = m;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            m = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
