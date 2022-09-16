package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: afui  reason: default package */
/* loaded from: classes.dex */
public class afui implements yoj {
    public final afug a;
    public final afuj b;
    private yor c;
    private final Application d;
    private final ykw e;

    public afui(ykw ykwVar, afug afugVar, afuj afujVar, Application application) {
        this.a = afugVar;
        this.b = afujVar;
        this.d = application;
        this.e = ykwVar;
    }

    public void a() {
        if (this.c == null) {
            yor yorVar = new yor();
            this.c = yorVar;
            yorVar.a(this.d);
            this.c.c(this);
            if (uul.c(this.d.getApplicationContext())) {
                return;
            }
            g();
        }
    }

    @Override // defpackage.yoj
    public final void g() {
        this.e.a(1, new afuh(this, 1));
        this.e.a(1, new afuh(this));
    }
}
