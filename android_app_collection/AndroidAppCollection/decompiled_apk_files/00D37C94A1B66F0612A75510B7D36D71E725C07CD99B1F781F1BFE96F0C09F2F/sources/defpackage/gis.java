package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CaptionPickerEndpointOuterClass$CaptionPickerEndpoint;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gis  reason: default package */
/* loaded from: classes3.dex */
public final class gis implements aafl, yiw {
    private final Context a;
    private final airr b;
    private final jwn c;
    private final aibe d;
    private final acth e;

    public gis(Context context, airr airrVar, jwn jwnVar, acth acthVar) {
        this.a = context;
        this.b = airrVar;
        jwnVar.getClass();
        this.c = jwnVar;
        this.d = new aibe(context);
        this.e = acthVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Void r2 = (Void) obj;
        zag.q(this.a, R.string.no_subtitles, 1);
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Void r4 = (Void) obj;
        this.d.c((List) obj2, new izp(this.b, 1), this.e);
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        CaptionPickerEndpointOuterClass$CaptionPickerEndpoint captionPickerEndpointOuterClass$CaptionPickerEndpoint = (CaptionPickerEndpointOuterClass$CaptionPickerEndpoint) apzgVar.qm(CaptionPickerEndpointOuterClass$CaptionPickerEndpoint.captionPickerEndpoint);
        if ((captionPickerEndpointOuterClass$CaptionPickerEndpoint.b & 1) == 0 || !captionPickerEndpointOuterClass$CaptionPickerEndpoint.c.equals(this.c.g())) {
            zag.q(this.a, R.string.error_selecting_subtitles, 1);
        } else {
            this.b.C(this);
        }
    }
}
