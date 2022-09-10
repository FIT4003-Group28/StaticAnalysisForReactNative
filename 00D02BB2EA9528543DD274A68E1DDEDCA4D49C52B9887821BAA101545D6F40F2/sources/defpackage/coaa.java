package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: coaa  reason: default package */
/* loaded from: classes5.dex */
final class coaa implements Runnable {
    final /* synthetic */ Map a;
    final /* synthetic */ cnzt b;
    final /* synthetic */ coac c;

    public coaa(coac coacVar, Map map, cnzt cnztVar) {
        this.c = coacVar;
        this.a = map;
        this.b = cnztVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr;
        try {
            bArr = this.c.e.e(this.a);
            if (bArr == null) {
                this.c.b = coaj.b("Received null");
                bArr = this.c.b;
            }
        } catch (Exception e) {
            coac coacVar = this.c;
            String valueOf = String.valueOf(e.toString());
            coacVar.b = coaj.b(valueOf.length() != 0 ? "Snapshot failed: ".concat(valueOf) : new String("Snapshot failed: "));
            bArr = this.c.b;
            this.c.a();
        }
        this.b.a(bArr);
    }
}
