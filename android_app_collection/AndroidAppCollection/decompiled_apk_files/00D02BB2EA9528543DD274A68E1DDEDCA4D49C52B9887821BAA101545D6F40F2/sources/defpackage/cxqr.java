package defpackage;

import android.text.TextUtils;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cxqr  reason: default package */
/* loaded from: classes5.dex */
public final class cxqr implements cxnv {
    public final cxnx a;
    public final eayu b;
    public final boolean c;
    private final String d;

    public cxqr(String str, cxnx cxnxVar, eayu eayuVar, boolean z) {
        this.d = str;
        this.a = cxnxVar;
        this.b = eayuVar;
        this.c = z;
    }

    @Override // defpackage.cxnv
    public final void a() {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cxqr) {
            cxqr cxqrVar = (cxqr) obj;
            if (TextUtils.equals(this.d, cxqrVar.d) && this.a.equals(cxqrVar.a) && this.b.equals(cxqrVar.b) && this.c == cxqrVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.a, this.b});
    }
}
