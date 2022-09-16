package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kxp  reason: default package */
/* loaded from: classes3.dex */
public final class kxp extends ajsl {
    ajsl a;
    private final kxq b;
    private final kxs c;
    private final kxr d;
    private final FrameLayout e;
    private ajsl f;
    private ajsl g;
    private ajsl h;
    private ajsl i;
    private ajsl j;

    public kxp(Context context, kxq kxqVar, kxs kxsVar, kxr kxrVar) {
        this.b = kxqVar;
        this.c = kxsVar;
        this.d = kxrVar;
        this.e = new FrameLayout(context);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.e;
    }

    @Override // defpackage.ajsl
    public final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        ajsl ajslVar;
        apvm apvmVar = (apvm) obj;
        if (ajrsVar.c("clarify_box_in_metadata_highlights") == Boolean.TRUE) {
            int e = apwt.e(apvmVar.i);
            if (e != 0 && e == 4) {
                if (this.j == null) {
                    this.j = this.d.a(this.e);
                }
                ajslVar = this.j;
            } else {
                int e2 = apwt.e(apvmVar.i);
                if (e2 != 0 && e2 == 3) {
                    if (this.g == null) {
                        this.g = this.c.a(R.layout.clarification_metadata_highlights_item_medium, this.e);
                    }
                    ajslVar = this.g;
                } else {
                    if (this.f == null) {
                        this.f = this.b.a(R.layout.clarification_metadata_highlights_item_small, this.e);
                    }
                    ajslVar = this.f;
                }
            }
        } else {
            int e3 = apwt.e(apvmVar.i);
            if (e3 != 0 && e3 == 4) {
                if (this.j == null) {
                    this.j = this.d.a(this.e);
                }
                ajslVar = this.j;
            } else {
                int e4 = apwt.e(apvmVar.i);
                if (e4 != 0 && e4 == 3) {
                    if (this.i == null) {
                        this.i = this.c.a(R.layout.clarification_item_medium, this.e);
                    }
                    ajslVar = this.i;
                } else {
                    if (this.h == null) {
                        this.h = this.b.a(R.layout.clarification_item_small, this.e);
                    }
                    ajslVar = this.h;
                }
            }
        }
        this.a = ajslVar;
        this.e.removeAllViews();
        this.e.addView(this.a.a());
        this.a.oK(ajrsVar, apvmVar);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((apvm) obj).m.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        ajsl ajslVar = this.a;
        if (ajslVar != null) {
            ajslVar.qZ(ajsaVar);
        }
    }
}
