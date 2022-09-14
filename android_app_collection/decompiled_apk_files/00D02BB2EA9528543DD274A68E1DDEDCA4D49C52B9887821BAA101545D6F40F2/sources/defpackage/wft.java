package defpackage;

import android.support.v7.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wft  reason: default package */
/* loaded from: classes7.dex */
public final class wft extends cqqw {
    final /* synthetic */ wfw a;

    public wft(wfw wfwVar) {
        this.a = wfwVar;
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 || this.a.e == null) {
            return;
        }
        dead deadVar = i > 0 ? dead.RIGHT : dead.LEFT;
        wfw wfwVar = this.a;
        wfwVar.b.n(wfwVar.e, new cjte(deaf.SWIPE, deadVar), this.a.d);
    }
}
