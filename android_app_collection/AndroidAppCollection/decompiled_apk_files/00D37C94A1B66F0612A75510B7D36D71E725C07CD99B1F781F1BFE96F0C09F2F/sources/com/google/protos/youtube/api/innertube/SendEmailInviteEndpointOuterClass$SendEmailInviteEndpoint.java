package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SendEmailInviteEndpointOuterClass$SendEmailInviteEndpoint extends aopi implements aoqv {
    public static final SendEmailInviteEndpointOuterClass$SendEmailInviteEndpoint a;
    private static volatile aorb b;
    public static final aopg sendEmailInviteEndpoint;

    static {
        SendEmailInviteEndpointOuterClass$SendEmailInviteEndpoint sendEmailInviteEndpointOuterClass$SendEmailInviteEndpoint = new SendEmailInviteEndpointOuterClass$SendEmailInviteEndpoint();
        a = sendEmailInviteEndpointOuterClass$SendEmailInviteEndpoint;
        aopi.registerDefaultInstance(SendEmailInviteEndpointOuterClass$SendEmailInviteEndpoint.class, sendEmailInviteEndpointOuterClass$SendEmailInviteEndpoint);
        sendEmailInviteEndpoint = aopi.newSingularGeneratedExtension(apzg.a, sendEmailInviteEndpointOuterClass$SendEmailInviteEndpoint, sendEmailInviteEndpointOuterClass$SendEmailInviteEndpoint, null, 164012079, aosj.MESSAGE, SendEmailInviteEndpointOuterClass$SendEmailInviteEndpoint.class);
    }

    private SendEmailInviteEndpointOuterClass$SendEmailInviteEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new SendEmailInviteEndpointOuterClass$SendEmailInviteEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (SendEmailInviteEndpointOuterClass$SendEmailInviteEndpoint.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
