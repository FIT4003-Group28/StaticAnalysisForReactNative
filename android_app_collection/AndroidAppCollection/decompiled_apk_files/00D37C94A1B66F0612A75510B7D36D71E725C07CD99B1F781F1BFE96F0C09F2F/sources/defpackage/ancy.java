package defpackage;

import android.util.Log;
/* compiled from: PG */
/* renamed from: ancy  reason: default package */
/* loaded from: classes.dex */
public final class ancy {
    private final String a;

    public ancy(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 3);
        sb.append("[");
        sb.append(str);
        sb.append("] ");
        this.a = sb.toString();
    }

    public final void b(String str) {
        Log.e("SetupLibrary", this.a.concat(str));
    }

    public final void c(String str, Throwable th) {
        Log.e("SetupLibrary", this.a.concat(str), th);
    }

    public final void d(String str) {
        Log.w("SetupLibrary", this.a.concat(str));
    }
}
