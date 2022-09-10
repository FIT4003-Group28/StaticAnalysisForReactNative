package defpackage;
/* compiled from: PG */
/* renamed from: cdhf  reason: default package */
/* loaded from: classes4.dex */
public abstract class cdhf implements defg<cdhe, cdhe> {
    private deig<cdhe> a = deig.d();

    @Override // defpackage.defg
    public final /* bridge */ /* synthetic */ dehn<cdhe> a(cdhe cdheVar) {
        cdhe cdheVar2 = cdheVar;
        this.a = deig.d();
        if (!cdheVar2.a()) {
            c(cdheVar2);
        } else {
            b(cdheVar2);
        }
        return this.a;
    }

    public abstract void b(cdhe cdheVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(cdhe cdheVar) {
        this.a.j(cdheVar);
    }
}
