package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
/* compiled from: MenuWrapperICS.java */
/* loaded from: classes.dex */
class p extends c<android.support.v4.d.a.a> implements Menu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public p(Context context, android.support.v4.d.a.a aVar) {
        super(context, aVar);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(((android.support.v4.d.a.a) this.f748b).add(charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return a(((android.support.v4.d.a.a) this.f748b).add(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(((android.support.v4.d.a.a) this.f748b).add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return a(((android.support.v4.d.a.a) this.f748b).add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return a(((android.support.v4.d.a.a) this.f748b).addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return a(((android.support.v4.d.a.a) this.f748b).addSubMenu(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return a(((android.support.v4.d.a.a) this.f748b).addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return a(((android.support.v4.d.a.a) this.f748b).addSubMenu(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = ((android.support.v4.d.a.a) this.f748b).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = a(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        b(i);
        ((android.support.v4.d.a.a) this.f748b).removeItem(i);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        a(i);
        ((android.support.v4.d.a.a) this.f748b).removeGroup(i);
    }

    @Override // android.view.Menu
    public void clear() {
        a();
        ((android.support.v4.d.a.a) this.f748b).clear();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((android.support.v4.d.a.a) this.f748b).setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        ((android.support.v4.d.a.a) this.f748b).setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        ((android.support.v4.d.a.a) this.f748b).setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return ((android.support.v4.d.a.a) this.f748b).hasVisibleItems();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        return a(((android.support.v4.d.a.a) this.f748b).findItem(i));
    }

    @Override // android.view.Menu
    public int size() {
        return ((android.support.v4.d.a.a) this.f748b).size();
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return a(((android.support.v4.d.a.a) this.f748b).getItem(i));
    }

    @Override // android.view.Menu
    public void close() {
        ((android.support.v4.d.a.a) this.f748b).close();
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((android.support.v4.d.a.a) this.f748b).performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((android.support.v4.d.a.a) this.f748b).isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return ((android.support.v4.d.a.a) this.f748b).performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        ((android.support.v4.d.a.a) this.f748b).setQwertyMode(z);
    }
}
