package defpackage;

import android.app.Activity;
import android.os.Build;
/* compiled from: PG */
/* renamed from: btgl  reason: default package */
/* loaded from: classes4.dex */
public class btgl implements btgk {
    private final Activity a;
    private final auix b;
    private final auhi c;
    private final aujb d;
    private final auom e;
    private final cqhn f;
    private final cjqy g;
    private final dxio<afha> h;
    private final ausy i;

    public btgl(Activity activity, auix auixVar, auhi auhiVar, aujb aujbVar, auom auomVar, cqhn cqhnVar, cjqy cjqyVar, dxio<afha> dxioVar, ausy ausyVar) {
        this.a = activity;
        this.b = auixVar;
        this.c = auhiVar;
        this.d = aujbVar;
        this.e = auomVar;
        this.f = cqhnVar;
        this.g = cjqyVar;
        this.h = dxioVar;
        this.i = ausyVar;
    }

    @Override // defpackage.jbk
    public jib NC() {
        Activity activity = this.a;
        return jib.g(activity, activity.getString(this.b.b));
    }

    @Override // defpackage.btgk
    public String b() {
        return this.a.getString(this.b.c);
    }

    @Override // defpackage.btgk
    public btgu c() {
        return new btgx(this.c, this.d, this.e, this.a, this.g, this.i);
    }

    @Override // defpackage.btgk
    public Boolean d() {
        return Boolean.valueOf(Build.VERSION.SDK_INT >= 26);
    }

    @Override // defpackage.btgk
    public cqkl e() {
        String b = this.d.a().b(0);
        if (b != null) {
            this.h.a().f(this.a, ause.b(this.a, b), 4);
        }
        return cqkl.a;
    }
}
