package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: btcs  reason: default package */
/* loaded from: classes4.dex */
class btcs implements btcp {
    private final Locale a;
    private final String b;
    private final cqss c;
    private final bvjj d;
    private final gga e;
    private final bwqv f;

    public btcs(Locale locale, String str, cqss cqssVar, gga ggaVar, bvjj bvjjVar, bwqv bwqvVar) {
        this.a = locale;
        this.b = str;
        this.c = cqssVar;
        this.e = ggaVar;
        this.d = bvjjVar;
        this.f = bwqvVar;
    }

    @Override // defpackage.btcp
    public CharSequence a() {
        return this.a.getDisplayLanguage();
    }

    @Override // defpackage.btcp
    public CharSequence b() {
        return this.b;
    }

    @Override // defpackage.btcp
    public cqkl c() {
        this.d.S(bvjk.T, true);
        if (this.a.getLanguage().equals(Locale.getDefault().getLanguage())) {
            btcb btcbVar = (btcb) this.e.K();
            if (btcbVar != null) {
                btcbVar.aT();
            }
            return cqkl.a;
        }
        btbt.g(Locale.getDefault(), this.a, this.f).aJ(this.e);
        return cqkl.a;
    }

    @Override // defpackage.btcp
    public cqss d() {
        return this.c;
    }
}
