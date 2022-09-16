package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.Set;
/* compiled from: PG */
/* renamed from: blju  reason: default package */
/* loaded from: classes3.dex */
public final class blju extends cqqw {
    private final Set<cqqw> a;

    public blju(Set<cqqw> set) {
        this.a = dcep.K(set);
    }

    @Override // defpackage.abx
    public final void QA(RecyclerView recyclerView, int i) {
        for (cqqw cqqwVar : this.a) {
            cqqwVar.QA(recyclerView, i);
        }
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        for (cqqw cqqwVar : this.a) {
            cqqwVar.a(recyclerView, i, i2);
        }
    }
}
