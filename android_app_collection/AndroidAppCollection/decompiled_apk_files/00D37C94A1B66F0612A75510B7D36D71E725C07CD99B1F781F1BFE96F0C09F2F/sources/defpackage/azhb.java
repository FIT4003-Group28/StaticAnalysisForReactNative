package defpackage;
/* compiled from: PG */
/* renamed from: azhb  reason: default package */
/* loaded from: classes2.dex */
public final class azhb extends azdm {
    final ayor b;
    final int c;

    public azhb(ayok ayokVar, ayor ayorVar, int i) {
        super(ayokVar);
        this.b = ayorVar;
        this.c = i;
    }

    @Override // defpackage.ayoi
    protected final void f(ayom ayomVar) {
        ayor ayorVar = this.b;
        if (ayorVar instanceof azns) {
            this.a.az(ayomVar);
            return;
        }
        this.a.az(new azha(ayomVar, ayorVar.a(), this.c));
    }
}
