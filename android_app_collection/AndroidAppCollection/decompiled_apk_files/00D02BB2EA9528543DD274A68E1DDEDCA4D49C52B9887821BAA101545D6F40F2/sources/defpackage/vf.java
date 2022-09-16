package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: vf  reason: default package */
/* loaded from: classes.dex */
public class vf implements ky {
    private static final int[] j = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public vd b;
    public final ArrayList<vi> c;
    public final ArrayList<vi> d;
    CharSequence e;
    Drawable f;
    View g;
    public vi h;
    public boolean i;
    private final Resources k;
    private boolean l;
    private final boolean m;
    private final ArrayList<vi> n;
    private boolean o;
    private final ArrayList<vi> p;
    private boolean q;
    private int r = 0;
    private boolean s = false;
    private boolean t = false;
    private boolean u = false;
    private boolean v = false;
    private final ArrayList<vi> w = new ArrayList<>();
    private final CopyOnWriteArrayList<WeakReference<vt>> x = new CopyOnWriteArrayList<>();
    private boolean y = false;

    public vf(Context context) {
        boolean z = false;
        this.a = context;
        Resources resources = context.getResources();
        this.k = resources;
        this.c = new ArrayList<>();
        this.n = new ArrayList<>();
        this.o = true;
        this.d = new ArrayList<>();
        this.p = new ArrayList<>();
        this.q = true;
        if (resources.getConfiguration().keyboard != 1 && oe.d(ViewConfiguration.get(context), context)) {
            z = true;
        }
        this.m = z;
    }

    private final void E(int i, boolean z) {
        if (i < 0 || i >= this.c.size()) {
            return;
        }
        this.c.remove(i);
        if (!z) {
            return;
        }
        r(true);
    }

    public boolean A(vi viVar) {
        boolean z = false;
        if (!this.x.isEmpty() && this.h == viVar) {
            s();
            Iterator<WeakReference<vt>> it = this.x.iterator();
            while (it.hasNext()) {
                WeakReference<vt> next = it.next();
                vt vtVar = next.get();
                if (vtVar == null) {
                    this.x.remove(next);
                } else {
                    z = vtVar.g(viVar);
                    if (z) {
                        break;
                    }
                }
            }
            t();
            if (z) {
                this.h = null;
            }
        }
        return z;
    }

    public final void B() {
        this.q = true;
        r(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void C() {
        this.o = true;
        r(true);
    }

    public final void D() {
        this.r = 1;
    }

    public final void a(vt vtVar) {
        b(vtVar, this.a);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return h(0, 0, 0, this.k.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem h = h(i, i2, i3, resolveInfo.loadLabel(packageManager));
            h.setIcon(resolveInfo.loadIcon(packageManager));
            ((vi) h).e = intent2;
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = h;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.k.getString(i));
    }

    public final void b(vt vtVar, Context context) {
        this.x.add(new WeakReference<>(vtVar));
        vtVar.a(context, this);
        this.q = true;
    }

    public final void c(vt vtVar) {
        Iterator<WeakReference<vt>> it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference<vt> next = it.next();
            vt vtVar2 = next.get();
            if (vtVar2 == null || vtVar2 == vtVar) {
                this.x.remove(next);
            }
        }
    }

    @Override // android.view.Menu
    public final void clear() {
        vi viVar = this.h;
        if (viVar != null) {
            A(viVar);
        }
        this.c.clear();
        r(true);
    }

    public final void clearHeader() {
        this.f = null;
        this.e = null;
        this.g = null;
        r(false);
    }

    @Override // android.view.Menu
    public final void close() {
        q(true);
    }

    public final void d(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((wb) item.getSubMenu()).d(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(f(), sparseArray);
        }
    }

    public final void e(Bundle bundle) {
        MenuItem findItem;
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(f());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((wb) item.getSubMenu()).e(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    protected String f() {
        return "android:menu:actionviewstates";
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            vi viVar = this.c.get(i2);
            if (viVar.a == i) {
                return viVar;
            }
            if (viVar.hasSubMenu() && (findItem = viVar.k.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public void g(vd vdVar) {
        this.b = vdVar;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return this.c.get(i);
    }

    protected final MenuItem h(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = i3 >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (j[i5] << 16) | ((char) i3);
        vi viVar = new vi(this, i, i2, i3, i6, charSequence, this.r);
        ArrayList<vi> arrayList = this.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                i4 = 0;
                break;
            } else if (arrayList.get(size).c <= i6) {
                i4 = size + 1;
                break;
            }
        }
        arrayList.add(i4, viVar);
        r(true);
        return viVar;
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.i) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.c.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean i() {
        return this.y;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return n(i, keyEvent) != null;
    }

    public boolean j() {
        return this.l;
    }

    public boolean k() {
        return this.m;
    }

    public boolean l(vf vfVar, MenuItem menuItem) {
        vd vdVar = this.b;
        return vdVar != null && vdVar.x(vfVar, menuItem);
    }

    final void m(List<vi> list, int i, KeyEvent keyEvent) {
        int i2;
        boolean j2 = j();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.c.size();
            for (int i3 = 0; i3 < size; i3++) {
                vi viVar = this.c.get(i3);
                if (viVar.hasSubMenu()) {
                    viVar.k.m(list, i, keyEvent);
                }
                char c = j2 ? viVar.h : viVar.f;
                if (j2) {
                    i2 = viVar.i;
                } else {
                    i2 = viVar.g;
                }
                if ((modifiers & 69647) == (i2 & 69647) && c != 0 && ((c == keyData.meta[0] || c == keyData.meta[2] || (j2 && c == '\b' && i == 67)) && viVar.isEnabled())) {
                    list.add(viVar);
                }
            }
        }
    }

    final vi n(int i, KeyEvent keyEvent) {
        ArrayList<vi> arrayList = this.w;
        arrayList.clear();
        m(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean j2 = j();
        for (int i2 = 0; i2 < size; i2++) {
            vi viVar = arrayList.get(i2);
            char c = j2 ? viVar.h : viVar.f;
            if ((c == keyData.meta[0] && (metaState & 2) == 0) || ((c == keyData.meta[2] && (metaState & 2) != 0) || (j2 && c == '\b' && i == 67))) {
                return viVar;
            }
        }
        return null;
    }

    public final boolean o(MenuItem menuItem, int i) {
        return p(menuItem, null, i);
    }

    public final boolean p(MenuItem menuItem, vt vtVar, int i) {
        boolean e;
        vi viVar = (vi) menuItem;
        if (viVar != null && viVar.isEnabled()) {
            boolean e2 = viVar.e();
            nf nfVar = viVar.o;
            boolean z = nfVar != null && nfVar.f();
            if (viVar.s()) {
                e2 |= viVar.expandActionView();
                if (e2) {
                    q(true);
                    return true;
                }
            } else if (viVar.hasSubMenu() || z) {
                if ((i & 4) == 0) {
                    q(false);
                }
                if (!viVar.hasSubMenu()) {
                    viVar.i(new wb(this.a, this, viVar));
                }
                wb wbVar = viVar.k;
                if (z) {
                    nfVar.g(wbVar);
                }
                if (this.x.isEmpty()) {
                    e = false;
                } else {
                    e = vtVar != null ? vtVar.e(wbVar) : false;
                    Iterator<WeakReference<vt>> it = this.x.iterator();
                    while (it.hasNext()) {
                        WeakReference<vt> next = it.next();
                        vt vtVar2 = next.get();
                        if (vtVar2 == null) {
                            this.x.remove(next);
                        } else if (!e) {
                            e = vtVar2.e(wbVar);
                        }
                    }
                }
                e2 |= e;
                if (!e2) {
                    q(true);
                }
            } else if ((i & 1) == 0) {
                q(true);
                return e2;
            }
            return e2;
        }
        return false;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return o(findItem(i), i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        vi n = n(i, keyEvent);
        boolean o = n != null ? o(n, i2) : false;
        if ((i2 & 2) != 0) {
            q(true);
        }
        return o;
    }

    public final void q(boolean z) {
        if (this.v) {
            return;
        }
        this.v = true;
        Iterator<WeakReference<vt>> it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference<vt> next = it.next();
            vt vtVar = next.get();
            if (vtVar == null) {
                this.x.remove(next);
            } else {
                vtVar.d(this, z);
            }
        }
        this.v = false;
    }

    public final void r(boolean z) {
        if (this.s) {
            this.t = true;
            if (!z) {
                return;
            }
            this.u = true;
            return;
        }
        if (z) {
            this.o = true;
            this.q = true;
        }
        if (this.x.isEmpty()) {
            return;
        }
        s();
        Iterator<WeakReference<vt>> it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference<vt> next = it.next();
            vt vtVar = next.get();
            if (vtVar == null) {
                this.x.remove(next);
            } else {
                vtVar.i();
            }
        }
        t();
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.c.get(i2).b == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int size2 = this.c.size() - i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size2 || this.c.get(i2).b != i) {
                    break;
                }
                E(i2, false);
                i3 = i4;
            }
            r(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.c.get(i2).a == i) {
                break;
            } else {
                i2++;
            }
        }
        E(i2, true);
    }

    public final void s() {
        if (!this.s) {
            this.s = true;
            this.t = false;
            this.u = false;
        }
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            vi viVar = this.c.get(i2);
            if (viVar.b == i) {
                viVar.k(z2);
                viVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.y = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            vi viVar = this.c.get(i2);
            if (viVar.b == i) {
                viVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        int size = this.c.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            vi viVar = this.c.get(i2);
            if (viVar.b == i && viVar.n(z)) {
                z2 = true;
            }
        }
        if (z2) {
            r(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.l = z;
        r(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.c.size();
    }

    public final void t() {
        this.s = false;
        if (this.t) {
            this.t = false;
            r(this.u);
        }
    }

    public final ArrayList<vi> u() {
        if (!this.o) {
            return this.n;
        }
        this.n.clear();
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            vi viVar = this.c.get(i);
            if (viVar.isVisible()) {
                this.n.add(viVar);
            }
        }
        this.o = false;
        this.q = true;
        return this.n;
    }

    public final void v() {
        ArrayList<vi> u = u();
        if (!this.q) {
            return;
        }
        Iterator<WeakReference<vt>> it = this.x.iterator();
        boolean z = false;
        while (it.hasNext()) {
            WeakReference<vt> next = it.next();
            vt vtVar = next.get();
            if (vtVar == null) {
                this.x.remove(next);
            } else {
                z |= vtVar.f();
            }
        }
        if (z) {
            this.d.clear();
            this.p.clear();
            int size = u.size();
            for (int i = 0; i < size; i++) {
                vi viVar = u.get(i);
                if (viVar.o()) {
                    this.d.add(viVar);
                } else {
                    this.p.add(viVar);
                }
            }
        } else {
            this.d.clear();
            this.p.clear();
            this.p.addAll(u());
        }
        this.q = false;
    }

    public final ArrayList<vi> w() {
        v();
        return this.p;
    }

    public final void x(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.k;
        if (view != null) {
            this.g = view;
            this.e = null;
            this.f = null;
        } else {
            if (i > 0) {
                this.e = resources.getText(i);
            } else if (charSequence != null) {
                this.e = charSequence;
            }
            if (i2 > 0) {
                this.f = this.a.getDrawable(i2);
            } else if (drawable != null) {
                this.f = drawable;
            }
            this.g = null;
        }
        r(false);
    }

    public vf y() {
        return this;
    }

    public boolean z(vi viVar) {
        boolean z = false;
        if (this.x.isEmpty()) {
            return false;
        }
        s();
        Iterator<WeakReference<vt>> it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference<vt> next = it.next();
            vt vtVar = next.get();
            if (vtVar == null) {
                this.x.remove(next);
            } else {
                z = vtVar.h(viVar);
                if (z) {
                    break;
                }
            }
        }
        t();
        if (z) {
            this.h = viVar;
        }
        return z;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return h(i, i2, i3, this.k.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.k.getString(i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return h(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        vi viVar = (vi) h(i, i2, i3, charSequence);
        wb wbVar = new wb(this.a, this, viVar);
        viVar.i(wbVar);
        return wbVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return h(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }
}
