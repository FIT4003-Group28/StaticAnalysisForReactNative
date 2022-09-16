package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SetClientSettingEndpointOuterClass$SetClientSettingEndpoint extends aopi implements aoqv {
    public static final SetClientSettingEndpointOuterClass$SetClientSettingEndpoint a;
    private static volatile aorb d;
    public static final aopg setClientSettingEndpoint;
    private byte e = 2;
    public aopu b = emptyProtobufList();
    public aopu c = emptyProtobufList();

    static {
        SetClientSettingEndpointOuterClass$SetClientSettingEndpoint setClientSettingEndpointOuterClass$SetClientSettingEndpoint = new SetClientSettingEndpointOuterClass$SetClientSettingEndpoint();
        a = setClientSettingEndpointOuterClass$SetClientSettingEndpoint;
        aopi.registerDefaultInstance(SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.class, setClientSettingEndpointOuterClass$SetClientSettingEndpoint);
        setClientSettingEndpoint = aopi.newSingularGeneratedExtension(apzg.a, setClientSettingEndpointOuterClass$SetClientSettingEndpoint, setClientSettingEndpointOuterClass$SetClientSettingEndpoint, null, 81212182, aosj.MESSAGE, SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.class);
    }

    private SetClientSettingEndpointOuterClass$SetClientSettingEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0001\u0001\u001b\u0002Л", new Object[]{"b", auqu.class, "c", apzg.class});
            case 3:
                return new SetClientSettingEndpointOuterClass$SetClientSettingEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.class) {
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
