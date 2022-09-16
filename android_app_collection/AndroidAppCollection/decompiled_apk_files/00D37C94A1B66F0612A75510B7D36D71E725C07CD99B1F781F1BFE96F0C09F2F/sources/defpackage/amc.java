package defpackage;

import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
/* compiled from: PG */
/* renamed from: amc  reason: default package */
/* loaded from: classes.dex */
public abstract class amc extends BaseAdapter implements Filterable, amd {
    private ame a;
    public final boolean c = true;
    public Cursor d = null;
    public boolean b = false;
    public int e = -1;
    public final ama f = new ama(this);
    public final DataSetObserver g = new amb(this);

    @Override // defpackage.amd
    public Cursor a(CharSequence charSequence) {
        throw null;
    }

    @Override // defpackage.amd
    public CharSequence b(Cursor cursor) {
        throw null;
    }

    @Override // defpackage.amd
    public void d(Cursor cursor) {
        throw null;
    }

    public abstract void e(View view, Cursor cursor);

    public abstract View f(ViewGroup viewGroup);

    @Override // defpackage.amd
    public final Cursor g() {
        return this.d;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.b || (cursor = this.d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.b) {
            this.d.moveToPosition(i);
            if (view == null) {
                view = h(viewGroup);
            }
            e(view, this.d);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.a == null) {
            this.a = new ame(this);
        }
        return this.a;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.b || (cursor = this.d) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.d;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (!this.b || (cursor = this.d) == null || !cursor.moveToPosition(i)) {
            return 0L;
        }
        return this.d.getLong(this.e);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.d.moveToPosition(i)) {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
        if (view == null) {
            view = f(viewGroup);
        }
        e(view, this.d);
        return view;
    }

    public View h(ViewGroup viewGroup) {
        throw null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }
}
