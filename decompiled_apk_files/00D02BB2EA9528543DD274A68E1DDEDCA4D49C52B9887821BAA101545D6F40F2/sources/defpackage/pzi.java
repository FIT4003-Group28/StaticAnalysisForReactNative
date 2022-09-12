package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
/* compiled from: PG */
/* renamed from: pzi  reason: default package */
/* loaded from: classes7.dex */
final class pzi implements View.OnClickListener {
    @dzsi
    private final Intent a;
    private final dxio<afha> b;

    public pzi(@dzsi Intent intent, dxio<afha> dxioVar) {
        this.a = intent;
        this.b = dxioVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static pzi a(String str, dxio<afha> dxioVar) {
        return new pzi(new Intent("android.intent.action.VIEW", Uri.parse(str)), dxioVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.a != null) {
            this.b.a().f(view.getContext(), this.a, 4);
        }
    }
}
