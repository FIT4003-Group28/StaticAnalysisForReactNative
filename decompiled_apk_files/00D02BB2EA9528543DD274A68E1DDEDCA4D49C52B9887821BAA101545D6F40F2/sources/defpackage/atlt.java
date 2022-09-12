package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: atlt  reason: default package */
/* loaded from: classes2.dex */
public class atlt {
    public static final cqtv a = cqrp.d(6.0d);
    public static final cqtv b = cqrp.d(3.0d);
    public static final cqtv c = cqrp.d(16.0d);
    private final Context d;

    static {
        cqrp.d(8.0d);
    }

    public atlt(Context context) {
        this.d = context;
    }

    public final float a() {
        return Math.max(308.0f, this.d.getResources().getConfiguration().screenWidthDp * 0.45f);
    }

    public final int b() {
        return cqrp.d(a()).e(this.d);
    }
}
