package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kcm  reason: default package */
/* loaded from: classes3.dex */
public final class kcm implements aizf {
    public final nxg a;
    public final azpa b;
    public View c;
    private final Context d;

    public kcm(Context context) {
        this.d = context;
        final azpa ar = azpa.ar();
        this.b = ar;
        this.a = new nxg() { // from class: kck
            @Override // defpackage.nxg
            public final void n(int i) {
                azpa.this.c(Integer.valueOf(i));
            }
        };
    }

    public final void a() {
        if (this.c != null) {
            return;
        }
        this.c = LayoutInflater.from(this.d).inflate(R.layout.engagement_panel_scrim_overlay, (ViewGroup) null);
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new aizh(-1, -1, false);
    }

    @Override // defpackage.aizf
    public final View kZ() {
        a();
        return this.c;
    }
}
