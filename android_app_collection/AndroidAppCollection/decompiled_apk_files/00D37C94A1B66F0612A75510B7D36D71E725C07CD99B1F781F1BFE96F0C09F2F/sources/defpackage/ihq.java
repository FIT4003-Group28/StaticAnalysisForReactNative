package defpackage;
/* compiled from: PG */
/* renamed from: ihq  reason: default package */
/* loaded from: classes3.dex */
public final class ihq extends aaqs {
    public String a;
    public String b;

    public ihq(aaqf aaqfVar, afvm afvmVar) {
        super("reel/reel_watch_sequence", aaqfVar, afvmVar, 1);
        k(aadi.b);
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = artx.a.createBuilder();
        String str = this.b;
        if (str != null) {
            createBuilder.copyOnWrite();
            artx artxVar = (artx) createBuilder.instance;
            artxVar.c = 4;
            artxVar.d = str;
        }
        String str2 = this.a;
        if (str2 != null) {
            createBuilder.copyOnWrite();
            artx artxVar2 = (artx) createBuilder.instance;
            artxVar2.c = 3;
            artxVar2.d = str2;
        }
        return createBuilder;
    }

    @Override // defpackage.aapd
    public final String b() {
        afrt afrtVar = new afrt();
        afrtVar.c("serviceName", this.m);
        afrtVar.c("identity", this.n.d());
        afrtVar.c("continuation", g(this.a));
        afrtVar.c("sequenceParams", g(this.b));
        return afrtVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        aqxo.y((this.b == null) ^ amps.e(this.a));
    }
}
