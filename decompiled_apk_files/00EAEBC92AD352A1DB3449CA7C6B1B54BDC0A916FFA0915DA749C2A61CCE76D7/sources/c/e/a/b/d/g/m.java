package c.e.a.b.d.g;

import android.os.Bundle;
import c.e.a.b.d.g.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m extends h.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ String f4290f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ String f4291g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ Bundle f4292h;
    private final /* synthetic */ h i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(h hVar, String str, String str2, Bundle bundle) {
        super(hVar);
        this.i = hVar;
        this.f4290f = str;
        this.f4291g = str2;
        this.f4292h = bundle;
    }

    @Override // c.e.a.b.d.g.h.a
    final void a() {
        md mdVar;
        mdVar = this.i.f4180h;
        mdVar.clearConditionalUserProperty(this.f4290f, this.f4291g, this.f4292h);
    }
}
