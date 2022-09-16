package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack;
/* compiled from: PG */
/* renamed from: hbo  reason: default package */
/* loaded from: classes3.dex */
public final class hbo extends ajqd {
    hbr a;

    public hbo(ayoi ayoiVar, ayor ayorVar) {
        ayoiVar.X(ayorVar).as(new ayqb() { // from class: hbn
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                hbo hboVar = hbo.this;
                ampq ampqVar = (ampq) obj;
                if (ampqVar.h()) {
                    hboVar.a = new hbr((ShortsCreationSelectedTrack) ampqVar.c());
                } else {
                    hboVar.a = null;
                }
                hboVar.v();
            }
        });
    }

    @Override // defpackage.ajqm
    public final int a() {
        return this.a == null ? 0 : 1;
    }

    @Override // defpackage.ajqm
    public final long b(int i) {
        return -1L;
    }

    @Override // defpackage.ajqm
    public final Object c(int i) {
        hbr hbrVar = this.a;
        hbrVar.getClass();
        return hbrVar;
    }

    @Override // defpackage.ajqm
    public final boolean contains(Object obj) {
        throw null;
    }

    @Override // defpackage.ajqm
    public final boolean isEmpty() {
        return this.a == null;
    }
}
