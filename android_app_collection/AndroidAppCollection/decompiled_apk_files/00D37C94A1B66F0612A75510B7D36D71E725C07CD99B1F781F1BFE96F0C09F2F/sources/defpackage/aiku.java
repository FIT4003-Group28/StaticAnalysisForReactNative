package defpackage;

import android.util.Pair;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aiku  reason: default package */
/* loaded from: classes.dex */
public final class aiku implements aikx, aikp {
    public final ailf a;
    public final aimr b;
    public final aimn c;
    private final zey d;
    private final aiko e;
    private final aimd f;
    private final aadd g;
    private final Executor h;
    private final aiix i;

    public aiku(zey zeyVar, ailf ailfVar, aimr aimrVar, aimn aimnVar, aiko aikoVar, aimd aimdVar, aadd aaddVar, aiix aiixVar, Executor executor) {
        this.d = zeyVar;
        ailfVar.getClass();
        this.a = ailfVar;
        aimrVar.getClass();
        this.b = aimrVar;
        this.c = aimnVar;
        aikoVar.getClass();
        this.e = aikoVar;
        this.f = aimdVar;
        aaddVar.getClass();
        this.g = aaddVar;
        this.h = executor;
        aiixVar.getClass();
        this.i = aiixVar;
    }

    @Override // defpackage.aikx
    public final Pair a(PlaybackStartDescriptor playbackStartDescriptor, String str, aijp aijpVar, boolean z) {
        aijp aijpVar2;
        aimc a;
        ankt b;
        aynx a2;
        if (!this.i.l(playbackStartDescriptor) || this.a.f(playbackStartDescriptor)) {
            aijpVar2 = aijpVar;
            a = aimd.a(playbackStartDescriptor, aijpVar, this.g, str, new aikr(this, aijpVar2, 3), new aikr(this, aijpVar2, 1), z, this.h);
        } else {
            aaqk b2 = this.c.b(playbackStartDescriptor, str, aijpVar);
            aimd aimdVar = this.f;
            if (this.i.m()) {
                a2 = (aynx) this.e.a(b2.l(), new aikt(this, b2, playbackStartDescriptor, str, aijpVar));
            } else {
                a2 = this.c.a(b2, playbackStartDescriptor, str, aijpVar);
            }
            aijpVar2 = aijpVar;
            a = aimdVar.b(playbackStartDescriptor, aijpVar, str, a2, new aikr(this, aijpVar, 2), new ampg() { // from class: aikq
                @Override // defpackage.ampg
                public final Object apply(Object obj) {
                    return aiku.this.c((PlaybackStartDescriptor) obj);
                }
            }, z);
        }
        ankt b3 = a.b();
        if (a.a().h()) {
            b = (ankt) a.a().c();
        } else {
            b = this.b.b(playbackStartDescriptor, aijpVar2);
        }
        return Pair.create(b3, b);
    }

    @Override // defpackage.aikx
    public final ankt b(PlaybackStartDescriptor playbackStartDescriptor, String str, int i, aijp aijpVar) {
        this.a.d(playbackStartDescriptor, i);
        return this.a.b(playbackStartDescriptor, str, i, null, true, aijpVar);
    }

    @Override // defpackage.aikx
    public final ankt c(PlaybackStartDescriptor playbackStartDescriptor) {
        return this.b.a(playbackStartDescriptor);
    }

    @Override // defpackage.aikx
    public final ankt d(String str, PlaybackStartDescriptor playbackStartDescriptor, aijp aijpVar, boolean z) {
        aadd aaddVar = this.g;
        aikr aikrVar = new aikr(this, aijpVar);
        final aimr aimrVar = this.b;
        return aimd.a(playbackStartDescriptor, aijpVar, aaddVar, str, aikrVar, new ampg() { // from class: aiks
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                return aimr.this.a((PlaybackStartDescriptor) obj);
            }
        }, z, this.h).b();
    }

    @Override // defpackage.aikp
    public final void g(PlaybackStartDescriptor playbackStartDescriptor, String str, Executor executor, aijp aijpVar) {
        if (this.i.l(playbackStartDescriptor)) {
            if (!this.i.m()) {
                return;
            }
            String h = playbackStartDescriptor.h(this.d);
            aaqk b = this.c.b(playbackStartDescriptor, h, aijpVar);
            this.e.b(b.l(), new aikt(this, b, playbackStartDescriptor, h, aijpVar, 1), executor);
            return;
        }
        this.a.e(playbackStartDescriptor, str, executor, aijpVar);
    }
}
