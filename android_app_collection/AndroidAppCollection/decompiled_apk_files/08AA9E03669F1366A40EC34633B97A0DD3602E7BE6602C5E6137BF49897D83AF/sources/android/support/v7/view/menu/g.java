package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.a.a;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: MenuBuilder.java */
/* loaded from: classes.dex */
public class g implements android.support.v4.d.a.a {

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f767d = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    CharSequence f768a;

    /* renamed from: b  reason: collision with root package name */
    Drawable f769b;

    /* renamed from: c  reason: collision with root package name */
    View f770c;
    private final Context e;
    private final Resources f;
    private boolean g;
    private boolean h;
    private a i;
    private ContextMenu.ContextMenuInfo q;
    private h y;
    private boolean z;
    private int p = 0;
    private boolean r = false;
    private boolean s = false;
    private boolean t = false;
    private boolean u = false;
    private boolean v = false;
    private ArrayList<h> w = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<m>> x = new CopyOnWriteArrayList<>();
    private ArrayList<h> j = new ArrayList<>();
    private ArrayList<h> k = new ArrayList<>();
    private boolean l = true;
    private ArrayList<h> m = new ArrayList<>();
    private ArrayList<h> n = new ArrayList<>();
    private boolean o = true;

    /* compiled from: MenuBuilder.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(g gVar);

        boolean a(g gVar, MenuItem menuItem);
    }

    /* compiled from: MenuBuilder.java */
    /* loaded from: classes.dex */
    public interface b {
        boolean a(h hVar);
    }

    public g m() {
        return this;
    }

    public g(Context context) {
        this.e = context;
        this.f = context.getResources();
        d(true);
    }

    public void a(m mVar, Context context) {
        this.x.add(new WeakReference<>(mVar));
        mVar.a(context, this);
        this.o = true;
    }

    public void a(m mVar) {
        Iterator<WeakReference<m>> it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar2 = next.get();
            if (mVar2 == null || mVar2 == mVar) {
                this.x.remove(next);
            }
        }
    }

    private void c(boolean z) {
        if (this.x.isEmpty()) {
            return;
        }
        f();
        Iterator<WeakReference<m>> it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                this.x.remove(next);
            } else {
                mVar.b(z);
            }
        }
        g();
    }

    private boolean a(s sVar, m mVar) {
        boolean z = false;
        if (this.x.isEmpty()) {
            return false;
        }
        if (mVar != null) {
            z = mVar.a(sVar);
        }
        Iterator<WeakReference<m>> it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar2 = next.get();
            if (mVar2 == null) {
                this.x.remove(next);
            } else if (!z) {
                z = mVar2.a(sVar);
            }
        }
        return z;
    }

    public void a(a aVar) {
        this.i = aVar;
    }

    protected MenuItem a(int i, int i2, int i3, CharSequence charSequence) {
        int e = e(i3);
        h a2 = a(i, i2, i3, e, charSequence, this.p);
        if (this.q != null) {
            a2.a(this.q);
        }
        this.j.add(a(this.j, e), a2);
        b(true);
        return a2;
    }

    private h a(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new h(this, i, i2, i3, i4, charSequence, i5);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return a(0, 0, 0, this.f.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.f.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        h hVar = (h) a(i, i2, i3, charSequence);
        s sVar = new s(this.e, this, hVar);
        hVar.a(sVar);
        return sVar;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f.getString(i4));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.e.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        a(a(i), true);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int b2 = b(i);
        if (b2 >= 0) {
            int size = this.j.size() - b2;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.j.get(b2).getGroupId() != i) {
                    break;
                }
                a(b2, false);
                i2 = i3;
            }
            b(true);
        }
    }

    private void a(int i, boolean z) {
        if (i < 0 || i >= this.j.size()) {
            return;
        }
        this.j.remove(i);
        if (!z) {
            return;
        }
        b(true);
    }

    @Override // android.view.Menu
    public void clear() {
        if (this.y != null) {
            d(this.y);
        }
        this.j.clear();
        b(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.j.size();
        f();
        for (int i = 0; i < size; i++) {
            h hVar = this.j.get(i);
            if (hVar.getGroupId() == groupId && hVar.g() && hVar.isCheckable()) {
                hVar.b(hVar == menuItem);
            }
        }
        g();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.j.size();
        for (int i2 = 0; i2 < size; i2++) {
            h hVar = this.j.get(i2);
            if (hVar.getGroupId() == i) {
                hVar.a(z2);
                hVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.j.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            h hVar = this.j.get(i2);
            if (hVar.getGroupId() == i && hVar.c(z)) {
                z2 = true;
            }
        }
        if (z2) {
            b(true);
        }
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.j.size();
        for (int i2 = 0; i2 < size; i2++) {
            h hVar = this.j.get(i2);
            if (hVar.getGroupId() == i) {
                hVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.j.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            h hVar = this.j.get(i2);
            if (hVar.getItemId() == i) {
                return hVar;
            }
            if (hVar.hasSubMenu() && (findItem = hVar.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public int a(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.j.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    public int b(int i) {
        return a(i, 0);
    }

    public int a(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.j.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public int size() {
        return this.j.size();
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.j.get(i);
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return a(i, keyEvent) != null;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.g = z;
        b(false);
    }

    private static int e(int i) {
        int i2 = ((-65536) & i) >> 16;
        if (i2 < 0 || i2 >= f767d.length) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        return (i & 65535) | (f767d[i2] << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.g;
    }

    private void d(boolean z) {
        boolean z2 = true;
        if (!z || this.f.getConfiguration().keyboard == 1 || !this.f.getBoolean(a.b.abc_config_showMenuShortcutsWhenKeyboardPresent)) {
            z2 = false;
        }
        this.h = z2;
    }

    public boolean b() {
        return this.h;
    }

    Resources c() {
        return this.f;
    }

    public Context d() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(g gVar, MenuItem menuItem) {
        return this.i != null && this.i.a(gVar, menuItem);
    }

    public void e() {
        if (this.i != null) {
            this.i.a(this);
        }
    }

    private static int a(ArrayList<h> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).c() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        h a2 = a(i, keyEvent);
        boolean a3 = a2 != null ? a(a2, i2) : false;
        if ((i2 & 2) != 0) {
            a(true);
        }
        return a3;
    }

    void a(List<h> list, int i, KeyEvent keyEvent) {
        boolean a2 = a();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.j.size();
            for (int i2 = 0; i2 < size; i2++) {
                h hVar = this.j.get(i2);
                if (hVar.hasSubMenu()) {
                    ((g) hVar.getSubMenu()).a(list, i, keyEvent);
                }
                char alphabeticShortcut = a2 ? hVar.getAlphabeticShortcut() : hVar.getNumericShortcut();
                if (((modifiers & 69647) == ((a2 ? hVar.getAlphabeticModifiers() : hVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0 && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (a2 && alphabeticShortcut == '\b' && i == 67)) && hVar.isEnabled())) {
                    list.add(hVar);
                }
            }
        }
    }

    h a(int i, KeyEvent keyEvent) {
        char numericShortcut;
        ArrayList<h> arrayList = this.w;
        arrayList.clear();
        a(arrayList, i, keyEvent);
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
        boolean a2 = a();
        for (int i2 = 0; i2 < size; i2++) {
            h hVar = arrayList.get(i2);
            if (a2) {
                numericShortcut = hVar.getAlphabeticShortcut();
            } else {
                numericShortcut = hVar.getNumericShortcut();
            }
            if ((numericShortcut == keyData.meta[0] && (metaState & 2) == 0) || ((numericShortcut == keyData.meta[2] && (metaState & 2) != 0) || (a2 && numericShortcut == '\b' && i == 67))) {
                return hVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return a(findItem(i), i2);
    }

    public boolean a(MenuItem menuItem, int i) {
        return a(menuItem, (m) null, i);
    }

    public boolean a(MenuItem menuItem, m mVar, int i) {
        h hVar = (h) menuItem;
        if (hVar == null || !hVar.isEnabled()) {
            return false;
        }
        boolean b2 = hVar.b();
        android.support.v4.j.c a2 = hVar.a();
        boolean z = a2 != null && a2.e();
        if (hVar.n()) {
            b2 |= hVar.expandActionView();
            if (b2) {
                a(true);
            }
        } else if (hVar.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                a(false);
            }
            if (!hVar.hasSubMenu()) {
                hVar.a(new s(d(), this, hVar));
            }
            s sVar = (s) hVar.getSubMenu();
            if (z) {
                a2.a(sVar);
            }
            b2 |= a(sVar, mVar);
            if (!b2) {
                a(true);
            }
        } else if ((i & 1) == 0) {
            a(true);
        }
        return b2;
    }

    public final void a(boolean z) {
        if (this.v) {
            return;
        }
        this.v = true;
        Iterator<WeakReference<m>> it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                this.x.remove(next);
            } else {
                mVar.a(this, z);
            }
        }
        this.v = false;
    }

    @Override // android.view.Menu
    public void close() {
        a(true);
    }

    public void b(boolean z) {
        if (!this.r) {
            if (z) {
                this.l = true;
                this.o = true;
            }
            c(z);
            return;
        }
        this.s = true;
        if (!z) {
            return;
        }
        this.t = true;
    }

    public void f() {
        if (!this.r) {
            this.r = true;
            this.s = false;
            this.t = false;
        }
    }

    public void g() {
        this.r = false;
        if (this.s) {
            this.s = false;
            b(this.t);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(h hVar) {
        this.l = true;
        b(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(h hVar) {
        this.o = true;
        b(true);
    }

    public ArrayList<h> h() {
        if (!this.l) {
            return this.k;
        }
        this.k.clear();
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            h hVar = this.j.get(i);
            if (hVar.isVisible()) {
                this.k.add(hVar);
            }
        }
        this.l = false;
        this.o = true;
        return this.k;
    }

    public void i() {
        ArrayList<h> h = h();
        if (!this.o) {
            return;
        }
        Iterator<WeakReference<m>> it = this.x.iterator();
        boolean z = false;
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                this.x.remove(next);
            } else {
                z |= mVar.b();
            }
        }
        if (z) {
            this.m.clear();
            this.n.clear();
            int size = h.size();
            for (int i = 0; i < size; i++) {
                h hVar = h.get(i);
                if (hVar.j()) {
                    this.m.add(hVar);
                } else {
                    this.n.add(hVar);
                }
            }
        } else {
            this.m.clear();
            this.n.clear();
            this.n.addAll(h());
        }
        this.o = false;
    }

    public ArrayList<h> j() {
        i();
        return this.m;
    }

    public ArrayList<h> k() {
        i();
        return this.n;
    }

    public void clearHeader() {
        this.f769b = null;
        this.f768a = null;
        this.f770c = null;
        b(false);
    }

    private void a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources c2 = c();
        if (view != null) {
            this.f770c = view;
            this.f768a = null;
            this.f769b = null;
        } else {
            if (i > 0) {
                this.f768a = c2.getText(i);
            } else if (charSequence != null) {
                this.f768a = charSequence;
            }
            if (i2 > 0) {
                this.f769b = android.support.v4.a.a.a(d(), i2);
            } else if (drawable != null) {
                this.f769b = drawable;
            }
            this.f770c = null;
        }
        b(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public g a(CharSequence charSequence) {
        a(0, charSequence, 0, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public g c(int i) {
        a(i, null, 0, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public g a(Drawable drawable) {
        a(0, null, 0, drawable, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public g d(int i) {
        a(0, null, i, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public g a(View view) {
        a(0, null, 0, null, view);
        return this;
    }

    public CharSequence l() {
        return this.f768a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean n() {
        return this.u;
    }

    public boolean c(h hVar) {
        boolean z = false;
        if (this.x.isEmpty()) {
            return false;
        }
        f();
        Iterator<WeakReference<m>> it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                this.x.remove(next);
            } else {
                z = mVar.a(this, hVar);
                if (z) {
                    break;
                }
            }
        }
        g();
        if (z) {
            this.y = hVar;
        }
        return z;
    }

    public boolean d(h hVar) {
        boolean z = false;
        if (this.x.isEmpty() || this.y != hVar) {
            return false;
        }
        f();
        Iterator<WeakReference<m>> it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                this.x.remove(next);
            } else {
                z = mVar.b(this, hVar);
                if (z) {
                    break;
                }
            }
        }
        g();
        if (z) {
            this.y = null;
        }
        return z;
    }

    public h o() {
        return this.y;
    }
}
