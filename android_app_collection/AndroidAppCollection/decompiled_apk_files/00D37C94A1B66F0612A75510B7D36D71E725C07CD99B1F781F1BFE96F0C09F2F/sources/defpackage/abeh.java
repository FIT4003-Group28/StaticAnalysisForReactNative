package defpackage;
/* compiled from: PG */
/* renamed from: abeh  reason: default package */
/* loaded from: classes.dex */
public final class abeh extends aaqs {
    public String a;

    public abeh(aaqf aaqfVar, afvm afvmVar) {
        super("ypc/get_cancellation_flow", aaqfVar, afvmVar);
        this.a = "";
        q(3);
    }

    @Override // defpackage.aapd
    public final String b() {
        afrt e = e();
        e.c("cancellationFlowParams", this.a);
        return e.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        zgh.m(((artb) a().mo39build()).d);
    }

    @Override // defpackage.aaqs
    /* renamed from: t */
    public final aopa a() {
        aopa createBuilder = artb.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        artb artbVar = (artb) createBuilder.instance;
        str.getClass();
        artbVar.b |= 2;
        artbVar.d = str;
        return createBuilder;
    }
}
