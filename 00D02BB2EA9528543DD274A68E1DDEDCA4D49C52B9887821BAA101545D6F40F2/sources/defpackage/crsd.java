package defpackage;
/* compiled from: PG */
/* renamed from: crsd  reason: default package */
/* loaded from: classes5.dex */
public final class crsd implements crgy {
    public final btrm a;
    public boolean b;

    public crsd(btrm btrmVar) {
        this.a = btrmVar;
    }

    @Override // defpackage.crgy
    public final void a(crgz crgzVar) {
        btrm btrmVar = this.a;
        dceq a = dcet.a();
        a.b(crsg.class, new crse(crsg.class, this));
        btrmVar.g(this, a.a());
        this.b = false;
    }

    @Override // defpackage.crgy
    public final void b(boolean z) {
        this.a.a(this);
    }
}
