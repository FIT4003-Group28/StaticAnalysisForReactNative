package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AddContactsEndpointOuterClass$AddContactsEndpoint extends aopi implements aoqv {
    public static final AddContactsEndpointOuterClass$AddContactsEndpoint a;
    public static final aopg addContactsEndpoint;
    private static volatile aorb c;
    public String b = "";
    private int d;

    static {
        AddContactsEndpointOuterClass$AddContactsEndpoint addContactsEndpointOuterClass$AddContactsEndpoint = new AddContactsEndpointOuterClass$AddContactsEndpoint();
        a = addContactsEndpointOuterClass$AddContactsEndpoint;
        aopi.registerDefaultInstance(AddContactsEndpointOuterClass$AddContactsEndpoint.class, addContactsEndpointOuterClass$AddContactsEndpoint);
        addContactsEndpoint = aopi.newSingularGeneratedExtension(apzg.a, addContactsEndpointOuterClass$AddContactsEndpoint, addContactsEndpointOuterClass$AddContactsEndpoint, null, 126354119, aosj.MESSAGE, AddContactsEndpointOuterClass$AddContactsEndpoint.class);
    }

    private AddContactsEndpointOuterClass$AddContactsEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"d", "b"});
            case 3:
                return new AddContactsEndpointOuterClass$AddContactsEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (AddContactsEndpointOuterClass$AddContactsEndpoint.class) {
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
