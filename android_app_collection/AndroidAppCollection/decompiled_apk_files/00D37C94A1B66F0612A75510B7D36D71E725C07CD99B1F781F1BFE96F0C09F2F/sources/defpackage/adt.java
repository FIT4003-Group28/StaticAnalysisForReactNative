package defpackage;

import android.os.Build;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: adt  reason: default package */
/* loaded from: classes.dex */
public final class adt {
    public CharSequence a = null;
    public CharSequence b = null;
    public CharSequence c = null;
    public boolean d = false;

    public final adu a() {
        if (!TextUtils.isEmpty(this.a)) {
            if (!acy.d(0)) {
                throw new IllegalArgumentException("Authenticator combination is unsupported on API " + Build.VERSION.SDK_INT + ": 0");
            }
            boolean z = this.d;
            if (!TextUtils.isEmpty(this.c) || z) {
                if (TextUtils.isEmpty(this.c) || !z) {
                    return new adu(this.a, this.b, this.c, this.d);
                }
                throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
            }
            throw new IllegalArgumentException("Negative text must be set and non-empty.");
        }
        throw new IllegalArgumentException("Title must be set and non-empty.");
    }
}
