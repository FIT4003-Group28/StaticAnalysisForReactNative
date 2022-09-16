package defpackage;
/* compiled from: PG */
/* renamed from: aesm  reason: default package */
/* loaded from: classes2.dex */
final class aesm extends cqmr<jba> {
    boolean a = false;
    final /* synthetic */ cqjz b;
    final /* synthetic */ aesn c;

    public aesm(aesn aesnVar, cqjz cqjzVar) {
        this.c = aesnVar;
        this.b = cqjzVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqmr
    public final /* bridge */ /* synthetic */ void a(jba jbaVar, boolean z) {
        bmog.b(this.b.c, new aesl(this), Integer.valueOf(ckgj.FIRST_AROUND_ME_PLACE.e + jbaVar.ab().intValue()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqmr
    public final void b(boolean z) {
        bmog.a(this.b.c);
        this.a = false;
    }
}
