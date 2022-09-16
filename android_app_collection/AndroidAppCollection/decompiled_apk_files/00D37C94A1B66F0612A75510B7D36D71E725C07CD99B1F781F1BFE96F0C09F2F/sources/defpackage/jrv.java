package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jrv  reason: default package */
/* loaded from: classes3.dex */
public final class jrv implements jav {
    final /* synthetic */ jrx a;

    public jrv(jrx jrxVar) {
        this.a = jrxVar;
    }

    @Override // defpackage.jav
    public final void a(String str) {
        ayoi h = this.a.g.c().h(emn.h(str), true);
        if (eog.aj(this.a.y)) {
            h = h.q(zna.t(this.a.p.a()));
        }
        h.I(jgs.k).ao().e().q(ick.q).C().R(new aypv() { // from class: jrt
            @Override // defpackage.aypv
            public final void a() {
                final jrv jrvVar = jrv.this;
                jrvVar.a.i.execute(new Runnable() { // from class: jru
                    @Override // java.lang.Runnable
                    public final void run() {
                        jsy jsyVar = jrv.this.a.s;
                        if (jsyVar != null) {
                            jsyVar.d(false, "downloads_page_downloads_item_section_identifier");
                        }
                    }
                });
            }
        });
    }

    @Override // defpackage.jav
    public final void b() {
    }
}
