package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: annl  reason: default package */
/* loaded from: classes.dex */
public final class annl extends afhx {
    public static final dbsl<afga> b = annh.a;
    public final anhg a;
    private final gga c;
    private final akfc d;
    private final eeu e;

    public annl(Intent intent, @dzsi String str, gga ggaVar, anhg anhgVar, akfc akfcVar, eeu eeuVar) {
        super(intent, str, afid.TIMELINE_NOTIFICATION);
        this.c = ggaVar;
        this.a = anhgVar;
        this.d = akfcVar;
        this.e = eeuVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        dbsg dbsgVar;
        char c;
        Intent intent = this.f;
        if (!intent.hasExtra("payload")) {
            dbsgVar = dbpy.a;
        } else {
            try {
                dbsgVar = dbsg.i((dljd) dsqw.cq(dljd.d, intent.getByteArrayExtra("payload")));
            } catch (dsrm e) {
                bvoo.f(new RuntimeException(e));
                dbsgVar = dbpy.a;
            }
        }
        if (!dbsgVar.a()) {
            return;
        }
        dljd dljdVar = (dljd) dbsgVar.b();
        if ((dljdVar.a & 1) == 0) {
            return;
        }
        String stringExtra = this.f.getStringExtra("obfuscated_gaia_id");
        String stringExtra2 = this.f.getStringExtra("action_type");
        if (stringExtra == null || stringExtra2 == null) {
            return;
        }
        dnsc dnscVar = dljdVar.b;
        if (dnscVar == null) {
            dnscVar = dnsc.f;
        }
        dljc dljcVar = dljdVar.c;
        if (dljcVar == null) {
            dljcVar = dljc.c;
        }
        String str = dljcVar.b;
        int hashCode = stringExtra2.hashCode();
        if (hashCode != -1315282478) {
            if (hashCode == -575959605 && stringExtra2.equals("open_action")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (stringExtra2.equals("settings_action")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            this.d.o(stringExtra, new anni(this, dnscVar, str));
        } else if (c != 1) {
        } else {
            this.d.o(stringExtra, new annj(this, dnscVar, str));
        }
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_TIMELINE_NOTIFICATION;
    }

    public final void d(dnsc dnscVar, anhu anhuVar, String str) {
        if (!this.e.b()) {
            return;
        }
        affw.a(this.f, this.c, new annk(this, dnscVar, anhuVar, str));
    }
}
