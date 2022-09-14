package c.e.a.b.d.g;

import android.os.Bundle;
import c.e.a.b.d.g.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class z extends h.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ kd f4554f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ h f4555g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(h hVar, kd kdVar) {
        super(hVar);
        this.f4555g = hVar;
        this.f4554f = kdVar;
    }

    @Override // c.e.a.b.d.g.h.a
    final void a() {
        md mdVar;
        mdVar = this.f4555g.f4180h;
        mdVar.getCurrentScreenClass(this.f4554f);
    }

    @Override // c.e.a.b.d.g.h.a
    protected final void b() {
        this.f4554f.a((Bundle) null);
    }
}
