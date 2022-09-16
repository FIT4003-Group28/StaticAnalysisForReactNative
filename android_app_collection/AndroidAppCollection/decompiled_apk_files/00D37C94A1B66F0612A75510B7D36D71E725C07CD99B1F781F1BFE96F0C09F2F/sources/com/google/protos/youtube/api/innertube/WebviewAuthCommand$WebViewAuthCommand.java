package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class WebviewAuthCommand$WebViewAuthCommand extends aopi implements aoqv {
    public static final WebviewAuthCommand$WebViewAuthCommand a;
    private static volatile aorb e;
    public static final aopg webViewAuthCommand;
    public int b;
    public int c;
    public String d = "";

    static {
        WebviewAuthCommand$WebViewAuthCommand webviewAuthCommand$WebViewAuthCommand = new WebviewAuthCommand$WebViewAuthCommand();
        a = webviewAuthCommand$WebViewAuthCommand;
        aopi.registerDefaultInstance(WebviewAuthCommand$WebViewAuthCommand.class, webviewAuthCommand$WebViewAuthCommand);
        webViewAuthCommand = aopi.newSingularGeneratedExtension(apzg.a, webviewAuthCommand$WebViewAuthCommand, webviewAuthCommand$WebViewAuthCommand, null, 386457349, aosj.MESSAGE, WebviewAuthCommand$WebViewAuthCommand.class);
    }

    private WebviewAuthCommand$WebViewAuthCommand() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"b", "c", awbk.m, "d"});
            case 3:
                return new WebviewAuthCommand$WebViewAuthCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (WebviewAuthCommand$WebViewAuthCommand.class) {
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
