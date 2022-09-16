package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: acmf  reason: default package */
/* loaded from: classes.dex */
public final class acmf extends abni {
    private final azqb c;
    private final aafo d;

    public acmf(azqb azqbVar, Context context, aafo aafoVar, ajxz ajxzVar) {
        super(context, ajxzVar);
        azqbVar.getClass();
        this.c = azqbVar;
        aafoVar.getClass();
        this.d = aafoVar;
        int dimensionPixelOffset = this.b.getDimensionPixelOffset(R.dimen.live_chat_vem_margin_vertical);
        int dimensionPixelOffset2 = this.b.getDimensionPixelOffset(R.dimen.live_chat_vem_margin_horizontal);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.topMargin = dimensionPixelOffset;
        marginLayoutParams.bottomMargin = dimensionPixelOffset;
        marginLayoutParams.leftMargin = dimensionPixelOffset2;
        marginLayoutParams.rightMargin = dimensionPixelOffset2;
        this.a.setLayoutParams(marginLayoutParams);
    }

    @Override // defpackage.abni
    public final int d() {
        return R.layout.live_chat_light_overlay_viewer_engagement_message;
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
