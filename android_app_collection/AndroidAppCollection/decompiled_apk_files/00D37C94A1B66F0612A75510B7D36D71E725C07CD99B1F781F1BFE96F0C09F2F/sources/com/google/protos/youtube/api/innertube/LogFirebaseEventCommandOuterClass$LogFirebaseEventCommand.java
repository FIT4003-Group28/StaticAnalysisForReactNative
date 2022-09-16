package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand extends aopi implements aoqv {
    public static final LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand a;
    private static volatile aorb d;
    public static final aopg logFirebaseEventCommand;
    private int e;
    private byte f = 2;
    public String b = "";
    public aopu c = emptyProtobufList();

    static {
        LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand logFirebaseEventCommandOuterClass$LogFirebaseEventCommand = new LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand();
        a = logFirebaseEventCommandOuterClass$LogFirebaseEventCommand;
        aopi.registerDefaultInstance(LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand.class, logFirebaseEventCommandOuterClass$LogFirebaseEventCommand);
        logFirebaseEventCommand = aopi.newSingularGeneratedExtension(apzg.a, logFirebaseEventCommandOuterClass$LogFirebaseEventCommand, logFirebaseEventCommandOuterClass$LogFirebaseEventCommand, null, 245093374, aosj.MESSAGE, LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand.class);
    }

    private LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဈ\u0000\u0002Л", new Object[]{"e", "b", "c", asmc.class});
            case 3:
                return new LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand.class) {
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
