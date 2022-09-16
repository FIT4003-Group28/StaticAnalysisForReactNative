package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer extends aopi implements aoqv {
    public static final ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer a;
    public static final aopg channelReelAvatarRenderer;
    private static volatile aorb i;
    public int b;
    public avhn c;
    public apzg d;
    public int e;
    public aovs f;
    public aunb g;
    private aoux j;
    private byte k = 2;
    public aoob h = aoob.b;

    static {
        ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer = new ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer();
        a = channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer;
        aopi.registerDefaultInstance(ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.class, channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer);
        channelReelAvatarRenderer = aopi.newSingularGeneratedExtension(aunb.a, channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer, channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer, null, 232603920, aosj.MESSAGE, ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.class);
    }

    private ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဌ\u0002\u0004ᐉ\u0006\u0005ည\u0007\u0006ဉ\u0003\u0007ᐉ\u0005", new Object[]{"b", "c", "d", "e", auii.l, "j", "h", "f", "g"});
            case 3:
                return new ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
