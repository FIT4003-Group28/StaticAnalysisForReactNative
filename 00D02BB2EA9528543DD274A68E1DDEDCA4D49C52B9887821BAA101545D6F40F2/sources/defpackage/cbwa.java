package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cbwa  reason: default package */
/* loaded from: classes4.dex */
public class cbwa implements cbvz {
    private final jib a;
    private final cjtd b;

    public cbwa(String str, String str2, ddho ddhoVar, View.OnClickListener onClickListener) {
        cjtd a;
        if (str.isEmpty()) {
            a = cjtd.b;
        } else {
            cjta b = cjtd.b();
            b.g(str);
            a = b.a();
        }
        cjta c = cjtd.c(a);
        c.d = ddhoVar;
        cjtd a2 = c.a();
        this.b = a;
        jhz a3 = jhz.a();
        a3.a = str2;
        a3.F = 1;
        a3.i = cqrt.g(2131231591, ibm.p());
        a3.o = a2;
        a3.f(onClickListener);
        this.a = a3.b();
    }

    @Override // defpackage.cbvz
    public jib b() {
        return this.a;
    }

    @Override // defpackage.cbvz
    public cjtd c(ddho ddhoVar) {
        cjta c = cjtd.c(this.b);
        c.d = ddhoVar;
        return c.a();
    }
}
