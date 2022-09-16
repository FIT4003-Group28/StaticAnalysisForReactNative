package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: blox  reason: default package */
/* loaded from: classes3.dex */
public final class blox extends gen implements bqld {
    public bwqv ad;
    public dzsj<bqji> ae;
    public ckcw af;
    public dzsj<blpp> ag;
    public gga ah;
    public ckmm ai;
    public blwb b;
    public blyw c;
    public blxp d;
    public dzsj<blyz> e;
    public cqkj g;
    public boolean a = true;
    private final blxm aj = new blov(this);

    @Override // defpackage.bqld
    public final void aS(bqlf bqlfVar) {
        this.aj.b();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        super.am();
        if (!this.ah.isFinishing()) {
            this.ai.e(cwsv.a("RiddlerDestroyNativePageEvent"));
        }
    }

    public final void g() {
        if (this.a) {
            u();
            this.a = false;
        }
    }

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        Bundle bundle2 = this.o;
        Dialog dialog = null;
        akqi akqiVar = null;
        try {
            blvw blvwVar = (blvw) this.ad.d(blvw.class, bundle2, "riddler_questions");
            boolean z = bundle2.getBoolean("show_settings_button", false);
            String string = bundle2.getString("server_ei", null);
            boolean z2 = bundle2.getBoolean("request_follow_on_questions", false);
            String string2 = bundle2.getString("feature_id", "");
            String string3 = bundle2.getString("riddler_session_id", "");
            try {
                akqiVar = akqi.b(string2);
            } catch (IllegalArgumentException unused) {
            }
            akqi akqiVar2 = akqiVar;
            blpk a = blpk.a(bundle2.getString("riddler_source"));
            blwb blwbVar = this.b;
            blvv blvvVar = new blvv(blvwVar.a, new blwn(this.ag.a().o()));
            blwb.a(blvvVar, 1);
            blpg a2 = blwbVar.a.a();
            blwb.a(a2, 3);
            dzsj<akfa> dzsjVar = blwbVar.b;
            bvrb a3 = blwbVar.c.a();
            blwb.a(a3, 5);
            blwa blwaVar = new blwa(blvvVar, a2, dzsjVar, a3);
            blxp blxpVar = this.d;
            blyw blywVar = this.c;
            blzg.a(blwaVar, 1);
            blzg.a(blxpVar, 2);
            blzg.a(blywVar, 3);
            blzg.a(a, 7);
            blzg.a(string3, 12);
            blzf blzfVar = new blzf(blwaVar, blxpVar, blywVar, this.g, string, akqiVar2, a, this.aj, this.e.a(), z, z2, string3);
            dialog = new Dialog(J(), 16973840);
            if (blzfVar.c() != null) {
                dialog.setContentView(blzfVar.c());
            }
            dialog.setOnShowListener(new blow(this));
        } catch (IOException unused2) {
        }
        return dialog;
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxz.w;
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        if (!this.a) {
            this.a = true;
            g();
        }
    }
}
