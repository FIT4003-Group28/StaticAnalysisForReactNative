package defpackage;

import android.app.Notification;
import android.content.Context;
import java.util.Collections;
import java.util.Map;
/* compiled from: PG */
/* renamed from: agyn  reason: default package */
/* loaded from: classes.dex */
public final class agyn implements agyr {
    private final Context a;
    private final ylm b;

    public agyn(Context context, ylm ylmVar) {
        this.a = context;
        this.b = ylmVar;
    }

    @Override // defpackage.agyr
    public final String a() {
        agxm agxmVar = (agxm) this.b.b();
        if (agxmVar == null) {
            return null;
        }
        return agxmVar.a();
    }

    @Override // defpackage.agyr
    public final Map b(String str) {
        agxm agxmVar = (agxm) this.b.a(this.a);
        if (agxmVar == null || !str.equals(agxmVar.a())) {
            return Collections.emptyMap();
        }
        return amup.j(agxmVar.a.b);
    }

    @Override // defpackage.agyr
    public final void c(String str, String str2, int i, agpw agpwVar) {
        agxm agxmVar = (agxm) this.b.a(this.a);
        agxmVar.b();
        agxmVar.a.e.f(str, str2, i, agpwVar);
    }

    @Override // defpackage.agyr
    public final void d(Context context) {
        this.b.c(context);
    }

    @Override // defpackage.agyr
    public final void e(Context context) {
        this.b.d(context);
    }

    @Override // defpackage.agyr
    public final void g() {
        if (((agxm) this.b.b()) == null) {
            return;
        }
        ((agxm) this.b.b()).a.n();
    }

    @Override // defpackage.agyr
    public final void h() {
        agxm agxmVar = (agxm) this.b.a(this.a);
        agxmVar.b();
        agxmVar.a.e.h();
    }

    @Override // defpackage.agyr
    public final void i(String str) {
        agxm agxmVar = (agxm) this.b.a(this.a);
        agxmVar.b();
        agxmVar.a.e.i(str);
    }

    @Override // defpackage.agyr
    public final void j(String str, int i) {
        agxm agxmVar = (agxm) this.b.a(this.a);
        agxmVar.b();
        agxmVar.a.e.k(str, i);
    }

    @Override // defpackage.agyr
    public final void k(String str) {
        agxm agxmVar = (agxm) this.b.a(this.a);
        str.length();
        agxmVar.b();
        agxmVar.a.e.l(str);
    }

    @Override // defpackage.agyr
    public final void l(String str) {
        agxm agxmVar = (agxm) this.b.a(this.a);
        agxmVar.b();
        agxmVar.a.e.m(str);
    }

    @Override // defpackage.agyr
    public final void m(String str) {
        agxm agxmVar = (agxm) this.b.a(this.a);
        String.valueOf(str).length();
        agxmVar.b();
        agxmVar.a.e.n(str);
    }

    @Override // defpackage.agyr
    public final boolean n(int i, Notification notification) {
        agxm agxmVar = (agxm) this.b.b();
        if (agxmVar == null) {
            return false;
        }
        agxmVar.a.startForeground(i, notification);
        return true;
    }
}
