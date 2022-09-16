package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
/* compiled from: PG */
/* renamed from: vg  reason: default package */
/* loaded from: classes7.dex */
final class vg implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, vs {
    public final vf a;
    public qy b;
    vb c;

    public vg(vf vfVar) {
        this.a = vfVar;
    }

    @Override // defpackage.vs
    public final boolean a(vf vfVar) {
        return false;
    }

    @Override // defpackage.vs
    public final void b(vf vfVar, boolean z) {
        qy qyVar;
        if ((z || vfVar == this.a) && (qyVar = this.b) != null) {
            qyVar.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.o(((va) this.c.c()).getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.c.d(this.a, true);
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
                this.a.q(true);
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
