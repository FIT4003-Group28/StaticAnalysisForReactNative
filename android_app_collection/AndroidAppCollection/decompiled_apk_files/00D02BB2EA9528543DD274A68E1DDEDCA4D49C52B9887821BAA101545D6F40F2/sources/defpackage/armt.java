package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: armt  reason: default package */
/* loaded from: classes2.dex */
public class armt implements army, arka {
    private final gfq a;
    private final ges b;
    private final crfm c;
    private final eeu d;
    private boolean e = false;

    public armt(cqhn cqhnVar, gfq gfqVar, ges gesVar, crfm crfmVar, eeu eeuVar) {
        this.a = gfqVar;
        this.b = gesVar;
        this.c = crfmVar;
        this.d = eeuVar;
    }

    @Override // defpackage.arka
    public void a(Bundle bundle) {
    }

    @Override // defpackage.arka
    public void b() {
    }

    @Override // defpackage.arka
    public void c() {
    }

    @Override // defpackage.arka
    public void d(Bundle bundle) {
    }

    @Override // defpackage.arka
    public void e(Configuration configuration) {
    }

    @Override // defpackage.arka
    public void f() {
    }

    @Override // defpackage.arka
    public void g(atlq atlqVar, @dzsi atlq atlqVar2) {
        boolean z = this.e;
        boolean z2 = false;
        if (!atlqVar.b() && atlqVar.q != null) {
            z2 = true;
        }
        this.e = z2;
        if (z2 != z) {
            cqkx.p(this);
        }
    }

    @Override // defpackage.army
    public cqkl h() {
        ((efh) this.d).e = false;
        this.c.d(false);
        gfq.l(this.b);
        return cqkl.a;
    }

    @Override // defpackage.army
    public Boolean i() {
        return Boolean.valueOf(this.e);
    }
}
