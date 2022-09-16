package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand extends aopi implements aoqv {
    public static final YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand a;
    private static volatile aorb c;
    public static final aopg ypcPauseMembershipDialogCommand;
    public aunb b;
    private int d;
    private byte e = 2;

    static {
        YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand ypcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand = new YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand();
        a = ypcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand;
        aopi.registerDefaultInstance(YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand.class, ypcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand);
        ypcPauseMembershipDialogCommand = aopi.newSingularGeneratedExtension(apzg.a, ypcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand, ypcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand, null, 215581778, aosj.MESSAGE, YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand.class);
    }

    private YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand() {
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
                return new YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand.class) {
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
