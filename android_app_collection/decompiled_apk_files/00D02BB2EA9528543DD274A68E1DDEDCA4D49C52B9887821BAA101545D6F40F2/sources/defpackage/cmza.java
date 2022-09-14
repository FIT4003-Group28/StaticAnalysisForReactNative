package defpackage;

import android.os.RemoteException;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
/* compiled from: PG */
/* renamed from: cmza  reason: default package */
/* loaded from: classes5.dex */
public final class cmza implements Window.Callback {
    private final cmzb a;
    private final Window b;

    public cmza(cmzb cmzbVar) {
        this.a = cmzbVar;
        Window window = ((cnht) cmzbVar).l.getWindow();
        dbsk.s(window);
        this.b = window;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.b.superDispatchGenericMotionEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.KeyEvent$Callback, java.lang.Object, cmzb] */
    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean superDispatchKeyEvent = this.b.superDispatchKeyEvent(keyEvent);
        int keyCode = keyEvent.getKeyCode();
        if (!superDispatchKeyEvent) {
            ?? r0 = this.a;
            cnht cnhtVar = (cnht) r0;
            superDispatchKeyEvent = cnhtVar.i != null && keyEvent.dispatch(r0, cnhtVar.F, r0);
        }
        cmzb cmzbVar = this.a;
        try {
            ((cnht) cmzbVar).J.k(superDispatchKeyEvent);
        } catch (RemoteException unused) {
            ((cnht) cmzbVar).r();
        }
        switch (keyCode) {
            case 19:
            case 20:
            case 21:
            case 22:
                return true;
            default:
                return superDispatchKeyEvent;
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.b.superDispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.b.superDispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.b.superDispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        cmyy cmyyVar = ((cnht) this.a).l;
        if (cmyyVar != null) {
            cmyyVar.d(true);
        }
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return null;
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        cmyy cmyyVar = ((cnht) this.a).l;
        if (cmyyVar != null) {
            cmyyVar.d(false);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        cnht cnhtVar = (cnht) this.a;
        cmyy cmyyVar = cnhtVar.l;
        if (cmyyVar != null) {
            cmyyVar.b((layoutParams.flags & 1024) != 0);
        }
        cnhtVar.j(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        int i = cnjc.a;
        cmyy cmyyVar = ((cnht) this.a).l;
        if (cmyyVar != null && cmyyVar.j == z) {
            cmyyVar.m = z;
            while (true) {
                Runnable poll = cmyyVar.F.poll();
                if (poll == null) {
                    break;
                }
                if (cnjc.a("CAR.PROJECTION.PRES", 2)) {
                    cmyyVar.F.size();
                }
                poll.run();
                if (cnjc.a("CAR.PROJECTION.PRES", 2)) {
                    cmyyVar.F.size();
                }
            }
            if (this.a.c() == z) {
                return;
            }
            this.a.d(z, cmyyVar.k);
        }
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return null;
    }
}
