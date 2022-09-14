package a.a.o;

import a.a.o.b;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.p;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class f extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    final Context f44a;

    /* renamed from: b  reason: collision with root package name */
    final b f45b;

    /* loaded from: classes.dex */
    public static class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final ActionMode.Callback f46a;

        /* renamed from: b  reason: collision with root package name */
        final Context f47b;

        /* renamed from: c  reason: collision with root package name */
        final ArrayList<f> f48c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        final a.e.g<Menu, Menu> f49d = new a.e.g<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f47b = context;
            this.f46a = callback;
        }

        private Menu a(Menu menu) {
            Menu menu2 = this.f49d.get(menu);
            if (menu2 == null) {
                p pVar = new p(this.f47b, (a.g.g.a.a) menu);
                this.f49d.put(menu, pVar);
                return pVar;
            }
            return menu2;
        }

        @Override // a.a.o.b.a
        public void a(b bVar) {
            this.f46a.onDestroyActionMode(b(bVar));
        }

        @Override // a.a.o.b.a
        public boolean a(b bVar, Menu menu) {
            return this.f46a.onPrepareActionMode(b(bVar), a(menu));
        }

        @Override // a.a.o.b.a
        public boolean a(b bVar, MenuItem menuItem) {
            return this.f46a.onActionItemClicked(b(bVar), new k(this.f47b, (a.g.g.a.b) menuItem));
        }

        public ActionMode b(b bVar) {
            int size = this.f48c.size();
            for (int i = 0; i < size; i++) {
                f fVar = this.f48c.get(i);
                if (fVar != null && fVar.f45b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f47b, bVar);
            this.f48c.add(fVar2);
            return fVar2;
        }

        @Override // a.a.o.b.a
        public boolean b(b bVar, Menu menu) {
            return this.f46a.onCreateActionMode(b(bVar), a(menu));
        }
    }

    public f(Context context, b bVar) {
        this.f44a = context;
        this.f45b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f45b.a();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f45b.b();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new p(this.f44a, (a.g.g.a.a) this.f45b.c());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f45b.d();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f45b.e();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f45b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f45b.g();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f45b.h();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f45b.i();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f45b.j();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f45b.a(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f45b.a(i);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f45b.a(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f45b.a(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f45b.b(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f45b.b(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f45b.a(z);
    }
}
