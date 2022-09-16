package defpackage;
/* compiled from: PG */
/* renamed from: abdv  reason: default package */
/* loaded from: classes.dex */
public final class abdv extends aaqs {
    public int a;
    public boolean b;

    public abdv(aaqf aaqfVar, afvm afvmVar) {
        super("video_effects/get_multi_page_sticker_catalog", aaqfVar, afvmVar, 3);
        this.a = -1;
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = artk.a.createBuilder();
        createBuilder.copyOnWrite();
        artk artkVar = (artk) createBuilder.instance;
        artkVar.b |= 4;
        artkVar.e = "";
        int i = this.a;
        if (i >= 0) {
            createBuilder.copyOnWrite();
            artk artkVar2 = (artk) createBuilder.instance;
            artkVar2.b |= 2;
            artkVar2.d = i;
        }
        boolean z = this.b;
        createBuilder.copyOnWrite();
        artk artkVar3 = (artk) createBuilder.instance;
        artkVar3.b |= 8;
        artkVar3.f = z;
        return createBuilder;
    }

    @Override // defpackage.aapd
    public final String b() {
        afrt e = e();
        e.d("getDefaultPage", this.b);
        e.b("page", this.a);
        return e.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
    }
}
