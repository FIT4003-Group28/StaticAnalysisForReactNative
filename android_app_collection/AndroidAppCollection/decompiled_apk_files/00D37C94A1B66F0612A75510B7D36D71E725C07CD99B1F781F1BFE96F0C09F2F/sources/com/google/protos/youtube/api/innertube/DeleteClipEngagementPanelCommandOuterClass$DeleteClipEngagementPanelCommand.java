package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DeleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand extends aopi implements aoqv {
    public static final DeleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand a;
    private static volatile aorb d;
    public static final aopg deleteClipEngagementPanelCommand;
    public int b;
    public apzg c;
    private byte e = 2;

    static {
        DeleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand deleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand = new DeleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand();
        a = deleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand;
        aopi.registerDefaultInstance(DeleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand.class, deleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand);
        deleteClipEngagementPanelCommand = aopi.newSingularGeneratedExtension(apzg.a, deleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand, deleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand, null, 358044308, aosj.MESSAGE, DeleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand.class);
    }

    private DeleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand() {
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
                return new DeleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (DeleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand.class) {
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
