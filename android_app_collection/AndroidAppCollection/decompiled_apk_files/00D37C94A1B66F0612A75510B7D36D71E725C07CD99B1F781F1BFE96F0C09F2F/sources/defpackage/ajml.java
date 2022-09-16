package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: ajml  reason: default package */
/* loaded from: classes.dex */
public final class ajml implements ajmm {
    private final ykg a = new yko(70);
    private final yku b = new yku();

    @Override // defpackage.ajmm
    public final ykg a() {
        return this.a;
    }

    @Override // defpackage.ajmm
    public final ykg b() {
        return this.b;
    }

    @Override // defpackage.ajmm
    public final void c() {
        this.a.c();
        this.b.c();
    }

    @Override // defpackage.ajmm
    public final void d(Uri uri) {
        this.a.b(uri);
        this.b.f(uri);
    }
}
