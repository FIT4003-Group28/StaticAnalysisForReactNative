package defpackage;
/* compiled from: PG */
/* renamed from: abam  reason: default package */
/* loaded from: classes.dex */
public final class abam extends aaqs {
    public String a;
    public String b;
    public String c;

    public abam(aaqf aaqfVar, afvm afvmVar, boolean z) {
        super("get_panel", aaqfVar, afvmVar, 3);
        this.i = z;
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = atus.a.createBuilder();
        String str = this.a;
        if (str != null) {
            createBuilder.copyOnWrite();
            atus atusVar = (atus) createBuilder.instance;
            atusVar.b |= 2;
            atusVar.d = str;
        }
        String str2 = this.b;
        if (str2 != null) {
            createBuilder.copyOnWrite();
            atus atusVar2 = (atus) createBuilder.instance;
            atusVar2.b |= 8;
            atusVar2.f = str2;
        }
        String str3 = this.c;
        if (str3 != null) {
            createBuilder.copyOnWrite();
            atus atusVar3 = (atus) createBuilder.instance;
            atusVar3.b |= 4;
            atusVar3.e = str3;
        }
        return createBuilder;
    }

    @Override // defpackage.aapd
    public final String b() {
        afrt e = e();
        e.c("params", this.c);
        e.c("panelId", this.a);
        e.c("continuation", this.b);
        return e.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        r(this.a, this.b);
    }
}
