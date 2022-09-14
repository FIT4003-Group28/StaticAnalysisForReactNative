package defpackage;

import android.accounts.Account;
import android.app.Activity;
/* compiled from: PG */
/* renamed from: bzpy  reason: default package */
/* loaded from: classes4.dex */
public abstract class bzpy {
    private final akfa a;
    @dzsi
    public awnl b;
    public final Activity c;
    protected final bzpx d;
    @dzsi
    public bzpo e;
    private boolean f;

    public bzpy(Activity activity, akfa akfaVar, bzpx bzpxVar) {
        this.c = activity;
        this.a = akfaVar;
        this.d = bzpxVar;
    }

    private final void g() {
        if (!this.f || this.d == null) {
            return;
        }
        this.c.runOnUiThread(new Runnable(this) { // from class: bzpw
            private final bzpy a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.d.a();
            }
        });
    }

    public abstract void a(String str);

    public final void b() {
        g();
        awnl awnlVar = this.b;
        if (awnlVar != null) {
            Activity activity = this.c;
            awnlVar.b(activity, -1, activity.getIntent());
        }
    }

    public final void c() {
        g();
        awnl awnlVar = this.b;
        if (awnlVar != null) {
            Activity activity = this.c;
            awnlVar.b(activity, 0, activity.getIntent());
        }
    }

    public final void d() {
        g();
        awnl awnlVar = this.b;
        if (awnlVar != null) {
            Activity activity = this.c;
            awnlVar.b(activity, 2, activity.getIntent());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Account e() {
        btlu j = this.a.j();
        dbsk.s(j);
        return j.s();
    }

    public final void f() {
        this.f = true;
    }
}
