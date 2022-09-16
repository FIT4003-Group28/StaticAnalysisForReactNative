package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media.ShortsVideoMetadata;
import com.google.android.libraries.video.editablevideo.EditableVideoEdits;
import com.google.android.libraries.video.media.VideoMetaData;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: hhq  reason: default package */
/* loaded from: classes3.dex */
public final class hhq extends hhp {
    public final Uri a;
    public vqr b;
    public long c;

    public hhq(vqr vqrVar, Uri uri, long j, String str) {
        this.b = vqrVar;
        this.a = uri;
        this.c = j;
        this.l = str;
    }

    @Override // defpackage.hhp
    public final vqr B() {
        return this.b;
    }

    @Override // defpackage.hhp
    public final ampq d() {
        gyr e = ShortsVideoMetadata.e();
        vqr vqrVar = this.b;
        if (vqrVar != null) {
            VideoMetaData videoMetaData = vqrVar.b;
            long l = vqrVar.l();
            long n = this.b.n();
            e.c(videoMetaData.a);
            e.d(TimeUnit.MICROSECONDS.toMillis(l - n));
            e.b(videoMetaData.e);
            e.e(videoMetaData.d);
        }
        return ampq.j(e.a());
    }

    @Override // defpackage.hhp
    public final String l() {
        return "TrimDraft";
    }

    @Override // defpackage.hhp
    public final void q(Bundle bundle) {
        super.q(bundle);
        vqr vqrVar = this.b;
        if (vqrVar != null) {
            VideoMetaData videoMetaData = vqrVar.b;
            try {
                EditableVideoEdits editableVideoEdits = vqrVar.a;
                vsh vshVar = new vsh();
                vshVar.a = videoMetaData.a;
                vshVar.h = videoMetaData.g;
                vshVar.e = videoMetaData.e;
                vshVar.d = videoMetaData.d;
                vshVar.i = new long[]{0};
                vqrVar = new vqr(editableVideoEdits, vshVar.a());
            } catch (IOException unused) {
                zep.b("Error shrinking editable video, returning source video");
            }
            bundle.putParcelable("EDITABLE_VIDEO_EDITS_KEY", vqrVar.a);
            bundle.putParcelable("EDITABLE_VIDEO_METADATA_KEY", vqrVar.b);
        }
        bundle.putParcelable("SOURCE_VIDEO_URI_KEY", this.a);
        bundle.putLong("TIMELINE_WINDOW_START_US_KEY", this.c);
    }
}
