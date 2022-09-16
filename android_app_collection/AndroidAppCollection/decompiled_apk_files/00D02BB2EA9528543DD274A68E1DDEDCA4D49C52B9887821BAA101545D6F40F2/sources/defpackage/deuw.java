package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: deuw  reason: default package */
/* loaded from: classes6.dex */
final class deuw {
    public final String a;
    public final Intent b;

    public deuw(Intent intent) {
        cnwc.m("MESSAGE_DELIVERED", "evenType must be non-null");
        this.a = "MESSAGE_DELIVERED";
        cnwc.n(intent, "intent must be non-null");
        this.b = intent;
    }
}
