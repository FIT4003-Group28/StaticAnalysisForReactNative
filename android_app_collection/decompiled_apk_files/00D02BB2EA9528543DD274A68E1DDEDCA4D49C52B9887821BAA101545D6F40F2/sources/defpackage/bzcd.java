package defpackage;

import android.app.Service;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: bzcd  reason: default package */
/* loaded from: classes4.dex */
public final class bzcd implements bzch {
    public static final String a = String.valueOf(bzcd.class.getCanonicalName()).concat(".ACTION_ARRIVE");
    private final Service b;
    private final byyp c;

    public bzcd(Service service, byyp byypVar) {
        this.b = service;
        this.c = byypVar;
    }

    @Override // defpackage.bzch
    public final void a(Intent intent) {
        bzdk c = this.c.c();
        if (c.h().a()) {
            c.h();
            return;
        }
        amte k = c.k();
        dbsk.s(k);
        boolean parseBoolean = Boolean.parseBoolean(intent.getData().getQueryParameter("active"));
        Intent d = umz.d(this.b, k, c.m(), false);
        d.addFlags(268435456);
        this.b.startActivity(d);
        if (!parseBoolean) {
            return;
        }
        bzcf.c(this.b);
    }

    @Override // defpackage.bzch
    public final boolean b(Intent intent) {
        return a.equals(intent.getAction());
    }
}
