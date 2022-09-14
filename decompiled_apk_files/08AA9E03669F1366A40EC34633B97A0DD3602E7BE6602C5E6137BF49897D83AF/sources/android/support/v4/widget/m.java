package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: ResourceCursorAdapter.java */
/* loaded from: classes.dex */
public abstract class m extends e {
    private int j;
    private int k;
    private LayoutInflater l;

    @Deprecated
    public m(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.k = i;
        this.j = i;
        this.l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // android.support.v4.widget.e
    public View a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.l.inflate(this.j, viewGroup, false);
    }

    @Override // android.support.v4.widget.e
    public View b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.l.inflate(this.k, viewGroup, false);
    }
}
