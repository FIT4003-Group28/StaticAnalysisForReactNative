package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.android.apps.youtube.app.extensions.accountlinking.UriFlowActivity;
/* compiled from: PG */
/* renamed from: gph  reason: default package */
/* loaded from: classes3.dex */
public final class gph implements amau {
    public final UriFlowActivity a;
    public final gpg b;
    public int c = 1;
    private final whe d;

    public gph(UriFlowActivity uriFlowActivity, gpg gpgVar, alzn alznVar, UriFlowActivity uriFlowActivity2, whe wheVar) {
        this.a = uriFlowActivity;
        this.b = gpgVar;
        this.d = wheVar;
        ambi b = ambj.b(uriFlowActivity2);
        b.b(whh.class);
        alznVar.a(b.a()).c(this);
    }

    @Override // defpackage.amau
    public final void a(amas amasVar) {
        this.d.b(3, 2, 2);
    }

    @Override // defpackage.amau
    public final void b(Throwable th) {
        this.d.c(3, th);
        this.a.finish();
    }

    @Override // defpackage.amau
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.amau
    public final /* synthetic */ void d() {
        answ.m(this);
    }

    public final void e() {
        g(4);
    }

    public final void f() {
        g(3);
    }

    public final void g(int i) {
        apzg apzgVar;
        this.c = 5;
        gpg gpgVar = this.b;
        UriFlowActivity uriFlowActivity = this.a;
        int i2 = i - 1;
        if (i2 == 1) {
            apzgVar = gpgVar.c;
        } else if (i2 == 2) {
            apzgVar = gpgVar.d;
        } else if (i2 != 3) {
            zep.b("Unknown UriFlowResult");
            apzgVar = null;
        } else {
            apzgVar = gpgVar.e;
        }
        if (apzgVar != null) {
            String str = gpgVar.f;
            if (str != null) {
                try {
                    Intent intent = new Intent(uriFlowActivity, Class.forName(str).asSubclass(Activity.class));
                    intent.setFlags(603979776);
                    intent.putExtra("navigation_endpoint", apzgVar.toByteArray());
                    uriFlowActivity.startActivity(intent);
                } catch (ClassNotFoundException unused) {
                    throw new AssertionError("Unable to retrieve activity that started UriFlow.");
                }
            } else {
                zep.b("No activity name found");
            }
        }
        gpgVar.b = null;
        gpgVar.c = null;
        gpgVar.d = null;
        gpgVar.e = null;
        gpgVar.f = null;
        ylx.j(gpgVar.g.b(fuj.q, anjk.a), anjk.a, gpe.b);
        this.a.finish();
    }
}
