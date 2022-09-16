package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: axbm  reason: default package */
/* loaded from: classes2.dex */
public final class axbm extends aopi implements axbn {
    private static final axbm a;
    private static volatile aorb b;
    private int c;
    private int d;
    private int e;
    private axbk f;
    private aotm g;
    private int h;
    private aopu i = emptyProtobufList();
    private aotm j;
    private long k;
    private axcs l;

    static {
        axbm axbmVar = new axbm();
        a = axbmVar;
        aopi.registerDefaultInstance(axbm.class, axbmVar);
    }

    private axbm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(axax axaxVar) {
        axaxVar.getClass();
        C();
        this.i.add(axaxVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        this.i = emptyProtobufList();
    }

    private void C() {
        aopu aopuVar = this.i;
        if (!aopuVar.c()) {
            this.i = aopi.mutableCopy(aopuVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(int i) {
        this.c |= 2;
        this.e = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(aotm aotmVar) {
        aotmVar.getClass();
        this.g = aotmVar;
        this.c |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(axbk axbkVar) {
        axbkVar.getClass();
        this.f = axbkVar;
        this.c |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(int i) {
        this.c |= 1;
        this.d = i;
    }

    public static axbl j() {
        return (axbl) a.createBuilder();
    }

    public static axbm l() {
        return a;
    }

    public static axbm m(byte[] bArr, aoos aoosVar) {
        return (axbm) aopi.parseFrom(a, bArr, aoosVar);
    }

    public int a() {
        return this.e;
    }

    public int b() {
        return this.i.size();
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.h;
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005င\u0004\u0006\u001b\u0007ဂ\u0006\tဉ\u0007\nဉ\u0005", new Object[]{"c", "d", "e", "f", "g", "h", "i", axax.class, "k", "l", "j"});
            case 3:
                return new axbm();
            case 4:
                return new axbl();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (axbm.class) {
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

    public long e() {
        return this.k;
    }

    public aotm f() {
        aotm aotmVar = this.g;
        return aotmVar == null ? aotm.a : aotmVar;
    }

    public aotm g() {
        aotm aotmVar = this.j;
        return aotmVar == null ? aotm.a : aotmVar;
    }

    public axax h(int i) {
        return (axax) this.i.get(0);
    }

    public axbk i() {
        axbk axbkVar = this.f;
        return axbkVar == null ? axbk.a : axbkVar;
    }

    public axcs n() {
        axcs axcsVar = this.l;
        return axcsVar == null ? axcs.a : axcsVar;
    }

    public List o() {
        return this.i;
    }

    public boolean v() {
        return (this.c & 128) != 0;
    }

    public boolean w() {
        return (this.c & 8) != 0;
    }

    public boolean x() {
        return (this.c & 4) != 0;
    }

    public boolean y() {
        return (this.c & 32) != 0;
    }

    public boolean z() {
        return (this.c & 16) != 0;
    }
}
