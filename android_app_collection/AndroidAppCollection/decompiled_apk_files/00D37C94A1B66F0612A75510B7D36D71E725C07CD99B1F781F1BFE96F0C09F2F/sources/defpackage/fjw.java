package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Space;
/* compiled from: PG */
/* renamed from: fjw  reason: default package */
/* loaded from: classes3.dex */
public final class fjw implements ajru {
    private final Context a;
    private final Space b;

    public fjw(Context context) {
        this.a = context;
        this.b = new Space(context);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        fju fjuVar = (fju) obj;
        int i = 0;
        if (ajrsVar.c("vertical_padding_should_display_top") != Boolean.FALSE || ajrsVar.c("position") != 0) {
            i = fjuVar.b != 1 ? fjuVar.a : zew.i(this.a.getResources().getDisplayMetrics(), fjuVar.a);
        }
        this.b.setMinimumHeight(i);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
