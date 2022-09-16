package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.common.audio.SfvAudioItemPlaybackController;
/* compiled from: PG */
/* renamed from: fzb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fzb implements aypv {
    private final /* synthetic */ int q;
    public static final /* synthetic */ fzb p = new fzb(16);
    public static final /* synthetic */ fzb o = new fzb(15);
    public static final /* synthetic */ fzb n = new fzb(14);
    public static final /* synthetic */ fzb m = new fzb(13);
    public static final /* synthetic */ fzb l = new fzb(12);
    public static final /* synthetic */ fzb k = new fzb(11);
    public static final /* synthetic */ fzb j = new fzb(10);
    public static final /* synthetic */ fzb i = new fzb(9);
    public static final /* synthetic */ fzb h = new fzb(8);
    public static final /* synthetic */ fzb g = new fzb(7);
    public static final /* synthetic */ fzb f = new fzb(6);
    public static final /* synthetic */ fzb e = new fzb(5);
    public static final /* synthetic */ fzb d = new fzb(4);
    public static final /* synthetic */ fzb c = new fzb(3);
    public static final /* synthetic */ fzb b = new fzb(2);
    public static final /* synthetic */ fzb a = new fzb();

    private /* synthetic */ fzb() {
    }

    public /* synthetic */ fzb(int i2) {
        this.q = i2;
    }

    @Override // defpackage.aypv
    public final void a() {
        int i2 = this.q;
        if (i2 == 10) {
            zep.b("Could not get link status from entities");
        } else if (i2 == 14) {
            zep.l("Could not retrieve a non-empty authToken");
        } else {
            switch (i2) {
                case 4:
                    int i3 = gmo.b;
                    afus.b(2, 1, "Could not retrieve survey entity on display");
                    return;
                case 5:
                    int i4 = gnb.b;
                    afus.b(2, 1, "Could not retrieve ad player fullscreen state entity on exit");
                    return;
                case 6:
                    int i5 = gne.d;
                    afus.b(2, 1, "Null survey on submit");
                    return;
                case 7:
                    long j2 = SfvAudioItemPlaybackController.a;
                    return;
                case 8:
                    long j3 = SfvAudioItemPlaybackController.a;
                    return;
                default:
                    return;
            }
        }
    }
}
