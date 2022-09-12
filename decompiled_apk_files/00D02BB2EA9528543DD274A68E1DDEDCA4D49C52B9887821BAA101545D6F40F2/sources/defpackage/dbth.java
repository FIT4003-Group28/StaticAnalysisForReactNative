package defpackage;
/* compiled from: PG */
/* renamed from: dbth  reason: default package */
/* loaded from: classes5.dex */
final class dbth extends dbtk {
    final /* synthetic */ dbrd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbth(dbtm dbtmVar, CharSequence charSequence, dbrd dbrdVar) {
        super(dbtmVar, charSequence);
        this.a = dbrdVar;
    }

    @Override // defpackage.dbtk
    public final int c(int i) {
        if (this.a.b(i)) {
            return this.a.d();
        }
        return -1;
    }

    @Override // defpackage.dbtk
    public final int d(int i) {
        return this.a.c();
    }
}
