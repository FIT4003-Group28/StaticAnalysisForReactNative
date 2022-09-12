package defpackage;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: cqso  reason: default package */
/* loaded from: classes.dex */
public final class cqso extends cqtd {
    private final cqtd a;
    private final cqss b;
    private final PorterDuff.Mode c;
    private ColorFilter d;
    private int e;

    public cqso(cqtd cqtdVar, cqss cqssVar, PorterDuff.Mode mode) {
        super(new Object[]{cqtdVar, cqssVar, mode});
        this.a = cqtdVar;
        this.b = cqssVar;
        this.c = mode;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        Drawable a = this.a.a(context);
        a.mutate();
        int b = this.b.b(context);
        if (this.d == null || b != this.e) {
            this.d = new PorterDuffColorFilter(b, this.c);
            this.e = b;
        }
        a.setColorFilter(this.d);
        return a;
    }
}
