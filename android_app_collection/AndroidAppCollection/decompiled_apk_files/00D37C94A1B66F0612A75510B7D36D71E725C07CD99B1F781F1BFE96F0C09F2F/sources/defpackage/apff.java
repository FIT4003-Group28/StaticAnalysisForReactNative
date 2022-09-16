package defpackage;
/* compiled from: PG */
/* renamed from: apff  reason: default package */
/* loaded from: classes.dex */
public final class apff extends aopi implements aoqv {
    public static final apff a;
    private static volatile aorb g;
    public int b;
    private byte h = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public aopu f = emptyProtobufList();

    static {
        apff apffVar = new apff();
        a = apffVar;
        aopi.registerDefaultInstance(apff.class, apffVar);
    }

    private apff() {
    }

    public static /* synthetic */ void a(apff apffVar) {
        apffVar.b |= 1;
        apffVar.c = "com.google.android.youtube";
    }

    public static /* synthetic */ void b(apff apffVar) {
        apffVar.b |= 2;
        apffVar.d = "android.intent.action.VIEW";
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004Л", new Object[]{"b", "c", "d", "e", "f", asmc.class});
            case 3:
                return new apff();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (apff.class) {
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
