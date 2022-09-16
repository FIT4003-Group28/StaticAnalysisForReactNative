package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: ahno  reason: default package */
/* loaded from: classes.dex */
public final class ahno extends ahlb {
    public final ahnh a;
    public final ahnh b;
    private final ahnh c;

    public ahno(ahoo ahooVar, ahne ahneVar) {
        ahnh a = ahneVar.a(ahooVar.clone(), 0.0f, 40.0f);
        this.a = a;
        a.h(17);
        a.B(true, true);
        a.z(-7829368);
        a.A(2.0f);
        a.n(0.0f, 6.0f, 0.0f);
        q(a);
        a.qS(true);
        ahnh a2 = ahneVar.a(ahooVar.clone(), 40.0f, 0.0f);
        this.b = a2;
        a2.B(false, true);
        a2.A(2.0f);
        a2.h(1);
        a2.n(0.0f, 2.0f, 0.0f);
        a2.g(new ahnn(this));
        q(a2);
        ahnh a3 = ahneVar.a(ahooVar.clone(), 40.0f, 0.0f);
        this.c = a3;
        a3.B(false, true);
        a3.A(1.5f);
        a3.h(1);
        q(a3);
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.c.y("");
            this.c.qS(true);
            return;
        }
        ahnh ahnhVar = this.c;
        if (str.length() > 40) {
            str = String.valueOf(str.substring(0, 37)).concat("...");
        }
        ahnhVar.y(str);
        this.c.qS(false);
    }

    public final void c(String str) {
        this.b.y(str);
    }
}
