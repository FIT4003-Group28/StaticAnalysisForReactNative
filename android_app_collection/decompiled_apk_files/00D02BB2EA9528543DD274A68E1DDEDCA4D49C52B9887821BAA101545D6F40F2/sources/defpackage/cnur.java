package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: cnur  reason: default package */
/* loaded from: classes5.dex */
public final class cnur extends cnus {
    final /* synthetic */ Intent a;
    final /* synthetic */ cnrx b;

    public cnur(Intent intent, cnrx cnrxVar) {
        this.a = intent;
        this.b = cnrxVar;
    }

    @Override // defpackage.cnus
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
