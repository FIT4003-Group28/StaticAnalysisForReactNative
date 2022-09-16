package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand extends aopi implements aoqv {
    public static final ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand a;
    private static volatile aorb e;
    public static final aopg toggleMultiSelectVideoItemCommand;
    public int b;
    public String c = "";
    public String d = "";

    static {
        ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand toggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand = new ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand();
        a = toggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand;
        aopi.registerDefaultInstance(ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.class, toggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand);
        toggleMultiSelectVideoItemCommand = aopi.newSingularGeneratedExtension(apzg.a, toggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand, toggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand, null, 229250685, aosj.MESSAGE, ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.class);
    }

    private ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.class) {
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
