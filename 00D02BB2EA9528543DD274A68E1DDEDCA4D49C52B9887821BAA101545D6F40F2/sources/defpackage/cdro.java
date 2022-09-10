package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cdro  reason: default package */
/* loaded from: classes4.dex */
public final class cdro implements cdjb {
    final /* synthetic */ cdrr a;

    public cdro(cdrr cdrrVar) {
        this.a = cdrrVar;
    }

    @Override // defpackage.cdjb
    public final dbsg<String> a() {
        return dbsg.j((this.a.p().a & 8) != 0 ? this.a.p().l : null);
    }

    @Override // defpackage.cdjb
    public final dbsg<cdis> b() {
        return this.a.n();
    }

    @Override // defpackage.cdjb
    public final cdja c() {
        return this.a.k();
    }

    @Override // defpackage.cdjb
    public final String d() {
        return this.a.p().o;
    }

    @Override // defpackage.cdjb
    public final eapd e() {
        return new eapd(this.a.p().p);
    }

    @Override // defpackage.cdjb
    public final dbsg<String> f() {
        String str;
        if (this.a.p().c == 39) {
            docg p = this.a.p();
            str = p.c == 39 ? (String) p.d : "";
        } else {
            str = null;
        }
        return dbsg.j(str);
    }

    @Override // defpackage.cdjb
    public final String g() {
        return this.a.p().i;
    }

    @Override // defpackage.cdjb
    public final dbsg<String> h() {
        return dbsg.j((this.a.p().a & 4) != 0 ? this.a.p().k : null);
    }
}
