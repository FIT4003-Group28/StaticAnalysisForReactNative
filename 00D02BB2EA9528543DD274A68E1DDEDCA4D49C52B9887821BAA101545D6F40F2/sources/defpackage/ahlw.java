package defpackage;

import com.google.android.gms.contextmanager.ContextData;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahlw  reason: default package */
/* loaded from: classes2.dex */
public final class ahlw extends cnyf {
    final /* synthetic */ ahly a;

    public ahlw(ahly ahlyVar) {
        this.a = ahlyVar;
    }

    @Override // defpackage.cnyf
    public final void a(ContextData contextData) {
        try {
            try {
                contextData.a();
                dsjc dsjcVar = contextData.a;
                byte[] bArr = null;
                if ((dsjcVar.a & 64) != 0) {
                    dsje dsjeVar = dsjcVar.h;
                    if (dsjeVar == null) {
                        dsjeVar = dsje.a;
                    }
                    byte[] bS = dsjeVar.bS();
                    if (bS.length != 0) {
                        dspj J = dspj.J(bS);
                        try {
                            J.a();
                            bArr = J.G(J.w());
                        } catch (IOException unused) {
                        }
                    } else {
                        bArr = bS;
                    }
                }
                dsjq dsjqVar = (dsjq) dsqw.cr(dsjq.c, bArr, dsqa.c());
                ahly ahlyVar = this.a;
                ahlyVar.g = dsjqVar;
                ahlyVar.e = ahlyVar.c.e();
                ahly ahlyVar2 = this.a;
                if (ahlyVar2.f == -1) {
                    ahlyVar2.f = ahlyVar2.c.e();
                }
                this.a.b(false);
            } catch (NullPointerException e) {
                e = e;
                deki.b(e);
            }
        } catch (dsrm e2) {
            e = e2;
            deki.b(e);
        }
    }
}
