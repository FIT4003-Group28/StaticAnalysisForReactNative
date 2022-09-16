package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: ajls  reason: default package */
/* loaded from: classes.dex */
public final class ajls implements tct {
    public final teb a;
    private final aawh b;

    public ajls(aawh aawhVar, teb tebVar) {
        aawhVar.getClass();
        this.b = aawhVar;
        this.a = tebVar;
    }

    @Override // defpackage.tct
    public final aooq a() {
        return atip.b;
    }

    @Override // defpackage.tct
    public final /* bridge */ /* synthetic */ aynr b(Object obj, final tcs tcsVar) {
        atip atipVar = (atip) obj;
        aawg a = this.b.a();
        for (String str : atipVar.c) {
            a.t(str);
        }
        boolean z = true;
        if (atipVar.c.size() <= 1) {
            z = false;
        }
        a.u(z);
        a.i();
        tdq tdqVar = tcsVar.f;
        if (tdqVar instanceof ajjk) {
            String k = ((ajjk) tdqVar).a.k();
            if (!TextUtils.isEmpty(k)) {
                a.l(k);
            }
        }
        return zhn.c(this.b.a.a(a)).q(new ayqb() { // from class: ajlr
            @Override // defpackage.ayqb
            public final void a(Object obj2) {
                ajls ajlsVar = ajls.this;
                tcs tcsVar2 = tcsVar;
                ajlsVar.a.a(31, "MultiFeedbackTokenCommand execution failed", tcsVar2.i, (Throwable) obj2);
            }
        });
    }

    @Override // defpackage.tct
    public final /* synthetic */ void c() {
    }
}
