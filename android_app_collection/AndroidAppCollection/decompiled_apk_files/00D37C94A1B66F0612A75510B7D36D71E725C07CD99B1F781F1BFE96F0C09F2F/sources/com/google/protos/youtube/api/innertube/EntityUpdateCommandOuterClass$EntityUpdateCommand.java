package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class EntityUpdateCommandOuterClass$EntityUpdateCommand extends aopi implements aoqv {
    public static final EntityUpdateCommandOuterClass$EntityUpdateCommand a;
    private static volatile aorb c;
    public static final aopg entityUpdateCommand;
    public aqvw b;
    private int d;
    private byte e = 2;

    static {
        EntityUpdateCommandOuterClass$EntityUpdateCommand entityUpdateCommandOuterClass$EntityUpdateCommand = new EntityUpdateCommandOuterClass$EntityUpdateCommand();
        a = entityUpdateCommandOuterClass$EntityUpdateCommand;
        aopi.registerDefaultInstance(EntityUpdateCommandOuterClass$EntityUpdateCommand.class, entityUpdateCommandOuterClass$EntityUpdateCommand);
        entityUpdateCommand = aopi.newSingularGeneratedExtension(apzg.a, entityUpdateCommandOuterClass$EntityUpdateCommand, entityUpdateCommandOuterClass$EntityUpdateCommand, null, 300347778, aosj.MESSAGE, EntityUpdateCommandOuterClass$EntityUpdateCommand.class);
    }

    private EntityUpdateCommandOuterClass$EntityUpdateCommand() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "b"});
            case 3:
                return new EntityUpdateCommandOuterClass$EntityUpdateCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (EntityUpdateCommandOuterClass$EntityUpdateCommand.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
