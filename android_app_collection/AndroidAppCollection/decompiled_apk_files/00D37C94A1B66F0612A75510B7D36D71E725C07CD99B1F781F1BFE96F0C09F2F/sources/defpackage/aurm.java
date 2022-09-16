package defpackage;
/* compiled from: PG */
/* renamed from: aurm  reason: default package */
/* loaded from: classes2.dex */
public final class aurm extends aopi implements aoqv {
    public static final aurm a;
    private static volatile aorb e;
    public int b;
    public arag c;
    private apok f;
    private apok g;
    private aoux h;
    private byte i = 2;
    public aopu d = emptyProtobufList();

    static {
        aurm aurmVar = new aurm();
        a = aurmVar;
        aopi.registerDefaultInstance(aurm.class, aurmVar);
    }

    private aurm() {
        aoob aoobVar = aoob.b;
    }

    public final void a() {
        aopu aopuVar = this.d;
        if (!aopuVar.c()) {
            this.d = aopi.mutableCopy(aopuVar);
        }
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0005\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003", new Object[]{"b", "c", "d", aunb.class, "f", "g", "h"});
            case 3:
                return new aurm();
            case 4:
                return new aopa((float[]) null, (float[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aurm.class) {
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
