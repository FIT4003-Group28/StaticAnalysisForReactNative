package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint extends aopi implements aoqv {
    public static final FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint a;
    private static volatile aorb e;
    public static final aopg formfillPostSubmitEndpoint;
    public apae b;
    public String c = "";
    public int d;
    private int f;

    static {
        FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint formfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint = new FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint();
        a = formfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint;
        aopi.registerDefaultInstance(FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.class, formfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint);
        formfillPostSubmitEndpoint = aopi.newSingularGeneratedExtension(apzg.a, formfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint, formfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint, null, 160183255, aosj.MESSAGE, FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.class);
    }

    private FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0006ဈ\u0005\u0007ဌ\u0006", new Object[]{"f", "b", "c", "d", aqyp.p});
            case 3:
                return new FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
