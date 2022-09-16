package defpackage;

import android.os.Bundle;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cjbs  reason: default package */
/* loaded from: classes4.dex */
public class cjbs implements cjbq {
    private boolean a = false;
    private final gga b;
    private final cjbr c;
    private final dbty<Boolean> d;
    private gen e;

    public cjbs(gga ggaVar, cqhn cqhnVar, cjbr cjbrVar, dbty<Boolean> dbtyVar) {
        this.b = ggaVar;
        this.c = cjbrVar;
        this.d = dbtyVar;
    }

    @Override // defpackage.cjbq
    public Boolean a() {
        boolean z = false;
        if (!this.a && this.d.a().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cjbq
    public CharSequence b() {
        return this.b.getString(R.string.DEPARTURE_BOARD_FEEDBACK_SATISFACTION_QUESTION);
    }

    @Override // defpackage.cjbq
    public CharSequence c() {
        return this.b.getString(R.string.DEPARTURE_BOARD_FEEDBACK_SUBTITLE);
    }

    @Override // defpackage.cjbq
    public cqkl d() {
        this.a = true;
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.cjbq
    public cqkl e() {
        gen genVar = this.e;
        if (genVar == null || !genVar.aU()) {
            didr a = this.c.a();
            Bundle bundle = new Bundle();
            dsuv.d(bundle, "DEPARTURE_BOARD_CONTEXT_KEY", a);
            cjba cjbaVar = new cjba();
            cjbaVar.B(bundle);
            this.e = cjbaVar;
            this.b.D(cjbaVar);
            this.a = true;
            cqkx.p(this);
            return cqkl.a;
        }
        return cqkl.a;
    }

    @Override // defpackage.cjbq
    public cjtd f() {
        return cjtd.a(dtyc.eV);
    }

    @Override // defpackage.cjbq
    public cjtd g() {
        return cjtd.a(dtyc.eW);
    }
}
