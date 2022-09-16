package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand extends aopi implements aoqv {
    public static final ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand a;
    private static volatile aorb k;
    public static final aopg showWebViewDialogCommand;
    public boolean c;
    public arag e;
    public aunb f;
    public boolean g;
    public boolean h;
    public int i;
    private int l;
    private aoux m;
    private byte n = 2;
    public String b = "";
    public aopu d = emptyProtobufList();
    public aoob j = aoob.b;

    static {
        ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand = new ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand();
        a = showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand;
        aopi.registerDefaultInstance(ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.class, showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand);
        showWebViewDialogCommand = aopi.newSingularGeneratedExtension(apzg.a, showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand, showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand, null, 243963315, aosj.MESSAGE, ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.class);
    }

    private ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.n = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0004\u0001ဈ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ဇ\u0001\u0005Л\u0006ᐉ\u0007\u0007ည\b\bဇ\u0004\tဌ\u0006\nဇ\u0005", new Object[]{"l", "b", "e", "f", "c", "d", apzg.class, "m", "j", "g", "i", awbk.l, "h"});
            case 3:
                return new ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.class) {
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
