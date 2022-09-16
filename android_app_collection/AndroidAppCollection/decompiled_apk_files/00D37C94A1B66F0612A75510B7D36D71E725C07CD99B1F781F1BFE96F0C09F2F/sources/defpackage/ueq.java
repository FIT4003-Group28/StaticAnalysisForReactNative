package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: ueq  reason: default package */
/* loaded from: classes4.dex */
public final class ueq {
    public final Bundle a;

    public ueq() {
        this.a = new Bundle();
    }

    public ueq(Bundle bundle) {
        this.a = bundle;
    }

    public static ueq a(fi fiVar) {
        return new ueq(fiVar.c());
    }

    public final int b() {
        return aolu.f(this.a.getInt("chime.richCollapsedView"));
    }

    public final void c() {
        this.a.putInt("chime.richCollapsedView", 1);
    }

    public final long d() {
        return this.a.getLong("handover_session_id");
    }

    public final void e(int i) {
        this.a.putInt("intent_type", i);
    }

    public final void f(boolean z) {
        this.a.putBoolean("is_from_incognito", z);
    }
}
