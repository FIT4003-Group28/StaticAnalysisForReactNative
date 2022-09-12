package defpackage;

import java.util.TreeSet;
/* compiled from: PG */
/* renamed from: apnq  reason: default package */
/* loaded from: classes2.dex */
public class apnq {
    @dzsi
    public apns b;
    TreeSet<apns> a = new TreeSet<>(apnn.a);
    private final apnp c = new apnp(this);

    @dzsi
    private final apns f(@dzsi apns apnsVar) {
        apns higher = apnsVar != null ? this.a.higher(apnsVar) : null;
        return higher == null ? this.a.first() : higher;
    }

    public final void a(apns apnsVar) {
        apnsVar.QQ(this.c);
    }

    public final void b() {
        apns apnsVar = this.b;
        if (apnsVar == null || !apnsVar.QP().booleanValue()) {
            e(d());
        }
    }

    public final void c(apns apnsVar) {
        d();
        apnsVar.QM(new Runnable(this) { // from class: apno
            private final apnq a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                apnq apnqVar = this.a;
                apns d = apnqVar.d();
                if (d != null) {
                    d.QO();
                }
                apnqVar.e(d);
            }
        });
        apnsVar.QN(true);
        this.b = apnsVar;
    }

    @dzsi
    public final apns d() {
        apns apnsVar = this.b;
        if (apnsVar != null) {
            apnsVar.QM(null);
            apnsVar.QN(false);
        }
        this.b = null;
        return apnsVar;
    }

    public final void e(@dzsi apns apnsVar) {
        if (this.a.isEmpty()) {
            return;
        }
        int size = this.a.size();
        apns f = f(apnsVar);
        for (int i = 0; i < size; i++) {
            if (f == null || !f.QP().booleanValue()) {
                f = f(f);
            } else {
                c(f);
                return;
            }
        }
    }
}
