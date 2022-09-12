package defpackage;

import com.google.android.apps.gmm.personalplaces.constellations.details.webview.RelatedListsWebViewCallbacks;
/* compiled from: PG */
/* renamed from: ayrl  reason: default package */
/* loaded from: classes3.dex */
public final class ayrl extends bvxb<dfvo, dfvq> {
    public static final ddho a = dtxy.er;
    public final ayrm b;
    public final bvvw c;
    private final gga d;

    public ayrl(gga ggaVar, ayrm ayrmVar, bvvw bvvwVar) {
        this.d = ggaVar;
        this.b = ayrmVar;
        this.c = bvvwVar;
    }

    @Override // defpackage.bvwz
    public final String c() {
        return "lsrl.olp";
    }

    @Override // defpackage.bvxb
    protected final /* bridge */ /* synthetic */ dfvq e(dfvo dfvoVar) {
        final dfvo dfvoVar2 = dfvoVar;
        this.d.runOnUiThread(new Runnable(this, dfvoVar2) { // from class: ayrk
            private final ayrl a;
            private final dfvo b;

            {
                this.a = this;
                this.b = dfvoVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ayrl ayrlVar = this.a;
                String str = this.b.a;
                if (str.isEmpty()) {
                    return;
                }
                bvvw bvvwVar = ayrlVar.c;
                bvvr e = bvvs.e();
                ((bvvn) e).b = new RelatedListsWebViewCallbacks(null);
                e.b(ayrlVar.b.a(str, 3));
                bvvwVar.r(e.a(), ayrl.a);
            }
        });
        return dfvq.a;
    }

    @Override // defpackage.bvxb
    protected final /* bridge */ /* synthetic */ dfvo j(byte[] bArr) {
        return ((dfvn) dfvo.b.bZ().by(bArr)).bK();
    }
}
