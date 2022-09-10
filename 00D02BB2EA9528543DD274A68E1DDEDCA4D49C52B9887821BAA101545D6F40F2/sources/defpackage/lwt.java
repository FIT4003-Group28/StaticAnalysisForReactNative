package defpackage;

import android.content.res.Resources;
import android.view.View;
/* compiled from: PG */
/* renamed from: lwt  reason: default package */
/* loaded from: classes7.dex */
public class lwt extends atcy implements asuq {
    @dzsi
    private atlq a;
    @dzsi
    private asuu c;
    private final Resources d;

    public lwt(Resources resources, atcu atcuVar, atcw atcwVar) {
        super(atcuVar, atcwVar);
        this.d = resources;
    }

    @Override // defpackage.atcv
    public void Oc(atlq atlqVar, @dzsi atlq atlqVar2) {
        if (!atlqVar.b()) {
            return;
        }
        this.a = atlqVar;
    }

    @Override // defpackage.asuq
    public Boolean h() {
        atlq atlqVar = this.a;
        boolean z = false;
        if (atlqVar != null && atlqVar.a()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.asuq
    public Boolean i() {
        return true;
    }

    @Override // defpackage.asuq
    public Boolean j() {
        return false;
    }

    @Override // defpackage.asuq
    @dzsi
    public String k() {
        return null;
    }

    @Override // defpackage.asuq
    @dzsi
    public asup l() {
        return null;
    }

    @Override // defpackage.asuq
    public cqkl m() {
        Qq().m();
        return cqkl.a;
    }

    @Override // defpackage.asuq
    @dzsi
    public cjtd n() {
        return cjtd.a(dtxm.cl);
    }

    @Override // defpackage.asuq
    public Boolean o() {
        return false;
    }

    @Override // defpackage.asuq
    @dzsi
    public asuv p() {
        return null;
    }

    @Override // defpackage.asuq
    public Boolean q() {
        return false;
    }

    @Override // defpackage.asuq
    @dzsi
    public audn r() {
        return null;
    }

    @Override // defpackage.asuq
    public Boolean s() {
        return false;
    }

    @Override // defpackage.asuq
    public Boolean t() {
        return false;
    }

    @Override // defpackage.asuq
    public cqkl u() {
        return cqkl.a;
    }

    @Override // defpackage.asuq
    @dzsi
    public View.OnLayoutChangeListener v() {
        return null;
    }

    @Override // defpackage.asuq
    public asuu w() {
        if (this.c == null) {
            this.c = new asud(this.d, new Runnable(this) { // from class: lws
                private final lwt a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.x();
                }
            }, dtxm.ci);
        }
        return this.c;
    }

    public cqkl x() {
        this.b.x();
        this.b.v();
        return cqkl.a;
    }

    @Override // defpackage.asuq
    public Boolean y() {
        return false;
    }

    @Override // defpackage.asuq
    public Float z() {
        return Float.valueOf(0.0f);
    }
}
