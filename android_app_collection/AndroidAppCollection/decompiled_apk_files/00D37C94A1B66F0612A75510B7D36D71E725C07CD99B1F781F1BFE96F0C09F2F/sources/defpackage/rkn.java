package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: rkn  reason: default package */
/* loaded from: classes4.dex */
public final class rkn extends rmk {
    protected static final AtomicReference a = new AtomicReference();
    protected static final AtomicReference b = new AtomicReference();
    protected static final AtomicReference c = new AtomicReference();

    public rkn(rlx rlxVar) {
        super(rlxVar);
    }

    private static final String h(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        qnm.b(strArr);
        qnm.b(strArr2);
        qnm.b(atomicReference);
        qnm.c(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (rps.aq(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i];
                    if (str2 == null) {
                        str2 = strArr2[i] + "(" + strArr[i] + ")";
                        strArr3[i] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    protected final String a(Object[] objArr) {
        String valueOf;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                valueOf = b((Bundle) obj);
            } else {
                valueOf = String.valueOf(obj);
            }
            if (valueOf != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(valueOf);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String b(Bundle bundle) {
        String valueOf;
        if (bundle == null) {
            return null;
        }
        if (!g()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(d(str));
            sb.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                valueOf = a(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                valueOf = a((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                valueOf = a(((ArrayList) obj).toArray());
            } else {
                valueOf = String.valueOf(obj);
            }
            sb.append(valueOf);
        }
        sb.append("}]");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String c(String str) {
        if (str == null) {
            return null;
        }
        return !g() ? str : h(str, rmm.c, rmm.a, a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String d(String str) {
        if (str == null) {
            return null;
        }
        return !g() ? str : h(str, rmn.b, rmn.a, b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String e(String str) {
        if (str == null) {
            return null;
        }
        if (!g()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return "experiment_id(" + str + ")";
        }
        return h(str, rmo.b, rmo.a, c);
    }

    @Override // defpackage.rmk
    protected final boolean f() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean g() {
        P();
        return this.w.y() && this.w.aG().h(3);
    }
}
