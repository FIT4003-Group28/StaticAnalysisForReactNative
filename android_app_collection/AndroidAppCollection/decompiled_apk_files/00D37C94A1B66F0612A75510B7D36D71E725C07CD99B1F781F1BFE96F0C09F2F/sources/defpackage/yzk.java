package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: yzk  reason: default package */
/* loaded from: classes4.dex */
public final class yzk {
    private final Context d;
    public int a = 200;
    public int c = 1;
    public int b = 20;

    public yzk(Context context) {
        this.d = context;
    }

    public final yzl a() {
        return new yzl(this.d, this.a, this.c, this.b);
    }
}
