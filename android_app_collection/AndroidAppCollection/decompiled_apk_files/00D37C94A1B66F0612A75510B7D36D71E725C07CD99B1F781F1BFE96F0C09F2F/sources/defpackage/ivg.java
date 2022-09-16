package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ivg  reason: default package */
/* loaded from: classes3.dex */
public final class ivg extends abni {
    private final azqb c;
    private final aafo d;

    public ivg(azqb azqbVar, Context context, aafo aafoVar, ajxz ajxzVar) {
        super(context, ajxzVar);
        azqbVar.getClass();
        this.c = azqbVar;
        aafoVar.getClass();
        this.d = aafoVar;
    }

    @Override // defpackage.abni
    public final int d() {
        return R.layout.live_chat_light_viewer_engagement_message;
    }

    @Override // defpackage.abni
    public final aafo e() {
        return this.d;
    }

    @Override // defpackage.abni
    public final Map f() {
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", (abhh) this.c.get());
        return hashMap;
    }
}
