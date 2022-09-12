package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
/* compiled from: PG */
/* renamed from: ctto  reason: default package */
/* loaded from: classes5.dex */
public final class ctto {
    public final Context a;
    final BroadcastReceiver b;
    public final dyeu c;

    public ctto(Context context, aqan aqanVar, cuim cuimVar) {
        csvo a = csvo.a(context);
        String a2 = dxzs.a.a().a();
        dbsg dbsgVar = a.b;
        csvo a3 = csvo.a(context);
        long b = dxzs.a.a().b();
        dbsg dbsgVar2 = a3.b;
        int i = (int) b;
        cuimVar = true != cswe.a(context).ap.f().booleanValue() ? null : cuimVar;
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 54);
        sb.append("tachyonHostName = ");
        sb.append(a2);
        sb.append(" and tachyonPortNumber = ");
        sb.append(i);
        sb.toString();
        cstl.a("StubFactory");
        this.c = ((cuimVar == null || !cswe.a(context).ap.f().booleanValue()) ? new ctsz() : cuimVar).a(context, aqanVar, a2, i);
        this.a = context;
        cttn cttnVar = new cttn(this);
        this.b = cttnVar;
        context.registerReceiver(cttnVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public final dehn<ctsu<dxtm>> a() {
        return deha.a(new ctst((dxtm) dxtm.e(new dxtl(), this.c)));
    }

    public final dehn<ctsu<dxti>> b() {
        return deha.a(new ctst((dxti) dxti.e(new dxth(), this.c)));
    }

    public final dehn<ctsu<dxjm>> c() {
        return deha.a(new ctst((dxjm) dxjm.e(new dxjl(), this.c)));
    }

    public final dehn<ctsu<dxpk>> d() {
        return deha.a(new ctst((dxpk) dxpk.e(new dxpj(), this.c)));
    }

    public final dehn<ctsu<dxkb>> e() {
        return deha.a(new ctst((dxkb) dxkb.e(new dxka(), this.c)));
    }

    public final dehn<ctsu<dxlj>> f() {
        return deha.a(new ctst((dxlj) dxlj.e(new dxli(), this.c)));
    }

    public final dehn<ctsu<dxta>> g() {
        return deha.a(new ctst((dxta) dxta.e(new dxsz(), this.c)));
    }
}
