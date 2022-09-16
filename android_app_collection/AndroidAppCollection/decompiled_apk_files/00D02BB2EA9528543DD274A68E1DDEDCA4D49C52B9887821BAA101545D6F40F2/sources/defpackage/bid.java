package defpackage;
/* compiled from: PG */
/* renamed from: bid  reason: default package */
/* loaded from: classes3.dex */
public final class bid<V> extends bib<V> {
    private bid() {
    }

    public static <V> bid<V> e() {
        return new bid<>();
    }

    public final void f(V v) {
        if (v == null) {
            v = (V) bib.c;
        }
        if (bib.b.e(this, null, v)) {
            bib.c(this);
        }
    }

    public final void g(Throwable th) {
        if (bib.b.e(this, null, new bhv(th))) {
            bib.c(this);
        }
    }

    public final void h(dehn<? extends V> dehnVar) {
        bhv bhvVar;
        bib.d(dehnVar);
        Object obj = this.d;
        if (obj == null) {
            if (dehnVar.isDone()) {
                if (!bib.b.e(this, null, bib.b(dehnVar))) {
                    return;
                }
                bib.c(this);
                return;
            }
            bhy bhyVar = new bhy(this, dehnVar);
            if (bib.b.e(this, null, bhyVar)) {
                try {
                    dehnVar.Pk(bhyVar, bic.a);
                    return;
                } catch (Throwable th) {
                    try {
                        bhvVar = new bhv(th);
                    } catch (Throwable unused) {
                        bhvVar = bhv.a;
                    }
                    bib.b.e(this, bhyVar, bhvVar);
                    return;
                }
            }
            obj = this.d;
        }
        if (obj instanceof bht) {
            dehnVar.cancel(((bht) obj).c);
        }
    }
}
