package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: akea  reason: default package */
/* loaded from: classes2.dex */
public final class akea extends itb {
    public final gga a;
    public final btvo b;
    public final bvjj c;
    public final akfa d;
    public final bzrh e;
    public final bujk f;
    public final ccie g;
    public final akfc h;
    public final Executor i;
    public final dxio<ckcw> j;
    @dzsi
    public btlu k;
    private final crzp<btlu> o = new akdw(this);

    public akea(gga ggaVar, btvo btvoVar, bvjj bvjjVar, akfa akfaVar, akfc akfcVar, bzrh bzrhVar, Executor executor, bujk bujkVar, ccie ccieVar, dxio<ckcw> dxioVar) {
        this.a = ggaVar;
        this.b = btvoVar;
        this.c = bvjjVar;
        this.d = akfaVar;
        this.h = akfcVar;
        this.i = executor;
        this.e = bzrhVar;
        this.f = bujkVar;
        this.g = ccieVar;
        this.j = dxioVar;
    }

    @Override // defpackage.itb
    public final void Nt() {
        super.Nt();
        this.d.C().d(this.o, dege.a);
    }

    @Override // defpackage.itb
    public final void Po() {
        this.d.C().c(this.o);
        super.Po();
    }
}
