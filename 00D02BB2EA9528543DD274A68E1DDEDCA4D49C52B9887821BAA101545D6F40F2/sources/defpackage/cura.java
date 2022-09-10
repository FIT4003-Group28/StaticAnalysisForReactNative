package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: cura  reason: default package */
/* loaded from: classes5.dex */
final class cura implements degu<String> {
    final /* synthetic */ curb a;

    public cura(curb curbVar) {
        this.a = curbVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.c.a(null);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(String str) {
        this.a.c.a(Uri.parse(str).getPath());
    }
}
