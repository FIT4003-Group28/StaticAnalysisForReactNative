package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    final String f7474a;

    /* renamed from: b  reason: collision with root package name */
    final String f7475b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7476c;

    /* renamed from: d  reason: collision with root package name */
    final long f7477d;

    /* renamed from: e  reason: collision with root package name */
    final long f7478e;

    /* renamed from: f  reason: collision with root package name */
    final o f7479f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(d5 d5Var, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        o oVar;
        com.google.android.gms.common.internal.s.b(str2);
        com.google.android.gms.common.internal.s.b(str3);
        this.f7474a = str2;
        this.f7475b = str3;
        this.f7476c = TextUtils.isEmpty(str) ? null : str;
        this.f7477d = j;
        this.f7478e = j2;
        long j3 = this.f7478e;
        if (j3 != 0 && j3 > this.f7477d) {
            d5Var.c().v().a("Event created with reverse previous/current timestamps. appId", z3.a(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            oVar = new o(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    d5Var.c().s().a("Param name can't be null");
                } else {
                    Object a2 = d5Var.u().a(next, bundle2.get(next));
                    if (a2 == null) {
                        d5Var.c().v().a("Param value can't be null", d5Var.v().b(next));
                    } else {
                        d5Var.u().a(bundle2, next, a2);
                    }
                }
                it.remove();
            }
            oVar = new o(bundle2);
        }
        this.f7479f = oVar;
    }

    private m(d5 d5Var, String str, String str2, String str3, long j, long j2, o oVar) {
        com.google.android.gms.common.internal.s.b(str2);
        com.google.android.gms.common.internal.s.b(str3);
        com.google.android.gms.common.internal.s.a(oVar);
        this.f7474a = str2;
        this.f7475b = str3;
        this.f7476c = TextUtils.isEmpty(str) ? null : str;
        this.f7477d = j;
        this.f7478e = j2;
        long j3 = this.f7478e;
        if (j3 != 0 && j3 > this.f7477d) {
            d5Var.c().v().a("Event created with reverse previous/current timestamps. appId, name", z3.a(str2), z3.a(str3));
        }
        this.f7479f = oVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final m a(d5 d5Var, long j) {
        return new m(d5Var, this.f7476c, this.f7474a, this.f7475b, this.f7477d, j, this.f7479f);
    }

    public final String toString() {
        String str = this.f7474a;
        String str2 = this.f7475b;
        String valueOf = String.valueOf(this.f7479f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
