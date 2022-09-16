package defpackage;

import android.net.Uri;
import java.util.List;
/* compiled from: PG */
/* renamed from: pjb  reason: default package */
/* loaded from: classes4.dex */
public final class pjb {
    public final Uri a;
    public final List e;
    public final List g;
    public final Object h;
    public final String b = null;
    public final piz c = null;
    public final piw d = null;
    public final String f = null;

    public pjb(Uri uri, List list, List list2, Object obj) {
        this.a = uri;
        this.e = list;
        this.g = list2;
        this.h = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pjb)) {
            return false;
        }
        pjb pjbVar = (pjb) obj;
        if (this.a.equals(pjbVar.a)) {
            String str = pjbVar.b;
            if (pxi.M(null, null)) {
                piz pizVar = pjbVar.c;
                if (pxi.M(null, null)) {
                    piw piwVar = pjbVar.d;
                    if (pxi.M(null, null) && this.e.equals(pjbVar.e)) {
                        String str2 = pjbVar.f;
                        if (pxi.M(null, null) && this.g.equals(pjbVar.g) && pxi.M(this.h, pjbVar.h)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() * 923521) + this.e.hashCode()) * 961) + this.g.hashCode()) * 31;
        Object obj = this.h;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }
}
