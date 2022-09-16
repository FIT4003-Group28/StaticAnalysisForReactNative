package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: acmc  reason: default package */
/* loaded from: classes.dex */
public final class acmc extends abmd {
    private final ajnj c;

    public acmc(Context context, ajmy ajmyVar) {
        super(context);
        this.c = new ajnj(ajmyVar.b(), this.b);
    }

    @Override // defpackage.abmd
    protected final int d() {
        return R.layout.live_chat_light_overlay_legacy_paid_message;
    }

    @Override // defpackage.abmd
    protected final ImageView e() {
        return (ImageView) this.a.findViewById(R.id.sponsor_thumbnail);
    }

    @Override // defpackage.abmd
    protected final TextView f() {
        return (TextView) this.a.findViewById(R.id.detail_text);
    }

    @Override // defpackage.abmd
    protected final TextView g() {
        return (TextView) this.a.findViewById(R.id.event_text);
    }

    @Override // defpackage.abmd
    protected final void h(avhn avhnVar) {
        this.c.k(avhnVar);
    }

    @Override // defpackage.abmd
    protected final void i(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_vertical_margin);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_horizontal_margin);
        zgd.u(this.a, new abmf(new ViewGroup.MarginLayoutParams(-2, -2), 4), zgd.b(zgd.s(-2, -2), zgd.m(dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset)), ViewGroup.MarginLayoutParams.class);
    }

    @Override // defpackage.abmd, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.c.a();
    }
}
