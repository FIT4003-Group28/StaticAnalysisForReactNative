package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: gcf  reason: default package */
/* loaded from: classes3.dex */
public class gcf {
    public zbb a;
    private final Activity b;
    private final gcc c;

    public gcf(Activity activity, gcc gccVar, ntt nttVar) {
        this.b = activity;
        this.c = gccVar;
        nttVar.a.n().Z(new ayqb() { // from class: gce
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                gcf gcfVar = gcf.this;
                gcfVar.a = (zbb) obj;
                gcfVar.f();
            }
        });
    }

    public void f() {
    }

    public boolean h() {
        return this.c.e(elk.i(this.b), this.a);
    }
}
