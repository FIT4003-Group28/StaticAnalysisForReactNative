package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mjc  reason: default package */
/* loaded from: classes3.dex */
public final class mjc implements ajru {
    private final Context a;
    private final View b;
    private final ajrx c;

    /* JADX WARN: Type inference failed for: r4v1, types: [ajrx, java.lang.Object] */
    public mjc(Context context, amqo amqoVar) {
        this.a = context;
        ?? r4 = amqoVar.get();
        this.c = r4;
        View inflate = View.inflate(context, R.layout.empty_footer, null);
        this.b = inflate;
        r4.c(inflate);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c.a();
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        ajxr ajxrVar = (ajxr) obj;
        if (zew.y(this.a)) {
            this.b.setMinimumHeight(this.a.getResources().getDimensionPixelSize(R.dimen.empty_footer_min_height_linear_grid_feed_tablet));
        }
        this.c.e(ajrsVar);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
