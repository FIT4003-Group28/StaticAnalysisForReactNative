package defpackage;

import android.graphics.Rect;
import android.view.View;
/* compiled from: PG */
/* renamed from: nzv  reason: default package */
/* loaded from: classes3.dex */
public final class nzv extends nzn {
    private final nzy a;
    private final frt b;

    public nzv(nzy nzyVar, frt frtVar) {
        this.a = nzyVar;
        this.b = frtVar;
    }

    @Override // defpackage.nzn
    public final float a() {
        return this.a.c().q();
    }

    @Override // defpackage.nzn
    public final Rect b() {
        return this.a.d(1).u();
    }

    @Override // defpackage.nzn
    public final Rect c() {
        return this.a.c().u();
    }

    @Override // defpackage.nzn
    public final View d() {
        return ((fqo) this.b).a;
    }

    @Override // defpackage.nzn
    public final boolean g() {
        return this.b.d() && this.a.p() && zew.y(e().getContext());
    }
}
