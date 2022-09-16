package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ e a;
    private final /* synthetic */ int b;

    public /* synthetic */ h(e eVar, int i) {
        this.b = i;
        this.a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        String str = "due to no playlist being set.";
        if (i == 0) {
            e eVar = this.a;
            a aVar = eVar.d;
            if (aVar == null || !aVar.j()) {
                if (true == (eVar.d instanceof b)) {
                    str = "as already at the end of the playlist.";
                }
                aqvb.l(str.length() != 0 ? "Ignoring call to next() on YouTubeThumbnailView ".concat(str) : new String("Ignoring call to next() on YouTubeThumbnailView "), new Object[0]);
                return;
            }
            eVar.d.f();
        } else if (i == 1) {
            a aVar2 = this.a.d;
            if (aVar2 == null) {
                aqvb.l("Ignoring call to first() on YouTubeThumbnailView due to no playlist being set.", new Object[0]);
            } else {
                aVar2.e();
            }
        } else {
            e eVar2 = this.a;
            a aVar3 = eVar2.d;
            if (aVar3 == null || !aVar3.k()) {
                if (true == (eVar2.d instanceof b)) {
                    str = "as already at the start of the playlist.";
                }
                aqvb.l(str.length() != 0 ? "Ignoring call to previous() on YouTubeThumbnailView ".concat(str) : new String("Ignoring call to previous() on YouTubeThumbnailView "), new Object[0]);
                return;
            }
            eVar2.d.g();
        }
    }
}
