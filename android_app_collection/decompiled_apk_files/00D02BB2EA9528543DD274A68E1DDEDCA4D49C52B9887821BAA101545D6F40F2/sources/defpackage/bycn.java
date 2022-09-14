package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bycn  reason: default package */
/* loaded from: classes4.dex */
public final class bycn extends itb {
    public final gga a;
    public final Executor b;
    private final crzp<btvo> c = new bycm(this);
    private final btxc d;

    public bycn(gga ggaVar, btxc btxcVar, Executor executor) {
        this.a = ggaVar;
        this.d = btxcVar;
        this.b = executor;
    }

    @Override // defpackage.itb
    public final void Nt() {
        super.Nt();
        this.d.a().d(this.c, this.b);
    }

    @Override // defpackage.itb
    public final void Po() {
        this.d.a().c(this.c);
        super.Po();
    }
}
