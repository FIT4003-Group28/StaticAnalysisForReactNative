package defpackage;

import android.view.Window;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: pa  reason: default package */
/* loaded from: classes4.dex */
public final class pa implements ss {
    final /* synthetic */ pd a;
    private boolean b;

    public pa(pd pdVar) {
        this.a = pdVar;
    }

    @Override // defpackage.ss
    public final void a(sf sfVar, boolean z) {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.a.g();
        Window.Callback callback = this.a.c;
        if (callback != null) {
            callback.onPanelClosed(108, sfVar);
        }
        this.b = false;
    }

    @Override // defpackage.ss
    public final boolean b(sf sfVar) {
        Window.Callback callback = this.a.c;
        if (callback != null) {
            callback.onMenuOpened(108, sfVar);
            return true;
        }
        return false;
    }
}
