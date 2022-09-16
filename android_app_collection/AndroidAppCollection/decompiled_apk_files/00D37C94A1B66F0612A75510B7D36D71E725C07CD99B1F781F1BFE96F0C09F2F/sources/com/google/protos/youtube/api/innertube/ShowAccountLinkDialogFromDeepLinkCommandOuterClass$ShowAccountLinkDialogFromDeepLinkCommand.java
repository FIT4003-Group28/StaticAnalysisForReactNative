package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShowAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand extends aopi implements aoqv {
    public static final ShowAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand a;
    private static volatile aorb e;
    public static final aopg showAccountLinkDialogFromDeepLinkCommand;
    public int b;
    public apzg c;
    public long d;
    private byte f = 2;

    static {
        ShowAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand showAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand = new ShowAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand();
        a = showAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand;
        aopi.registerDefaultInstance(ShowAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand.class, showAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand);
        showAccountLinkDialogFromDeepLinkCommand = aopi.newSingularGeneratedExtension(apzg.a, showAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand, showAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand, null, 370101185, aosj.MESSAGE, ShowAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand.class);
    }

    private ShowAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဂ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new ShowAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (ShowAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
