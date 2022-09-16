package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
/* compiled from: PG */
/* renamed from: sg  reason: default package */
/* loaded from: classes4.dex */
final class sg implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, ss {
    public final sf a;
    public nx b;
    sb c;

    public sg(sf sfVar) {
        this.a = sfVar;
    }

    @Override // defpackage.ss
    public final void a(sf sfVar, boolean z) {
        nx nxVar;
        if ((z || sfVar == this.a) && (nxVar = this.b) != null) {
            nxVar.dismiss();
        }
    }

    @Override // defpackage.ss
    public final boolean b(sf sfVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.z(((sa) this.c.a()).getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.c.c(this.a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i != 82) {
            if (i == 4) {
                i = 4;
            }
            return this.a.performShortcut(i, keyEvent, 0);
        }
        if (keyEvent.getAction() != 0 || keyEvent.getRepeatCount() != 0) {
            if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.a.i(true);
                dialogInterface.dismiss();
                return true;
            }
        } else {
            Window window2 = this.b.getWindow();
            if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                keyDispatcherState2.startTracking(keyEvent, this);
                return true;
            }
        }
        return this.a.performShortcut(i, keyEvent, 0);
    }
}
