package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: qwx  reason: default package */
/* loaded from: classes4.dex */
public final class qwx extends qwy {
    final /* synthetic */ Intent a;
    final /* synthetic */ qux b;

    public qwx(Intent intent, qux quxVar) {
        this.a = intent;
        this.b = quxVar;
    }

    @Override // defpackage.qwy
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
