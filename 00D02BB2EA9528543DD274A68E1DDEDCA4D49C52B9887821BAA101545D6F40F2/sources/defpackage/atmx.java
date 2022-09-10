package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: atmx  reason: default package */
/* loaded from: classes2.dex */
public class atmx implements atni {
    private final atmw a;
    private final CharSequence b;
    private final CharSequence c;

    public atmx(cqhn cqhnVar, atmw atmwVar, String str, String str2) {
        this.a = atmwVar;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.atni
    public CharSequence a() {
        return this.b;
    }

    @Override // defpackage.atni
    public cqkl b() {
        View o = cqkx.o(this);
        if (o != null) {
            cpv.a.f(o, this.c);
        }
        atbu atbuVar = (atbu) this.a;
        atbuVar.a.aT();
        atbv atbvVar = atbuVar.a;
        atbvVar.c.b(crhx.a(atbvVar.b));
        return cqkl.a;
    }

    @Override // defpackage.atni
    public cqkl c() {
        atbu atbuVar = (atbu) this.a;
        atbuVar.a.aT();
        fd G = atbuVar.a.G();
        if (!(G instanceof atbq)) {
            bvoo.h("NavigationFragment should be the target fragment.", new Object[0]);
        }
        atbq atbqVar = (atbq) G;
        atbqVar.k();
        atbqVar.Qa();
        return cqkl.a;
    }
}
