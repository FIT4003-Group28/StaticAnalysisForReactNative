package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
/* compiled from: PG */
/* renamed from: aipv  reason: default package */
/* loaded from: classes.dex */
public final class aipv implements aiqb {
    public final aiix a;
    public final aiql b;
    public final ailu c;
    public final aiqp d;
    public final aikh e;
    private final aynx f;
    private final aynx g;
    private final aypf h = new aypf();
    private final aipt i = new aipt(this);

    public aipv(aynx aynxVar, aynx aynxVar2, aiqp aiqpVar, aikh aikhVar, ailu ailuVar, aiix aiixVar, aiql aiqlVar) {
        this.f = aynxVar;
        this.g = aynxVar2;
        this.d = aiqpVar;
        this.e = aikhVar;
        this.c = ailuVar;
        this.a = aiixVar;
        this.b = aiqlVar;
    }

    public final void a() {
        azpb azpbVar = this.d.c;
        boolean g = g(aiqk.b);
        boolean g2 = g(aiqk.a);
        aiql aiqlVar = this.b;
        boolean z = false;
        int u = aiqlVar instanceof aiqi ? ((aiqi) aiqlVar).u() : 0;
        aiql aiqlVar2 = this.b;
        if ((aiqlVar2 instanceof aiqm) && ((aiqm) aiqlVar2).o()) {
            z = true;
        }
        azpbVar.c(new ahhl(g, g2, u, z));
    }

    @Override // defpackage.aiqb
    public final void b() {
        this.h.d(this.f.Z(new ayqb() { // from class: aipu
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                aipv.this.b.h(((ahhz) obj).a());
            }
        }));
        this.h.d(this.g.Z(new aiax(16)));
        this.e.g();
        a();
        azpb azpbVar = this.d.d;
        PlaybackStartDescriptor playbackStartDescriptor = this.c.o;
        azpbVar.c(new aiil(playbackStartDescriptor == null ? null : playbackStartDescriptor.k()));
        this.b.k(this.i);
    }

    @Override // defpackage.aiqb
    public final void c(boolean z) {
        this.b.e(z);
    }

    public final void d(aiim aiimVar) {
        this.d.e.c(new aiin(aiimVar));
    }

    @Override // defpackage.aiqb
    public final void e() {
        d(aiim.START);
    }

    @Override // defpackage.aiqb
    public final void f() {
        this.d.a.c(new ahhk(false));
        this.d.g.c(ahhm.a);
        this.e.d();
        this.h.qr();
        this.b.l(this.i);
        this.b.g();
    }

    @Override // defpackage.aiqb
    public final boolean g(aiqk aiqkVar) {
        return i(aiqkVar) == 2;
    }

    public final boolean h(Class cls) {
        return this.b.getClass().equals(cls);
    }

    @Override // defpackage.aiqb
    public final int i(aiqk aiqkVar) {
        return this.b.j(aiqkVar);
    }
}
