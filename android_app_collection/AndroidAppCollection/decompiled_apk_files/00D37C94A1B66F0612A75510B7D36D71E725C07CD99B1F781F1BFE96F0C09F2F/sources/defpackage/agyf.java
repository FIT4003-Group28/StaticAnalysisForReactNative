package defpackage;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import java.util.Collections;
import java.util.Map;
/* compiled from: PG */
/* renamed from: agyf  reason: default package */
/* loaded from: classes.dex */
public final class agyf implements agyr {
    public final agzh a;
    private final ahdf b;

    public agyf(agzh agzhVar, ahdf ahdfVar) {
        this.a = agzhVar;
        this.b = ahdfVar;
    }

    @Override // defpackage.agyr
    public final String a() {
        agyb agybVar = this.a.h;
        if (agybVar == null) {
            return null;
        }
        return agybVar.f;
    }

    @Override // defpackage.agyr
    public final Map b(String str) {
        if (!str.equals(((agyb) this.a.a()).f)) {
            return Collections.emptyMap();
        }
        return amup.j(this.a.c);
    }

    @Override // defpackage.agyr
    public final void c(String str, String str2, int i, agpw agpwVar) {
        String.valueOf(str2).length();
        String.valueOf(str).length();
        this.a.a().f(str, str2, i, agpwVar);
    }

    @Override // defpackage.agyr
    public final void d(Context context) {
    }

    @Override // defpackage.agyr
    public final void e(Context context) {
    }

    public final void f(String str, Bundle bundle) {
        this.a.a().g(str, bundle);
    }

    @Override // defpackage.agyr
    public final void g() {
        Notification a;
        if (this.b.f()) {
            agzh agzhVar = this.a;
            if (Build.VERSION.SDK_INT >= 26 && agzhVar.d.getApplicationInfo().targetSdkVersion >= 26 && (a = ((agrn) agzhVar.f.get()).a()) != null && agzhVar.p(a)) {
                return;
            }
            agzhVar.g.c();
        }
    }

    @Override // defpackage.agyr
    public final void h() {
        this.a.a().h();
    }

    @Override // defpackage.agyr
    public final void i(String str) {
        String.valueOf(str).length();
        this.a.a().i(str);
    }

    @Override // defpackage.agyr
    public final void j(String str, int i) {
        String.valueOf(str).length();
        this.a.a().k(str, i);
    }

    @Override // defpackage.agyr
    public final void k(String str) {
        str.length();
        this.a.a().l(str);
    }

    @Override // defpackage.agyr
    public final void l(String str) {
        String.valueOf(str).length();
        this.a.a().m(str);
    }

    @Override // defpackage.agyr
    public final void m(String str) {
        String.valueOf(str).length();
        this.a.a().n(str);
    }

    @Override // defpackage.agyr
    public final boolean n(int i, Notification notification) {
        if (this.b.f()) {
            return this.a.p(notification);
        }
        return false;
    }
}
