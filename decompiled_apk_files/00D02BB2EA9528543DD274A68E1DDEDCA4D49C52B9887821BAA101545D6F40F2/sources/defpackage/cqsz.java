package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cqsz  reason: default package */
/* loaded from: classes.dex */
public abstract class cqsz implements cqtv, cqtu {
    public static cqtv c() {
        return new cqsx();
    }

    public static cqtv d() {
        return new cqsy();
    }

    @Override // defpackage.cqtv
    public final int NR(Context context) {
        return (int) a(context);
    }

    @Override // defpackage.cqtv
    public final int e(Context context) {
        return (int) a(context);
    }

    public final boolean equals(@dzsi Object obj) {
        return obj != null && getClass().equals(obj.getClass());
    }
}
