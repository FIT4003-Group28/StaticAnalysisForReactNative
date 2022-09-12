package defpackage;

import android.net.Uri;
import java.util.List;
/* compiled from: PG */
/* renamed from: clnn  reason: default package */
/* loaded from: classes5.dex */
public final class clnn {
    public final Uri a;
    public final List e;
    public final List g;
    public final String b = null;
    public final clnl c = null;
    public final clni d = null;
    public final String f = null;
    public final Object h = null;

    public clnn(Uri uri, List list, List list2) {
        this.a = uri;
        this.e = list;
        this.g = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clnn)) {
            return false;
        }
        clnn clnnVar = (clnn) obj;
        if (this.a.equals(clnnVar.a)) {
            String str = clnnVar.b;
            if (cmny.b(null, null)) {
                clnl clnlVar = clnnVar.c;
                if (cmny.b(null, null)) {
                    clni clniVar = clnnVar.d;
                    if (cmny.b(null, null) && this.e.equals(clnnVar.e)) {
                        String str2 = clnnVar.f;
                        if (cmny.b(null, null) && this.g.equals(clnnVar.g)) {
                            Object obj2 = clnnVar.h;
                            if (cmny.b(null, null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() * 923521) + this.e.hashCode()) * 961) + this.g.hashCode()) * 31;
    }
}
