package c.e.a.b.d.g;

import android.os.Bundle;
import c.e.a.b.d.g.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d0 extends h.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ String f4096f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ String f4097g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ boolean f4098h;
    private final /* synthetic */ kd i;
    private final /* synthetic */ h j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(h hVar, String str, String str2, boolean z, kd kdVar) {
        super(hVar);
        this.j = hVar;
        this.f4096f = str;
        this.f4097g = str2;
        this.f4098h = z;
        this.i = kdVar;
    }

    @Override // c.e.a.b.d.g.h.a
    final void a() {
        md mdVar;
        mdVar = this.j.f4180h;
        mdVar.getUserProperties(this.f4096f, this.f4097g, this.f4098h, this.i);
    }

    @Override // c.e.a.b.d.g.h.a
    protected final void b() {
        this.i.a((Bundle) null);
    }
}
