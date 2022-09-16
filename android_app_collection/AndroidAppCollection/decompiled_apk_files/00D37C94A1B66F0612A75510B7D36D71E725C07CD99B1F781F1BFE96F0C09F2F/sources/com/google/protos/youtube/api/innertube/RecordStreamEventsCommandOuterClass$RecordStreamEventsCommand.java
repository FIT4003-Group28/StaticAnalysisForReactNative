package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand extends aopi implements aoqv {
    public static final RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand a;
    private static volatile aorb d;
    public static final aopg recordStreamEventsCommand;
    public long b;
    public int c;
    private int e;

    static {
        RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand recordStreamEventsCommandOuterClass$RecordStreamEventsCommand = new RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand();
        a = recordStreamEventsCommandOuterClass$RecordStreamEventsCommand;
        aopi.registerDefaultInstance(RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand.class, recordStreamEventsCommandOuterClass$RecordStreamEventsCommand);
        recordStreamEventsCommand = aopi.newSingularGeneratedExtension(apzg.a, recordStreamEventsCommandOuterClass$RecordStreamEventsCommand, recordStreamEventsCommandOuterClass$RecordStreamEventsCommand, null, 191776071, aosj.MESSAGE, RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand.class);
    }

    private RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0003င\u0002", new Object[]{"e", "b", "c"});
            case 3:
                return new RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand.class) {
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
