package c.e.a.b.d.g;

import android.os.Bundle;
import c.e.a.b.d.g.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e0 extends h.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ String f4115f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ kd f4116g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ h f4117h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(h hVar, String str, kd kdVar) {
        super(hVar);
        this.f4117h = hVar;
        this.f4115f = str;
        this.f4116g = kdVar;
    }

    @Override // c.e.a.b.d.g.h.a
    final void a() {
        md mdVar;
        mdVar = this.f4117h.f4180h;
        mdVar.getMaxUserProperties(this.f4115f, this.f4116g);
    }

    @Override // c.e.a.b.d.g.h.a
    protected final void b() {
        this.f4116g.a((Bundle) null);
    }
}
