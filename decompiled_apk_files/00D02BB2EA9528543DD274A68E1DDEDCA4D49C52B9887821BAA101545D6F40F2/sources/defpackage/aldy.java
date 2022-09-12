package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aldy  reason: default package */
/* loaded from: classes2.dex */
public final class aldy implements dbty<akuh> {
    final /* synthetic */ bnrd a;
    final /* synthetic */ int b;
    final /* synthetic */ alec c;

    public aldy(alec alecVar, bnrd bnrdVar, int i) {
        this.c = alecVar;
        this.a = bnrdVar;
        this.b = i;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ akuh a() {
        return this.c.a.a().m(this.a, this.b);
    }
}
