package defpackage;

import android.app.AlertDialog;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akdy  reason: default package */
/* loaded from: classes2.dex */
public final class akdy implements btzi<dukl, dukn> {
    final /* synthetic */ akdz a;

    public akdy(akdz akdzVar) {
        this.a = akdzVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dukl> btzrVar, btzy btzyVar) {
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dukl> btzrVar, dukn duknVar) {
        dqwa dqwaVar;
        dukn duknVar2 = duknVar;
        akdz akdzVar = this.a;
        akea akeaVar = akdzVar.a.get();
        if (akeaVar == null) {
            return;
        }
        ckco ckcoVar = (ckco) akdzVar.e.a().a(akdzVar.g.get() > 1 ? ckja.S : ckja.R);
        dwzg b = dwzg.b(duknVar2.b);
        if (b == null) {
            b = dwzg.SUCCESS;
        }
        ckcoVar.a(b.ordinal());
        dwzg b2 = dwzg.b(duknVar2.b);
        if (b2 == null) {
            b2 = dwzg.SUCCESS;
        }
        int ordinal = b2.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            akeaVar.h.c(akez.GAIA_LOGIN_DISABLED_IN_APP_START);
        } else if (ordinal == 3) {
            akeaVar.d.A(btzrVar.c, btzrVar.b);
            if (akdzVar.f) {
                akdzVar.f = false;
                akdzVar.run();
            }
        } else if (ordinal != 8) {
            bvjj bvjjVar = akdzVar.b;
            btlu btluVar = akdzVar.c;
            if ((2 & duknVar2.a) != 0) {
                bvjk bvjkVar = bvjk.ga;
                dwvb dwvbVar = duknVar2.c;
                if (dwvbVar == null) {
                    dwvbVar = dwvb.e;
                }
                bvjjVar.am(bvjkVar, btluVar, dwvbVar);
            }
            akeaVar.e.e(akdzVar.c);
            btlx btlxVar = new btlx(akdzVar.c);
            dqwa dqwaVar2 = duknVar2.d;
            if (dqwaVar2 == null) {
                dqwaVar2 = dqwa.g;
            }
            btlu btluVar2 = btlxVar.a;
            String str = dqwaVar2.f;
            dbsk.l(btluVar2.l());
            btluVar2.g = str;
        } else {
            akeaVar.h.c(akez.DASHER_ADMIN_DISABLED);
            if (akeaVar.w()) {
                new AlertDialog.Builder(akeaVar.a).setMessage(R.string.DASHER_ADMIN_DISABLED_DIALOG_MESSAGE).setPositiveButton(R.string.OK_BUTTON, new akdx(akeaVar)).show();
            }
        }
        ccie ccieVar = akdzVar.d;
        btlu btluVar3 = btzrVar.c;
        dbsk.s(btluVar3);
        if ((duknVar2.a & 4) != 0) {
            dqwaVar = duknVar2.d;
            if (dqwaVar == null) {
                dqwaVar = dqwa.g;
            }
        } else {
            dqwaVar = null;
        }
        ccieVar.c(btluVar3, dqwaVar);
    }
}
