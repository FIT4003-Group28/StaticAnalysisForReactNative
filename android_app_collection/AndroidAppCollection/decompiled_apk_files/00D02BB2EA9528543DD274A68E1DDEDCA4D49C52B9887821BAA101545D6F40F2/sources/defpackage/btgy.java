package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: btgy  reason: default package */
/* loaded from: classes4.dex */
public class btgy implements cqkp {
    private final auhi a;
    private final auin b;
    private final btgx c;
    private final Runnable d;

    public btgy(auhi auhiVar, auin auinVar, auom auomVar, cqhn cqhnVar, Runnable runnable, cjqy cjqyVar, Activity activity, ausy ausyVar) {
        this.a = auhiVar;
        this.b = auinVar;
        this.d = runnable;
        this.c = new btgx(auhiVar, auinVar, auomVar, activity, cjqyVar, ausyVar);
    }

    public cqkl a() {
        this.d.run();
        return cqkl.a;
    }

    public cqkl b() {
        aufs aufsVar = this.c.a;
        if (aufsVar != null) {
            for (aujb aujbVar : this.a.c(this.b).values()) {
                if (aufsVar != aufs.INBOX_ONLY || this.c.h(aujbVar)) {
                    this.a.e(aujbVar.a, aufsVar);
                }
            }
            this.c.i(aufsVar);
        }
        this.d.run();
        return cqkl.a;
    }

    public btgu c() {
        return this.c;
    }
}
