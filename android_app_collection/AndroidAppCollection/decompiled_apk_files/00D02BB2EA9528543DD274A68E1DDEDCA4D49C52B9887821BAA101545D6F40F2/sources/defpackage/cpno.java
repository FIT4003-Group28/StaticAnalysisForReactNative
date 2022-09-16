package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cpno  reason: default package */
/* loaded from: classes5.dex */
public final class cpno implements dbrn<dgzr, dgzy> {
    final /* synthetic */ cpnv a;

    public cpno(cpnv cpnvVar) {
        this.a = cpnvVar;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ dgzy a(dgzr dgzrVar) {
        cpnv cpnvVar;
        Context a;
        int i;
        dgzr dgzrVar2 = dgzrVar;
        dhaf dhafVar = dgzrVar2.a;
        if (dhafVar == null) {
            dhafVar = dhaf.d;
        }
        dhad dhadVar = dhafVar.b;
        if (dhadVar == null) {
            dhadVar = dhad.c;
        }
        dgzz dgzzVar = dhadVar.b;
        if (dgzzVar == null) {
            dgzzVar = dgzz.c;
        }
        dgzy b = dgzy.b(dgzzVar.a);
        if (b == null) {
            b = dgzy.UNRECOGNIZED;
        }
        if (b != dgzy.MSG_VALID) {
            int ordinal = b.ordinal();
            if (ordinal == 2) {
                cpnvVar = this.a;
                a = cpnvVar.a();
                i = R.string.address_verify_inferred;
            } else if (ordinal == 3) {
                cpnvVar = this.a;
                a = cpnvVar.a();
                i = R.string.address_verify_corrections;
            } else if (ordinal == 4) {
                if (dgzrVar2.b.size() == 0) {
                    cpnv cpnvVar2 = this.a;
                    cpnvVar2.i(cpnvVar2.a().getString(R.string.address_not_understood));
                    this.a.l();
                    return b;
                }
                cpnvVar = this.a;
                a = cpnvVar.a();
                i = R.string.address_incomplete;
            }
            cpnvVar.i(a.getString(i));
            this.a.j(dgzrVar2);
            return b;
        }
        this.a.k();
        return b;
    }
}
