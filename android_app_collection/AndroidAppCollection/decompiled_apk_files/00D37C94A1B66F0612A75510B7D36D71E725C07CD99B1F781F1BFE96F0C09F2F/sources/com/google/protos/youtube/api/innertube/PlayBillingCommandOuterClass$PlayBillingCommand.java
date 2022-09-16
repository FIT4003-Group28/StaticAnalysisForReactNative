package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PlayBillingCommandOuterClass$PlayBillingCommand extends aopi implements aoqv {
    public static final PlayBillingCommandOuterClass$PlayBillingCommand a;
    private static volatile aorb h;
    public static final aopg playBillingCommand;
    public int b;
    public atxx c;
    public apzg d;
    public apzg e;
    public apzg f;
    public String g;
    private apzg i;
    private byte j = 2;

    static {
        PlayBillingCommandOuterClass$PlayBillingCommand playBillingCommandOuterClass$PlayBillingCommand = new PlayBillingCommandOuterClass$PlayBillingCommand();
        a = playBillingCommandOuterClass$PlayBillingCommand;
        aopi.registerDefaultInstance(PlayBillingCommandOuterClass$PlayBillingCommand.class, playBillingCommandOuterClass$PlayBillingCommand);
        playBillingCommand = aopi.newSingularGeneratedExtension(apzg.a, playBillingCommandOuterClass$PlayBillingCommand, playBillingCommandOuterClass$PlayBillingCommand, null, 381321562, aosj.MESSAGE, PlayBillingCommandOuterClass$PlayBillingCommand.class);
    }

    private PlayBillingCommandOuterClass$PlayBillingCommand() {
        aoob aoobVar = aoob.b;
        this.g = "";
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0004\u0001ဉ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ဈ\u0006", new Object[]{"b", "c", "i", "d", "e", "f", "g"});
            case 3:
                return new PlayBillingCommandOuterClass$PlayBillingCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (PlayBillingCommandOuterClass$PlayBillingCommand.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
