package defpackage;

import android.view.View;
import android.view.WindowId;
/* compiled from: PG */
/* renamed from: boi  reason: default package */
/* loaded from: classes2.dex */
final class boi {
    private final WindowId a;

    public boi(View view) {
        this.a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof boi) && ((boi) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
