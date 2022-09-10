package defpackage;

import android.os.Build;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rn  reason: default package */
/* loaded from: classes.dex */
public final class rn extends uo {
    final /* synthetic */ rv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn(rv rvVar, Window.Callback callback) {
        super(callback);
        this.a = rvVar;
    }

    final ActionMode a(ActionMode.Callback callback) {
        uh uhVar = new uh(this.a.g, callback);
        rv rvVar = this.a;
        ud udVar = rvVar.m;
        if (udVar != null) {
            udVar.c();
        }
        rm rmVar = new rm(rvVar, uhVar);
        qk c = rvVar.c();
        if (c != null) {
            si siVar = (si) c;
            sh shVar = siVar.g;
            if (shVar != null) {
                shVar.c();
            }
            siVar.b.setHideOnContentScrollEnabled(false);
            siVar.e.h();
            sh shVar2 = new sh(siVar, siVar.e.getContext(), rmVar);
            shVar2.a.s();
            try {
                if (shVar2.b.a(shVar2, shVar2.a)) {
                    siVar.g = shVar2;
                    shVar2.d();
                    siVar.e.g(shVar2);
                    siVar.q(true);
                    siVar.e.sendAccessibilityEvent(32);
                } else {
                    shVar2 = null;
                }
                rvVar.m = shVar2;
            } finally {
                shVar2.a.t();
            }
        }
        if (rvVar.m == null) {
            rvVar.m = rvVar.z(rmVar);
        }
        ud udVar2 = rvVar.m;
        if (udVar2 != null) {
            return uhVar.f(udVar2);
        }
        return null;
    }

    @Override // defpackage.uo, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.a.C(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r3.performShortcut(r2, r7, 0) != false) goto L30;
     */
    @Override // defpackage.uo, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
        /*
            r6 = this;
            boolean r0 = super.dispatchKeyShortcutEvent(r7)
            r1 = 1
            if (r0 != 0) goto L69
            rv r0 = r6.a
            int r2 = r7.getKeyCode()
            qk r3 = r0.c()
            r4 = 0
            if (r3 == 0) goto L3c
            si r3 = (defpackage.si) r3
            sh r3 = r3.g
            if (r3 != 0) goto L1b
            goto L3c
        L1b:
            vf r3 = r3.a
            if (r7 == 0) goto L24
            int r5 = r7.getDeviceId()
            goto L25
        L24:
            r5 = -1
        L25:
            android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
            int r5 = r5.getKeyboardType()
            if (r5 == r1) goto L31
            r5 = 1
            goto L32
        L31:
            r5 = 0
        L32:
            r3.setQwertyMode(r5)
            boolean r2 = r3.performShortcut(r2, r7, r4)
            if (r2 == 0) goto L3c
            goto L69
        L3c:
            rt r2 = r0.z
            if (r2 == 0) goto L51
            int r3 = r7.getKeyCode()
            boolean r2 = r0.O(r2, r3, r7)
            if (r2 == 0) goto L51
            rt r7 = r0.z
            if (r7 == 0) goto L69
            r7.l = r1
            goto L69
        L51:
            rt r2 = r0.z
            if (r2 != 0) goto L68
            rt r2 = r0.N(r4)
            r0.D(r2, r7)
            int r3 = r7.getKeyCode()
            boolean r7 = r0.O(r2, r3, r7)
            r2.k = r4
            if (r7 != 0) goto L69
        L68:
            return r4
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rn.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    @Override // defpackage.uo, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // defpackage.uo, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            if (!(menu instanceof vf)) {
                return false;
            }
            i = 0;
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // defpackage.uo, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        qk c;
        super.onMenuOpened(i, menu);
        rv rvVar = this.a;
        if (i == 108 && (c = rvVar.c()) != null) {
            c.g(true);
        }
        return true;
    }

    @Override // defpackage.uo, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
        rv rvVar = this.a;
        if (i == 108) {
            qk c = rvVar.c();
            if (c == null) {
                return;
            }
            c.g(false);
        } else if (i != 0) {
        } else {
            rt N = rvVar.N(0);
            if (!N.m) {
                return;
            }
            rvVar.F(N, false);
        }
    }

    @Override // defpackage.uo, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        vf vfVar = menu instanceof vf ? (vf) menu : null;
        if (i == 0) {
            if (vfVar == null) {
                return false;
            }
            i = 0;
        }
        if (vfVar != null) {
            vfVar.i = true;
        }
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (vfVar != null) {
            vfVar.i = false;
        }
        return onPreparePanel;
    }

    @Override // defpackage.uo, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        vf vfVar = this.a.N(0).h;
        if (vfVar == null) {
            super.onProvideKeyboardShortcuts(list, menu, i);
        } else {
            super.onProvideKeyboardShortcuts(list, vfVar, i);
        }
    }

    @Override // defpackage.uo, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        if (this.a.r) {
            return a(callback);
        }
        return super.onWindowStartingActionMode(callback);
    }

    @Override // defpackage.uo, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        if (this.a.r && i == 0) {
            return a(callback);
        }
        return super.onWindowStartingActionMode(callback, i);
    }
}
