package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DownloadReelItem$DownloadReelItemEndpoint extends aopi implements aoqv {
    public static final DownloadReelItem$DownloadReelItemEndpoint a;
    private static volatile aorb c;
    public static final aopg downloadReelItemEndpoint;
    public String b = "";
    private int d;

    static {
        DownloadReelItem$DownloadReelItemEndpoint downloadReelItem$DownloadReelItemEndpoint = new DownloadReelItem$DownloadReelItemEndpoint();
        a = downloadReelItem$DownloadReelItemEndpoint;
        aopi.registerDefaultInstance(DownloadReelItem$DownloadReelItemEndpoint.class, downloadReelItem$DownloadReelItemEndpoint);
        downloadReelItemEndpoint = aopi.newSingularGeneratedExtension(apzg.a, downloadReelItem$DownloadReelItemEndpoint, downloadReelItem$DownloadReelItemEndpoint, null, 188662615, aosj.MESSAGE, DownloadReelItem$DownloadReelItemEndpoint.class);
    }

    private DownloadReelItem$DownloadReelItemEndpoint() {
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
                return new DownloadReelItem$DownloadReelItemEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (DownloadReelItem$DownloadReelItemEndpoint.class) {
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
