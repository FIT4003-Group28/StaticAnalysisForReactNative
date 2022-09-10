package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: defz  reason: default package */
/* loaded from: classes.dex */
public abstract class defz<V, C> extends defa<V, C> {
    private List<defy<V>> c;

    public defz(dccr<? extends dehn<? extends V>> dccrVar, boolean z) {
        super(dccrVar, z, true);
        List<defy<V>> f;
        if (dccrVar.isEmpty()) {
            f = dcdc.e();
        } else {
            f = dchl.f(dccrVar.size());
        }
        for (int i = 0; i < dccrVar.size(); i++) {
            f.add(null);
        }
        this.c = f;
    }

    @Override // defpackage.defa
    public final void q(deez deezVar) {
        super.q(deezVar);
        this.c = null;
    }

    @Override // defpackage.defa
    public final void r(int i, V v) {
        List<defy<V>> list = this.c;
        if (list != null) {
            list.set(i, new defy<>(v));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.defa
    public final void s() {
        List<defy<V>> list = this.c;
        if (list != null) {
            j(t(list));
        }
    }

    public abstract C t(List<defy<V>> list);
}
