package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;
/* compiled from: PG */
/* renamed from: bzbr  reason: default package */
/* loaded from: classes4.dex */
public final class bzbr extends gen {
    public bvjj a;
    public String ad;
    public boolean ae = false;
    private bzbv af;
    private cqkf<bzbv> ag;
    public cqkj b;
    public gdc c;
    public dxio<afha> d;
    public String e;
    public String g;

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<bzbv> cqkfVar = this.ag;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        super.Qe();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        if (bundle == null) {
            bundle = this.o;
        }
        String string = bundle.getString("et_file");
        dbsk.s(string);
        this.e = string;
        String string2 = bundle.getString("start_point");
        dbsk.s(string2);
        this.g = string2;
        String string3 = bundle.getString("end_point");
        dbsk.s(string3);
        this.ad = string3;
        this.af = new bzbm(new CompoundButton.OnCheckedChangeListener(this) { // from class: bzbo
            private final bzbr a;

            {
                this.a = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.ae = z;
            }
        }, cjtd.a(dtyc.cW));
        cqkf<bzbv> c = this.b.c(new bzbu(), null);
        this.ag = c;
        c.e(this.af);
        gcz a = this.c.a();
        a.j();
        a.i(byyn.TRANSIT_SEND_TRACK_CONSENT_DIALOG_TITLE);
        a.d(byyn.TRANSIT_SEND_TRACK_CONSENT_DIALOG_MESSAGE);
        a.i = cjtd.a(dtyc.cT);
        a.h(byyn.TRANSIT_SEND_TRACK_CONSENT_DIALOG_ALLOW, cjtd.a(dtyc.cU), new gdd(this) { // from class: bzbp
            private final bzbr a;

            {
                this.a = this;
            }

            @Override // defpackage.gdd
            public final void a(DialogInterface dialogInterface) {
                bzbr bzbrVar = this.a;
                if (bzbrVar.ae) {
                    bzbrVar.a.S(bvjk.dj, true);
                }
                ff J = bzbrVar.J();
                String str = bzbrVar.g;
                String str2 = bzbrVar.ad;
                String str3 = bzbrVar.e;
                dxio<afha> dxioVar = bzbrVar.d;
                Intent b = bzgk.b(J, str, str2, "", str3);
                b.setFlags(268435456);
                try {
                    dxioVar.a().f(J, b, 4);
                } catch (Exception unused) {
                    Toast.makeText(J, "Unable to send track using Gmail", 1).show();
                }
            }
        });
        a.e(byyn.TRANSIT_SEND_TRACK_CONSENT_DIALOG_DENY, cjtd.a(dtyc.cV), new gdd(this) { // from class: bzbq
            private final bzbr a;

            {
                this.a = this;
            }

            @Override // defpackage.gdd
            public final void a(DialogInterface dialogInterface) {
                bzbr bzbrVar = this.a;
                if (bzbrVar.ae) {
                    bzbrVar.a.S(bvjk.dj, false);
                }
            }
        });
        gde a2 = a.a();
        a2.c(this.ag.c());
        return a2;
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putString("et_file", this.e);
        bundle.putString("start_point", this.g);
        bundle.putString("end_point", this.ad);
        bundle.putBoolean("naa", this.ae);
    }
}
