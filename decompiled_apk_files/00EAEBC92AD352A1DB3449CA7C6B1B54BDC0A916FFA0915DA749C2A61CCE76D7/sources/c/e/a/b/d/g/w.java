package c.e.a.b.d.g;

import c.e.a.b.d.g.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class w extends h.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ String f4484f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ h f4485g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(h hVar, String str) {
        super(hVar);
        this.f4485g = hVar;
        this.f4484f = str;
    }

    @Override // c.e.a.b.d.g.h.a
    final void a() {
        md mdVar;
        mdVar = this.f4485g.f4180h;
        mdVar.endAdUnitExposure(this.f4484f, this.f4182c);
    }
}
