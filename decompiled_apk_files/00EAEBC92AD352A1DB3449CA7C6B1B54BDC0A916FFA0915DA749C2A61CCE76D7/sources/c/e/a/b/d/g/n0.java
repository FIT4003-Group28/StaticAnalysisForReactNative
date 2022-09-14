package c.e.a.b.d.g;

import android.app.Activity;
import c.e.a.b.d.g.h;
/* loaded from: classes.dex */
final class n0 extends h.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ Activity f4307f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ kd f4308g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ h.b f4309h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(h.b bVar, Activity activity, kd kdVar) {
        super(h.this);
        this.f4309h = bVar;
        this.f4307f = activity;
        this.f4308g = kdVar;
    }

    @Override // c.e.a.b.d.g.h.a
    final void a() {
        md mdVar;
        mdVar = h.this.f4180h;
        mdVar.onActivitySaveInstanceState(c.e.a.b.c.b.a(this.f4307f), this.f4308g, this.f4182c);
    }
}
