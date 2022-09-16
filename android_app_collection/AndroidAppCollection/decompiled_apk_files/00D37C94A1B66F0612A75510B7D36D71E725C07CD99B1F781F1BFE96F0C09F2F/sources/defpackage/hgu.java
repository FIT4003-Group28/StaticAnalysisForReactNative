package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack;
/* compiled from: PG */
/* renamed from: hgu  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hgu implements Runnable {
    public final /* synthetic */ hhc a;
    public final /* synthetic */ ShortsCreationSelectedTrack b;
    private final /* synthetic */ int c;

    public /* synthetic */ hgu(hhc hhcVar, ShortsCreationSelectedTrack shortsCreationSelectedTrack) {
        this.a = hhcVar;
        this.b = shortsCreationSelectedTrack;
    }

    public /* synthetic */ hgu(hhc hhcVar, ShortsCreationSelectedTrack shortsCreationSelectedTrack, int i) {
        this.c = i;
        this.a = hhcVar;
        this.b = shortsCreationSelectedTrack;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            this.a.A.c(this.b.g());
        } else if (i == 1) {
            hhc hhcVar = this.a;
            ShortsCreationSelectedTrack shortsCreationSelectedTrack = this.b;
            hhcVar.A.d = Long.valueOf(shortsCreationSelectedTrack.a());
        } else if (i == 2) {
            hhc hhcVar2 = this.a;
            ShortsCreationSelectedTrack shortsCreationSelectedTrack2 = this.b;
            hhcVar2.A.e = (Long) shortsCreationSelectedTrack2.d().c();
        } else {
            this.a.A.c(this.b.g());
        }
    }
}
