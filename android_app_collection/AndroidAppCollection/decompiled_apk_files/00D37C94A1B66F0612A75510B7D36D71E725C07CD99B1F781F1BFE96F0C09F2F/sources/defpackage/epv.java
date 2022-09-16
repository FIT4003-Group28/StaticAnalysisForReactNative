package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.youtube.app.extensions.upload.EditVideoActivity;
import com.google.protos.youtube.api.innertube.EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: epv  reason: default package */
/* loaded from: classes3.dex */
public final class epv implements aafl {
    public final yni a;
    private final Context b;
    private final yjk c;

    public epv(Context context, yjk yjkVar, yni yniVar) {
        this.b = context;
        this.c = yjkVar;
        this.a = yniVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        Context context = this.b;
        String str = ((EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint) apzgVar.qm(EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint.editVideoMetadataEndpoint)).c;
        aoob aoobVar = apzgVar.c;
        str.getClass();
        Intent intent = new Intent(context, EditVideoActivity.class);
        intent.setAction("android.intent.action.EDIT");
        intent.putExtra("video_id", str);
        if (!aoobVar.H()) {
            intent.putExtra("click_tracking_params", aoobVar.I());
        }
        this.c.a(intent, 0, new yiu() { // from class: epu
            @Override // defpackage.yiu
            public final void kC(int i, int i2, Intent intent2) {
                epv epvVar = epv.this;
                if (intent2 == null || !intent2.getBooleanExtra("refresh_my_videos", false)) {
                    return;
                }
                epvVar.a.d(new ggo());
            }
        });
    }
}
