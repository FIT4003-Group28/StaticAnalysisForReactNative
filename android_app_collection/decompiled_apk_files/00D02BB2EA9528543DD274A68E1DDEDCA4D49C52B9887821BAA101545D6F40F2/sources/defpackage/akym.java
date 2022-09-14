package defpackage;

import android.graphics.Rect;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akym  reason: default package */
/* loaded from: classes2.dex */
public final class akym extends akyc {
    final /* synthetic */ Rect a;
    final /* synthetic */ akqs d;

    public akym(Rect rect, akqs akqsVar) {
        this.a = rect;
        this.d = akqsVar;
    }

    @Override // defpackage.akyc
    public final void a(akyb akybVar) {
        int i;
        int a = akybVar.a();
        int b = akybVar.b();
        boolean z = false;
        if (a != 0) {
            if (b == 0) {
                i = 0;
                dbsk.m(z, "Map size should not be 0. Most likely, layout has not yet occurred for the map view.");
                akyt.p(akybVar, this.b, this.c, this.d, a, i, this.a.left, a - this.a.right, this.a.top, i - this.a.bottom);
            }
            z = true;
        }
        i = b;
        dbsk.m(z, "Map size should not be 0. Most likely, layout has not yet occurred for the map view.");
        akyt.p(akybVar, this.b, this.c, this.d, a, i, this.a.left, a - this.a.right, this.a.top, i - this.a.bottom);
    }
}
