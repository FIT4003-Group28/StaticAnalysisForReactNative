package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: csfo  reason: default package */
/* loaded from: classes5.dex */
public final class csfo {
    public final Bundle a = new Bundle();

    public final long a() {
        return this.a.getLong("handover_session_id");
    }

    public final void b(long j) {
        this.a.putLong("handover_session_id", j);
    }

    public final void c(int i) {
        this.a.putInt("intent_type", i);
    }

    public final void d(byte[] bArr) {
        this.a.putByteArray("lens_init_params", bArr);
    }

    public final void e(long j) {
        this.a.putLong("request_lens_time_nanos", j);
    }

    public final void f() {
        this.a.putInt("transition_type", 0);
    }
}
