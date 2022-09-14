package c.e.a.b.d.g;

import android.app.Activity;
import android.os.Bundle;
import c.e.a.b.d.g.h;
/* loaded from: classes.dex */
final class k0 extends h.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ Activity f4248f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ Bundle f4249g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ h.b f4250h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(h.b bVar, Activity activity, Bundle bundle) {
        super(h.this);
        this.f4250h = bVar;
        this.f4248f = activity;
        this.f4249g = bundle;
    }

    @Override // c.e.a.b.d.g.h.a
    final void a() {
        md mdVar;
        mdVar = h.this.f4180h;
        mdVar.onActivityCreated(c.e.a.b.c.b.a(this.f4248f), this.f4249g, this.f4182c);
    }
}
