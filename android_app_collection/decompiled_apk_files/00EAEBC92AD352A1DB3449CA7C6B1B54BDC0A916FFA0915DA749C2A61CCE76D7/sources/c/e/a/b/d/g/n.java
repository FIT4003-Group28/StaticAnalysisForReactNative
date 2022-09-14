package c.e.a.b.d.g;

import android.app.Activity;
import c.e.a.b.d.g.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n extends h.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ Activity f4304f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ String f4305g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ String f4306h;
    private final /* synthetic */ h i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(h hVar, Activity activity, String str, String str2) {
        super(hVar);
        this.i = hVar;
        this.f4304f = activity;
        this.f4305g = str;
        this.f4306h = str2;
    }

    @Override // c.e.a.b.d.g.h.a
    final void a() {
        md mdVar;
        mdVar = this.i.f4180h;
        mdVar.setCurrentScreen(c.e.a.b.c.b.a(this.f4304f), this.f4305g, this.f4306h, this.f4181b);
    }
}
