package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bnqr  reason: default package */
/* loaded from: classes3.dex */
public class bnqr implements bnqn {
    private final Resources a;
    private final dpca b;
    private final bnqu c;
    private final String d;
    private final dpjn e;

    public bnqr(Resources resources, dpca dpcaVar, dpjn dpjnVar, String str, bnqu bnquVar) {
        this.a = resources;
        this.b = dpcaVar;
        this.c = bnquVar;
        this.d = str;
        this.e = dpjnVar;
    }

    @Override // defpackage.bnqn
    public cqkl a(cjqm cjqmVar) {
        bnqu bnquVar = this.c;
        dpjx dpjxVar = this.e.b;
        if (dpjxVar == null) {
            dpjxVar = dpjx.n;
        }
        dpjx dpjxVar2 = this.b.c;
        if (dpjxVar2 == null) {
            dpjxVar2 = dpjx.n;
        }
        bnquVar.g(dpjxVar, dpjxVar2, cjqmVar, true);
        return cqkl.a;
    }

    @Override // defpackage.bnqn
    public cqkl b(cjqm cjqmVar) {
        bnqu bnquVar = this.c;
        dpjx dpjxVar = this.e.b;
        if (dpjxVar == null) {
            dpjxVar = dpjx.n;
        }
        dpjx dpjxVar2 = this.b.c;
        if (dpjxVar2 == null) {
            dpjxVar2 = dpjx.n;
        }
        bnquVar.g(dpjxVar, dpjxVar2, cjqmVar, false);
        return cqkl.a;
    }

    @Override // defpackage.bnqn
    public cjtd c() {
        cjta b = cjtd.b();
        b.b = this.d;
        b.g(this.b.d);
        b.d = dtxn.k;
        return b.a();
    }

    @Override // defpackage.bnqn
    @dzsi
    public CharSequence d() {
        dpjx dpjxVar = this.b.c;
        if (dpjxVar == null) {
            dpjxVar = dpjx.n;
        }
        return dpjxVar.e;
    }

    @Override // defpackage.bnqn
    @dzsi
    public CharSequence e() {
        return null;
    }

    @Override // defpackage.bnqn
    public cqtd f() {
        return cqrt.g(2131231604, ibm.x());
    }

    @Override // defpackage.bnqn
    public String g() {
        CharSequence d = d();
        return d != null ? this.a.getString(R.string.DESTINATION_REFINEMENT_DIRECTIONS_ICON_VOICE_DESCRIPTION, d) : "";
    }
}
