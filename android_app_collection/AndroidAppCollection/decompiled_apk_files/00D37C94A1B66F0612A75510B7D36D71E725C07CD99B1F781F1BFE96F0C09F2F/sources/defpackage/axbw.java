package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: axbw  reason: default package */
/* loaded from: classes2.dex */
public final class axbw extends aopi implements aoqv {
    private static final axbw a;
    private static volatile aorb b;
    private int c;
    private aopu d = emptyProtobufList();
    private aopu e = emptyProtobufList();
    private boolean f;

    static {
        axbw axbwVar = new axbw();
        a = axbwVar;
        aopi.registerDefaultInstance(axbw.class, axbwVar);
    }

    private axbw() {
    }

    public static axbw c() {
        return a;
    }

    public static axbw d(byte[] bArr, aoos aoosVar) {
        return (axbw) aopi.parseFrom(a, bArr, aoosVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        this.c &= -2;
        this.f = false;
    }

    public int a() {
        return this.d.size();
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u001b\u0003ဇ\u0000", new Object[]{"c", "d", axbm.class, "f"});
            case 3:
                return new axbw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (axbw.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public List e() {
        return this.d;
    }

    public boolean g() {
        return this.f;
    }
}
