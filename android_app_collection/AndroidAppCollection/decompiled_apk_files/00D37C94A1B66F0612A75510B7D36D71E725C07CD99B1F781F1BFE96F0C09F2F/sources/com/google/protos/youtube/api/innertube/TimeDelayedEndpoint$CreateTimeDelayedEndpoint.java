package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class TimeDelayedEndpoint$CreateTimeDelayedEndpoint extends aopi implements aoqv {
    public static final TimeDelayedEndpoint$CreateTimeDelayedEndpoint a;
    public static final aopg createTimeDelayedEndpoint;
    private static volatile aorb h;
    public int b;
    public int d;
    public apzg f;
    private byte i = 2;
    public String c = "";
    public aopu e = emptyProtobufList();
    public aopu g = emptyProtobufList();

    static {
        TimeDelayedEndpoint$CreateTimeDelayedEndpoint timeDelayedEndpoint$CreateTimeDelayedEndpoint = new TimeDelayedEndpoint$CreateTimeDelayedEndpoint();
        a = timeDelayedEndpoint$CreateTimeDelayedEndpoint;
        aopi.registerDefaultInstance(TimeDelayedEndpoint$CreateTimeDelayedEndpoint.class, timeDelayedEndpoint$CreateTimeDelayedEndpoint);
        createTimeDelayedEndpoint = aopi.newSingularGeneratedExtension(apzg.a, timeDelayedEndpoint$CreateTimeDelayedEndpoint, timeDelayedEndpoint$CreateTimeDelayedEndpoint, null, 165976025, aosj.MESSAGE, TimeDelayedEndpoint$CreateTimeDelayedEndpoint.class);
    }

    private TimeDelayedEndpoint$CreateTimeDelayedEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0003\u0001ဈ\u0000\u0002င\u0001\u0003Л\u0004ᐉ\u0002\u0005Л", new Object[]{"b", "c", "d", "e", apzg.class, "f", "g", apzg.class});
            case 3:
                return new TimeDelayedEndpoint$CreateTimeDelayedEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (TimeDelayedEndpoint$CreateTimeDelayedEndpoint.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
