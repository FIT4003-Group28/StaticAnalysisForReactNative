package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import androidx.activity.result.IntentSenderRequest;
/* compiled from: PG */
/* renamed from: acf  reason: default package */
/* loaded from: classes.dex */
public final class acf {
    public Intent a;
    private final IntentSender b;
    private int c;
    private int d;

    public acf(IntentSender intentSender) {
        this.b = intentSender;
    }

    public final IntentSenderRequest a() {
        return new IntentSenderRequest(this.b, this.a, this.c, this.d);
    }

    public final void b(int i, int i2) {
        this.d = i;
        this.c = i2;
    }
}
