package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class TriggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand extends aopi implements aoqv {
    public static final TriggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand a;
    private static volatile aorb d;
    public static final aopg triggerOfferAdsEnrollmentEventCommand;
    public int b;
    public atpt c;

    static {
        TriggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand triggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand = new TriggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand();
        a = triggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand;
        aopi.registerDefaultInstance(TriggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand.class, triggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand);
        triggerOfferAdsEnrollmentEventCommand = aopi.newSingularGeneratedExtension(apzg.a, triggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand, triggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand, null, 308059427, aosj.MESSAGE, TriggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand.class);
    }

    private TriggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new TriggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (TriggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand.class) {
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
