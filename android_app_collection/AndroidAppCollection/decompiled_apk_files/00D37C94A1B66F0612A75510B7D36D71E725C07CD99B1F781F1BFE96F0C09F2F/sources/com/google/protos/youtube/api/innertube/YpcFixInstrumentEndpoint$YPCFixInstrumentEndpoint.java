package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint extends aopi implements aoqv {
    public static final YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint a;
    private static volatile aorb h;
    public static final aopg ypcFixInstrumentEndpoint;
    public Object c;
    public Object e;
    private int i;
    public int b = 0;
    public int d = 0;
    private byte j = 2;
    public aoob f = aoob.b;
    public aoob g = aoob.b;

    static {
        YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint = new YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint();
        a = ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint;
        aopi.registerDefaultInstance(YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint.class, ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint);
        ypcFixInstrumentEndpoint = aopi.newSingularGeneratedExtension(apzg.a, ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint, ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint, null, 152316869, aosj.MESSAGE, YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint.class);
    }

    private YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0006\u0002\u0001\u0001\u0006\u0006\u0000\u0000\u0004\u0001ည\u0000\u0002ᐼ\u0000\u0003ᐼ\u0000\u0004ᐼ\u0001\u0005ᐼ\u0001\u0006ည\u0005", new Object[]{"c", "b", "e", "d", "i", "f", apzg.class, apzg.class, apzg.class, apzg.class, "g"});
            case 3:
                return new YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint.class) {
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
