package defpackage;
/* compiled from: PG */
/* renamed from: aizv  reason: default package */
/* loaded from: classes2.dex */
final class aizv implements cqgl {
    final /* synthetic */ aizx a;

    public aizv(aizx aizxVar) {
        this.a = aizxVar;
    }

    @Override // defpackage.cqgl
    public final void a(CharSequence charSequence) {
        aizx aizxVar = this.a;
        double d = dcyn.a;
        if (charSequence != null && !dzxg.a(charSequence)) {
            d = Double.parseDouble(charSequence.toString());
        }
        aizxVar.c = d;
    }
}
