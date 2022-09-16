package defpackage;
/* compiled from: PG */
/* renamed from: apfz  reason: default package */
/* loaded from: classes.dex */
public final class apfz extends aopi implements aoqv {
    public static final apfz a;
    private static volatile aorb j;
    public int b;
    public int c;
    public apfw d;
    public boolean e;
    public boolean f;
    public aopu g = aopi.emptyProtobufList();
    public apfs h;
    public apfy i;

    static {
        apfz apfzVar = new apfz();
        a = apfzVar;
        aopi.registerDefaultInstance(apfz.class, apfzVar);
    }

    private apfz() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\uf743㤸\u0007\u0000\u0001\u0000\u0001ဌ\u0000\u0005ဇ\u0005\u0006ဇ\u0006\t\u001a\u000bဉ\t\uf38c㗞ဉ\u0002\uf743㤸ဉ\b", new Object[]{"b", "c", apfa.h, "e", "f", "g", "i", "d", "h"});
            case 3:
                return new apfz();
            case 4:
                return new aopa((short[][][]) null, (float[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (apfz.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
