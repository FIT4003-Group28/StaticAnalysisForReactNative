package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acql  reason: default package */
/* loaded from: classes.dex */
public final class acql implements absu {
    final /* synthetic */ acqm a;

    public acql(acqm acqmVar) {
        this.a = acqmVar;
    }

    @Override // defpackage.absu
    public final void c(abry abryVar) {
        this.a.d.c(abryVar);
        absi absiVar = this.a.e;
        if (absiVar != null) {
            absiVar.c(abryVar);
        }
    }

    @Override // defpackage.absu
    public final boolean e(boolean z, absw abswVar, abry abryVar) {
        boolean e = new absi(this.a.d).e(z, abswVar, abryVar);
        absi absiVar = this.a.e;
        return e || (absiVar != null ? new absi(absiVar).e(z, abswVar, abryVar) : false);
    }
}
