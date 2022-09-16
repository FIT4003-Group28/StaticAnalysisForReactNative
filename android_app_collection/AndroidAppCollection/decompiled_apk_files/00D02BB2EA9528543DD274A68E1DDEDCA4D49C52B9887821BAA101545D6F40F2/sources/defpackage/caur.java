package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: caur  reason: default package */
/* loaded from: classes4.dex */
final class caur implements begr {
    final /* synthetic */ cauu a;

    public caur(cauu cauuVar) {
        this.a = cauuVar;
    }

    @Override // defpackage.begr
    public final void a(bttu bttuVar, ilo iloVar) {
        if (!this.a.a.b()) {
            return;
        }
        bjbu bjbuVar = this.a.b;
        bwrs<ilo> a = bwrs.a(iloVar);
        djan bZ = djao.i.bZ();
        djaj bZ2 = djam.m.bZ();
        String str = this.a.n().b;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        djam djamVar = (djam) bZ2.b;
        str.getClass();
        djamVar.a |= 1;
        djamVar.b = str;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djao djaoVar = (djao) bZ.b;
        djam bK = bZ2.bK();
        bK.getClass();
        djaoVar.b = bK;
        djaoVar.a |= 1;
        bjbuVar.c(a, bZ.bK());
    }

    @Override // defpackage.begr
    public final void b(bttu bttuVar, ilo iloVar, bttq bttqVar) {
        Toast.makeText(this.a.d, (int) R.string.PLACE_QA_ERROR_MESSAGE_GENERIC, 0).show();
        bttqVar.toString();
    }
}
