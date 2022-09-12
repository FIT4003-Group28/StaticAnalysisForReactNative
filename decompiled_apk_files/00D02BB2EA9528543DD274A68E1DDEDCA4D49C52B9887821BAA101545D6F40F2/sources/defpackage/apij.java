package defpackage;

import android.support.v7.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: apij  reason: default package */
/* loaded from: classes2.dex */
public final class apij extends cqqw {
    final /* synthetic */ apik a;

    public apij(apik apikVar) {
        this.a = apikVar;
    }

    @Override // defpackage.abx
    public final void QA(RecyclerView recyclerView, int i) {
        if (i == 1) {
            this.a.e = true;
        } else if (i != 0) {
        } else {
            apik apikVar = this.a;
            if (!apikVar.e) {
                return;
            }
            apikVar.e = false;
            if (apikVar.f == dead.UNASSIGNED_DIRECTIONAL_MOVEMENT_ID) {
                return;
            }
            this.a.g.m(new cjte(deaf.SWIPE, this.a.f), this.a.h);
        }
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (i2 != 0) {
            this.a.f = i2 > 0 ? dead.UP : dead.DOWN;
        }
    }
}
