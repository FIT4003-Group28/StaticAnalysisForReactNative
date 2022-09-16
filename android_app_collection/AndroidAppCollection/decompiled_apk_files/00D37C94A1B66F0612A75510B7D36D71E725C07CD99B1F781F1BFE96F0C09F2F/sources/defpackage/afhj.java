package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: afhj  reason: default package */
/* loaded from: classes.dex */
public final class afhj {
    private boolean a;
    private final Context b;

    public afhj(Context context) {
        this.b = context;
    }

    public final synchronized void a() {
        if (this.a) {
            return;
        }
        zgd.a(this.b, "elements");
        this.a = true;
    }
}
