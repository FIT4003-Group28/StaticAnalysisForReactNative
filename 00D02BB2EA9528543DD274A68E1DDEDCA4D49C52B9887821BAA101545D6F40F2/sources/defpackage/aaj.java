package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aaj  reason: default package */
/* loaded from: classes2.dex */
public final class aaj implements Runnable {
    final /* synthetic */ aaq a;

    public aaj(aaq aaqVar) {
        this.a = aaqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.a.l;
        if (view == null || view.getWindowToken() == null) {
            return;
        }
        this.a.MY();
    }
}
