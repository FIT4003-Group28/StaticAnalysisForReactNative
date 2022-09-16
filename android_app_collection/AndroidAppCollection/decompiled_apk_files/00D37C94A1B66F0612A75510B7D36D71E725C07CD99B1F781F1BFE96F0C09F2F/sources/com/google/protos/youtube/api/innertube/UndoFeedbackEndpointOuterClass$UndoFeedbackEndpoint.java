package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint extends aopi implements aoqv {
    public static final UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint a;
    private static volatile aorb d;
    public static final aopg undoFeedbackEndpoint;
    private int e;
    private byte f = 2;
    public String b = "";
    public aopu c = emptyProtobufList();

    static {
        UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint undoFeedbackEndpointOuterClass$UndoFeedbackEndpoint = new UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint();
        a = undoFeedbackEndpointOuterClass$UndoFeedbackEndpoint;
        aopi.registerDefaultInstance(UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint.class, undoFeedbackEndpointOuterClass$UndoFeedbackEndpoint);
        undoFeedbackEndpoint = aopi.newSingularGeneratedExtension(apzg.a, undoFeedbackEndpointOuterClass$UndoFeedbackEndpoint, undoFeedbackEndpointOuterClass$UndoFeedbackEndpoint, null, 75948536, aosj.MESSAGE, UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint.class);
    }

    private UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဈ\u0000\u0002Л", new Object[]{"e", "b", "c", apzg.class});
            case 3:
                return new UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint.class) {
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
