package c.e.a.b.d.g;

import android.os.Bundle;
import c.e.a.b.d.g.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i0 extends h.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ Long f4206f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ String f4207g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ String f4208h;
    private final /* synthetic */ Bundle i;
    private final /* synthetic */ boolean j;
    private final /* synthetic */ boolean k;
    private final /* synthetic */ h l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(h hVar, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(hVar);
        this.l = hVar;
        this.f4206f = l;
        this.f4207g = str;
        this.f4208h = str2;
        this.i = bundle;
        this.j = z;
        this.k = z2;
    }

    @Override // c.e.a.b.d.g.h.a
    final void a() {
        md mdVar;
        Long l = this.f4206f;
        long longValue = l == null ? this.f4181b : l.longValue();
        mdVar = this.l.f4180h;
        mdVar.logEvent(this.f4207g, this.f4208h, this.i, this.j, this.k, longValue);
    }
}
