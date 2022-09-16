package defpackage;

import android.database.DataSetObserver;
import android.widget.HorizontalScrollView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zuh  reason: default package */
/* loaded from: classes4.dex */
public final class zuh extends DataSetObserver {
    final /* synthetic */ HorizontalScrollView a;
    final /* synthetic */ zuk b;

    public zuh(zuk zukVar, HorizontalScrollView horizontalScrollView) {
        this.b = zukVar;
        this.a = horizontalScrollView;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.a.post(new zug(this.b, 2));
    }
}
