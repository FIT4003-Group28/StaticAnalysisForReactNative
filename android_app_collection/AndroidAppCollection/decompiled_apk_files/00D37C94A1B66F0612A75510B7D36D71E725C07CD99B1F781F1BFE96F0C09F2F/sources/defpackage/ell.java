package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ell  reason: default package */
/* loaded from: classes3.dex */
public final class ell implements ajru {
    private final Context a;
    private final View b;

    public ell(Context context) {
        this.a = context;
        this.b = LayoutInflater.from(context).inflate(R.layout.channel_list_sub_menu_divider, (ViewGroup) null);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        elk elkVar = (elk) obj;
        zgd.v(this.b, this.a.getResources().getDimensionPixelSize(R.dimen.channel_list_sub_menu_divider_container_width), this.a.getResources().getDimensionPixelSize(R.dimen.channel_list_sub_menu_divider_container_height));
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
