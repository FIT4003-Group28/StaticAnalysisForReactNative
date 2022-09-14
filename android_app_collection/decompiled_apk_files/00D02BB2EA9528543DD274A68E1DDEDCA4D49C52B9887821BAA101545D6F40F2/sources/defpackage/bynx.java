package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bynx  reason: default package */
/* loaded from: classes4.dex */
public class bynx {
    private final akox a;
    @dzsi
    private vue b;
    private final Context c;
    private final Executor d;

    public bynx(akox akoxVar, Activity activity, Executor executor) {
        this.a = akoxVar;
        this.c = activity.getBaseContext();
        this.d = executor;
    }

    public final void a(List<dozz> list, int i, @dzsi vud vudVar) {
        b();
        vue a = vue.a(list, this.a, this.c, this.d, i, vudVar);
        this.a.S(a, this.b);
        a.c();
        a.d();
        this.b = a;
    }

    public final void b() {
        vue vueVar = this.b;
        if (vueVar != null) {
            this.a.R(vueVar);
            this.b.e();
            this.b = null;
        }
    }
}
