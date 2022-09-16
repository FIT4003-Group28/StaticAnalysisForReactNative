package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: armx  reason: default package */
/* loaded from: classes2.dex */
public class armx implements arna, arka {
    private final czz a;
    private final arla b;
    private final armz d;
    private boolean f = true;
    private final aa<arkz> c = new aa(this) { // from class: armv
        private final armx a;

        {
            this.a = this;
        }

        @Override // defpackage.aa
        public final void m(Object obj) {
            arkz arkzVar = (arkz) obj;
            cqkx.p(this.a);
        }
    };
    private final dal e = new dal(this) { // from class: armw
        private final armx a;

        {
            this.a = this;
        }

        @Override // defpackage.dal
        public final void a(int i) {
            cqkx.p(this.a);
        }
    };

    public armx(czz czzVar, cqhn cqhnVar, arla arlaVar, armz armzVar) {
        this.a = czzVar;
        this.b = arlaVar;
        this.d = armzVar;
    }

    @Override // defpackage.arka
    public void a(@dzsi Bundle bundle) {
        ((arjz) this.b).b.c(this.c);
        this.a.m().a().a(this.e);
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
        ((arjz) this.b).b.d(this.c);
        this.a.m().a().b(this.e);
    }

    @Override // defpackage.arka
    public void g(atlq atlqVar, atlq atlqVar2) {
    }

    @Override // defpackage.arna
    public Boolean h() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.arna
    public void i(boolean z) {
        this.f = z;
        cqkx.p(this);
    }

    @Override // defpackage.arna
    public armz j() {
        return this.d;
    }
}
