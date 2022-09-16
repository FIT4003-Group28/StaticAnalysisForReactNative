package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RemoveContactActionOuterClass$RemoveContactAction extends aopi implements aoqv {
    public static final RemoveContactActionOuterClass$RemoveContactAction a;
    private static volatile aorb b;
    public static final aopg removeContactAction;

    static {
        RemoveContactActionOuterClass$RemoveContactAction removeContactActionOuterClass$RemoveContactAction = new RemoveContactActionOuterClass$RemoveContactAction();
        a = removeContactActionOuterClass$RemoveContactAction;
        aopi.registerDefaultInstance(RemoveContactActionOuterClass$RemoveContactAction.class, removeContactActionOuterClass$RemoveContactAction);
        removeContactAction = aopi.newSingularGeneratedExtension(apzg.a, removeContactActionOuterClass$RemoveContactAction, removeContactActionOuterClass$RemoveContactAction, null, 102580987, aosj.MESSAGE, RemoveContactActionOuterClass$RemoveContactAction.class);
    }

    private RemoveContactActionOuterClass$RemoveContactAction() {
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
                return new RemoveContactActionOuterClass$RemoveContactAction();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (RemoveContactActionOuterClass$RemoveContactAction.class) {
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
