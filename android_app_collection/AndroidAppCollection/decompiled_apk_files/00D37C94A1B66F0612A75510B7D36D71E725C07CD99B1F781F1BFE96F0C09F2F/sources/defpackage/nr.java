package defpackage;

import android.support.v7.app.AlertController$RecycleListView;
import android.view.View;
import android.widget.AdapterView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nr  reason: default package */
/* loaded from: classes3.dex */
public final class nr implements AdapterView.OnItemClickListener {
    final /* synthetic */ AlertController$RecycleListView a;
    final /* synthetic */ nv b;
    final /* synthetic */ ns c;

    public nr(ns nsVar, AlertController$RecycleListView alertController$RecycleListView, nv nvVar) {
        this.c = nsVar;
        this.a = alertController$RecycleListView;
        this.b = nvVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        boolean[] zArr = this.c.s;
        if (zArr != null) {
            zArr[i] = this.a.isItemChecked(i);
        }
        this.c.w.onClick(this.b.b, i, this.a.isItemChecked(i));
    }
}
