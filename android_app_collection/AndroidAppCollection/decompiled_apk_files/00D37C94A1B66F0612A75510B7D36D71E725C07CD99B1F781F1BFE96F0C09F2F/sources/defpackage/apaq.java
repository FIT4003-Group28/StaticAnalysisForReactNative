package defpackage;
/* compiled from: PG */
/* renamed from: apaq  reason: default package */
/* loaded from: classes.dex */
public final class apaq extends aopd implements aope {
    public static final apaq a;
    private static volatile aorb g;
    public int b;
    public apas d;
    public boolean e;
    public aoyu f;
    private aoux h;
    private byte i = 2;
    public String c = "";

    static {
        apaq apaqVar = new apaq();
        a = apaqVar;
        aopi.registerDefaultInstance(apaq.class, apaqVar);
    }

    private apaq() {
        aoob aoobVar = aoob.b;
    }

    public static /* synthetic */ void a(apaq apaqVar) {
        apaqVar.b |= 1;
        apaqVar.c = "{TIME_REMAINING}";
    }

    public static /* synthetic */ void e(apaq apaqVar) {
        apaqVar.b |= 4;
        apaqVar.e = true;
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0002\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ᐉ\u0003\u0006ᐉ\u0005", new Object[]{"b", "c", "d", "e", "h", "f"});
            case 3:
                return new apaq();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (apaq.class) {
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
