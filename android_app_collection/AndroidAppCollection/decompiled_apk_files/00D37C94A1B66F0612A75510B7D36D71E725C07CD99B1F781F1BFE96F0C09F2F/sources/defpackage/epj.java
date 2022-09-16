package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.google.protos.youtube.api.innertube.CopyTextEndpointOuterClass$CopyTextEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: epj  reason: default package */
/* loaded from: classes3.dex */
public final class epj implements aafl {
    private final Context a;
    private final aafo b;

    public epj(Context context, aafo aafoVar) {
        this.a = context;
        aafoVar.getClass();
        this.b = aafoVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        CopyTextEndpointOuterClass$CopyTextEndpoint copyTextEndpointOuterClass$CopyTextEndpoint = (CopyTextEndpointOuterClass$CopyTextEndpoint) apzgVar.qm(CopyTextEndpointOuterClass$CopyTextEndpoint.copyTextEndpoint);
        ((ClipboardManager) this.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text/plain", copyTextEndpointOuterClass$CopyTextEndpoint.b));
        this.b.d(copyTextEndpointOuterClass$CopyTextEndpoint.c, null);
    }
}
