package defpackage;
/* compiled from: PG */
/* renamed from: bpfa  reason: default package */
/* loaded from: classes3.dex */
public class bpfa implements jbf {
    private final CharSequence a;
    private final CharSequence b;
    private final ddho c;
    private final bpev d;

    public bpfa(CharSequence charSequence, CharSequence charSequence2, ddho ddhoVar, bpev bpevVar) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = ddhoVar;
        this.d = bpevVar;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd d() {
        return null;
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return Boolean.TRUE;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        final bpey bpeyVar = (bpey) this.d;
        bput bputVar = bpeyVar.a;
        dbsk.s(bputVar);
        bputVar.d(new bpus(bpeyVar) { // from class: bpex
            private final bpey a;

            {
                this.a = bpeyVar;
            }

            @Override // defpackage.bpus
            public final void a(digi digiVar) {
                bpey bpeyVar2 = this.a;
                bpeyVar2.c.a(bpvi.f(bpeyVar2.b, digiVar));
            }
        });
        return cqkl.a;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd g() {
        return null;
    }

    @Override // defpackage.jbf
    @dzsi
    public cjtd h() {
        return cjtd.a(this.c);
    }

    @Override // defpackage.jbf
    public CharSequence l() {
        return this.b;
    }

    @Override // defpackage.jbi
    public CharSequence m() {
        return this.a;
    }
}
