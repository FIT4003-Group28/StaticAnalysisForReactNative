package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction extends aopi implements aoqv {
    public static final UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction a;
    private static volatile aorb d;
    public static final aopg updateCommentVoteAction;
    public int b;
    public arag c;
    private byte e = 2;

    static {
        UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction updateCommentVoteActionOuterClass$UpdateCommentVoteAction = new UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction();
        a = updateCommentVoteActionOuterClass$UpdateCommentVoteAction;
        aopi.registerDefaultInstance(UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction.class, updateCommentVoteActionOuterClass$UpdateCommentVoteAction);
        updateCommentVoteAction = aopi.newSingularGeneratedExtension(apzg.a, updateCommentVoteActionOuterClass$UpdateCommentVoteAction, updateCommentVoteActionOuterClass$UpdateCommentVoteAction, null, 119065485, aosj.MESSAGE, UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction.class);
    }

    private UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction.class) {
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
