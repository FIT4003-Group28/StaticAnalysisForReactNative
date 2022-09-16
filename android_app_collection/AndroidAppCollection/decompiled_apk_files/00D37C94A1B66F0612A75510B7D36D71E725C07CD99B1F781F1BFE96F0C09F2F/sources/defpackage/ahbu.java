package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Checkable;
import com.google.android.libraries.youtube.offline.ui.NonScrollableListView;
/* compiled from: PG */
/* renamed from: ahbu  reason: default package */
/* loaded from: classes.dex */
public final class ahbu extends ahcw implements AdapterView.OnItemClickListener {
    public int a;
    private final NonScrollableListView c;

    public ahbu(Context context, NonScrollableListView nonScrollableListView) {
        super(context, null);
        this.a = -1;
        nonScrollableListView.getClass();
        this.c = nonScrollableListView;
    }

    public final void a(int i) {
        this.a = i;
        int i2 = 0;
        while (i2 < this.c.getChildCount()) {
            View childAt = this.c.getChildAt(i2);
            if (childAt instanceof Checkable) {
                ((Checkable) childAt).setChecked(i2 == i);
            }
            i2++;
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (this.a == i) {
            return;
        }
        a(i);
    }
}
