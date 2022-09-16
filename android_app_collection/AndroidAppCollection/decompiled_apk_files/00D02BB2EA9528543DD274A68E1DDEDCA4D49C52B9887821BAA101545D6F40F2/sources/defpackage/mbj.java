package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.auto.sdk.ui.CarRecyclerView;
/* compiled from: PG */
/* renamed from: mbj  reason: default package */
/* loaded from: classes7.dex */
final class mbj extends abi {
    final /* synthetic */ mbp a;

    public mbj(mbp mbpVar) {
        this.a = mbpVar;
    }

    @Override // defpackage.abi
    public final void a() {
        this.a.x.d();
        final CarRecyclerView carRecyclerView = ((cov) this.a.w).a;
        carRecyclerView.post(new Runnable(this, carRecyclerView) { // from class: mbi
            private final mbj a;
            private final RecyclerView b;

            {
                this.a = this;
                this.b = carRecyclerView;
            }

            @Override // java.lang.Runnable
            public final void run() {
                mbj mbjVar = this.a;
                RecyclerView recyclerView = this.b;
                mbp mbpVar = mbjVar.a;
                if (mbpVar.x.b == -1) {
                    View q = ((cov) mbpVar.w).b.q();
                    mbjVar.a.i.g(0, (q == null ? 3 : recyclerView.Z(q)) + 1, true);
                }
            }
        });
    }

    @Override // defpackage.abi
    public final void b(int i, int i2) {
        this.a.p();
    }
}
