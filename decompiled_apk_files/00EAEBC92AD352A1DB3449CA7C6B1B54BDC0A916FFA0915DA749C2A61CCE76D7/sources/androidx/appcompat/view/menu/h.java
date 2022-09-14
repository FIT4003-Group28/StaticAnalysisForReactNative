package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.c;
import androidx.appcompat.view.menu.n;
/* loaded from: classes.dex */
class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, n.a {

    /* renamed from: b  reason: collision with root package name */
    private g f1058b;

    /* renamed from: c  reason: collision with root package name */
    private androidx.appcompat.app.c f1059c;

    /* renamed from: d  reason: collision with root package name */
    e f1060d;

    /* renamed from: e  reason: collision with root package name */
    private n.a f1061e;

    public h(g gVar) {
        this.f1058b = gVar;
    }

    public void a() {
        androidx.appcompat.app.c cVar = this.f1059c;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    public void a(IBinder iBinder) {
        g gVar = this.f1058b;
        c.a aVar = new c.a(gVar.e());
        this.f1060d = new e(aVar.b(), a.a.g.abc_list_menu_item_layout);
        this.f1060d.a(this);
        this.f1058b.a(this.f1060d);
        aVar.a(this.f1060d.b(), this);
        View i = gVar.i();
        if (i != null) {
            aVar.a(i);
        } else {
            aVar.a(gVar.g());
            aVar.a(gVar.h());
        }
        aVar.a(this);
        this.f1059c = aVar.a();
        this.f1059c.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f1059c.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f1059c.show();
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void a(g gVar, boolean z) {
        if (z || gVar == this.f1058b) {
            a();
        }
        n.a aVar = this.f1061e;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean a(g gVar) {
        n.a aVar = this.f1061e;
        if (aVar != null) {
            return aVar.a(gVar);
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1058b.a((j) this.f1060d.b().getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f1060d.a(this.f1058b, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1059c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1059c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1058b.a(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1058b.performShortcut(i, keyEvent, 0);
    }
}
