package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: elv  reason: default package */
/* loaded from: classes3.dex */
public final class elv extends ajsl {
    private final fmr a;
    private final View b;

    public elv(Context context, fms fmsVar) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.toggle_button, (ViewGroup) null);
        this.b = inflate;
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.channel_list_toggle_button_padding);
        inflate.setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        this.a = fmsVar.a(inflate);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        this.a.b((apos) obj);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((apos) obj).v.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.a.b(null);
    }
}
