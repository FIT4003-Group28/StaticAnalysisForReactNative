package defpackage;
/* compiled from: PG */
/* renamed from: aovd  reason: default package */
/* loaded from: classes2.dex */
public final class aovd implements angw {
    public final aoup<eapy, aogo> a;
    private final anhz b;

    public aovd(anhz anhzVar, angp angpVar, angy angyVar, bvrb bvrbVar) {
        aoup<eapy, aogo> c = aoup.c(bvrbVar, 10);
        this.b = anhzVar;
        this.a = c;
        angpVar.a(new aovb(this));
        angyVar.a(new aovc(this));
    }

    @Override // defpackage.angq
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.angw
    public final void c(eapy eapyVar) {
        if (!a(eapyVar).b().e()) {
            eapf w = eapyVar.d(1).w();
            aogb f = aogb.f(w.d(w.a.x(w.b())));
            eapf w2 = eapyVar.d(1).w();
            this.b.b(f, aogb.f(w2.d(w2.a.B(w2.b()))), new aova(this, eapyVar));
        }
    }

    @Override // defpackage.angq
    /* renamed from: d */
    public final angu<eapy, aogo> a(eapy eapyVar) {
        return this.a.a(eapyVar);
    }
}
