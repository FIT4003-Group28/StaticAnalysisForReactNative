package defpackage;
/* compiled from: PG */
/* renamed from: aizu  reason: default package */
/* loaded from: classes2.dex */
final class aizu implements cqgl {
    final /* synthetic */ aizx a;

    public aizu(aizx aizxVar) {
        this.a = aizxVar;
    }

    @Override // defpackage.cqgl
    public final void a(CharSequence charSequence) {
        aizx aizxVar = this.a;
        double d = dcyn.a;
        if (charSequence != null && !dzxg.a(charSequence)) {
            d = Double.parseDouble(charSequence.toString());
        }
        aizxVar.b = d;
    }
}
