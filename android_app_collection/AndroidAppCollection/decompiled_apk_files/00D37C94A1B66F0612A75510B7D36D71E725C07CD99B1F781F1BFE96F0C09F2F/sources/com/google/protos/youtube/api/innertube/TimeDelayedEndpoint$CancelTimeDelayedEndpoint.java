package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class TimeDelayedEndpoint$CancelTimeDelayedEndpoint extends aopi implements aoqv {
    public static final TimeDelayedEndpoint$CancelTimeDelayedEndpoint a;
    public static final aopg cancelTimeDelayedEndpoint;
    private static volatile aorb d;
    public int b;
    public String c = "";

    static {
        TimeDelayedEndpoint$CancelTimeDelayedEndpoint timeDelayedEndpoint$CancelTimeDelayedEndpoint = new TimeDelayedEndpoint$CancelTimeDelayedEndpoint();
        a = timeDelayedEndpoint$CancelTimeDelayedEndpoint;
        aopi.registerDefaultInstance(TimeDelayedEndpoint$CancelTimeDelayedEndpoint.class, timeDelayedEndpoint$CancelTimeDelayedEndpoint);
        cancelTimeDelayedEndpoint = aopi.newSingularGeneratedExtension(apzg.a, timeDelayedEndpoint$CancelTimeDelayedEndpoint, timeDelayedEndpoint$CancelTimeDelayedEndpoint, null, 166907542, aosj.MESSAGE, TimeDelayedEndpoint$CancelTimeDelayedEndpoint.class);
    }

    private TimeDelayedEndpoint$CancelTimeDelayedEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"b", "c"});
            case 3:
                return new TimeDelayedEndpoint$CancelTimeDelayedEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (TimeDelayedEndpoint$CancelTimeDelayedEndpoint.class) {
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
