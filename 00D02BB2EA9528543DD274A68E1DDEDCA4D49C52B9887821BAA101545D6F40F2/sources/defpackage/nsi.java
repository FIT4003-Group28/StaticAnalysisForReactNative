package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: nsi  reason: default package */
/* loaded from: classes7.dex */
public final class nsi extends cqtd {
    private final bvjj a;
    private final cqtd b;
    private final cqtd c;

    public nsi(bvjj bvjjVar, cqtd cqtdVar, cqtd cqtdVar2) {
        super(new Object[]{cqtdVar, cqtdVar2});
        this.a = bvjjVar;
        this.b = cqtdVar;
        this.c = cqtdVar2;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        return (this.a.m(bvjk.gk, false) ? this.b : this.c).a(context);
    }
}
