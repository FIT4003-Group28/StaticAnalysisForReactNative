package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jzk  reason: default package */
/* loaded from: classes3.dex */
public final class jzk implements ajru {
    private final gah a;
    private final View b;

    public jzk(Context context, ajsn ajsnVar, yni yniVar, ViewGroup viewGroup) {
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.app_related_endscreen_loading_view_wrapper, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) frameLayout.findViewById(R.id.container);
        Resources resources = context.getResources();
        tpj tpjVar = new tpj(-1.0f, resources.getDimensionPixelSize(R.dimen.app_related_end_screen_loading_progress_thickness), resources.getDimensionPixelSize(R.dimen.buffering_progress_inset), new int[]{resources.getColor(R.color.buffering_progress_color)});
        tpjVar.setAlpha(resources.getInteger(R.integer.buffering_progress_transparency));
        this.a = new gah(context, ajsnVar, yniVar, viewGroup2, tpjVar);
        this.b = frameLayout;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        this.a.oK(ajrsVar, (ajyv) obj);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.a.qZ(ajsaVar);
    }
}
