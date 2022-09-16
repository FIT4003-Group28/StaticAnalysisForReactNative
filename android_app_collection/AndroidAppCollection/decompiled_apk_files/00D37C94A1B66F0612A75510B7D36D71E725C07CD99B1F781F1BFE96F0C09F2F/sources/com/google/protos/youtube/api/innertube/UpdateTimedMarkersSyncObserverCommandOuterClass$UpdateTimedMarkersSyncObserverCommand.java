package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UpdateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand extends aopi implements aoqv {
    public static final UpdateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand a;
    private static volatile aorb g;
    public static final aopg updateTimedMarkersSyncObserverCommand;
    public int b;
    public boolean c;
    public apzg f;
    private byte h = 2;
    public String d = "";
    public String e = "";

    static {
        UpdateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand updateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand = new UpdateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand();
        a = updateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand;
        aopi.registerDefaultInstance(UpdateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand.class, updateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand);
        updateTimedMarkersSyncObserverCommand = aopi.newSingularGeneratedExtension(apzg.a, updateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand, updateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand, null, 376871121, aosj.MESSAGE, UpdateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand.class);
    }

    private UpdateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new UpdateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (UpdateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
