package defpackage;
/* compiled from: PG */
/* renamed from: angz  reason: default package */
/* loaded from: classes.dex */
public final class angz extends aopi implements aoqv {
    public static final angz a;
    private static volatile aorb i;
    public int b;
    public aopu c = emptyProtobufList();
    public aopt d = emptyLongList();
    public aopt e = emptyLongList();
    public long f;
    public long g;
    public int h;

    static {
        angz angzVar = new angz();
        a = angzVar;
        aopi.registerDefaultInstance(angz.class, angzVar);
    }

    private angz() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0003\u0000\u0001\u001b\u0002\u0015\u0003\u0015\u0004ဃ\u0000\u0005ဃ\u0001\u0006င\u0002", new Object[]{"b", "c", angn.class, "d", "e", "f", "g", "h"});
            case 3:
                return new angz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (angz.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
