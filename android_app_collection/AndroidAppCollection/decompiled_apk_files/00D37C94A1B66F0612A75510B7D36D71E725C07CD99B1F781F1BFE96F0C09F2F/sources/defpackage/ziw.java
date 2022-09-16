package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ziw  reason: default package */
/* loaded from: classes4.dex */
public final class ziw {
    public final Map a = new HashMap();
    public final axnm b;

    public ziw(axnm axnmVar) {
        this.b = axnmVar;
    }

    public final void a(zjc zjcVar) {
        ylr.c();
        for (Uri uri : zjcVar.b) {
            zew.N(this.a, uri, zjcVar.a);
            Set set = (Set) this.a.get(uri);
            if (set == null || set.isEmpty()) {
                this.a.remove(uri);
            }
        }
    }
}
