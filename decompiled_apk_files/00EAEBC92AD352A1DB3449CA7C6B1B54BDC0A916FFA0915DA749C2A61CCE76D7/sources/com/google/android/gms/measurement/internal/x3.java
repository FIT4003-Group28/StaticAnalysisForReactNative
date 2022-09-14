package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class x3 extends b6 {

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicReference<String[]> f7775c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicReference<String[]> f7776d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicReference<String[]> f7777e = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public x3(d5 d5Var) {
        super(d5Var);
    }

    private static String a(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        com.google.android.gms.common.internal.s.a(strArr);
        com.google.android.gms.common.internal.s.a(strArr2);
        com.google.android.gms.common.internal.s.a(atomicReference);
        com.google.android.gms.common.internal.s.a(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (z9.c(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i] == null) {
                        strArr3[i] = strArr2[i] + "(" + strArr[i] + ")";
                    }
                    str2 = strArr3[i];
                }
                return str2;
            }
        }
        return str;
    }

    private final String a(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String a2 = obj instanceof Bundle ? a((Bundle) obj) : String.valueOf(obj);
            if (a2 != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(a2);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private final boolean s() {
        w();
        return this.f7802a.y() && this.f7802a.c().a(3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!s()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(b(str));
            sb.append("=");
            if (!c.e.a.b.d.g.k9.a() || !l().a(r.E0)) {
                sb.append(bundle.get(str));
            } else {
                Object obj = bundle.get(str);
                sb.append(obj instanceof Bundle ? a(new Object[]{obj}) : obj instanceof Object[] ? a((Object[]) obj) : obj instanceof ArrayList ? a(((ArrayList) obj).toArray()) : String.valueOf(obj));
            }
        }
        sb.append("}]");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String a(p pVar) {
        String str = null;
        if (pVar == null) {
            return null;
        }
        if (!s()) {
            return pVar.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(pVar.f7571d);
        sb.append(",name=");
        sb.append(a(pVar.f7569b));
        sb.append(",params=");
        o oVar = pVar.f7570c;
        if (oVar != null) {
            str = !s() ? oVar.toString() : a(oVar.j());
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String a(String str) {
        if (str == null) {
            return null;
        }
        return !s() ? str : a(str, c6.f7216b, c6.f7215a, f7775c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !s() ? str : a(str, f6.f7295b, f6.f7294a, f7776d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (!s()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return a(str, e6.f7273b, e6.f7272a, f7777e);
        }
        return "experiment_id(" + str + ")";
    }

    @Override // com.google.android.gms.measurement.internal.b6
    protected final boolean q() {
        return false;
    }
}
