package c.e.a.b.d.g;

import android.os.Bundle;
import c.e.a.b.d.g.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a0 extends h.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ kd f4038f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ h f4039g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(h hVar, kd kdVar) {
        super(hVar);
        this.f4039g = hVar;
        this.f4038f = kdVar;
    }

    @Override // c.e.a.b.d.g.h.a
    final void a() {
        md mdVar;
        mdVar = this.f4039g.f4180h;
        mdVar.getCurrentScreenName(this.f4038f);
    }

    @Override // c.e.a.b.d.g.h.a
    protected final void b() {
        this.f4038f.a((Bundle) null);
    }
}
