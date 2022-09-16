package defpackage;

import android.app.Activity;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: cnuq  reason: default package */
/* loaded from: classes.dex */
public final class cnuq extends cnus {
    final /* synthetic */ Intent a;
    final /* synthetic */ Activity b;
    final /* synthetic */ int c;

    public cnuq(Intent intent, Activity activity, int i) {
        this.a = intent;
        this.b = activity;
        this.c = i;
    }

    @Override // defpackage.cnus
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, this.c);
        }
    }
}
