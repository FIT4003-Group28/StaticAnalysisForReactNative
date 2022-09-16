package defpackage;

import android.os.Build;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ol  reason: default package */
/* loaded from: classes3.dex */
public final class ol extends ro {
    final /* synthetic */ ot a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol(ot otVar, Window.Callback callback) {
        super(callback);
        this.a = otVar;
    }

    final ActionMode a(ActionMode.Callback callback) {
        rh rhVar = new rh(this.a.d, callback);
        re g = this.a.g(rhVar);
        if (g != null) {
            return rhVar.e(g);
        }
        return null;
    }

    @Override // defpackage.ro, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.a.P(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.ro, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyShortcutEvent(keyEvent)) {
            ot otVar = this.a;
            int keyCode = keyEvent.getKeyCode();
            nj c = otVar.c();
            if (c == null || !c.v(keyCode, keyEvent)) {
                or orVar = otVar.w;
                if (orVar == null || !otVar.W(orVar, keyEvent.getKeyCode(), keyEvent)) {
                    if (otVar.w == null) {
                        or V = otVar.V(0);
                        otVar.R(V, keyEvent);
                        boolean W = otVar.W(V, keyEvent.getKeyCode(), keyEvent);
                        V.k = false;
                        if (!W) {
                        }
                    }
                    return false;
                }
                or orVar2 = otVar.w;
                if (orVar2 != null) {
                    orVar2.l = true;
                }
            }
        }
        return true;
    }

    @Override // defpackage.ro, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // defpackage.ro, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            if (!(menu instanceof sf)) {
                return false;
            }
            i = 0;
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // defpackage.ro, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        nj c;
        super.onMenuOpened(i, menu);
        ot otVar = this.a;
        if (i == 108 && (c = otVar.c()) != null) {
            c.e(true);
        }
        return true;
    }

    @Override // defpackage.ro, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
        ot otVar = this.a;
        if (i == 108) {
            nj c = otVar.c();
            if (c == null) {
                return;
            }
            c.e(false);
        } else if (i != 0) {
        } else {
            or V = otVar.V(0);
            if (!V.m) {
                return;
            }
            otVar.L(V, false);
        }
    }

    @Override // defpackage.ro, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        sf sfVar = menu instanceof sf ? (sf) menu : null;
        if (i == 0) {
            if (sfVar == null) {
                return false;
            }
            i = 0;
        }
        if (sfVar != null) {
            sfVar.i = true;
        }
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (sfVar != null) {
            sfVar.i = false;
        }
        return onPreparePanel;
    }

    @Override // defpackage.ro, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        sf sfVar = this.a.V(0).h;
        if (sfVar == null) {
            super.onProvideKeyboardShortcuts(list, menu, i);
        } else {
            super.onProvideKeyboardShortcuts(list, sfVar, i);
        }
    }

    @Override // defpackage.ro, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        if (this.a.o) {
            return a(callback);
        }
        return super.onWindowStartingActionMode(callback);
    }

    @Override // defpackage.ro, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        if (this.a.o && i == 0) {
            return a(callback);
        }
        return super.onWindowStartingActionMode(callback, i);
    }
}
