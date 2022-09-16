package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: yzy  reason: default package */
/* loaded from: classes7.dex */
public final class yzy implements dbrn<RecyclerView, RecyclerView> {
    int a = 0;
    final /* synthetic */ boolean b;
    final /* synthetic */ zaa c;

    public yzy(zaa zaaVar, boolean z) {
        this.c = zaaVar;
        this.b = z;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ RecyclerView a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = recyclerView;
        List<yzz> list = this.c.b;
        if (list != null) {
            if (this.b) {
                list.add(new yzz(recyclerView2));
            } else if (this.a < list.size()) {
                this.c.b.get(this.a).a = recyclerView2;
            }
            this.a++;
        }
        return recyclerView2;
    }
}
