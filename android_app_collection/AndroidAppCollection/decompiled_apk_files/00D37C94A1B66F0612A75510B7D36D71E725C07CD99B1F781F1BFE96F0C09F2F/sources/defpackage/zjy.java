package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.google.android.libraries.youtube.edit.audioswap.model.Track;
import com.google.android.youtube.R;
import java.util.Observable;
/* compiled from: PG */
/* renamed from: zjy  reason: default package */
/* loaded from: classes4.dex */
public final class zjy extends Observable implements ota {
    public final acti a;
    public otb b;
    private final Context c;
    private final boolean d;
    private Track e;

    public zjy(Context context, acti actiVar, boolean z) {
        otb a = osz.a(1, 5000, 5000);
        this.c = context;
        this.a = actiVar;
        this.d = z;
        this.b = a;
        a.e(this);
        if (actiVar != null) {
            actiVar.n(new acte(actj.UPLOAD_VIDEO_EDITING_VIDEO_AUDIO_SWAP_TRACK_STOP_PREVIEW_BUTTON));
            actiVar.n(new acte(actj.UPLOAD_VIDEO_EDITING_VIDEO_AUDIO_SWAP_TRACK_START_PREVIEW_BUTTON));
            actiVar.n(new acte(actj.UPLOAD_VIDEO_EDITING_VIDEO_AUDIO_SWAP_TRACK_PREVIEW_ERROR));
        }
    }

    public final void a(boolean z) {
        acti actiVar;
        if (!c(null) || !z || (actiVar = this.a) == null || ((acsx) actiVar).i == null) {
            return;
        }
        actiVar.H(3, new acte(actj.UPLOAD_VIDEO_EDITING_VIDEO_AUDIO_SWAP_TRACK_STOP_PREVIEW_BUTTON), null);
    }

    public final boolean b(Track track) {
        Track track2 = this.e;
        track.getClass();
        return akzj.f(track2, track) && ((otd) this.b).e != 5;
    }

    public final boolean c(Track track) {
        oui otfVar;
        if (akzj.f(this.e, track)) {
            return false;
        }
        this.e = track;
        this.b.n();
        Track track2 = this.e;
        if (track2 != null) {
            if (this.d) {
                otfVar = new oxx(this.e.d, new pbq(this.c, pcx.l(this.c, "AudioMPEG")), new pbo(65536), 1310720, new oxq[0]);
            } else {
                otfVar = new otf(this.c, track2.d);
            }
            this.b.g(new otk(otfVar, otm.a));
            this.b.j(0L);
            this.b.l(true);
        }
        setChanged();
        notifyObservers(this);
        return true;
    }

    @Override // defpackage.ota
    public final void rL() {
    }

    @Override // defpackage.ota
    public final void rM(osx osxVar) {
        Toast.makeText(this.c, (int) R.string.upload_edit_audio_swap_preview_error, 0).show();
        acti actiVar = this.a;
        if (actiVar != null && ((acsx) actiVar).i != null) {
            actiVar.u(new acte(actj.UPLOAD_VIDEO_EDITING_VIDEO_AUDIO_SWAP_TRACK_PREVIEW_ERROR), null);
        }
        c(null);
    }

    @Override // defpackage.ota
    public final void rN(boolean z, int i) {
        if (i == 5) {
            c(null);
        }
    }
}
