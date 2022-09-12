package defpackage;

import android.content.IntentSender;
import androidx.activity.result.IntentSenderRequest;
/* compiled from: PG */
/* renamed from: agx  reason: default package */
/* loaded from: classes2.dex */
public final class agx {
    private final IntentSender a;
    private int b;
    private int c;

    public agx(IntentSender intentSender) {
        this.a = intentSender;
    }

    public final IntentSenderRequest a() {
        return new IntentSenderRequest(this.a, this.b, this.c);
    }

    public final void b(int i, int i2) {
        this.c = i;
        this.b = i2;
    }
}
