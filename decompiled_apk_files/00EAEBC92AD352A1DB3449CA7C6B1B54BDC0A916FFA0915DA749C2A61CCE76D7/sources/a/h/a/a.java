package a.h.a;

import a.h.a.b;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: b  reason: collision with root package name */
    protected boolean f405b;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f406c;

    /* renamed from: d  reason: collision with root package name */
    protected Cursor f407d;

    /* renamed from: e  reason: collision with root package name */
    protected Context f408e;

    /* renamed from: f  reason: collision with root package name */
    protected int f409f;

    /* renamed from: g  reason: collision with root package name */
    protected C0017a f410g;

    /* renamed from: h  reason: collision with root package name */
    protected DataSetObserver f411h;
    protected a.h.a.b i;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.h.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0017a extends ContentObserver {
        C0017a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            a.this.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f405b = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f405b = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z) {
        a(context, cursor, z ? 1 : 2);
    }

    @Override // a.h.a.b.a
    public Cursor a() {
        return this.f407d;
    }

    public abstract View a(Context context, Cursor cursor, ViewGroup viewGroup);

    void a(Context context, Cursor cursor, int i) {
        b bVar;
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f406c = true;
        } else {
            this.f406c = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f407d = cursor;
        this.f405b = z;
        this.f408e = context;
        this.f409f = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f410g = new C0017a();
            bVar = new b();
        } else {
            bVar = null;
            this.f410g = null;
        }
        this.f411h = bVar;
        if (z) {
            C0017a c0017a = this.f410g;
            if (c0017a != null) {
                cursor.registerContentObserver(c0017a);
            }
            DataSetObserver dataSetObserver = this.f411h;
            if (dataSetObserver == null) {
                return;
            }
            cursor.registerDataSetObserver(dataSetObserver);
        }
    }

    @Override // a.h.a.b.a
    public void a(Cursor cursor) {
        Cursor c2 = c(cursor);
        if (c2 != null) {
            c2.close();
        }
    }

    public abstract void a(View view, Context context, Cursor cursor);

    public abstract View b(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // a.h.a.b.a
    public abstract CharSequence b(Cursor cursor);

    protected void b() {
        Cursor cursor;
        if (!this.f406c || (cursor = this.f407d) == null || cursor.isClosed()) {
            return;
        }
        this.f405b = this.f407d.requery();
    }

    public Cursor c(Cursor cursor) {
        Cursor cursor2 = this.f407d;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0017a c0017a = this.f410g;
            if (c0017a != null) {
                cursor2.unregisterContentObserver(c0017a);
            }
            DataSetObserver dataSetObserver = this.f411h;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f407d = cursor;
        if (cursor != null) {
            C0017a c0017a2 = this.f410g;
            if (c0017a2 != null) {
                cursor.registerContentObserver(c0017a2);
            }
            DataSetObserver dataSetObserver2 = this.f411h;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f409f = cursor.getColumnIndexOrThrow("_id");
            this.f405b = true;
            notifyDataSetChanged();
        } else {
            this.f409f = -1;
            this.f405b = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f405b || (cursor = this.f407d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.f405b) {
            this.f407d.moveToPosition(i);
            if (view == null) {
                view = a(this.f408e, this.f407d, viewGroup);
            }
            a(view, this.f408e, this.f407d);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.i == null) {
            this.i = new a.h.a.b(this);
        }
        return this.i;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f405b || (cursor = this.f407d) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f407d;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (!this.f405b || (cursor = this.f407d) == null || !cursor.moveToPosition(i)) {
            return 0L;
        }
        return this.f407d.getLong(this.f409f);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.f405b) {
            if (this.f407d.moveToPosition(i)) {
                if (view == null) {
                    view = b(this.f408e, this.f407d, viewGroup);
                }
                a(view, this.f408e, this.f407d);
                return view;
            }
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
