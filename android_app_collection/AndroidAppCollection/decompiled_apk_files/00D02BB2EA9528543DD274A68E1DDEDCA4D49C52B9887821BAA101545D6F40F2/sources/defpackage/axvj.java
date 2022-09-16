package defpackage;

import android.text.style.ClickableSpan;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: axvj  reason: default package */
/* loaded from: classes3.dex */
public class axvj extends axve {
    private final awnl c;
    private final bzpr d;
    private final cjtd e;
    private final cjtd f;
    private final cjtd g;
    private final bvsx h;
    private final cklf i;

    public axvj(ff ffVar, cklf cklfVar, dndp dndpVar, awnl awnlVar, bzpr bzprVar) {
        super(ffVar, dndpVar);
        this.c = awnlVar;
        this.d = bzprVar;
        this.i = cklfVar;
        this.e = cjtd.a(dtxj.Y);
        this.f = cjtd.a(dtxj.Z);
        this.g = cjtd.a(dtxj.aa);
        this.h = new bvsx(this.b);
    }

    @Override // defpackage.axvc
    public cjtd a() {
        return this.e;
    }

    @Override // defpackage.axvc
    public cjtd b() {
        return this.f;
    }

    @Override // defpackage.axve, defpackage.axvc
    public cjtd c() {
        return this.g;
    }

    @Override // defpackage.axvc
    public cqkl d() {
        this.a.g().f();
        this.d.b(this.c).a("home_and_work_alias_setting");
        return cqkl.a;
    }

    @Override // defpackage.axvc
    public CharSequence f() {
        bvsu c = this.h.c(R.string.ALIAS_SETTING_SEARCH_HISTORY_PROMPT);
        c.a(i());
        return c.c();
    }

    @Override // defpackage.axvc
    public CharSequence g() {
        String string = this.b.getString(R.string.LEARN_MORE);
        ClickableSpan e = this.i.e("web_app_activity");
        bvsu b = this.h.b(string);
        b.k(e);
        return b.c();
    }

    @Override // defpackage.axvc
    public CharSequence h() {
        return this.b.getString(R.string.ALIAS_SETTING_GET_STARTED);
    }
}
