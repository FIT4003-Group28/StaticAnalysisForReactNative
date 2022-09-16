package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand extends aopi implements aoqv {
    public static final ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand a;
    private static volatile aorb f;
    public static final aopg showSponsorshipsEngagementPanelCommand;
    public int b;
    public aunb d;
    public apzg e;
    private byte g = 2;
    public String c = "";

    static {
        ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand showSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand = new ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand();
        a = showSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand;
        aopi.registerDefaultInstance(ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand.class, showSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand);
        showSponsorshipsEngagementPanelCommand = aopi.newSingularGeneratedExtension(apzg.a, showSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand, showSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand, null, 200394150, aosj.MESSAGE, ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand.class);
    }

    private ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ဈ\u0000", new Object[]{"b", "d", "e", "c"});
            case 3:
                return new ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
