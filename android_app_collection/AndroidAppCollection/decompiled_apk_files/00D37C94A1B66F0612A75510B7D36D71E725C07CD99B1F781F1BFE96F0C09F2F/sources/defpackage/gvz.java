package defpackage;

import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: gvz  reason: default package */
/* loaded from: classes3.dex */
public final class gvz {
    public final View a;
    public final View b;
    public final gyx c;

    public gvz(View view) {
        this.a = view;
        this.b = view.findViewById(R.id.green_screen_media_item_thumbnail_border);
        View findViewById = view.findViewById(R.id.loading_spinner);
        this.c = findViewById == null ? null : new gyx(findViewById);
    }

    public final void a() {
        View view = this.b;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public final void b() {
        gyx gyxVar = this.c;
        if (gyxVar != null) {
            gyxVar.a();
        }
    }
}
