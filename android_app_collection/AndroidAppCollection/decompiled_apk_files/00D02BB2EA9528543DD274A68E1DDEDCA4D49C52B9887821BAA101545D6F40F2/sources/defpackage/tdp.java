package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: tdp  reason: default package */
/* loaded from: classes7.dex */
public class tdp extends tdz implements tdd {
    private final tak a;
    private final twa b;
    @dzsi
    private final taj c;
    @dzsi
    private final zbi d;
    private final CharSequence e;

    public tdp(Activity activity, cqhn cqhnVar, vtn vtnVar, tam tamVar, tao taoVar, zgv zgvVar, tlv tlvVar, amve amveVar) {
        CharSequence h;
        this.b = new tap(activity, amveVar);
        this.a = taoVar.a(amveVar);
        if (tlvVar.d().a()) {
            h = stf.d(activity);
        } else {
            h = stf.h(activity, vtnVar, amveVar);
        }
        this.e = h;
        dozy b = dozy.b(amveVar.q().f);
        tal talVar = null;
        this.d = (b == null ? dozy.UNKNOWN : b) == dozy.CRISIS ? zgvVar.a(amveVar.q()) : null;
        tal a = tamVar.a(tlvVar, amveVar);
        this.c = true != dbsj.d(a.a()) ? a : talVar;
    }

    @Override // defpackage.tdd
    public CharSequence a() {
        return this.e;
    }

    @Override // defpackage.tdd
    @dzsi
    public taj b() {
        return this.c;
    }

    @Override // defpackage.tdd
    public tak c() {
        return this.a;
    }

    @Override // defpackage.tdd
    public twa d() {
        return this.b;
    }

    @Override // defpackage.tdd
    @dzsi
    public zbi e() {
        return this.d;
    }

    @Override // defpackage.tdz, defpackage.tdh
    public Boolean i() {
        return Boolean.valueOf(b() != null);
    }
}
