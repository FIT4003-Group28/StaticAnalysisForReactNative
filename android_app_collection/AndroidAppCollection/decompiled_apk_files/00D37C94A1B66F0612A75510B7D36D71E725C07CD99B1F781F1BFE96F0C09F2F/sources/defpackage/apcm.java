package defpackage;
/* compiled from: PG */
/* renamed from: apcm  reason: default package */
/* loaded from: classes.dex */
public final class apcm extends aopi implements aoqv {
    public static final apcm a;
    private static volatile aorb d;
    public int b = 0;
    public Object c;

    static {
        apcm apcmVar = new apcm();
        a = apcmVar;
        aopi.registerDefaultInstance(apcm.class, apcmVar);
    }

    private apcm() {
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
                return newMessageInfo(a, "\u0001\u000e\u0001\u0000\u0001\u000e\u000e\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000\u000bြ\u0000\fြ\u0000\rြ\u0000\u000eြ\u0000", new Object[]{"c", "b", apco.class, apct.class, apcp.class, apcr.class, apcq.class, apdk.class, apdf.class, apcw.class, apcn.class, apcu.class, apcl.class, apcs.class, apch.class, apcj.class});
            case 3:
                return new apcm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (apcm.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
