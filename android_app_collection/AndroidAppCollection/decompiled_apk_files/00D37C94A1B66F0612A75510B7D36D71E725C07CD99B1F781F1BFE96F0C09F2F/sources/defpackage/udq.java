package defpackage;

import android.content.Intent;
import android.os.Bundle;
import java.util.Set;
/* compiled from: PG */
/* renamed from: udq  reason: default package */
/* loaded from: classes4.dex */
public final class udq implements udj, ujj {
    private final ucj a;
    private final ujo b;
    private final uie c;
    private final ujk d;
    private final Set e;
    private final ufa f;
    private final uiy g;
    private final ues h;

    public udq(ucj ucjVar, uiy uiyVar, ujo ujoVar, uie uieVar, ujk ujkVar, Set set, ues uesVar, ufa ufaVar) {
        this.a = ucjVar;
        this.g = uiyVar;
        this.b = ujoVar;
        this.c = uieVar;
        this.d = ujkVar;
        this.e = set;
        this.h = uesVar;
        this.f = ufaVar;
    }

    @Override // defpackage.udj
    public final /* synthetic */ int a(Intent intent) {
        return 10;
    }

    @Override // defpackage.udj
    public final void b(Intent intent, ubz ubzVar, long j) {
        aomi aomiVar;
        uev.e("RestartIntentHandler", "Re-surface notifications and sync registrations due to Restart Intent", new Object[0]);
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction()) && axqb.a.get().c()) {
            this.h.b(aojs.BOOT_COMPLETED).i();
        }
        if ("android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction()) && axqb.a.get().b()) {
            this.h.b(aojs.APP_UPDATED).i();
        }
        uck uckVar = this.a.d;
        if (uckVar != null) {
            int i = uckVar.m;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                this.b.b();
            } else if (i2 == 1) {
                if (axqq.a.get().d()) {
                    try {
                        this.d.a(null, 10, this, new Bundle());
                    } catch (uji unused) {
                        uev.g("RestartIntentHandler", "Unable to schedule task for refreshing notifications.", new Object[0]);
                    }
                } else {
                    this.b.a(ubzVar);
                }
            }
        }
        amzs it = ((amyg) this.e).iterator();
        while (it.hasNext()) {
            ((uih) it.next()).a();
        }
        if ("android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction())) {
            aomiVar = aomi.APP_UPDATED;
        } else {
            aomiVar = aomi.DEVICE_START;
        }
        this.g.a(aomiVar);
        this.c.a();
        this.f.a();
    }

    @Override // defpackage.udj
    public final boolean c(Intent intent) {
        return "android.intent.action.BOOT_COMPLETED".equals(intent.getAction()) || "android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction());
    }

    @Override // defpackage.ujj
    public final /* synthetic */ long d() {
        return 0L;
    }

    @Override // defpackage.ujj
    public final uby e(Bundle bundle) {
        this.b.a(ubz.b());
        return uby.a;
    }

    @Override // defpackage.ujj
    public final String f() {
        return "restart_job_handler_key";
    }

    @Override // defpackage.ujj
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // defpackage.ujj
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.ujj
    public final /* synthetic */ void i() {
    }
}
