package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: cjnf  reason: default package */
/* loaded from: classes4.dex */
public final class cjnf {
    private final cjjj a;
    private final Resources b;

    public cjnf(cjjj cjjjVar, Resources resources) {
        this.a = cjjjVar;
        this.b = resources;
    }

    public final void a(cjne cjneVar) {
        dzvx.c(cjneVar, "configuration");
        String a = cjneVar.a();
        if (a == null) {
            Integer b = cjneVar.b();
            if (b != null) {
                a = this.b.getString(b.intValue());
            } else {
                a = null;
            }
        }
        if (a != null) {
            cjju cjjuVar = new cjju(a, 2);
            cjjd a2 = cjje.a();
            a2.c(cjjq.TOOLTIP);
            cjix cjixVar = (cjix) a2;
            cjixVar.a = cjjuVar;
            a2.d(cjneVar.d());
            a2.b(cjneVar.g());
            Integer e = cjneVar.e();
            if (e != null) {
                cjixVar.b = Integer.valueOf(e.intValue());
            }
            cjtd c = cjneVar.c();
            if (c != null) {
                cjixVar.c = c;
            }
            Runnable f = cjneVar.f();
            if (f != null) {
                cjixVar.d = f;
            }
            cjkd h = cjneVar.h();
            if (h != null) {
                cjixVar.e = h;
            }
            this.a.a(a2.a());
            return;
        }
        throw new IllegalStateException("No text content for tooltip.".toString());
    }
}
