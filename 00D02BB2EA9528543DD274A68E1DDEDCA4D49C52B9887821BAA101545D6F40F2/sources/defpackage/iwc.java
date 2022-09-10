package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: iwc  reason: default package */
/* loaded from: classes.dex */
public final class iwc {
    private final gga a;
    private final btvo b;
    private final akfa c;
    private String d = null;

    public iwc(gga ggaVar, akfa akfaVar, btvo btvoVar) {
        this.a = ggaVar;
        this.b = btvoVar;
        this.c = akfaVar;
    }

    public final String a(izr izrVar) {
        if (btlu.n(this.c.j())) {
            return this.a.getString(R.string.INCOGNITO_OMNIBOX_SEARCH_HINT);
        }
        if (this.d == null) {
            String a = this.b.getSearchParameters().a();
            if (dbsj.d(a)) {
                a = this.a.getString(R.string.SEARCH_HINT);
            }
            this.d = a;
        }
        return izrVar == izr.VIEW ? this.d : this.a.getString(R.string.SEARCH_HINT);
    }
}
