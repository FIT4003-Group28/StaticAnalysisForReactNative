package defpackage;

import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: PG */
/* renamed from: aacr  reason: default package */
/* loaded from: classes.dex */
public final class aacr {
    public axnm a;
    public boolean b = false;
    public boolean c = false;
    private final azqb d;
    private final aacz e;

    public aacr(aacz aaczVar, azqb azqbVar) {
        this.e = aaczVar;
        this.d = azqbVar;
    }

    public final void a() {
        apyy b;
        if (this.b) {
            return;
        }
        if (((Integer) this.d.get()).intValue() >= 16200000 && (b = this.e.b()) != null) {
            aqyn aqynVar = b.A;
            if (aqynVar == null) {
                aqynVar = aqyn.a;
            }
            if (aqynVar.b) {
                ((FirebaseAnalytics) this.a.get()).a(true);
                this.c = true;
                zep.g("FirebaseAnalytics initialization successful");
                this.b = true;
            }
        }
        ((FirebaseAnalytics) this.a.get()).a(false);
        this.b = true;
    }
}
