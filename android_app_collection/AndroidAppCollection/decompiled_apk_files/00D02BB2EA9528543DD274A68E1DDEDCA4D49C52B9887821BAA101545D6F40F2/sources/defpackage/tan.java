package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: tan  reason: default package */
/* loaded from: classes7.dex */
public class tan implements tak {
    private final twl a;
    private final zfo b;

    public tan(Activity activity, amve amveVar) {
        zqx zqxVar = new zqx(activity, amveVar);
        this.b = zqxVar;
        this.a = new twl(activity, amveVar, zqxVar);
    }

    @Override // defpackage.tak
    @dzsi
    public String a() {
        return this.b.d();
    }

    @Override // defpackage.twb
    @dzsi
    public String b() {
        return this.a.b();
    }

    @Override // defpackage.twb
    public cqss c() {
        return this.a.c();
    }

    public tan(Activity activity, amve amveVar, zfo zfoVar) {
        this.b = zfoVar;
        this.a = new twl(activity, amveVar, zfoVar);
    }
}
