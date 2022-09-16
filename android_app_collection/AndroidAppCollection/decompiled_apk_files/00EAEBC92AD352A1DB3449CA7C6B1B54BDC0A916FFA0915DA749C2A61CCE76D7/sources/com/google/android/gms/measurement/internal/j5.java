package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import c.e.a.b.d.g.hb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
/* loaded from: classes.dex */
public final class j5 extends u3 {

    /* renamed from: a  reason: collision with root package name */
    private final r9 f7390a;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f7391b;

    /* renamed from: c  reason: collision with root package name */
    private String f7392c;

    public j5(r9 r9Var) {
        this(r9Var, null);
    }

    private j5(r9 r9Var, String str) {
        com.google.android.gms.common.internal.s.a(r9Var);
        this.f7390a = r9Var;
        this.f7392c = null;
    }

    private final void a(Runnable runnable) {
        com.google.android.gms.common.internal.s.a(runnable);
        if (this.f7390a.a().s()) {
            runnable.run();
        } else {
            this.f7390a.a().a(runnable);
        }
    }

    private final void a(String str, boolean z) {
        boolean z2;
        if (TextUtils.isEmpty(str)) {
            this.f7390a.c().s().a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.f7391b == null) {
                    if (!"com.google.android.gms".equals(this.f7392c) && !com.google.android.gms.common.util.o.a(this.f7390a.d(), Binder.getCallingUid()) && !com.google.android.gms.common.j.a(this.f7390a.d()).a(Binder.getCallingUid())) {
                        z2 = false;
                        this.f7391b = Boolean.valueOf(z2);
                    }
                    z2 = true;
                    this.f7391b = Boolean.valueOf(z2);
                }
                if (this.f7391b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e2) {
                this.f7390a.c().s().a("Measurement Service called with invalid calling package. appId", z3.a(str));
                throw e2;
            }
        }
        if (this.f7392c == null && com.google.android.gms.common.i.a(this.f7390a.d(), Binder.getCallingUid(), str)) {
            this.f7392c = str;
        }
        if (str.equals(this.f7392c)) {
            return;
        }
        throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
    }

    private final void b(fa faVar, boolean z) {
        com.google.android.gms.common.internal.s.a(faVar);
        a(faVar.f7303b, false);
        this.f7390a.n().a(faVar.f7304c, faVar.s, faVar.w);
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final List<y9> a(fa faVar, boolean z) {
        b(faVar, false);
        try {
            List<aa> list = (List) this.f7390a.a().a(new u5(this, faVar)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (aa aaVar : list) {
                if (z || !z9.f(aaVar.f7175c)) {
                    arrayList.add(new y9(aaVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.f7390a.c().s().a("Failed to get user properties. appId", z3.a(faVar.f7303b), e2);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final List<oa> a(String str, String str2, fa faVar) {
        b(faVar, false);
        try {
            return (List) this.f7390a.a().a(new p5(this, faVar, str, str2)).get();
        } catch (InterruptedException | ExecutionException e2) {
            this.f7390a.c().s().a("Failed to get conditional user properties", e2);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final List<oa> a(String str, String str2, String str3) {
        a(str, true);
        try {
            return (List) this.f7390a.a().a(new o5(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e2) {
            this.f7390a.c().s().a("Failed to get conditional user properties as", e2);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final List<y9> a(String str, String str2, String str3, boolean z) {
        a(str, true);
        try {
            List<aa> list = (List) this.f7390a.a().a(new m5(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (aa aaVar : list) {
                if (z || !z9.f(aaVar.f7175c)) {
                    arrayList.add(new y9(aaVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.f7390a.c().s().a("Failed to get user properties as. appId", z3.a(str), e2);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final List<y9> a(String str, String str2, boolean z, fa faVar) {
        b(faVar, false);
        try {
            List<aa> list = (List) this.f7390a.a().a(new n5(this, faVar, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (aa aaVar : list) {
                if (z || !z9.f(aaVar.f7175c)) {
                    arrayList.add(new y9(aaVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.f7390a.c().s().a("Failed to query user properties. appId", z3.a(faVar.f7303b), e2);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void a(long j, String str, String str2, String str3) {
        a(new w5(this, str2, str3, str, j));
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void a(final Bundle bundle, final fa faVar) {
        if (!hb.a() || !this.f7390a.f().a(r.O0)) {
            return;
        }
        b(faVar, false);
        a(new Runnable(this, faVar, bundle) { // from class: com.google.android.gms.measurement.internal.i5

            /* renamed from: b  reason: collision with root package name */
            private final j5 f7359b;

            /* renamed from: c  reason: collision with root package name */
            private final fa f7360c;

            /* renamed from: d  reason: collision with root package name */
            private final Bundle f7361d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f7359b = this;
                this.f7360c = faVar;
                this.f7361d = bundle;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f7359b.a(this.f7360c, this.f7361d);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void a(fa faVar) {
        b(faVar, false);
        a(new x5(this, faVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(fa faVar, Bundle bundle) {
        this.f7390a.i().a(faVar.f7303b, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void a(oa oaVar) {
        com.google.android.gms.common.internal.s.a(oaVar);
        com.google.android.gms.common.internal.s.a(oaVar.f7564d);
        a(oaVar.f7562b, true);
        a(new k5(this, new oa(oaVar)));
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void a(oa oaVar, fa faVar) {
        com.google.android.gms.common.internal.s.a(oaVar);
        com.google.android.gms.common.internal.s.a(oaVar.f7564d);
        b(faVar, false);
        oa oaVar2 = new oa(oaVar);
        oaVar2.f7562b = faVar.f7303b;
        a(new z5(this, oaVar2, faVar));
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void a(p pVar, fa faVar) {
        com.google.android.gms.common.internal.s.a(pVar);
        b(faVar, false);
        a(new q5(this, pVar, faVar));
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void a(p pVar, String str, String str2) {
        com.google.android.gms.common.internal.s.a(pVar);
        com.google.android.gms.common.internal.s.b(str);
        a(str, true);
        a(new t5(this, pVar, str));
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void a(y9 y9Var, fa faVar) {
        com.google.android.gms.common.internal.s.a(y9Var);
        b(faVar, false);
        a(new v5(this, y9Var, faVar));
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final byte[] a(p pVar, String str) {
        com.google.android.gms.common.internal.s.b(str);
        com.google.android.gms.common.internal.s.a(pVar);
        a(str, true);
        this.f7390a.c().A().a("Log and bundle. event", this.f7390a.m().a(pVar.f7569b));
        long c2 = this.f7390a.b().c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f7390a.a().b(new s5(this, pVar, str)).get();
            if (bArr == null) {
                this.f7390a.c().s().a("Log and bundle returned null. appId", z3.a(str));
                bArr = new byte[0];
            }
            this.f7390a.c().A().a("Log and bundle processed. event, size, time_ms", this.f7390a.m().a(pVar.f7569b), Integer.valueOf(bArr.length), Long.valueOf((this.f7390a.b().c() / 1000000) - c2));
            return bArr;
        } catch (InterruptedException | ExecutionException e2) {
            this.f7390a.c().s().a("Failed to log and bundle. appId, event, error", z3.a(str), this.f7390a.m().a(pVar.f7569b), e2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final p b(p pVar, fa faVar) {
        o oVar;
        boolean z = false;
        if ("_cmp".equals(pVar.f7569b) && (oVar = pVar.f7570c) != null && oVar.f() != 0) {
            String d2 = pVar.f7570c.d("_cis");
            if (!TextUtils.isEmpty(d2) && (("referrer broadcast".equals(d2) || "referrer API".equals(d2)) && this.f7390a.f().e(faVar.f7303b, r.S))) {
                z = true;
            }
        }
        if (z) {
            this.f7390a.c().z().a("Event has been filtered ", pVar.toString());
            return new p("_cmpx", pVar.f7570c, pVar.f7571d, pVar.f7572e);
        }
        return pVar;
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void b(fa faVar) {
        b(faVar, false);
        a(new l5(this, faVar));
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final String c(fa faVar) {
        b(faVar, false);
        return this.f7390a.d(faVar);
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void d(fa faVar) {
        a(faVar.f7303b, false);
        a(new r5(this, faVar));
    }
}
