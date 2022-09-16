package defpackage;

import com.google.research.aimatter.drishti.DrishtiCache;
/* compiled from: PG */
/* renamed from: awwn  reason: default package */
/* loaded from: classes2.dex */
public final class awwn {
    public DrishtiCache a;
    private Long b;

    public final awwo a() {
        Long l = this.b;
        if (l == null) {
            throw new IllegalStateException("Missing required properties: parentGlContextHandle");
        }
        return new awwo(l.longValue(), this.a);
    }

    public final void b(long j) {
        this.b = Long.valueOf(j);
    }
}
