package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: znb  reason: default package */
/* loaded from: classes7.dex */
public final class znb implements View.OnClickListener {
    final /* synthetic */ gft a;
    final /* synthetic */ ff b;

    public znb(gft gftVar, ff ffVar) {
        this.a = gftVar;
        this.b = ffVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (((ges) this.a).aD) {
            this.b.g().f();
        }
    }
}
