package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand extends aopi implements aoqv {
    public static final ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand a;
    public static final aopg changeKeyedMarkersVisibilityCommand;
    private static volatile aorb e;
    public int b;
    public boolean c;
    public String d = "";

    static {
        ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand changeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand = new ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand();
        a = changeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand;
        aopi.registerDefaultInstance(ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand.class, changeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand);
        changeKeyedMarkersVisibilityCommand = aopi.newSingularGeneratedExtension(apzg.a, changeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand, changeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand, null, 329568813, aosj.MESSAGE, ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand.class);
    }

    private ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand.class) {
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
