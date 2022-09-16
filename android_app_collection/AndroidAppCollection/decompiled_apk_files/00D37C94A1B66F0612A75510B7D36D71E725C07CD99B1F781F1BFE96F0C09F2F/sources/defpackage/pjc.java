package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: pjc  reason: default package */
/* loaded from: classes4.dex */
public final class pjc {
    public final String a;
    public final pjb b;
    public final pja c;
    public final pje d;
    public final piy e;

    static {
        new pix().a();
    }

    public pjc(String str, piy piyVar, pjb pjbVar, pja pjaVar, pje pjeVar) {
        this.a = str;
        this.b = pjbVar;
        this.c = pjaVar;
        this.d = pjeVar;
        this.e = piyVar;
    }

    public static pjc a(Uri uri) {
        pix pixVar = new pix();
        pixVar.a = uri;
        return pixVar.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pjc)) {
            return false;
        }
        pjc pjcVar = (pjc) obj;
        return pxi.M(this.a, pjcVar.a) && this.e.equals(pjcVar.e) && pxi.M(this.b, pjcVar.b) && pxi.M(this.c, pjcVar.c) && pxi.M(this.d, pjcVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        pjb pjbVar = this.b;
        return ((((((hashCode + (pjbVar != null ? pjbVar.hashCode() : 0)) * 31) + this.c.hashCode()) * 31) + this.e.hashCode()) * 31) + this.d.hashCode();
    }
}
