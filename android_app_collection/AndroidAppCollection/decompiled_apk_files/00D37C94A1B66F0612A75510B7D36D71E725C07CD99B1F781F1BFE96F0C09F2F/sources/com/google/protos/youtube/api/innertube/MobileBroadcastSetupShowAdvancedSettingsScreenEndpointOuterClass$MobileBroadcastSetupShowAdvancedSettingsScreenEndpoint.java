package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint extends aopi implements aoqv {
    public static final MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint a;
    private static volatile aorb d;
    public static final aopg mobileBroadcastSetupShowAdvancedSettingsScreenEndpoint;
    public int b;
    public atgs c;
    private byte e = 2;

    static {
        MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint mobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint = new MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint();
        a = mobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint;
        aopi.registerDefaultInstance(MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint.class, mobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint);
        mobileBroadcastSetupShowAdvancedSettingsScreenEndpoint = aopi.newSingularGeneratedExtension(apzg.a, mobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint, mobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint, null, 134103788, aosj.MESSAGE, MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint.class);
    }

    private MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint.class) {
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
