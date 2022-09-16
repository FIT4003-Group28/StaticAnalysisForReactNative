package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: apud  reason: default package */
/* loaded from: classes2.dex */
public final class apud implements btzi<dipt, dipv> {
    final /* synthetic */ apue a;
    final /* synthetic */ int b;

    public apud(apue apueVar, int i) {
        this.a = apueVar;
        this.b = i;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dipt> btzrVar, btzy btzyVar) {
        int i = this.b;
        if (i == 2 || i == 4) {
            int i2 = true != bttq.NO_CONNECTIVITY.equals(btzyVar.p) ? R.string.ERROR_LOAD_POSTS : R.string.DATA_REQUEST_ERROR_NO_CONNECTIVITY;
            gga ggaVar = this.a.a;
            Toast.makeText(ggaVar, ggaVar.getText(i2), 0).show();
        }
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dipt> btzrVar, dipv dipvVar) {
        dipv dipvVar2 = dipvVar;
        dipo dipoVar = dipvVar2.a;
        if (dipoVar == null) {
            dipoVar = dipo.e;
        }
        if (dipoVar.c.size() > 0) {
            dipo dipoVar2 = dipvVar2.a;
            if (dipoVar2 == null) {
                dipoVar2 = dipo.e;
            }
            dipk dipkVar = dipoVar2.c.get(0);
            if (this.b != 2) {
                apue apueVar = this.a;
                apup apupVar = apueVar.b;
                dbsk.s(apueVar.c.c());
                apupVar.r(dipkVar);
                return;
            }
            apue apueVar2 = this.a;
            apup apupVar2 = apueVar2.b;
            ilo c = apueVar2.c.c();
            dbsk.s(c);
            apupVar2.n(c, dipkVar);
        }
    }
}
