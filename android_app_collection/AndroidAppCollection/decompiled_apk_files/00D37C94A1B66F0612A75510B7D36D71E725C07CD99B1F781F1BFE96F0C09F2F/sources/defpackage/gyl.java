package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.activity.ShortsCreationActivity;
import com.google.protos.youtube.api.innertube.ShortsCreationEndpointOuterClass$ShortsCreationEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gyl  reason: default package */
/* loaded from: classes3.dex */
public final class gyl implements aafl {
    private final Context a;
    private final airr b;

    public gyl(Context context, airr airrVar) {
        this.a = context;
        this.b = airrVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        Intent putExtra = new Intent(this.a, ShortsCreationActivity.class).putExtra("navigation_endpoint", apzgVar.toByteArray());
        this.b.a();
        this.a.startActivity(putExtra);
        if (!apzgVar.qn(ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint)) {
            afus.b(1, 6, "[ShortsCreation][Android]No ShortsCreationEndpoint extension when resolving command");
        }
    }
}
