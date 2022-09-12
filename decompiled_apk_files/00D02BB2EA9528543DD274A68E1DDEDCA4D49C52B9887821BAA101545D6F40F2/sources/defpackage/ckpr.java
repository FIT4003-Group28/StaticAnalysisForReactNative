package defpackage;

import android.app.Activity;
import android.app.Application;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: PG */
/* renamed from: ckpr  reason: default package */
/* loaded from: classes.dex */
public final class ckpr implements ckov {
    public final ConcurrentHashMap<ckpa, ckoy> a = new ConcurrentHashMap<>();
    public final ConcurrentMap<Activity, ConcurrentMap<ckow, List<ckoy>>> b;
    public final ConcurrentMap<fd, ckoy> c;
    public final ConcurrentMap<fd, ckoy> d;
    public final ConcurrentMap<fd, ckoy> e;
    public final Application.ActivityLifecycleCallbacks f;
    public final gh g;
    public final ckpo h;
    public final Application i;
    public final ckcw j;
    public final ckpj k;
    boolean l;

    public ckpr(Application application, ckcw ckcwVar, ckpj ckpjVar) {
        dchm dchmVar = new dchm();
        dchmVar.i();
        this.b = dchmVar.e();
        dchm dchmVar2 = new dchm();
        dchmVar2.i();
        this.c = dchmVar2.e();
        dchm dchmVar3 = new dchm();
        dchmVar3.i();
        this.d = dchmVar3.e();
        dchm dchmVar4 = new dchm();
        dchmVar4.i();
        this.e = dchmVar4.e();
        this.f = new ckpp(this);
        this.g = new ckpq(this);
        this.h = new ckpo(this);
        this.l = false;
        this.i = application;
        this.j = ckcwVar;
        this.k = ckpjVar;
    }

    @dzsi
    public static ddho c(fd fdVar) {
        if (fdVar instanceof cjtg) {
            return ((cjtg) fdVar).a();
        }
        if (!(fdVar instanceof cjsf)) {
            return null;
        }
        return ((cjsf) fdVar).aP().a();
    }

    @Override // defpackage.ckov
    public final void a(int i) {
        Iterator<ckoy> it = this.a.values().iterator();
        while (it.hasNext()) {
            ckpt ckptVar = (ckpt) it.next();
            if (ckptVar.d) {
                eacj bZ = eacl.d.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                eacl eaclVar = (eacl) bZ.b;
                eaclVar.c = 1;
                int i2 = eaclVar.a | 2;
                eaclVar.a = i2;
                eaclVar.a = 1 | i2;
                eaclVar.b = i;
                ckptVar.c.add(bZ.bK());
            }
        }
    }

    @Override // defpackage.ckov
    @dzsi
    public final ckoy b(ckpa ckpaVar) {
        return this.a.get(ckpaVar);
    }
}
