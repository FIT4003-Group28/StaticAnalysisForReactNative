package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: zoz  reason: default package */
/* loaded from: classes7.dex */
class zoz implements zet {
    final /* synthetic */ zpe a;

    public zoz(zpe zpeVar) {
        this.a = zpeVar;
    }

    @Override // defpackage.zet
    public Boolean a() {
        doxp doxpVar = this.a.d;
        boolean z = false;
        if (doxpVar != null) {
            dqtz b = dqtz.b(doxpVar.c);
            if (b == null) {
                b = dqtz.UNKNOWN_FARE;
            }
            if (b == dqtz.IC_FARE) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zet
    @dzsi
    public String b() {
        zpe zpeVar = this.a;
        if (zpeVar.d != null) {
            if (zpeVar.A()) {
                dquj dqujVar = this.a.d.d;
                if (dqujVar == null) {
                    dqujVar = dquj.f;
                }
                return dqujVar.d;
            }
            dquh dquhVar = this.a.d.b;
            if (dquhVar == null) {
                dquhVar = dquh.c;
            }
            return dquhVar.b;
        }
        return null;
    }

    @Override // defpackage.zet
    @dzsi
    public String c() {
        zpe zpeVar = this.a;
        if (zpeVar.d != null) {
            if (!zpeVar.A()) {
                dquh dquhVar = this.a.d.b;
                if (dquhVar == null) {
                    dquhVar = dquh.c;
                }
                return dquhVar.b;
            }
            Resources resources = this.a.m.getResources();
            dquj dqujVar = this.a.d.d;
            if (dqujVar == null) {
                dqujVar = dquj.f;
            }
            return vxc.b(resources, dqujVar).toString();
        }
        return null;
    }

    @Override // defpackage.zet
    public Boolean d() {
        return Boolean.valueOf(this.a.d != null);
    }
}
