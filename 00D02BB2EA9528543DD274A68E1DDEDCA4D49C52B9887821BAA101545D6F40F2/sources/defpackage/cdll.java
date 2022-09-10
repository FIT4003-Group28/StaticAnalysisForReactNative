package defpackage;

import com.google.android.apps.gmm.ugc.post.photo.MediaData;
/* renamed from: cdll  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cdll implements dbrn {
    static final dbrn a = new cdll();

    private cdll() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        MediaData mediaData = (MediaData) obj;
        final bbtl w = bbtm.w(mediaData.a());
        dbsg<String> c = mediaData.c();
        w.getClass();
        bvor.a(c, new mw(w) { // from class: cdya
            private final bbtl a;

            {
                this.a = w;
            }

            @Override // defpackage.mw
            public final void a(Object obj2) {
                this.a.b((String) obj2);
            }
        });
        dbsg<String> b = mediaData.b();
        w.getClass();
        bvor.a(b, new mw(w) { // from class: cdyb
            private final bbtl a;

            {
                this.a = w;
            }

            @Override // defpackage.mw
            public final void a(Object obj2) {
                this.a.k((String) obj2);
            }
        });
        dbsg<Integer> d = mediaData.d();
        w.getClass();
        bvor.a(d, new mw(w) { // from class: cdyc
            private final bbtl a;

            {
                this.a = w;
            }

            @Override // defpackage.mw
            public final void a(Object obj2) {
                this.a.q((Integer) obj2);
            }
        });
        dbsg<Integer> e = mediaData.e();
        w.getClass();
        bvor.a(e, new mw(w) { // from class: cdyd
            private final bbtl a;

            {
                this.a = w;
            }

            @Override // defpackage.mw
            public final void a(Object obj2) {
                this.a.p((Integer) obj2);
            }
        });
        dbsg<Integer> f = mediaData.f();
        w.getClass();
        bvor.a(f, new mw(w) { // from class: cdye
            private final bbtl a;

            {
                this.a = w;
            }

            @Override // defpackage.mw
            public final void a(Object obj2) {
                this.a.n((Integer) obj2);
            }
        });
        return w.a();
    }
}
