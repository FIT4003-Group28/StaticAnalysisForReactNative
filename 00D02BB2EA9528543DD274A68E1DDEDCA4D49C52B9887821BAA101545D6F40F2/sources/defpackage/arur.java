package defpackage;

import android.support.v4.media.session.MediaSessionCompat$Token;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: arur  reason: default package */
/* loaded from: classes2.dex */
public final class arur extends le {
    final /* synthetic */ arus c;
    final /* synthetic */ aruu d;

    public arur(aruu aruuVar, arus arusVar) {
        this.d = aruuVar;
        this.c = arusVar;
    }

    @Override // defpackage.le
    public final void a() {
        lq lqVar = this.d.c;
        if (lqVar == null) {
            return;
        }
        MediaSessionCompat$Token f = lqVar.a.f();
        if (f == null) {
            this.d.c(this.c, "sessionToken is null");
            return;
        }
        this.d.d();
        mi miVar = new mi(this.d.a, f);
        ckcw ckcwVar = this.d.b;
        ckgz ckgzVar = ckhi.aJ;
        dbsk.s(ckgzVar);
        this.d.d();
        ((ckco) ckcwVar.a(ckgzVar)).a(-1);
        this.c.a(new arut(miVar));
    }

    @Override // defpackage.le
    public final void b() {
        this.d.d();
        this.c.b();
    }

    @Override // defpackage.le
    public final void c() {
        this.d.c(this.c, null);
    }
}
