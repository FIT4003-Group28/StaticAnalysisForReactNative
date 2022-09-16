package defpackage;

import android.os.Looper;
/* compiled from: PG */
/* renamed from: rjm  reason: default package */
/* loaded from: classes4.dex */
public final class rjm {
    public final boolean a;

    public rjm() {
        this.a = false;
    }

    public rjm(boolean z) {
        this.a = z;
    }

    public static final boolean a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
