package defpackage;

import com.facebook.yoga.YogaNative;
/* compiled from: PG */
/* renamed from: dmz  reason: default package */
/* loaded from: classes3.dex */
public final class dmz {
    public final long a;

    public dmz() {
        long jni_YGConfigNew = YogaNative.jni_YGConfigNew();
        this.a = jni_YGConfigNew;
        if (jni_YGConfigNew != 0) {
            return;
        }
        throw new IllegalStateException("Failed to allocate native memory");
    }

    protected final void finalize() {
        try {
            YogaNative.jni_YGConfigFree(this.a);
        } finally {
            super.finalize();
        }
    }
}
