package defpackage;

import com.google.android.apps.gmm.locationsharing.api.Profile;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahux  reason: default package */
/* loaded from: classes2.dex */
public final class ahux extends ahwm {
    private Profile a;
    private doep b;
    private dbsg<ahvj> c;
    private Long d;
    private Long e;
    private Long f;
    private dcdc<dqzv> g;
    private Boolean h;
    private Boolean i;
    private Boolean j;
    private Long k;
    private Boolean l;
    private dbsg<String> m;

    public ahux() {
        this.c = dbpy.a;
        this.m = dbpy.a;
    }

    public ahux(ahwn ahwnVar) {
        this.c = dbpy.a;
        this.m = dbpy.a;
        this.a = ahwnVar.a();
        this.b = ahwnVar.b();
        this.c = ahwnVar.c();
        this.d = Long.valueOf(ahwnVar.d());
        this.e = Long.valueOf(ahwnVar.e());
        this.f = Long.valueOf(ahwnVar.f());
        this.g = ahwnVar.g();
        this.h = Boolean.valueOf(ahwnVar.h());
        this.i = Boolean.valueOf(ahwnVar.i());
        this.j = Boolean.valueOf(ahwnVar.j());
        this.k = Long.valueOf(ahwnVar.k());
        this.l = Boolean.valueOf(ahwnVar.l());
        this.m = ahwnVar.m();
    }

    @Override // defpackage.ahwm
    public final void b(boolean z) {
        this.j = Boolean.valueOf(z);
    }

    @Override // defpackage.ahwm
    public final void c(long j) {
        this.f = Long.valueOf(j);
    }

    @Override // defpackage.ahwm
    public final void d(boolean z) {
        this.i = Boolean.valueOf(z);
    }

    @Override // defpackage.ahwm
    public final void e(dbsg<ahvj> dbsgVar) {
        if (dbsgVar != null) {
            this.c = dbsgVar;
            return;
        }
        throw new NullPointerException("Null journey");
    }

    @Override // defpackage.ahwm
    public final void f(long j) {
        this.k = Long.valueOf(j);
    }

    @Override // defpackage.ahwm
    public final void g(long j) {
        this.d = Long.valueOf(j);
    }

    @Override // defpackage.ahwm
    public final void h(long j) {
        this.e = Long.valueOf(j);
    }

    @Override // defpackage.ahwm
    public final void i(dbsg<String> dbsgVar) {
        this.m = dbsgVar;
    }

    @Override // defpackage.ahwm
    public final void j(Profile profile) {
        if (profile != null) {
            this.a = profile;
            return;
        }
        throw new NullPointerException("Null profile");
    }

    @Override // defpackage.ahwm
    public final void k(dcdc<dqzv> dcdcVar) {
        if (dcdcVar != null) {
            this.g = dcdcVar;
            return;
        }
        throw new NullPointerException("Null shareAcls");
    }

    @Override // defpackage.ahwm
    public final void l(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    @Override // defpackage.ahwm
    public final void m(doep doepVar) {
        if (doepVar != null) {
            this.b = doepVar;
            return;
        }
        throw new NullPointerException("Null sharedUserLocation");
    }

    @Override // defpackage.ahwm
    public final void n(boolean z) {
        this.l = Boolean.valueOf(z);
    }

    @Override // defpackage.ahwm
    public final ahwn a() {
        String str = this.a == null ? " profile" : "";
        if (this.b == null) {
            str = str.concat(" sharedUserLocation");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" lastShareAclModificationTimestampMs");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" lastSharingActivityTimestampMs");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" batteryStateUpdatedTimestampMs");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" shareAcls");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" shareReadOnly");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" hasChangingShareAcl");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" askForLocationInProgress");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" lastAskForLocationTimestampMs");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" sharing");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new ahve(this.a, this.b, this.c, this.d.longValue(), this.e.longValue(), this.f.longValue(), this.g, this.h.booleanValue(), this.i.booleanValue(), this.j.booleanValue(), this.k.longValue(), this.l.booleanValue(), this.m);
    }
}
