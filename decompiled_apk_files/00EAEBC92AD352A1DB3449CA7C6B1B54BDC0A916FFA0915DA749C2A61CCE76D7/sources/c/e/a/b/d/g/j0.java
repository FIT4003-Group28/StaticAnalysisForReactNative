package c.e.a.b.d.g;

import android.app.Activity;
import c.e.a.b.d.g.h;
/* loaded from: classes.dex */
final class j0 extends h.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ Activity f4226f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ h.b f4227g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(h.b bVar, Activity activity) {
        super(h.this);
        this.f4227g = bVar;
        this.f4226f = activity;
    }

    @Override // c.e.a.b.d.g.h.a
    final void a() {
        md mdVar;
        mdVar = h.this.f4180h;
        mdVar.onActivityStarted(c.e.a.b.c.b.a(this.f4226f), this.f4182c);
    }
}
