package defpackage;

import android.view.View;
import android.view.WindowId;
/* compiled from: PG */
/* renamed from: azr  reason: default package */
/* loaded from: classes3.dex */
final class azr {
    private final WindowId a;

    public azr(View view) {
        this.a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof azr) && ((azr) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
