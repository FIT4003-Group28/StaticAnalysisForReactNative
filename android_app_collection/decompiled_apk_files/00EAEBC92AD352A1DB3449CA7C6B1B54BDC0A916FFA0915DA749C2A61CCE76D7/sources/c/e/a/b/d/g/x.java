package c.e.a.b.d.g;

import android.os.Bundle;
import c.e.a.b.d.g.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class x extends h.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ kd f4509f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ h f4510g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(h hVar, kd kdVar) {
        super(hVar);
        this.f4510g = hVar;
        this.f4509f = kdVar;
    }

    @Override // c.e.a.b.d.g.h.a
    final void a() {
        md mdVar;
        mdVar = this.f4510g.f4180h;
        mdVar.generateEventId(this.f4509f);
    }

    @Override // c.e.a.b.d.g.h.a
    protected final void b() {
        this.f4509f.a((Bundle) null);
    }
}
