package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mjw  reason: default package */
/* loaded from: classes3.dex */
public final class mjw implements ajru {
    private final YouTubeTextView a;
    private final ajrx b;

    public mjw(Context context, gem gemVar) {
        this.b = gemVar;
        YouTubeTextView youTubeTextView = (YouTubeTextView) View.inflate(context, R.layout.section_heading, null);
        this.a = youTubeTextView;
        gemVar.c(youTubeTextView);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.b).b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        this.a.setText(((ajyr) obj).a);
        this.b.e(ajrsVar);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
