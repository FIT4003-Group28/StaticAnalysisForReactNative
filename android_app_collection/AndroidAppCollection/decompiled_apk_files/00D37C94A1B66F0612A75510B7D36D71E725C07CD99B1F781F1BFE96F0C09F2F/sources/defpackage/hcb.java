package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.TextTrackView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hcb  reason: default package */
/* loaded from: classes3.dex */
public final class hcb implements ajru {
    public final TextTrackView a;
    private final View b;

    public hcb(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.text_track, viewGroup, false);
        this.b = inflate;
        this.a = (TextTrackView) inflate.findViewById(R.id.text_track_view);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        TextTrackView textTrackView = this.a;
        textTrackView.d = (hcn) obj;
        textTrackView.requestLayout();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
