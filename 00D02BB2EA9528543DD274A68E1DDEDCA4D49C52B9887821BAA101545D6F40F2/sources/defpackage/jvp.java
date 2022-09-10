package defpackage;

import android.content.Intent;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: jvp  reason: default package */
/* loaded from: classes7.dex */
public final class jvp {
    private final jvo a;
    private final ckcw b;

    public jvp(jvo jvoVar, ckcw ckcwVar) {
        this.a = jvoVar;
        this.b = ckcwVar;
    }

    public final void a(Uri uri) {
        b(uri, false);
    }

    public final void b(Uri uri, boolean z) {
        ((ckhe) this.b.a(ckee.aC)).e();
        ((ckhe) this.b.a(ckee.aB)).e();
        if (z) {
            ((ckhe) this.b.a(ckee.aC)).a();
        } else {
            ((ckhe) this.b.a(ckee.aB)).a();
        }
        this.a.a(uri != null ? new Intent("android.intent.action.VIEW", uri) : new Intent("android.intent.action.VIEW"));
    }
}
