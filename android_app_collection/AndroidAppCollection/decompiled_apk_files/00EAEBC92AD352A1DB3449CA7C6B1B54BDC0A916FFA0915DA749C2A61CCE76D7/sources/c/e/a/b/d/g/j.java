package c.e.a.b.d.g;

import android.os.Bundle;
import c.e.a.b.d.g.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j extends h.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ Bundle f4224f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ h f4225g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, Bundle bundle) {
        super(hVar);
        this.f4225g = hVar;
        this.f4224f = bundle;
    }

    @Override // c.e.a.b.d.g.h.a
    final void a() {
        md mdVar;
        mdVar = this.f4225g.f4180h;
        mdVar.setConditionalUserProperty(this.f4224f, this.f4181b);
    }
}
