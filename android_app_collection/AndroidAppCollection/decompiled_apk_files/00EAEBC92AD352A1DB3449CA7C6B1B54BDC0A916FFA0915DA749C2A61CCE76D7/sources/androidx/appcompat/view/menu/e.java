package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class e implements n, AdapterView.OnItemClickListener {

    /* renamed from: b  reason: collision with root package name */
    Context f1035b;

    /* renamed from: c  reason: collision with root package name */
    LayoutInflater f1036c;

    /* renamed from: d  reason: collision with root package name */
    g f1037d;

    /* renamed from: e  reason: collision with root package name */
    ExpandedMenuView f1038e;

    /* renamed from: f  reason: collision with root package name */
    int f1039f;

    /* renamed from: g  reason: collision with root package name */
    int f1040g;

    /* renamed from: h  reason: collision with root package name */
    int f1041h;
    private n.a i;
    a j;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        private int f1042b = -1;

        public a() {
            a();
        }

        void a() {
            j f2 = e.this.f1037d.f();
            if (f2 != null) {
                ArrayList<j> j = e.this.f1037d.j();
                int size = j.size();
                for (int i = 0; i < size; i++) {
                    if (j.get(i) == f2) {
                        this.f1042b = i;
                        return;
                    }
                }
            }
            this.f1042b = -1;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = e.this.f1037d.j().size() - e.this.f1039f;
            return this.f1042b < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        /* renamed from: getItem */
        public j mo36getItem(int i) {
            ArrayList<j> j = e.this.f1037d.j();
            int i2 = i + e.this.f1039f;
            int i3 = this.f1042b;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return j.get(i2);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                e eVar = e.this;
                view = eVar.f1036c.inflate(eVar.f1041h, viewGroup, false);
            }
            ((o.a) view).a(mo36getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(int i, int i2) {
        this.f1041h = i;
        this.f1040g = i2;
    }

    public e(Context context, int i) {
        this(i, 0);
        this.f1035b = context;
        this.f1036c = LayoutInflater.from(this.f1035b);
    }

    public o a(ViewGroup viewGroup) {
        if (this.f1038e == null) {
            this.f1038e = (ExpandedMenuView) this.f1036c.inflate(a.a.g.abc_expanded_menu_layout, viewGroup, false);
            if (this.j == null) {
                this.j = new a();
            }
            this.f1038e.setAdapter((ListAdapter) this.j);
            this.f1038e.setOnItemClickListener(this);
        }
        return this.f1038e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r2.f1036c == null) goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.view.menu.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.content.Context r3, androidx.appcompat.view.menu.g r4) {
        /*
            r2 = this;
            int r0 = r2.f1040g
            if (r0 == 0) goto L14
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            r1.<init>(r3, r0)
            r2.f1035b = r1
        Lb:
            android.content.Context r3 = r2.f1035b
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r2.f1036c = r3
            goto L1f
        L14:
            android.content.Context r0 = r2.f1035b
            if (r0 == 0) goto L1f
            r2.f1035b = r3
            android.view.LayoutInflater r3 = r2.f1036c
            if (r3 != 0) goto L1f
            goto Lb
        L1f:
            r2.f1037d = r4
            androidx.appcompat.view.menu.e$a r3 = r2.j
            if (r3 == 0) goto L28
            r3.notifyDataSetChanged()
        L28:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.a(android.content.Context, androidx.appcompat.view.menu.g):void");
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(g gVar, boolean z) {
        n.a aVar = this.i;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(n.a aVar) {
        this.i = aVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(boolean z) {
        a aVar = this.j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean a(g gVar, j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean a(s sVar) {
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        new h(sVar).a((IBinder) null);
        n.a aVar = this.i;
        if (aVar == null) {
            return true;
        }
        aVar.a(sVar);
        return true;
    }

    public ListAdapter b() {
        if (this.j == null) {
            this.j = new a();
        }
        return this.j;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean b(g gVar, j jVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f1037d.a(this.j.mo36getItem(i), this, 0);
    }
}
