package defpackage;

import android.text.style.ClickableSpan;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: axvn  reason: default package */
/* loaded from: classes3.dex */
public class axvn extends axve {
    private final axuc c;
    private final cjtd d;
    private final cjtd e;
    private final cjtd f;
    private final bvsx g;
    private final dzsj<axwy> h;
    private final cklf i;

    public axvn(ff ffVar, cklf cklfVar, dzsj<axwy> dzsjVar, dndp dndpVar, axuc axucVar) {
        super(ffVar, dndpVar);
        this.h = dzsjVar;
        this.c = axucVar;
        this.i = cklfVar;
        this.d = cjtd.a(dtxj.ae);
        this.e = cjtd.a(dtxj.af);
        this.f = cjtd.a(dtxj.ag);
        this.g = new bvsx(ffVar.getResources());
    }

    @Override // defpackage.axvc
    public cjtd a() {
        return this.d;
    }

    @Override // defpackage.axvc
    public cjtd b() {
        return this.e;
    }

    @Override // defpackage.axve, defpackage.axvc
    public cjtd c() {
        return this.f;
    }

    @Override // defpackage.axvc
    public cqkl d() {
        dndr dndrVar;
        this.a.g().f();
        dndj j = super.j();
        if (j != null) {
            dndl dndlVar = j.b;
            if (dndlVar == null) {
                dndlVar = dndl.d;
            }
            dndrVar = dndr.b(dndlVar.b);
            if (dndrVar == null) {
                dndrVar = dndr.UNKNOWN_ALIAS_TYPE;
            }
        } else {
            dndrVar = null;
        }
        if (dndrVar != null) {
            axwv n = axww.n();
            n.b(dndrVar);
            n.g(true);
            ((axvv) n).d = this.c;
            this.h.a().L(n.h());
        }
        return cqkl.a;
    }

    @Override // defpackage.axvc
    public CharSequence f() {
        bvsu c = this.g.c(R.string.ALIAS_SETTING_SET_ALIAS_PROMPT);
        c.a(i());
        return c.c();
    }

    @Override // defpackage.axvc
    public CharSequence g() {
        String string = this.b.getString(R.string.LEARN_MORE);
        ClickableSpan e = this.i.e("home_work_address");
        bvsu b = this.g.b(string);
        b.k(e);
        return b.c();
    }

    @Override // defpackage.axvc
    public CharSequence h() {
        return this.b.getString(R.string.ALIAS_SETTING_ADD);
    }
}
