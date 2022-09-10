package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akdg  reason: default package */
/* loaded from: classes2.dex */
public final class akdg implements View.OnClickListener {
    final /* synthetic */ cjtd a;
    final /* synthetic */ akdv b;

    public akdg(akdv akdvVar, cjtd cjtdVar) {
        this.b = akdvVar;
        this.a = cjtdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.b.g.i(this.a);
        this.b.k(null, null);
    }
}
