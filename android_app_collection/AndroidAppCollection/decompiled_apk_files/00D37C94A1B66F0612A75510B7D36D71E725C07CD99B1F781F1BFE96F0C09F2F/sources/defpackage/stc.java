package defpackage;

import android.os.Looper;
/* compiled from: PG */
/* renamed from: stc  reason: default package */
/* loaded from: classes4.dex */
public final class stc implements tct {
    public final srr a;
    private final teb b;
    private final /* synthetic */ int c;

    public stc(srr srrVar, teb tebVar) {
        this.a = srrVar;
        this.b = tebVar;
    }

    public stc(srr srrVar, teb tebVar, int i) {
        this.c = i;
        this.a = srrVar;
        this.b = tebVar;
    }

    @Override // defpackage.tct
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.tct
    public final aooq a() {
        if (this.c == 0) {
            return awsy.b;
        }
        return awsq.b;
    }

    @Override // defpackage.tct
    public final /* bridge */ /* synthetic */ aynr b(Object obj, final tcs tcsVar) {
        if (this.c == 0) {
            final awsy awsyVar = (awsy) obj;
            if ((awsyVar.c & 4) == 0) {
                this.b.c(23, "UpdateActionSheetCommand needs to have a sheet id.", tcsVar.i);
                return aynr.f();
            }
            aynr t = aynr.t(new aypv() { // from class: stb
                @Override // defpackage.aypv
                public final void a() {
                    stc stcVar = stc.this;
                    stcVar.a.e(awsyVar);
                }
            });
            return Looper.myLooper() == Looper.getMainLooper() ? t.E(aypa.a()) : t;
        }
        final awsq awsqVar = (awsq) obj;
        if (awsqVar.f.size() > 0 || (awsqVar.c & 4) != 0) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.a.d(awsqVar, tcsVar);
                return aynr.f();
            }
            return aynr.t(new aypv(awsqVar, tcsVar, null) { // from class: sso
                public final /* synthetic */ awsq a;
                public final /* synthetic */ tcs b;

                @Override // defpackage.aypv
                public final void a() {
                    stc stcVar = stc.this;
                    stcVar.a.d(this.a, this.b);
                }
            }).E(aypa.a());
        }
        this.b.c(23, "ShowActionSheetCommand needs to have at least one list option if there is no sheet id.", tcsVar.i);
        return aynr.f();
    }
}
