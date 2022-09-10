package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: aruu  reason: default package */
/* loaded from: classes2.dex */
public final class aruu {
    public final Context a;
    public final ckcw b;
    @dzsi
    public lq c;
    private final ResolveInfo d;

    public aruu(Context context, ckcw ckcwVar, ResolveInfo resolveInfo) {
        this.a = context;
        this.b = ckcwVar;
        this.d = resolveInfo;
    }

    public final void a(arus arusVar) {
        ComponentName componentName = new ComponentName(d(), this.d.serviceInfo.name);
        Bundle bundle = new Bundle();
        bundle.putBoolean("android.service.media.extra.SUGGESTED", true);
        lq lqVar = new lq(this.a, componentName, new arur(this, arusVar), bundle);
        this.c = lqVar;
        if (lqVar != null) {
            lqVar.a.c();
        }
    }

    public final void b() {
        lq lqVar = this.c;
        if (lqVar != null) {
            lqVar.a.d();
        }
        this.c = null;
    }

    public final void c(arus arusVar, @dzsi String str) {
        if (str != null) {
            d();
        } else {
            d();
        }
        ckcw ckcwVar = this.b;
        ckgz ckgzVar = ckhi.aK;
        dbsk.s(ckgzVar);
        d();
        ((ckco) ckcwVar.a(ckgzVar)).a(-1);
        arusVar.b();
    }

    public final String d() {
        return this.d.serviceInfo.packageName;
    }
}
