package defpackage;

import android.view.View;
import android.widget.Button;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
/* compiled from: PG */
/* renamed from: hnk  reason: default package */
/* loaded from: classes3.dex */
public final class hnk implements View.OnClickListener, hpy, zua {
    public View a;
    public ChooseFilterView b;
    public Button c;
    public boolean d;
    public float e;
    public hnj f;
    public acti g;

    @Override // defpackage.hpy
    public final float a() {
        if (this.d) {
            return this.e;
        }
        return 0.0f;
    }

    @Override // defpackage.hpy
    public final float b() {
        if (this.d) {
            return 0.0f;
        }
        return this.e;
    }

    @Override // defpackage.hpy
    public final View c() {
        return this.a;
    }

    public final void d() {
        if (this.d) {
            hqb.d(this);
            this.d = false;
        }
    }

    @Override // defpackage.hpy
    public final void e() {
    }

    @Override // defpackage.hpy
    public final void f() {
    }

    @Override // defpackage.zua
    public final void g() {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.c) {
            this.f.h();
            this.g.H(3, new acte(actj.UPLOAD_VIDEO_EDITING_CONFIRM_FILTER_BUTTON), null);
        }
    }
}
