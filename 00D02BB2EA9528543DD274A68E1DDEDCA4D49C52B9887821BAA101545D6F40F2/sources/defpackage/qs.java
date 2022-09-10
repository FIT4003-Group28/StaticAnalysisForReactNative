package defpackage;

import android.support.v7.app.AlertController$RecycleListView;
import android.view.View;
import android.widget.AdapterView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qs  reason: default package */
/* loaded from: classes7.dex */
public final class qs implements AdapterView.OnItemClickListener {
    final /* synthetic */ AlertController$RecycleListView a;
    final /* synthetic */ qw b;
    final /* synthetic */ qt c;

    public qs(qt qtVar, AlertController$RecycleListView alertController$RecycleListView, qw qwVar) {
        this.c = qtVar;
        this.a = alertController$RecycleListView;
        this.b = qwVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        boolean[] zArr = this.c.r;
        if (zArr != null) {
            zArr[i] = this.a.isItemChecked(i);
        }
        this.c.v.onClick(this.b.b, i, this.a.isItemChecked(i));
    }
}
