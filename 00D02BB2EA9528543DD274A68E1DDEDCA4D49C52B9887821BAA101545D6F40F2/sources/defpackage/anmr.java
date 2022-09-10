package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anmr  reason: default package */
/* loaded from: classes2.dex */
public final class anmr {
    public dbsg<dvay> a;
    public long b;
    public long c;
    public dbsg<Long> d;
    public List<anmq> e;
    public boolean f;
    public dbsg<dqjl> g;
    private final anms h;
    private dbsg<anmq> i;
    private int j;

    public anmr(anms anmsVar) {
        this.h = anmsVar;
        this.a = anmsVar.b;
        this.b = anmsVar.g;
        this.c = anmsVar.h;
        this.d = anmsVar.i;
        this.i = anmsVar.j;
        this.e = anmsVar.k;
        this.j = anmsVar.n;
        this.f = anmsVar.f;
        this.g = anmsVar.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final anms a() {
        dbsg<dvay> dbsgVar = this.a;
        anms anmsVar = this.h;
        return new anms(dbsgVar, anmsVar.c, anmsVar.d, anmsVar.e, anmsVar.m, this.f, this.b, this.c, this.d, this.i, this.e, this.j, this.g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(anmq anmqVar) {
        this.i = dbsg.i(anmqVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.j = 4;
    }
}
