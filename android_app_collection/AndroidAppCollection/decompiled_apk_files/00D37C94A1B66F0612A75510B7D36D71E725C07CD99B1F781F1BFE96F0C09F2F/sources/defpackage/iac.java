package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.WindowManager;
/* compiled from: PG */
/* renamed from: iac  reason: default package */
/* loaded from: classes3.dex */
final class iac extends LinearLayoutManager {
    final /* synthetic */ iai a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iac(iai iaiVar, Context context) {
        super(iaiVar.q ? 1 : 0);
        this.a = iaiVar;
        iaiVar.A = 117.46f / ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getWidth();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.xw
    public final boolean ad() {
        iai iaiVar = this.a;
        return (iaiVar.q || iaiVar.q()) ? super.ad() : !this.a.e.b;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.xw
    public final boolean ae() {
        iai iaiVar = this.a;
        return (!iaiVar.q || iaiVar.q()) ? super.ae() : !this.a.e.b;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.xw
    public final void ao(RecyclerView recyclerView, int i) {
        iad iadVar = new iad(this.a, recyclerView.getContext());
        iadVar.b = i;
        bd(iadVar);
    }
}
