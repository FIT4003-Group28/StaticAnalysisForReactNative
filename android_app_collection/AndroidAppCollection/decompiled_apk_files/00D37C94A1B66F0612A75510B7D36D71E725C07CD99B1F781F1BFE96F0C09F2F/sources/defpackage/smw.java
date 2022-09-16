package defpackage;
/* compiled from: PG */
/* renamed from: smw  reason: default package */
/* loaded from: classes4.dex */
final class smw implements smt {
    final /* synthetic */ Iterable a;

    public smw(Iterable iterable) {
        this.a = iterable;
    }

    @Override // defpackage.smt
    public final boolean a(String str) {
        for (smt smtVar : this.a) {
            if (smtVar.a(str)) {
                return true;
            }
        }
        return false;
    }
}
