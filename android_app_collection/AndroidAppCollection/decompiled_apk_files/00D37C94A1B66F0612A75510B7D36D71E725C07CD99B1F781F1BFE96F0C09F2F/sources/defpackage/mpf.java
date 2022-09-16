package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mpf  reason: default package */
/* loaded from: classes3.dex */
public final class mpf implements ajru {
    private final frf a;
    private final View b;

    public mpf(Context context) {
        frf frfVar = new frf(zhn.j(context, R.attr.ytSeparator).orElse(0), context.getResources().getDimensionPixelSize(R.dimen.line_separator_height));
        this.a = frfVar;
        frfVar.c(16);
        frfVar.e(true);
        View inflate = LayoutInflater.from(context).inflate(R.layout.separator_with_padding, (ViewGroup) null, false);
        this.b = inflate;
        zav.c(inflate, frfVar);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        mpe mpeVar = (mpe) obj;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
