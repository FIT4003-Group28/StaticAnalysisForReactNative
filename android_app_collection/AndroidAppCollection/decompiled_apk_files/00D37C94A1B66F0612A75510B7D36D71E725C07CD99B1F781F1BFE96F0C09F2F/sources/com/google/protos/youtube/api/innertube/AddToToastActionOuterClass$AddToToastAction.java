package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AddToToastActionOuterClass$AddToToastAction extends aopi implements aoqv {
    public static final AddToToastActionOuterClass$AddToToastAction a;
    public static final aopg addToToastAction;
    private static volatile aorb c;
    public apbx b;
    private int d;
    private byte e = 2;

    static {
        AddToToastActionOuterClass$AddToToastAction addToToastActionOuterClass$AddToToastAction = new AddToToastActionOuterClass$AddToToastAction();
        a = addToToastActionOuterClass$AddToToastAction;
        aopi.registerDefaultInstance(AddToToastActionOuterClass$AddToToastAction.class, addToToastActionOuterClass$AddToToastAction);
        addToToastAction = aopi.newSingularGeneratedExtension(apzg.a, addToToastActionOuterClass$AddToToastAction, addToToastActionOuterClass$AddToToastAction, null, 76623563, aosj.MESSAGE, AddToToastActionOuterClass$AddToToastAction.class);
    }

    private AddToToastActionOuterClass$AddToToastAction() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "b"});
            case 3:
                return new AddToToastActionOuterClass$AddToToastAction();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (AddToToastActionOuterClass$AddToToastAction.class) {
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
