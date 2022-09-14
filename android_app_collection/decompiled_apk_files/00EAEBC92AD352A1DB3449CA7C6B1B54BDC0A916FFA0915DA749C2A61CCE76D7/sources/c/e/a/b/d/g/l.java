package c.e.a.b.d.g;

import android.os.Bundle;
import c.e.a.b.d.g.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l extends h.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ String f4269f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ String f4270g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ kd f4271h;
    private final /* synthetic */ h i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(h hVar, String str, String str2, kd kdVar) {
        super(hVar);
        this.i = hVar;
        this.f4269f = str;
        this.f4270g = str2;
        this.f4271h = kdVar;
    }

    @Override // c.e.a.b.d.g.h.a
    final void a() {
        md mdVar;
        mdVar = this.i.f4180h;
        mdVar.getConditionalUserProperties(this.f4269f, this.f4270g, this.f4271h);
    }

    @Override // c.e.a.b.d.g.h.a
    protected final void b() {
        this.f4271h.a((Bundle) null);
    }
}
