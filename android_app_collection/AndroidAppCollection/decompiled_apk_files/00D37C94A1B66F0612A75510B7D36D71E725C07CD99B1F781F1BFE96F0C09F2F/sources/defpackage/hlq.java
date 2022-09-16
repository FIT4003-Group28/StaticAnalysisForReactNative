package defpackage;

import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hlq  reason: default package */
/* loaded from: classes3.dex */
public final class hlq implements zdt {
    public boolean a;
    private final View b;
    private final acti c;
    private final acup d;
    private boolean e;
    private boolean f = true;

    public hlq(View view, acti actiVar, acup acupVar) {
        this.b = view;
        actiVar.getClass();
        this.c = actiVar;
        this.d = acupVar;
    }

    private final void d() {
        View view = this.b;
        if (view == null) {
            return;
        }
        int i = 0;
        boolean z = this.e && this.f;
        view.setEnabled(z);
        View view2 = this.b;
        if (true != z) {
            i = 4;
        }
        view2.setVisibility(i);
    }

    @Override // defpackage.zdt
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Boolean bool = (Boolean) obj;
        if (this.b == null) {
            return;
        }
        if (!this.e) {
            acup acupVar = this.d;
            if (acupVar != null) {
                this.c.n(new acte(acupVar));
            }
            this.e = true;
        }
        d();
        if (!this.a) {
            return;
        }
        int i = true != bool.booleanValue() ? 8 : 0;
        View view = this.b;
        if (view == null || view.findViewById(R.id.reel_camera_effect_new_indicator) == null) {
            return;
        }
        this.b.findViewById(R.id.reel_camera_effect_new_indicator).setVisibility(i);
    }

    public final void b() {
        this.f = false;
        d();
    }

    public final void c() {
        this.f = true;
        d();
    }
}
