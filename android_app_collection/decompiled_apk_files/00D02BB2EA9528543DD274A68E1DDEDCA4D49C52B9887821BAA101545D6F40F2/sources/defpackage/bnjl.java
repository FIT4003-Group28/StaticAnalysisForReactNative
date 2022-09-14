package defpackage;

import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bnjl  reason: default package */
/* loaded from: classes3.dex */
public class bnjl implements bnie {
    private final behy a;
    private final bege b;
    private final bnjj c;
    private final Executor d;
    private final crzp<bnjj> e = new bnjk(this);

    public bnjl(Executor executor, bnjj bnjjVar, cqhn cqhnVar, bege begeVar, behy behyVar) {
        this.d = executor;
        this.b = begeVar;
        this.a = behyVar;
        this.c = bnjjVar;
    }

    @Override // defpackage.bnie
    public List<befz<? extends bega>> a() {
        return this.a.b(this.b);
    }

    @Override // defpackage.bnie
    @dzsi
    public cqqw b() {
        return this.a.f();
    }

    public void c() {
        this.c.b().d(this.e, this.d);
    }

    public void d() {
        this.c.b().c(this.e);
    }
}
