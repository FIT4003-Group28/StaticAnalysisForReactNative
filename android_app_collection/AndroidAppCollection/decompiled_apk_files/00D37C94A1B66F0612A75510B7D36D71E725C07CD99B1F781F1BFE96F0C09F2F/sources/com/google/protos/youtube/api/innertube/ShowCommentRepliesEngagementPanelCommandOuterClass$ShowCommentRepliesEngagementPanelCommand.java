package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand extends aopi implements aoqv {
    public static final ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand a;
    private static volatile aorb k;
    public static final aopg showCommentRepliesEngagementPanelCommand;
    public int b;
    public arag d;
    public boolean f;
    public arag g;
    public int h;
    public apzg j;
    private byte l = 2;
    public String c = "";
    public String e = "";
    public String i = "";

    static {
        ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand = new ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand();
        a = showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand;
        aopi.registerDefaultInstance(ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.class, showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand);
        showCommentRepliesEngagementPanelCommand = aopi.newSingularGeneratedExtension(apzg.a, showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand, showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand, null, 141942083, aosj.MESSAGE, ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.class);
    }

    private ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0003\u0001ဈ\u0000\u0002ဈ\u0002\u0003ᐉ\u0001\u0004ဇ\u0003\u0005ᐉ\u0004\u0006င\u0005\u0007ဈ\u0006\bᐉ\u0007", new Object[]{"b", "c", "e", "d", "f", "g", "h", "i", "j"});
            case 3:
                return new ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.class) {
                        aorbVar = k;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            k = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
