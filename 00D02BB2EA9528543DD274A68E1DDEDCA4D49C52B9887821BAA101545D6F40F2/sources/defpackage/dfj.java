package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dfj  reason: default package */
/* loaded from: classes6.dex */
final class dfj implements degu<Map<String, String>> {
    final /* synthetic */ acgz a;
    final /* synthetic */ dbsg b;
    final /* synthetic */ achg c;
    final /* synthetic */ achc d;
    final /* synthetic */ dfk e;

    public dfj(dfk dfkVar, acgz acgzVar, dbsg dbsgVar, achg achgVar, achc achcVar) {
        this.e = dfkVar;
        this.a = acgzVar;
        this.b = dbsgVar;
        this.c = achgVar;
        this.d = achcVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.e.c.a().D(this.c, this.d, this.a.b());
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.a.c(entry.getKey(), entry.getValue());
        }
        if (this.b.a()) {
            this.a.c("GeoAR Feedback Screenshot Time", Long.toString(((Long) this.b.b()).longValue()));
        }
        this.e.c.a().D(this.c, this.d, this.a.b());
    }
}
