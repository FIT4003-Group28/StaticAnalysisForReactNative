package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand extends aopi implements aoqv {
    public static final FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand a;
    public static final aopg filterBarContentInsertionCommand;
    private static volatile aorb g;
    public int b;
    public aunb c;
    public int d;
    public apzg e;
    public boolean f;
    private byte h = 2;

    static {
        FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand filterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand = new FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand();
        a = filterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand;
        aopi.registerDefaultInstance(FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand.class, filterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand);
        filterBarContentInsertionCommand = aopi.newSingularGeneratedExtension(apzg.a, filterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand, filterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand, null, 362185493, aosj.MESSAGE, FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand.class);
    }

    private FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဋ\u0001\u0006ᐉ\u0005\u0007ဇ\u0006", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand.class) {
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
