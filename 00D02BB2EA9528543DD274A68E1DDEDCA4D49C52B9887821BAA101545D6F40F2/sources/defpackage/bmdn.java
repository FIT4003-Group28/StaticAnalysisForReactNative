package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: bmdn  reason: default package */
/* loaded from: classes3.dex */
public final class bmdn {
    public final /* synthetic */ bmdu a;
    final /* synthetic */ cjtx b;
    final /* synthetic */ ilo c;
    final /* synthetic */ bmdq d;

    public bmdn(bmdq bmdqVar, bmdu bmduVar, cjtx cjtxVar, ilo iloVar) {
        this.d = bmdqVar;
        this.a = bmduVar;
        this.b = cjtxVar;
        this.c = iloVar;
    }

    public final void a(Uri uri) {
        this.a.a();
        if (!this.d.a.isFinishing()) {
            bmdq bmdqVar = this.d;
            bmdqVar.e(uri, bmdqVar.a, this.b);
        }
    }

    public final void b() {
        this.a.a();
        if (!this.d.a.isFinishing()) {
            bmdq bmdqVar = this.d;
            String valueOf = String.valueOf(this.c.L());
            bmdqVar.e(Uri.parse(valueOf.length() != 0 ? "tel: ".concat(valueOf) : new String("tel: ")), this.d.a, this.b);
        }
    }
}
