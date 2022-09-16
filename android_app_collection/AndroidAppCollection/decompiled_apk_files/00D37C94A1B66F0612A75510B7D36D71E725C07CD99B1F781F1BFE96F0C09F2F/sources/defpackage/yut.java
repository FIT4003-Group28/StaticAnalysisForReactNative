package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: yut  reason: default package */
/* loaded from: classes4.dex */
public final class yut implements yuu {
    private final Context b;

    public yut(Context context) {
        this.b = context;
    }

    @Override // defpackage.yuu
    public final boolean a(atvp... atvpVarArr) {
        for (atvp atvpVar : atvpVarArr) {
            amup amupVar = a;
            atvo b = atvo.b(atvpVar.c);
            if (b == null) {
                b = atvo.INVALID;
            }
            String str = (String) amupVar.get(b);
            if (str != null) {
                if (ake.c(this.b, str) != 0) {
                    return false;
                }
            } else {
                throw new IllegalArgumentException("Unsupported Permission Type");
            }
        }
        return true;
    }
}
