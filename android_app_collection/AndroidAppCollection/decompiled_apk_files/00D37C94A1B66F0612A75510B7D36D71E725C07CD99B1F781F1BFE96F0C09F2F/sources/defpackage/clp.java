package defpackage;

import android.graphics.Bitmap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: clp  reason: default package */
/* loaded from: classes2.dex */
public final class clp implements cln {
    int a;
    public Bitmap.Config b;
    private final clq c;

    public clp(clq clqVar) {
        this.c = clqVar;
    }

    @Override // defpackage.cln
    public final void a() {
        this.c.c(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof clp) {
            clp clpVar = (clp) obj;
            if (this.a == clpVar.a && cvd.l(this.b, clpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a * 31;
        Bitmap.Config config = this.b;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return clr.a(this.a, this.b);
    }
}
