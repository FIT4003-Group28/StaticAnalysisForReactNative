package defpackage;

import android.content.Context;
import com.google.android.libraries.messaging.lighter.ui.common.pagedrecyclerview.PagedRecyclerView;
/* compiled from: PG */
/* renamed from: cuwr  reason: default package */
/* loaded from: classes5.dex */
public final class cuwr extends aag {
    final /* synthetic */ PagedRecyclerView a;
    private int b = 0;

    public cuwr(PagedRecyclerView pagedRecyclerView, Context context) {
        this.a = pagedRecyclerView;
    }

    @Override // defpackage.aag, defpackage.abs
    public final void e(aci aciVar) {
        super.e(aciVar);
        int b = aciVar.b();
        if (b != this.b) {
            this.b = b;
            cuwv cuwvVar = this.a.U;
            if (cuwvVar == null) {
                return;
            }
            cuwvVar.a();
        }
    }
}
