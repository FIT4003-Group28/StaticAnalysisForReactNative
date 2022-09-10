package defpackage;

import android.net.Uri;
import com.google.android.apps.gmm.ugc.post.photo.MediaData;
/* compiled from: PG */
/* renamed from: cdxx  reason: default package */
/* loaded from: classes4.dex */
public final class cdxx extends an {
    public static final /* synthetic */ int j = 0;
    public final v<Boolean> a;
    public final z<cdwq> d = new z<>();
    public final z<dcdc<MediaData>> e;
    public final z<dcdc<MediaData>> f;
    public final v<dcdc<MediaData>> g;
    public final v<Boolean> h;
    public final z<dbsg<Integer>> i;
    private final x<dbsg<Integer>> k;

    static {
        Uri.parse("media://first");
    }

    public cdxx(ad adVar) {
        z<dbsg<Integer>> zVar = new z<>(dbpy.a);
        this.i = zVar;
        z<dcdc<MediaData>> b = adVar.b("serverMedia", dcdc.e());
        this.e = b;
        z<dcdc<MediaData>> b2 = adVar.b("clientMedia", dcdc.e());
        this.f = b2;
        final x xVar = new x();
        xVar.m(b, new aa(this, xVar) { // from class: cdxm
            private final cdxx a;
            private final x b;

            {
                this.a = this;
                this.b = xVar;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                cdxx cdxxVar = this.a;
                x xVar2 = this.b;
                dccx F = dcdc.F();
                F.i((dcdc) obj);
                F.i((Iterable) dbsg.j(cdxxVar.f.h()).c(dcdc.e()));
                xVar2.g(F.f());
            }
        });
        xVar.m(b2, new aa(this, xVar) { // from class: cdxo
            private final cdxx a;
            private final x b;

            {
                this.a = this;
                this.b = xVar;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                cdxx cdxxVar = this.a;
                x xVar2 = this.b;
                dccx F = dcdc.F();
                F.i((Iterable) dbsg.j(cdxxVar.e.h()).c(dcdc.e()));
                F.i((dcdc) obj);
                xVar2.g(F.f());
            }
        });
        this.g = xVar;
        this.h = am.a(xVar, cdxp.a);
        final x<dbsg<Integer>> xVar2 = new x<>();
        xVar2.g(dbpy.a);
        xVar2.m(zVar, new aa(this, xVar2) { // from class: cdxq
            private final cdxx a;
            private final x b;

            {
                this.a = this;
                this.b = xVar2;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                cdxx cdxxVar = this.a;
                x xVar3 = this.b;
                dcdc<MediaData> h = cdxxVar.e.h();
                dbsk.s(h);
                xVar3.g(cdxx.c((dbsg) obj, h.size()));
            }
        });
        xVar2.m(b, new aa(this, xVar2) { // from class: cdxr
            private final cdxx a;
            private final x b;

            {
                this.a = this;
                this.b = xVar2;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                cdxx cdxxVar = this.a;
                x xVar3 = this.b;
                dbsg<Integer> h = cdxxVar.i.h();
                dbsk.s(h);
                xVar3.g(cdxx.c(h, ((dcdc) obj).size()));
            }
        });
        this.k = xVar2;
        this.a = am.a(xVar2, cdxs.a);
    }

    public static dbsg<Integer> c(dbsg<Integer> dbsgVar, final int i) {
        return dbsgVar.h(new dbrn(i) { // from class: cdxt
            private final int a;

            {
                this.a = i;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return Integer.valueOf(Math.max(((Integer) obj).intValue() - this.a, 0));
            }
        });
    }

    public static void e(final Uri uri, z<dcdc<MediaData>> zVar) {
        zVar.g(dcbg.b((Iterable) dbsg.j(zVar.h()).c(dcdc.e())).o(new dbsl(uri) { // from class: cdxw
            private final Uri a;

            {
                this.a = uri;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                Uri uri2 = this.a;
                int i = cdxx.j;
                return !uri2.equals(((MediaData) obj).a());
            }
        }).z());
    }

    public static void f(final Uri uri, final String str, z<dcdc<MediaData>> zVar) {
        zVar.g(dcbg.b((Iterable) dbsg.j(zVar.h()).c(dcdc.e())).s(new dbrn(uri, str) { // from class: cdxn
            private final Uri a;
            private final String b;

            {
                this.a = uri;
                this.b = str;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                Uri uri2 = this.a;
                String str2 = this.b;
                MediaData mediaData = (MediaData) obj;
                int i = cdxx.j;
                if (!mediaData.a().equals(uri2)) {
                    return mediaData;
                }
                cdyf g = mediaData.g();
                g.b(dbsg.i(str2));
                return g.a();
            }
        }).z());
    }

    public final dbsg<Integer> d() {
        dbsg<Integer> h = this.k.h();
        dbsk.s(h);
        return h;
    }
}
