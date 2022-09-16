package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bpce  reason: default package */
/* loaded from: classes3.dex */
public class bpce extends bpbx implements bpvs {
    final bnyn<dwbw, dwby> a;
    private final bowz b;
    private final bpbw c;
    private final bnyo d;
    private final bpsw e;
    private final dkyr f;
    private final bwqv g;
    private boolean h;
    private boolean i;
    private final Context j;

    public bpce(Context context, bpbw bpbwVar, bowy bowyVar, int i, int i2, dkyr dkyrVar, bwqv bwqvVar, bnyo bnyoVar, bpsw bpswVar) {
        super(context, bowyVar, i, i2, dtya.ar);
        this.h = false;
        this.i = false;
        this.a = new bpcd(this);
        this.c = bpbwVar;
        this.b = bowyVar.a;
        this.d = bnyoVar;
        this.e = bpswVar;
        this.f = dkyrVar;
        this.g = bwqvVar;
        this.j = context;
    }

    @Override // defpackage.bpbx, defpackage.bpvp
    public bpvo a() {
        return bpvo.PLACE_MOVED;
    }

    @Override // defpackage.bpvs
    public Boolean f() {
        return Boolean.valueOf(this.f.i());
    }

    @Override // defpackage.bpvs
    @dzsi
    public String g() {
        return this.b.a;
    }

    @Override // defpackage.bpvs
    public Boolean h() {
        return Boolean.valueOf(i() == null);
    }

    @Override // defpackage.bpvs
    @dzsi
    public akqq i() {
        return this.b.b;
    }

    @Override // defpackage.bpvs
    public Boolean j() {
        boolean z = false;
        if (g() != null && i() == null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bpvs
    public cqkl k() {
        if (!this.c.aD) {
            return cqkl.a;
        }
        bxko bxkoVar = new bxko();
        bxkoVar.c(bxla.PLACE_MOVED);
        bxkoVar.e(g());
        bxkoVar.q(false);
        bxkoVar.s(true);
        this.c.aZ(bxel.bt(this.g, bxkoVar, this.c));
        return cqkl.a;
    }

    @Override // defpackage.bpvs
    public cqkl m() {
        if (!this.c.aD) {
            return cqkl.a;
        }
        aneb z = anee.z();
        z.r(this.j.getResources().getString(R.string.FEATURE_SELECTION_HINT_REPORT_A_PROBLEM_PLACE_MOVED));
        this.c.aZ(andr.bt(i(), true, false, dosc.TYPE_REPORT_LOCAL_ISSUE, z.a()));
        return cqkl.a;
    }

    @Override // defpackage.bpvs
    public void n(akqq akqqVar, boolean z) {
        if (z) {
            this.i = true;
        } else if (this.i) {
            return;
        }
        this.b.b = akqqVar;
        cqkx.p(this);
    }

    @Override // defpackage.bpvs
    public cqkl l(CharSequence charSequence, boolean z) {
        if (z || !this.h) {
            String charSequence2 = charSequence.toString();
            this.b.a = charSequence2;
            if (z) {
                bnyo bnyoVar = this.d;
                bpsw bpswVar = this.e;
                dwbv bZ = dwbw.d.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dwbw dwbwVar = (dwbw) bZ.b;
                charSequence2.getClass();
                dwbwVar.a |= 1;
                dwbwVar.b = charSequence2;
                dhjx Z = bpswVar.a.Z();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dwbw dwbwVar2 = (dwbw) bZ.b;
                Z.getClass();
                dwbwVar2.c = Z;
                dwbwVar2.a |= 2;
                bnyoVar.a(bZ.bK(), this.a);
                this.h = true;
            }
            cqkx.p(this);
            return cqkl.a;
        }
        return cqkl.a;
    }
}
