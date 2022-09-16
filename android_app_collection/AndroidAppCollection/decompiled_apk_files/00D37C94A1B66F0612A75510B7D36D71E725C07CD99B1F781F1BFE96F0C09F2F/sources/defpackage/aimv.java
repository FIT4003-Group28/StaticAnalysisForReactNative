package defpackage;
/* compiled from: PG */
/* renamed from: aimv  reason: default package */
/* loaded from: classes.dex */
public final class aimv extends aaqs {
    public ampq a;
    public ampq b;

    public aimv(aaqf aaqfVar, afvm afvmVar) {
        super("get_watch", aaqfVar, afvmVar, 3);
        this.a = amon.a;
        this.b = amon.a;
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = asdc.a.createBuilder();
        if (this.a.h()) {
            asag asagVar = (asag) ((aina) this.a.c()).a().mo39build();
            createBuilder.copyOnWrite();
            asdc asdcVar = (asdc) createBuilder.instance;
            asagVar.getClass();
            asdcVar.d = asagVar;
            asdcVar.b |= 2;
        }
        if (this.b.h()) {
            asgs asgsVar = (asgs) ((abed) this.b.c()).a().mo39build();
            createBuilder.copyOnWrite();
            asdc asdcVar2 = (asdc) createBuilder.instance;
            asgsVar.getClass();
            asdcVar2.e = asgsVar;
            asdcVar2.b |= 4;
        }
        return createBuilder;
    }

    @Override // defpackage.aapd
    public final String b() {
        afrt e = e();
        if (this.a.h()) {
            e.c("playerRequest", ((aina) this.a.c()).b());
        }
        if (this.b.h()) {
            e.c("watchNextRequest", ((abed) this.b.c()).b());
        }
        return e.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        boolean z = true;
        if (!this.a.h() && !this.b.h()) {
            z = false;
        }
        aqxo.y(z);
    }
}
