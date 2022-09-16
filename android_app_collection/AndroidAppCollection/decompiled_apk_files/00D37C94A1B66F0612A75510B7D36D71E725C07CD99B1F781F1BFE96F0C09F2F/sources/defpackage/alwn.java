package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alwn  reason: default package */
/* loaded from: classes.dex */
public final class alwn implements Runnable {
    final /* synthetic */ alwo a;

    public alwn(alwo alwoVar) {
        this.a = alwoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View peekDecorView = this.a.b.peekDecorView();
        if (peekDecorView != null) {
            alwp.a(peekDecorView);
            return;
        }
        alwo alwoVar = this.a;
        int i = alwoVar.c - 1;
        alwoVar.c = i;
        if (i >= 0) {
            alwoVar.a.post(alwoVar.d);
            return;
        }
        ancy ancyVar = alwp.a;
        String valueOf = String.valueOf(this.a.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
        sb.append("Cannot get decor view of window: ");
        sb.append(valueOf);
        ancyVar.b(sb.toString());
    }
}
