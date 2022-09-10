package defpackage;

import android.app.Application;
import java.util.Random;
/* compiled from: PG */
/* renamed from: htw */
/* loaded from: classes.dex */
public final class htw {
    public final Application a;
    public final eeu b;
    public final bvjj c;
    public final bttf d;
    public final btvo e;
    public final ckcw f;
    public final bvkx g;
    public final bwqv h;
    public final dxio<huz> i;
    public final dxio<hva> j;
    private final cjqy k;
    private final Random l;
    private final dxio<aujo> m;

    public htw(Application application, eeu eeuVar, bvjj bvjjVar, bttf bttfVar, btvo btvoVar, cjqy cjqyVar, ckcw ckcwVar, bvkx bvkxVar, bwqv bwqvVar, Random random, dxio<huz> dxioVar, dxio<hva> dxioVar2, dxio<aujo> dxioVar3) {
        this.a = application;
        this.b = eeuVar;
        this.c = bvjjVar;
        this.d = bttfVar;
        this.e = btvoVar;
        this.k = cjqyVar;
        this.f = ckcwVar;
        this.g = bvkxVar;
        this.h = bwqvVar;
        this.i = dxioVar;
        this.j = dxioVar2;
        this.l = random;
        this.m = dxioVar3;
    }

    public static /* synthetic */ void d(htw htwVar, dukj dukjVar, ddkk ddkkVar, ddou ddouVar) {
        htwVar.a(dukjVar, null, null, ddkkVar, null, ddouVar);
    }

    public final void a(dukj dukjVar, @dzsi String str, @dzsi String str2, @dzsi ddkk ddkkVar, @dzsi ddkq ddkqVar, @dzsi ddou ddouVar) {
        this.k.R(dukjVar, str, str2, ddkkVar, ddkqVar, ddouVar);
        if (dukjVar == dukj.APP_STARTED_COLD) {
            this.f.q();
        }
    }

    @dzsi
    public final ddkk b() {
        if ((this.e.getUserPreferencesLoggingParameters().a & 1) != 0) {
            if (this.l.nextDouble() >= this.e.getUserPreferencesLoggingParameters().b) {
                return null;
            }
            return (ddkk) this.h.j(bwrj.USER_PREFERENCES, (dssr) ddkk.C.cu(7));
        }
        return null;
    }

    @dzsi
    public final ddou c(dukj dukjVar) {
        aujo a;
        if ((this.e.getLoggingParameters().g && dukjVar != dukj.RUNNING) || (a = this.m.a()) == null) {
            return null;
        }
        return a.d();
    }
}
