package com.google.firebase.auth.internal;
/* loaded from: classes.dex */
final class h implements c.e.a.b.g.d {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ e f8363a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(e eVar) {
        this.f8363a = eVar;
    }

    @Override // c.e.a.b.g.d
    public final void a(Exception exc) {
        com.google.android.gms.common.l.a aVar;
        if (exc instanceof c.e.b.h) {
            aVar = f.f8348h;
            aVar.c("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            this.f8363a.f8344c.b();
        }
    }
}
