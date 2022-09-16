package defpackage;
/* compiled from: PG */
/* renamed from: aufy  reason: default package */
/* loaded from: classes2.dex */
public final class aufy extends aopi implements aoqv {
    private static final aufy a;
    private static volatile aorb b;
    private int c;
    private String d = "";
    private awbs e;
    private int f;
    private float g;
    private int h;

    static {
        aufy aufyVar = new aufy();
        a = aufyVar;
        aopi.registerDefaultInstance(aufy.class, aufyVar);
    }

    private aufy() {
    }

    public static aufx a() {
        return (aufx) a.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(String str) {
        str.getClass();
        this.c |= 1;
        this.d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(int i) {
        this.c |= 16;
        this.h = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(aufw aufwVar) {
        this.f = aufwVar.d;
        this.c |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(awbs awbsVar) {
        awbsVar.getClass();
        this.e = awbsVar;
        this.c |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(float f) {
        this.c |= 8;
        this.g = f;
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ခ\u0003\u0005င\u0004", new Object[]{"c", "d", "e", "f", aufw.a(), "g", "h"});
            case 3:
                return new aufy();
            case 4:
                return new aufx();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aufy.class) {
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
}
