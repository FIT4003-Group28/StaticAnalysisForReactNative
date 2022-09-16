package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: czty  reason: default package */
/* loaded from: classes5.dex */
public final class czty implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ cztz b;

    public czty(cztz cztzVar, View view) {
        this.b = cztzVar;
        this.a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.getParent() != null) {
            this.b.a.removeView(this.a);
        }
        cztz cztzVar = this.b;
        cztzVar.b = null;
        cztzVar.d = false;
        cztt czttVar = cztzVar.c;
        if (czttVar != null) {
            cztzVar.c = null;
            cztzVar.a(czttVar);
        }
    }
}
