package defpackage;
/* compiled from: PG */
/* renamed from: apax  reason: default package */
/* loaded from: classes.dex */
public final class apax extends aopi implements aoqv {
    public static final apax a;
    private static volatile aorb j;
    public int b;
    public float d;
    public aunb e;
    public int f;
    public boolean g;
    public apay h;
    public aoyz i;
    private aoux k;
    private byte l = 2;
    public aopu c = emptyProtobufList();

    static {
        apax apaxVar = new apax();
        a = apaxVar;
        aopi.registerDefaultInstance(apax.class, apaxVar);
    }

    private apax() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0004\u0001Л\u0002ᐉ\u0000\u0004ခ\u0002\u0005ᐉ\u0003\u0006ဌ\u0004\u0007ဇ\u0005\bᐉ\u0006\tဉ\u0007", new Object[]{"b", "c", apaz.class, "k", "d", "e", "f", aoxm.h, "g", "h", "i"});
            case 3:
                return new apax();
            case 4:
                return new aopa((char[][]) null, (short[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (apax.class) {
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
