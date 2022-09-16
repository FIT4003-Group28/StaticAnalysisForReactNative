package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SetSettingEndpointOuterClass$SetSettingEndpoint extends aopi implements aoqv {
    public static final SetSettingEndpointOuterClass$SetSettingEndpoint a;
    private static volatile aorb g;
    public static final aopg setSettingEndpoint;
    public int b;
    public Object d;
    public int c = 0;
    private byte h = 2;
    public String e = "";
    public aopu f = emptyProtobufList();

    static {
        SetSettingEndpointOuterClass$SetSettingEndpoint setSettingEndpointOuterClass$SetSettingEndpoint = new SetSettingEndpointOuterClass$SetSettingEndpoint();
        a = setSettingEndpointOuterClass$SetSettingEndpoint;
        aopi.registerDefaultInstance(SetSettingEndpointOuterClass$SetSettingEndpoint.class, setSettingEndpointOuterClass$SetSettingEndpoint);
        setSettingEndpoint = aopi.newSingularGeneratedExtension(apzg.a, setSettingEndpointOuterClass$SetSettingEndpoint, setSettingEndpointOuterClass$SetSettingEndpoint, null, 77872990, aosj.MESSAGE, SetSettingEndpointOuterClass$SetSettingEndpoint.class);
    }

    private SetSettingEndpointOuterClass$SetSettingEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဈ\u0000\u0002ျ\u0000\u0003်\u0000\u0004ဵ\u0000\u0005Л", new Object[]{"d", "c", "b", "e", "f", apzg.class});
            case 3:
                return new SetSettingEndpointOuterClass$SetSettingEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (SetSettingEndpointOuterClass$SetSettingEndpoint.class) {
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
