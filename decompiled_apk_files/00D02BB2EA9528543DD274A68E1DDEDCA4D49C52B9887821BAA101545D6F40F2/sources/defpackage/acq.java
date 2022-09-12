package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
/* compiled from: PG */
/* renamed from: acq  reason: default package */
/* loaded from: classes.dex */
final class acq extends ail<Integer, PorterDuffColorFilter> {
    public acq() {
        super(6);
    }

    public static int a(int i, PorterDuff.Mode mode) {
        return ((i + 31) * 31) + mode.hashCode();
    }
}
