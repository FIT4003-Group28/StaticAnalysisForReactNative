package c.e.a.b.d.g;

import android.os.Bundle;
import c.e.a.b.d.g.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y extends h.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ kd f4528f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ h f4529g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(h hVar, kd kdVar) {
        super(hVar);
        this.f4529g = hVar;
        this.f4528f = kdVar;
    }

    @Override // c.e.a.b.d.g.h.a
    final void a() {
        md mdVar;
        mdVar = this.f4529g.f4180h;
        mdVar.getCachedAppInstanceId(this.f4528f);
    }

    @Override // c.e.a.b.d.g.h.a
    protected final void b() {
        this.f4528f.a((Bundle) null);
    }
}
