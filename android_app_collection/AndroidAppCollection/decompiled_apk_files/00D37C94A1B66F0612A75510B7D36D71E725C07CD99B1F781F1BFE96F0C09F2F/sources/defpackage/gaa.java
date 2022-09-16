package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gaa  reason: default package */
/* loaded from: classes3.dex */
public final class gaa implements afwa {
    final /* synthetic */ aspb a;
    final /* synthetic */ asov b;
    final /* synthetic */ gab c;
    final /* synthetic */ gab d;
    final /* synthetic */ gab e;
    final /* synthetic */ gac f;

    public gaa(gac gacVar, aspb aspbVar, asov asovVar, gab gabVar, gab gabVar2, gab gabVar3) {
        this.f = gacVar;
        this.a = aspbVar;
        this.b = asovVar;
        this.c = gabVar;
        this.d = gabVar2;
        this.e = gabVar3;
    }

    @Override // defpackage.afwa
    public final void a() {
    }

    @Override // defpackage.afwa
    public final void b() {
        this.f.b(this.a, this.b, true, this.c, this.d, this.e);
    }

    @Override // defpackage.afwa
    public final void c(Exception exc) {
        this.f.a.e(exc);
    }
}
