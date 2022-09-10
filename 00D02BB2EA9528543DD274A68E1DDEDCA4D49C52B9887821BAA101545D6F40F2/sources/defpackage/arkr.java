package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: arkr  reason: default package */
/* loaded from: classes2.dex */
public final class arkr implements arka {
    public final atlo a;
    public final crms b;
    @dzsi
    public atlq d;
    public arjt e;
    private final btrm f;
    public boolean c = false;
    private final arkq g = new arkq(this);

    public arkr(btrm btrmVar, atlo atloVar, bwqv bwqvVar) {
        this.f = btrmVar;
        this.a = atloVar;
        this.b = new crms(bwqvVar);
    }

    @Override // defpackage.arka
    public final void a(Bundle bundle) {
    }

    @Override // defpackage.arka
    public final void b() {
        this.c = true;
        btrm btrmVar = this.f;
        arkq arkqVar = this.g;
        dceq a = dcet.a();
        a.b(crhp.class, new arks(crhp.class, arkqVar, bvrj.UI_THREAD));
        btrmVar.g(arkqVar, a.a());
    }

    @Override // defpackage.arka
    public final void c() {
        this.c = false;
        this.f.a(this.g);
    }

    @Override // defpackage.arka
    public final void d(Bundle bundle) {
    }

    @Override // defpackage.arka
    public final void e(Configuration configuration) {
    }

    @Override // defpackage.arka
    public final void f() {
    }

    @Override // defpackage.arka
    public final void g(atlq atlqVar, atlq atlqVar2) {
    }
}
