package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: xtg  reason: default package */
/* loaded from: classes4.dex */
public final class xtg implements ajru {
    private final View a;
    private final View b;

    public xtg(Context context) {
        View inflate = View.inflate(context, R.layout.comment_thread_footer, null);
        this.a = inflate;
        this.b = inflate.findViewById(R.id.comment_thread_footer);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        aqbu aqbuVar = (aqbu) obj;
        this.b.setVisibility(0);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
