package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: rqg */
/* loaded from: classes4.dex */
public final class rqg extends aopi implements aoqv {
    private static final rqg a;
    private static volatile aorb b;
    private int c;
    private aopu d = emptyProtobufList();
    private String e = "";
    private long f;
    private long g;
    private int h;

    static {
        rqg rqgVar = new rqg();
        a = rqgVar;
        aopi.registerDefaultInstance(rqg.class, rqgVar);
    }

    private rqg() {
    }

    public void A(int i, rqi rqiVar) {
        rqiVar.getClass();
        x();
        this.d.set(i, rqiVar);
    }

    public void B(long j) {
        this.c |= 4;
        this.g = j;
    }

    public void C(long j) {
        this.c |= 2;
        this.f = j;
    }

    public static rqf e() {
        return (rqf) a.createBuilder();
    }

    public static /* synthetic */ rqg f() {
        return a;
    }

    public static /* synthetic */ void j(rqg rqgVar, int i, rqi rqiVar) {
        rqgVar.A(i, rqiVar);
    }

    public static /* synthetic */ void k(rqg rqgVar, rqi rqiVar) {
        rqgVar.v(rqiVar);
    }

    public static /* synthetic */ void n(rqg rqgVar, int i) {
        rqgVar.y(i);
    }

    public void u(Iterable iterable) {
        x();
        aonk.addAll(iterable, (List) this.d);
    }

    public void v(rqi rqiVar) {
        rqiVar.getClass();
        x();
        this.d.add(rqiVar);
    }

    public void w() {
        this.d = emptyProtobufList();
    }

    private void x() {
        aopu aopuVar = this.d;
        if (!aopuVar.c()) {
            this.d = aopi.mutableCopy(aopuVar);
        }
    }

    public void y(int i) {
        x();
        this.d.remove(i);
    }

    public void z(String str) {
        str.getClass();
        this.c |= 1;
        this.e = str;
    }

    public int a() {
        return this.h;
    }

    public int b() {
        return this.d.size();
    }

    public long c() {
        return this.g;
    }

    public long d() {
        return this.f;
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"c", "d", rqi.class, "e", "f", "g", "h"});
            case 3:
                return new rqg();
            case 4:
                return new rqf();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (rqg.class) {
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

    public rqi g(int i) {
        return (rqi) this.d.get(i);
    }

    public String h() {
        return this.e;
    }

    public List i() {
        return this.d;
    }

    public boolean r() {
        return (this.c & 8) != 0;
    }

    public boolean s() {
        return (this.c & 4) != 0;
    }

    public boolean t() {
        return (this.c & 2) != 0;
    }
}
