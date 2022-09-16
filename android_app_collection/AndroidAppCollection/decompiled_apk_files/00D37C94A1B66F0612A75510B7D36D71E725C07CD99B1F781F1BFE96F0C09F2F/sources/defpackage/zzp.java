package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: zzp  reason: default package */
/* loaded from: classes4.dex */
final class zzp extends ne {
    final /* synthetic */ zzq a;

    public zzp(zzq zzqVar) {
        this.a = zzqVar;
    }

    private final void a() {
        int J2 = this.a.d.J();
        int i = 0;
        View childAt = this.a.c.getChildAt(0);
        boolean z = J2 > 0 || (childAt != null && childAt.getTop() < 0);
        View view = this.a.e;
        if (true != z) {
            i = 4;
        }
        view.setVisibility(i);
    }

    @Override // defpackage.ne
    public final void i(RecyclerView recyclerView, int i) {
        int i2;
        a();
        aaar aaarVar = this.a.f;
        if (aaarVar != null) {
            aaarVar.h();
        }
        if (i == 0) {
            zzq zzqVar = this.a;
            aaar aaarVar2 = zzqVar.f;
            if (zzqVar.c == null) {
                i2 = -1;
            } else {
                int J2 = zzqVar.d.J();
                View childAt = zzqVar.c.getChildAt(0);
                i2 = (childAt == null || ((float) childAt.getTop()) >= ((float) childAt.getHeight()) * (-0.3f)) ? J2 : J2 + 1;
            }
            aaarVar2.n(i2);
        }
    }

    @Override // defpackage.ne
    public final void j(RecyclerView recyclerView, int i, int i2) {
        a();
        aaar aaarVar = this.a.f;
        if (aaarVar != null) {
            aaarVar.h();
        }
    }
}
