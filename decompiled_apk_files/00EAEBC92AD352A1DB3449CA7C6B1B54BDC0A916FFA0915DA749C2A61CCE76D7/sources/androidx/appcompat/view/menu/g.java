package androidx.appcompat.view.menu;

import a.g.m.w;
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
import android.view.ContextMenu;
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
/* loaded from: classes.dex */
public class g implements a.g.g.a.a {
    private static final int[] A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    private final Context f1050a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f1051b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1052c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1053d;

    /* renamed from: e  reason: collision with root package name */
    private a f1054e;
    private ContextMenu.ContextMenuInfo m;
    CharSequence n;
    Drawable o;
    View p;
    private j x;
    private boolean z;
    private int l = 0;
    private boolean q = false;
    private boolean r = false;
    private boolean s = false;
    private boolean t = false;
    private boolean u = false;
    private ArrayList<j> v = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<n>> w = new CopyOnWriteArrayList<>();
    private boolean y = false;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<j> f1055f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<j> f1056g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    private boolean f1057h = true;
    private ArrayList<j> i = new ArrayList<>();
    private ArrayList<j> j = new ArrayList<>();
    private boolean k = true;

    /* loaded from: classes.dex */
    public interface a {
        void a(g gVar);

        boolean a(g gVar, MenuItem menuItem);
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean a(j jVar);
    }

    public g(Context context) {
        this.f1050a = context;
        this.f1051b = context.getResources();
        e(true);
    }

    private static int a(ArrayList<j> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).c() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    private j a(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new j(this, i, i2, i3, i4, charSequence, i5);
    }

    private void a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources l = l();
        if (view != null) {
            this.p = view;
            this.n = null;
            this.o = null;
        } else {
            if (i > 0) {
                this.n = l.getText(i);
            } else if (charSequence != null) {
                this.n = charSequence;
            }
            if (i2 > 0) {
                this.o = a.g.e.b.c(e(), i2);
            } else if (drawable != null) {
                this.o = drawable;
            }
            this.p = null;
        }
        b(false);
    }

    private void a(int i, boolean z) {
        if (i < 0 || i >= this.f1055f.size()) {
            return;
        }
        this.f1055f.remove(i);
        if (!z) {
            return;
        }
        b(true);
    }

    private boolean a(s sVar, n nVar) {
        boolean z = false;
        if (this.w.isEmpty()) {
            return false;
        }
        if (nVar != null) {
            z = nVar.a(sVar);
        }
        Iterator<WeakReference<n>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar2 = next.get();
            if (nVar2 == null) {
                this.w.remove(next);
            } else if (!z) {
                z = nVar2.a(sVar);
            }
        }
        return z;
    }

    private void d(boolean z) {
        if (this.w.isEmpty()) {
            return;
        }
        s();
        Iterator<WeakReference<n>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar = next.get();
            if (nVar == null) {
                this.w.remove(next);
            } else {
                nVar.a(z);
            }
        }
        r();
    }

    private void e(boolean z) {
        boolean z2 = true;
        if (!z || this.f1051b.getConfiguration().keyboard == 1 || !w.d(ViewConfiguration.get(this.f1050a), this.f1050a)) {
            z2 = false;
        }
        this.f1053d = z2;
    }

    private static int f(int i) {
        int i2 = ((-65536) & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = A;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public int a(int i) {
        return a(i, 0);
    }

    public int a(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.f1055f.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    protected MenuItem a(int i, int i2, int i3, CharSequence charSequence) {
        int f2 = f(i3);
        j a2 = a(i, i2, i3, f2, charSequence, this.l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.m;
        if (contextMenuInfo != null) {
            a2.a(contextMenuInfo);
        }
        ArrayList<j> arrayList = this.f1055f;
        arrayList.add(a(arrayList, f2), a2);
        b(true);
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public g a(Drawable drawable) {
        a(0, null, 0, drawable, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public g a(View view) {
        a(0, null, 0, null, view);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public g a(CharSequence charSequence) {
        a(0, charSequence, 0, null, null);
        return this;
    }

    j a(int i, KeyEvent keyEvent) {
        ArrayList<j> arrayList = this.v;
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
        boolean p = p();
        for (int i2 = 0; i2 < size; i2++) {
            j jVar = arrayList.get(i2);
            char alphabeticShortcut = p ? jVar.getAlphabeticShortcut() : jVar.getNumericShortcut();
            if ((alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) || ((alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) || (p && alphabeticShortcut == '\b' && i == 67))) {
                return jVar;
            }
        }
        return null;
    }

    public void a() {
        a aVar = this.f1054e;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(d());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((s) item.getSubMenu()).a(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f1055f.size();
        s();
        for (int i = 0; i < size; i++) {
            j jVar = this.f1055f.get(i);
            if (jVar.getGroupId() == groupId && jVar.i() && jVar.isCheckable()) {
                jVar.b(jVar == menuItem);
            }
        }
        r();
    }

    public void a(a aVar) {
        this.f1054e = aVar;
    }

    public void a(n nVar) {
        a(nVar, this.f1050a);
    }

    public void a(n nVar, Context context) {
        this.w.add(new WeakReference<>(nVar));
        nVar.a(context, this);
        this.k = true;
    }

    void a(List<j> list, int i, KeyEvent keyEvent) {
        boolean p = p();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f1055f.size();
            for (int i2 = 0; i2 < size; i2++) {
                j jVar = this.f1055f.get(i2);
                if (jVar.hasSubMenu()) {
                    ((g) jVar.getSubMenu()).a(list, i, keyEvent);
                }
                char alphabeticShortcut = p ? jVar.getAlphabeticShortcut() : jVar.getNumericShortcut();
                if (((modifiers & 69647) == ((p ? jVar.getAlphabeticModifiers() : jVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (p && alphabeticShortcut == '\b' && i == 67)) && jVar.isEnabled()) {
                        list.add(jVar);
                    }
                }
            }
        }
    }

    public final void a(boolean z) {
        if (this.u) {
            return;
        }
        this.u = true;
        Iterator<WeakReference<n>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar = next.get();
            if (nVar == null) {
                this.w.remove(next);
            } else {
                nVar.a(this, z);
            }
        }
        this.u = false;
    }

    public boolean a(MenuItem menuItem, int i) {
        return a(menuItem, (n) null, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        if (r1 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
        a(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
        if ((r9 & 1) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
        if (r1 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006b, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(android.view.MenuItem r7, androidx.appcompat.view.menu.n r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.j r7 = (androidx.appcompat.view.menu.j) r7
            r0 = 0
            if (r7 == 0) goto L6c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Lc
            goto L6c
        Lc:
            boolean r1 = r7.g()
            a.g.m.b r2 = r7.a()
            r3 = 1
            if (r2 == 0) goto L1f
            boolean r4 = r2.a()
            if (r4 == 0) goto L1f
            r4 = 1
            goto L20
        L1f:
            r4 = 0
        L20:
            boolean r5 = r7.f()
            if (r5 == 0) goto L31
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L6b
        L2d:
            r6.a(r3)
            goto L6b
        L31:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L3f
            if (r4 == 0) goto L3a
            goto L3f
        L3a:
            r7 = r9 & 1
            if (r7 != 0) goto L6b
            goto L2d
        L3f:
            r9 = r9 & 4
            if (r9 != 0) goto L46
            r6.a(r0)
        L46:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L58
            androidx.appcompat.view.menu.s r9 = new androidx.appcompat.view.menu.s
            android.content.Context r0 = r6.e()
            r9.<init>(r0, r6, r7)
            r7.a(r9)
        L58:
            android.view.SubMenu r7 = r7.getSubMenu()
            androidx.appcompat.view.menu.s r7 = (androidx.appcompat.view.menu.s) r7
            if (r4 == 0) goto L63
            r2.a(r7)
        L63:
            boolean r7 = r6.a(r7, r8)
            r1 = r1 | r7
            if (r1 != 0) goto L6b
            goto L2d
        L6b:
            return r1
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.g.a(android.view.MenuItem, androidx.appcompat.view.menu.n, int):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(g gVar, MenuItem menuItem) {
        a aVar = this.f1054e;
        return aVar != null && aVar.a(gVar, menuItem);
    }

    public boolean a(j jVar) {
        boolean z = false;
        if (!this.w.isEmpty() && this.x == jVar) {
            s();
            Iterator<WeakReference<n>> it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference<n> next = it.next();
                n nVar = next.get();
                if (nVar == null) {
                    this.w.remove(next);
                } else {
                    z = nVar.a(this, jVar);
                    if (z) {
                        break;
                    }
                }
            }
            r();
            if (z) {
                this.x = null;
            }
        }
        return z;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return a(0, 0, 0, this.f1051b.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.f1051b.getString(i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f1050a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f1051b.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f1051b.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        j jVar = (j) a(i, i2, i3, charSequence);
        s sVar = new s(this.f1050a, this, jVar);
        jVar.a(sVar);
        return sVar;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public int b(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f1055f.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    public void b() {
        ArrayList<j> n = n();
        if (!this.k) {
            return;
        }
        Iterator<WeakReference<n>> it = this.w.iterator();
        boolean z = false;
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar = next.get();
            if (nVar == null) {
                this.w.remove(next);
            } else {
                z |= nVar.a();
            }
        }
        if (z) {
            this.i.clear();
            this.j.clear();
            int size = n.size();
            for (int i = 0; i < size; i++) {
                j jVar = n.get(i);
                (jVar.h() ? this.i : this.j).add(jVar);
            }
        } else {
            this.i.clear();
            this.j.clear();
            this.j.addAll(n());
        }
        this.k = false;
    }

    public void b(Bundle bundle) {
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
                ((s) item.getSubMenu()).b(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(d(), sparseArray);
        }
    }

    public void b(n nVar) {
        Iterator<WeakReference<n>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar2 = next.get();
            if (nVar2 == null || nVar2 == nVar) {
                this.w.remove(next);
            }
        }
    }

    public void b(boolean z) {
        if (!this.q) {
            if (z) {
                this.f1057h = true;
                this.k = true;
            }
            d(z);
            return;
        }
        this.r = true;
        if (!z) {
            return;
        }
        this.s = true;
    }

    public boolean b(j jVar) {
        boolean z = false;
        if (this.w.isEmpty()) {
            return false;
        }
        s();
        Iterator<WeakReference<n>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar = next.get();
            if (nVar == null) {
                this.w.remove(next);
            } else {
                z = nVar.b(this, jVar);
                if (z) {
                    break;
                }
            }
        }
        r();
        if (z) {
            this.x = jVar;
        }
        return z;
    }

    public g c(int i) {
        this.l = i;
        return this;
    }

    public ArrayList<j> c() {
        b();
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(j jVar) {
        this.k = true;
        b(true);
    }

    public void c(boolean z) {
        this.z = z;
    }

    @Override // android.view.Menu
    public void clear() {
        j jVar = this.x;
        if (jVar != null) {
            a(jVar);
        }
        this.f1055f.clear();
        b(true);
    }

    public void clearHeader() {
        this.o = null;
        this.n = null;
        this.p = null;
        b(false);
    }

    @Override // android.view.Menu
    public void close() {
        a(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public g d(int i) {
        a(0, null, i, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String d() {
        return "android:menu:actionviewstates";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(j jVar) {
        this.f1057h = true;
        b(true);
    }

    public Context e() {
        return this.f1050a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public g e(int i) {
        a(i, null, 0, null, null);
        return this;
    }

    public j f() {
        return this.x;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            j jVar = this.f1055f.get(i2);
            if (jVar.getItemId() == i) {
                return jVar;
            }
            if (jVar.hasSubMenu() && (findItem = jVar.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public Drawable g() {
        return this.o;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.f1055f.get(i);
    }

    public CharSequence h() {
        return this.n;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f1055f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public View i() {
        return this.p;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return a(i, keyEvent) != null;
    }

    public ArrayList<j> j() {
        b();
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean k() {
        return this.t;
    }

    Resources l() {
        return this.f1051b;
    }

    public g m() {
        return this;
    }

    public ArrayList<j> n() {
        if (!this.f1057h) {
            return this.f1056g;
        }
        this.f1056g.clear();
        int size = this.f1055f.size();
        for (int i = 0; i < size; i++) {
            j jVar = this.f1055f.get(i);
            if (jVar.isVisible()) {
                this.f1056g.add(jVar);
            }
        }
        this.f1057h = false;
        this.k = true;
        return this.f1056g;
    }

    public boolean o() {
        return this.y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p() {
        return this.f1052c;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return a(findItem(i), i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        j a2 = a(i, keyEvent);
        boolean a3 = a2 != null ? a(a2, i2) : false;
        if ((i2 & 2) != 0) {
            a(true);
        }
        return a3;
    }

    public boolean q() {
        return this.f1053d;
    }

    public void r() {
        this.q = false;
        if (this.r) {
            this.r = false;
            b(this.s);
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int a2 = a(i);
        if (a2 >= 0) {
            int size = this.f1055f.size() - a2;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f1055f.get(a2).getGroupId() != i) {
                    break;
                }
                a(a2, false);
                i2 = i3;
            }
            b(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        a(b(i), true);
    }

    public void s() {
        if (!this.q) {
            this.q = true;
            this.r = false;
            this.s = false;
        }
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f1055f.size();
        for (int i2 = 0; i2 < size; i2++) {
            j jVar = this.f1055f.get(i2);
            if (jVar.getGroupId() == i) {
                jVar.c(z2);
                jVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.y = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.f1055f.size();
        for (int i2 = 0; i2 < size; i2++) {
            j jVar = this.f1055f.get(i2);
            if (jVar.getGroupId() == i) {
                jVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.f1055f.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            j jVar = this.f1055f.get(i2);
            if (jVar.getGroupId() == i && jVar.e(z)) {
                z2 = true;
            }
        }
        if (z2) {
            b(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f1052c = z;
        b(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f1055f.size();
    }
}
