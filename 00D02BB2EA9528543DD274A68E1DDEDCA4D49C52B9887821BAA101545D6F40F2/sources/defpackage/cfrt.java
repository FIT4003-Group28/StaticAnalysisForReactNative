package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cfrt  reason: default package */
/* loaded from: classes4.dex */
public final class cfrt {
    private final gfq a;
    private final akfc b;
    private final acyp c;
    private final btvo d;

    public cfrt(gfq gfqVar, akfc akfcVar, acyp acypVar, btvo btvoVar) {
        this.a = gfqVar;
        this.b = akfcVar;
        this.c = acypVar;
        this.d = btvoVar;
    }

    public final void a() {
        if (this.a.e(cfqo.class)) {
            return;
        }
        aker i = akeu.i(new cfrs(this.c.f()));
        i.c(dktk.CONTRIBUTE);
        i.d(this.c.f());
        aken a = i.a();
        a.d(R.string.CONTRIBUTE_TAB_BUTTON);
        a.c(R.string.CONTRIBUTE_INCOGNITO_MESSAGE);
        a.f(R.string.CONTRIBUTE_TAB_BUTTON);
        a.i(R.string.CONTRIBUTIONS_LOGIN_PROMPT_TITLE);
        a.h(R.string.CONTRIBUTIONS_LOGIN_PROMPT_BODY);
        this.b.b(i.b());
    }

    public final boolean b() {
        dhpt dhptVar = this.d.getContributionsPageParameters().h;
        if (dhptVar == null) {
            dhptVar = dhpt.w;
        }
        return dhptVar.s;
    }
}
