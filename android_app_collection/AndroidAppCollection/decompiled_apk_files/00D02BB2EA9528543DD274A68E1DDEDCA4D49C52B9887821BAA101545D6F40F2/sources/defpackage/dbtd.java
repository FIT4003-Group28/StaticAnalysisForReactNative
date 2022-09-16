package defpackage;
/* compiled from: PG */
/* renamed from: dbtd  reason: default package */
/* loaded from: classes.dex */
final class dbtd extends dbtk {
    final /* synthetic */ dbte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbtd(dbte dbteVar, dbtm dbtmVar, CharSequence charSequence) {
        super(dbtmVar, charSequence);
        this.a = dbteVar;
    }

    @Override // defpackage.dbtk
    public final int c(int i) {
        return this.a.a.d(this.b, i);
    }

    @Override // defpackage.dbtk
    public final int d(int i) {
        return i + 1;
    }
}
