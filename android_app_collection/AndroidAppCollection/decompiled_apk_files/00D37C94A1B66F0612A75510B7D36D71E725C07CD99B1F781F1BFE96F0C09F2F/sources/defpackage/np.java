package defpackage;

import android.content.Context;
import android.support.v7.app.AlertController$RecycleListView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
/* compiled from: PG */
/* renamed from: np  reason: default package */
/* loaded from: classes3.dex */
final class np extends ArrayAdapter {
    final /* synthetic */ AlertController$RecycleListView a;
    final /* synthetic */ ns b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np(ns nsVar, Context context, int i, CharSequence[] charSequenceArr, AlertController$RecycleListView alertController$RecycleListView) {
        super(context, i, 16908308, charSequenceArr);
        this.b = nsVar;
        this.a = alertController$RecycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = this.b.s;
        if (zArr != null && zArr[i]) {
            this.a.setItemChecked(i, true);
        }
        return view2;
    }
}
