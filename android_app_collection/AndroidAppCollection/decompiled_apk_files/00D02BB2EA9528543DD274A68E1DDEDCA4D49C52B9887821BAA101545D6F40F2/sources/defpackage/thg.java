package defpackage;

import com.google.android.apps.gmm.directions.framework.fetch.api.FetchState;
/* compiled from: PG */
/* renamed from: thg  reason: default package */
/* loaded from: classes7.dex */
public final class thg {
    public tgj a;
    private final crzo<FetchState> b;

    public thg() {
        tgj c = FetchState.c();
        ((tga) c).a = FetchState.Fetch.c(tgk.NOT_STARTED);
        this.a = c;
        this.b = new crzo<>(this.a.a());
    }

    public final crzm<FetchState> a() {
        return this.b.a;
    }

    public final void b(FetchState.Fetch fetch) {
        this.a.b(fetch);
        d();
    }

    public final void c() {
        FetchState l = a().l();
        dbsk.s(l);
        if (l.a().a().equals(tgk.IN_PROGRESS)) {
            b(FetchState.Fetch.c(tgk.NOT_STARTED));
        }
    }

    public final void d() {
        this.b.b(this.a.a());
    }
}
