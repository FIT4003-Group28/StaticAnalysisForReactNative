package defpackage;

import android.view.WindowManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: pxx  reason: default package */
/* loaded from: classes4.dex */
public final class pxx implements pxw {
    private final WindowManager a;

    public pxx(WindowManager windowManager) {
        this.a = windowManager;
    }

    @Override // defpackage.pxw
    public final void a() {
    }

    @Override // defpackage.pxw
    public final void b(pxu pxuVar) {
        pxuVar.a(this.a.getDefaultDisplay());
    }
}
