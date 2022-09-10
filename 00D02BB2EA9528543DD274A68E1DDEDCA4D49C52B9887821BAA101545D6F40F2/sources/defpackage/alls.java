package defpackage;

import java.util.concurrent.atomic.AtomicLong;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alls  reason: default package */
/* loaded from: classes.dex */
public final class alls extends alow implements aktg {
    public final alrv a;
    boolean b;
    private final dmqx h;

    public alls(alrv alrvVar, alrk alrkVar, dmqx dmqxVar, int i) {
        super(alrkVar, alxs.e(dmqxVar, new AtomicLong(i)), i);
        this.b = false;
        this.a = alrvVar;
        this.h = dmqxVar;
    }

    @Override // defpackage.alow, defpackage.akuh
    public final int a() {
        synchronized (this) {
            if (this.b) {
                return -1;
            }
            return this.f;
        }
    }

    @Override // defpackage.alow, defpackage.akuh
    public final dmqx d() {
        return this.h;
    }

    @Override // defpackage.alow, defpackage.akuh
    public final dmpc e() {
        dmpc dmpcVar = (dmpc) dmpd.h.bZ();
        int a = a();
        if (dmpcVar.c) {
            dmpcVar.bF();
            dmpcVar.c = false;
        }
        dmpd dmpdVar = (dmpd) dmpcVar.b;
        dmpdVar.a |= 2;
        dmpdVar.c = a;
        return dmpcVar;
    }

    @Override // defpackage.alow, defpackage.akuh
    public final dmpe f() {
        dmpe dmpeVar = (dmpe) dmph.f.bZ();
        int a = a();
        if (dmpeVar.c) {
            dmpeVar.bF();
            dmpeVar.c = false;
        }
        dmph dmphVar = (dmph) dmpeVar.b;
        dmphVar.a |= 1;
        dmphVar.c = a;
        return dmpeVar;
    }

    @Override // defpackage.alow, defpackage.akuh
    public final dmpk g() {
        dmpk dmpkVar = (dmpk) dmpn.r.bZ();
        int a = a();
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar = (dmpn) dmpkVar.b;
        dmpnVar.a |= 2048;
        dmpnVar.k = a;
        return dmpkVar;
    }

    @Override // defpackage.alow
    public final void h() {
        synchronized (this) {
            this.b = true;
        }
    }

    @Override // defpackage.alow
    public final alxp i() {
        synchronized (this) {
            if (this.b) {
                return alxp.e;
            }
            return super.i();
        }
    }
}
