package defpackage;

import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: crcc  reason: default package */
/* loaded from: classes5.dex */
public final class crcc implements btzi<dxai, dxam> {
    final /* synthetic */ crcd a;
    private final crcb b;

    public crcc(crcd crcdVar, crcb crcbVar) {
        this.a = crcdVar;
        this.b = crcbVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dxai> btzrVar, btzy btzyVar) {
        synchronized (this.a) {
            this.a.f(this.b);
            this.a.e = null;
        }
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dxai> btzrVar, dxam dxamVar) {
        dxam dxamVar2 = dxamVar;
        synchronized (this.a) {
            if (dxamVar2.a.size() == 0) {
                crcb crcbVar = this.b;
                if (crcbVar.d > 0) {
                    this.a.d(crcbVar);
                    return;
                }
                this.a.f(crcbVar);
                this.a.e = null;
                return;
            }
            dxal dxalVar = dxamVar2.a.get(0);
            int i = dxalVar.c;
            this.b.toString();
            if (i == 200) {
                this.b.toString();
                crcb crcbVar2 = this.b;
                Locale locale = crcbVar2.a;
                String str = crcbVar2.b;
                long j = dxalVar.d;
                String str2 = this.a.a;
                long currentTimeMillis = System.currentTimeMillis();
                this.a.e(this.b, new crbz(locale.toString(), str, j, currentTimeMillis, currentTimeMillis, str2), dxalVar.e.G());
            } else if (i == 304) {
                crcb crcbVar3 = this.b;
                crbz crbzVar = crcbVar3.c;
                if (crbzVar != null) {
                    crbzVar.d = System.currentTimeMillis();
                    this.a.b();
                } else {
                    this.a.f(crcbVar3);
                }
            } else {
                this.b.toString();
                this.a.f(this.b);
            }
            this.a.e = null;
        }
    }
}
