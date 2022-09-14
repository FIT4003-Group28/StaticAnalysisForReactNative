package android.support.v4.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.support.v4.widget.f;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
/* compiled from: CursorAdapter.java */
/* loaded from: classes.dex */
public abstract class e extends BaseAdapter implements f.a, Filterable {

    /* renamed from: a  reason: collision with root package name */
    protected boolean f646a;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f647b;

    /* renamed from: c  reason: collision with root package name */
    protected Cursor f648c;

    /* renamed from: d  reason: collision with root package name */
    protected Context f649d;
    protected int e;
    protected a f;
    protected DataSetObserver g;
    protected f h;
    protected FilterQueryProvider i;

    public abstract View a(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract void a(View view, Context context, Cursor cursor);

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public e(Context context, Cursor cursor, boolean z) {
        a(context, cursor, z ? 1 : 2);
    }

    void a(Context context, Cursor cursor, int i) {
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f647b = true;
        } else {
            this.f647b = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f648c = cursor;
        this.f646a = z;
        this.f649d = context;
        this.e = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f = new a();
            this.g = new b();
        } else {
            this.f = null;
            this.g = null;
        }
        if (z) {
            if (this.f != null) {
                cursor.registerContentObserver(this.f);
            }
            if (this.g == null) {
                return;
            }
            cursor.registerDataSetObserver(this.g);
        }
    }

    @Override // android.support.v4.widget.f.a
    public Cursor a() {
        return this.f648c;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (!this.f646a || this.f648c == null) {
            return 0;
        }
        return this.f648c.getCount();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (!this.f646a || this.f648c == null) {
            return null;
        }
        this.f648c.moveToPosition(i);
        return this.f648c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        if (!this.f646a || this.f648c == null || !this.f648c.moveToPosition(i)) {
            return 0L;
        }
        return this.f648c.getLong(this.e);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f646a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f648c.moveToPosition(i)) {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
        if (view == null) {
            view = a(this.f649d, this.f648c, viewGroup);
        }
        a(view, this.f649d, this.f648c);
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.f646a) {
            this.f648c.moveToPosition(i);
            if (view == null) {
                view = b(this.f649d, this.f648c, viewGroup);
            }
            a(view, this.f649d, this.f648c);
            return view;
        }
        return null;
    }

    public View b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return a(context, cursor, viewGroup);
    }

    @Override // android.support.v4.widget.f.a
    public void a(Cursor cursor) {
        Cursor b2 = b(cursor);
        if (b2 != null) {
            b2.close();
        }
    }

    public Cursor b(Cursor cursor) {
        if (cursor == this.f648c) {
            return null;
        }
        Cursor cursor2 = this.f648c;
        if (cursor2 != null) {
            if (this.f != null) {
                cursor2.unregisterContentObserver(this.f);
            }
            if (this.g != null) {
                cursor2.unregisterDataSetObserver(this.g);
            }
        }
        this.f648c = cursor;
        if (cursor != null) {
            if (this.f != null) {
                cursor.registerContentObserver(this.f);
            }
            if (this.g != null) {
                cursor.registerDataSetObserver(this.g);
            }
            this.e = cursor.getColumnIndexOrThrow("_id");
            this.f646a = true;
            notifyDataSetChanged();
        } else {
            this.e = -1;
            this.f646a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    @Override // android.support.v4.widget.f.a
    public CharSequence c(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    @Override // android.support.v4.widget.f.a
    public Cursor a(CharSequence charSequence) {
        if (this.i != null) {
            return this.i.runQuery(charSequence);
        }
        return this.f648c;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.h == null) {
            this.h = new f(this);
        }
        return this.h;
    }

    protected void b() {
        if (!this.f647b || this.f648c == null || this.f648c.isClosed()) {
            return;
        }
        this.f646a = this.f648c.requery();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CursorAdapter.java */
    /* loaded from: classes.dex */
    public class a extends ContentObserver {
        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            e.this.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CursorAdapter.java */
    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            e.this.f646a = true;
            e.this.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            e.this.f646a = false;
            e.this.notifyDataSetInvalidated();
        }
    }
}
