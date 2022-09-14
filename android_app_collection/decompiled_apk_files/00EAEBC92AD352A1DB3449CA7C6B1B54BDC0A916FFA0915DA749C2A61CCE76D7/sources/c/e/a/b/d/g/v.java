package c.e.a.b.d.g;

import android.os.Bundle;
import c.e.a.b.d.g.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v extends h.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ kd f4457f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ h f4458g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(h hVar, kd kdVar) {
        super(hVar);
        this.f4458g = hVar;
        this.f4457f = kdVar;
    }

    @Override // c.e.a.b.d.g.h.a
    final void a() {
        md mdVar;
        mdVar = this.f4458g.f4180h;
        mdVar.getGmpAppId(this.f4457f);
    }

    @Override // c.e.a.b.d.g.h.a
    protected final void b() {
        this.f4457f.a((Bundle) null);
    }
}
