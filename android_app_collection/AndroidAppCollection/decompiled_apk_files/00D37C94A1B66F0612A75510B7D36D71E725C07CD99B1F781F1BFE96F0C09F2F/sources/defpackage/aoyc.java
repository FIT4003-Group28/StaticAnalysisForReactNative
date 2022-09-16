package defpackage;
/* compiled from: PG */
/* renamed from: aoyc  reason: default package */
/* loaded from: classes.dex */
public final class aoyc extends aopi implements aoqv {
    public static final aoyc a;
    private static volatile aorb i;
    public int b;
    public avwu c;
    public aqzm d;
    public avcu e;
    public auoc f;
    public avww g;
    public avwt h;
    private asid j;
    private apax k;
    private byte l = 2;

    static {
        aoyc aoycVar = new aoyc();
        a = aoycVar;
        aopi.registerDefaultInstance(aoyc.class, aoycVar);
    }

    private aoyc() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001ﵡᵙﲱꌪ\b\u0000\u0000\u0007ﵡᵙᐉ\u0000諾⡱ဉ\u0001\uf09c⢠ᐉ\u0002\ue162⪂ᐉ\u0005\ue879㋶ᐉ\u0003\ueb30堂ᐉ\u0004\ue4bfꋚᐉ\u0006ﲱꌪᐉ\u0007", new Object[]{"b", "c", "d", "e", "k", "j", "f", "g", "h"});
            case 3:
                return new aoyc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (aoyc.class) {
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
