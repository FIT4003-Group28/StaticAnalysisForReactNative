package defpackage;

import android.media.session.MediaController;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: mh  reason: default package */
/* loaded from: classes7.dex */
public final class mh extends mg {
    protected final MediaController.TransportControls a;

    public mh(MediaController.TransportControls transportControls) {
        this.a = transportControls;
    }

    @Override // defpackage.mg
    public final void a() {
        this.a.play();
    }

    @Override // defpackage.mg
    public final void b(String str, Bundle bundle) {
        this.a.playFromMediaId(str, bundle);
    }

    @Override // defpackage.mg
    public final void c() {
        this.a.pause();
    }

    @Override // defpackage.mg
    public final void d() {
        this.a.fastForward();
    }

    @Override // defpackage.mg
    public final void e() {
        this.a.skipToNext();
    }

    @Override // defpackage.mg
    public final void f() {
        this.a.rewind();
    }

    @Override // defpackage.mg
    public final void g() {
        this.a.skipToPrevious();
    }
}
