package defpackage;

import android.net.Uri;
import android.view.View;
/* compiled from: PG */
/* renamed from: pmh  reason: default package */
/* loaded from: classes7.dex */
public class pmh implements plq {
    public final gga a;
    public final dxio<afha> b;
    public final dqsv c;
    private final String d;

    public pmh(gga ggaVar, dxio<afha> dxioVar, String str, dqsv dqsvVar) {
        this.a = ggaVar;
        this.b = dxioVar;
        this.d = str;
        this.c = dqsvVar;
    }

    @Override // defpackage.plq
    public CharSequence a() {
        dgly dglyVar = this.c.a;
        if (dglyVar == null) {
            dglyVar = dgly.c;
        }
        return acls.a(dglyVar);
    }

    @Override // defpackage.plq
    public CharSequence b() {
        dqtb dqtbVar = this.c.b;
        if (dqtbVar == null) {
            dqtbVar = dqtb.d;
        }
        dgly dglyVar = dqtbVar.b;
        if (dglyVar == null) {
            dglyVar = dgly.c;
        }
        return acls.a(dglyVar);
    }

    @Override // defpackage.plq
    public int c() {
        dqtb dqtbVar = this.c.b;
        if (dqtbVar == null) {
            dqtbVar = dqtb.d;
        }
        if ((dqtbVar.a & 2) != 0) {
            dqtb dqtbVar2 = this.c.b;
            if (dqtbVar2 == null) {
                dqtbVar2 = dqtb.d;
            }
            return dqtbVar2.c;
        }
        return 2;
    }

    @Override // defpackage.plq
    public CharSequence d() {
        return this.c.c;
    }

    @Override // defpackage.plq
    public View.OnClickListener e() {
        return new View.OnClickListener(this) { // from class: pmg
            private final pmh a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pmh pmhVar = this.a;
                dgly dglyVar = pmhVar.c.a;
                if (dglyVar == null) {
                    dglyVar = dgly.c;
                }
                if (dglyVar.b.size() == 0) {
                    return;
                }
                dgly dglyVar2 = pmhVar.c.a;
                if (dglyVar2 == null) {
                    dglyVar2 = dgly.c;
                }
                dgbo dgboVar = dglyVar2.b.get(0).e;
                if (dgboVar == null) {
                    dgboVar = dgbo.e;
                }
                String str = dgboVar.c;
                if (str.isEmpty()) {
                    return;
                }
                pmhVar.b.a().l(pmhVar.a, Uri.parse(str), 4);
            }
        };
    }

    @Override // defpackage.plq
    public cjtd f() {
        cjta b = cjtd.b();
        b.d = dtxl.ij;
        b.g(this.d);
        return b.a();
    }
}
