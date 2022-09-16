package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class YpcUpdateFopEndpoint$YPCUpdateFopEndpoint extends aopi implements aoqv {
    public static final YpcUpdateFopEndpoint$YPCUpdateFopEndpoint a;
    private static volatile aorb c;
    public static final aopg ypcUpdateFopEndpoint;
    public String b = "";
    private int d;

    static {
        YpcUpdateFopEndpoint$YPCUpdateFopEndpoint ypcUpdateFopEndpoint$YPCUpdateFopEndpoint = new YpcUpdateFopEndpoint$YPCUpdateFopEndpoint();
        a = ypcUpdateFopEndpoint$YPCUpdateFopEndpoint;
        aopi.registerDefaultInstance(YpcUpdateFopEndpoint$YPCUpdateFopEndpoint.class, ypcUpdateFopEndpoint$YPCUpdateFopEndpoint);
        ypcUpdateFopEndpoint = aopi.newSingularGeneratedExtension(apzg.a, ypcUpdateFopEndpoint$YPCUpdateFopEndpoint, ypcUpdateFopEndpoint$YPCUpdateFopEndpoint, null, 151765852, aosj.MESSAGE, YpcUpdateFopEndpoint$YPCUpdateFopEndpoint.class);
    }

    private YpcUpdateFopEndpoint$YPCUpdateFopEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "b"});
            case 3:
                return new YpcUpdateFopEndpoint$YPCUpdateFopEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (YpcUpdateFopEndpoint$YPCUpdateFopEndpoint.class) {
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
