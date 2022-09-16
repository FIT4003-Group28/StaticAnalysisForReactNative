package defpackage;

import android.app.Activity;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: qww  reason: default package */
/* loaded from: classes4.dex */
public final class qww extends qwy {
    final /* synthetic */ Intent a;
    final /* synthetic */ Activity b;
    final /* synthetic */ int c;

    public qww(Intent intent, Activity activity, int i) {
        this.a = intent;
        this.b = activity;
        this.c = i;
    }

    @Override // defpackage.qwy
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, this.c);
        }
    }
}
