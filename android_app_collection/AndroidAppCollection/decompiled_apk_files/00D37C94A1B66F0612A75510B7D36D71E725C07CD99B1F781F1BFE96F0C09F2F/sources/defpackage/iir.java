package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: iir  reason: default package */
/* loaded from: classes3.dex */
public final class iir implements fqc, ajpz {
    private final ajqa a;
    private final azqb b;

    public iir(ajqa ajqaVar, azqb azqbVar) {
        this.a = ajqaVar;
        this.b = azqbVar;
    }

    @Override // defpackage.fqc
    public final void a() {
        this.a.e(this);
    }

    @Override // defpackage.fqc
    public final void b() {
        this.a.h(iiq.a, this);
    }

    @Override // defpackage.ajpz
    public final void kA(Uri uri, Uri uri2) {
        iiq iiqVar;
        if (akzj.f(uri, iiq.a) && (iiqVar = (iiq) this.a.b(uri2)) != null && iiqVar.f) {
            ((ces) this.b.get()).b();
        }
    }
}
