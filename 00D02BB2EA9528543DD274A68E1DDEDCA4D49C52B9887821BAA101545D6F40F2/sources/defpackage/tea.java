package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: tea  reason: default package */
/* loaded from: classes7.dex */
public class tea extends tdz implements tdi {
    private final tak a;
    private final twa b;
    @dzsi
    private final taj c;
    @dzsi
    private final zbi d;
    private final CharSequence e;

    public tea(Activity activity, cqhn cqhnVar, vtn vtnVar, tam tamVar, tao taoVar, zgv zgvVar, tlv tlvVar, amve amveVar) {
        this.b = new tap(activity, amveVar);
        this.a = taoVar.a(amveVar);
        this.e = stf.h(activity, vtnVar, amveVar);
        dozy b = dozy.b(amveVar.q().f);
        tal talVar = null;
        this.d = (b == null ? dozy.UNKNOWN : b) == dozy.CRISIS ? zgvVar.a(amveVar.q()) : null;
        tal a = tamVar.a(tlvVar, amveVar);
        this.c = true != dbsj.d(a.a()) ? a : talVar;
    }

    @Override // defpackage.tdi
    public CharSequence a() {
        return this.e;
    }

    @Override // defpackage.tdi
    @dzsi
    public taj b() {
        return this.c;
    }

    @Override // defpackage.tdi
    public tak c() {
        return this.a;
    }

    @Override // defpackage.tdi
    public twa d() {
        return this.b;
    }

    @Override // defpackage.tdi
    @dzsi
    public zbi e() {
        return this.d;
    }

    @Override // defpackage.tdz, defpackage.tdh
    public Boolean i() {
        return Boolean.valueOf(b() != null);
    }
}
