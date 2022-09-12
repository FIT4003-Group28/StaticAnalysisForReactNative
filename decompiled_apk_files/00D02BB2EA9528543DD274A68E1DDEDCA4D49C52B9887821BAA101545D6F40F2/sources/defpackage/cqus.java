package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
@Deprecated
/* renamed from: cqus  reason: default package */
/* loaded from: classes5.dex */
public final class cqus extends cqss {
    private static final int[][] a = {new int[]{16842919}, new int[0]};
    private final ColorStateList b;
    private final cqss c;

    public cqus(Context context, cqss cqssVar, cqss cqssVar2) {
        super(new Object[]{cqssVar, cqssVar2});
        this.c = cqssVar2;
        this.b = new ColorStateList(a, new int[]{cqssVar.b(context), cqssVar2.b(context)});
    }

    @Override // defpackage.cqss, defpackage.cqtd
    public final Drawable a(Context context) {
        return this.c.a(context);
    }

    @Override // defpackage.cqss
    public final int b(Context context) {
        return this.c.b(context);
    }

    @Override // defpackage.cqss
    public final ColorStateList c(Context context) {
        return this.b;
    }
}
