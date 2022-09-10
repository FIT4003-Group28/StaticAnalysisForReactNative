package defpackage;

import android.graphics.drawable.Drawable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zwy  reason: default package */
/* loaded from: classes7.dex */
public final class zwy implements vtl {
    final /* synthetic */ zxb a;

    public zwy(zxb zxbVar) {
        this.a = zxbVar;
    }

    @Override // defpackage.vtl
    public final void a(Drawable drawable) {
        bvrj.UI_THREAD.c();
        zxb zxbVar = this.a;
        if (this != zxbVar.b) {
            return;
        }
        zxbVar.j(drawable);
    }
}
