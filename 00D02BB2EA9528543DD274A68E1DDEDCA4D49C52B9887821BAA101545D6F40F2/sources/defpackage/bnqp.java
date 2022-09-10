package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bnqp  reason: default package */
/* loaded from: classes3.dex */
public class bnqp implements bnqn {
    private final Resources a;
    private final bnqu b;
    private final String c;
    private final dpjn d;
    private final dpjx e;

    public bnqp(Resources resources, dpjn dpjnVar, String str, bnqu bnquVar) {
        this.a = resources;
        this.b = bnquVar;
        this.c = str;
        this.d = dpjnVar;
        dpjx dpjxVar = dpjnVar.b;
        this.e = dpjxVar == null ? dpjx.n : dpjxVar;
    }

    @Override // defpackage.bnqn
    public cqkl a(cjqm cjqmVar) {
        bnqu bnquVar = this.b;
        dpjx dpjxVar = this.e;
        bnquVar.g(dpjxVar, dpjxVar, cjqmVar, true);
        return cqkl.a;
    }

    @Override // defpackage.bnqn
    public cqkl b(cjqm cjqmVar) {
        bnqu bnquVar = this.b;
        dpjx dpjxVar = this.e;
        bnquVar.g(dpjxVar, dpjxVar, cjqmVar, false);
        return cqkl.a;
    }

    @Override // defpackage.bnqn
    public cjtd c() {
        cjta b = cjtd.b();
        b.b = this.c;
        b.g(this.d.i);
        b.d = dtxn.k;
        return b.a();
    }

    @Override // defpackage.bnqn
    @dzsi
    public CharSequence d() {
        return !this.e.e.isEmpty() ? this.e.e : this.e.b;
    }

    @Override // defpackage.bnqn
    @dzsi
    public CharSequence e() {
        return this.a.getString(R.string.DESTINATION_REFINEMENT_SUBTITLE);
    }

    @Override // defpackage.bnqn
    public cqtd f() {
        return cqrt.g(2131231604, irg.a());
    }

    @Override // defpackage.bnqn
    public String g() {
        CharSequence d = d();
        return d != null ? this.a.getString(R.string.DESTINATION_REFINEMENT_DIRECTIONS_ICON_VOICE_DESCRIPTION, d) : "";
    }
}
