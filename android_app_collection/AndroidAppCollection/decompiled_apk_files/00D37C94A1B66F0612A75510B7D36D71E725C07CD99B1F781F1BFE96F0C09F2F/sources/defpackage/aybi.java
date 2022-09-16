package defpackage;

import java.net.URI;
/* compiled from: PG */
/* renamed from: aybi  reason: default package */
/* loaded from: classes2.dex */
final class aybi extends aybb {
    final /* synthetic */ aybk a;

    public aybi(aybk aybkVar) {
        this.a = aybkVar;
    }

    @Override // defpackage.aybb
    public final aybg a(URI uri, ayaz ayazVar) {
        aybh aybhVar = (aybh) this.a.b().get(uri.getScheme());
        if (aybhVar == null) {
            return null;
        }
        return aybhVar.a(uri, ayazVar);
    }

    @Override // defpackage.aybb
    public final String b() {
        String str;
        synchronized (this.a) {
            str = this.a.b;
        }
        return str;
    }
}
