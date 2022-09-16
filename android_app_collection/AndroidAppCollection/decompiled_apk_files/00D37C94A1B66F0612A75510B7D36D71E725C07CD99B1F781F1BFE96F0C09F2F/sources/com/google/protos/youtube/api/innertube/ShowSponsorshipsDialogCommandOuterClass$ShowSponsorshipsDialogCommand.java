package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand extends aopi implements aoqv {
    public static final ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand a;
    private static volatile aorb c;
    public static final aopg showSponsorshipsDialogCommand;
    public apzg b;
    private int d;
    private byte e = 2;

    static {
        ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand showSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand = new ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand();
        a = showSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand;
        aopi.registerDefaultInstance(ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand.class, showSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand);
        showSponsorshipsDialogCommand = aopi.newSingularGeneratedExtension(apzg.a, showSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand, showSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand, null, 209133170, aosj.MESSAGE, ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand.class);
    }

    private ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0000", new Object[]{"d", "b"});
            case 3:
                return new ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand.class) {
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
