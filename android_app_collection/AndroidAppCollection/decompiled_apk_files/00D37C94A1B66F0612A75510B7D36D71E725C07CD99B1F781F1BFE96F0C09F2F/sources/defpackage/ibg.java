package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ibg  reason: default package */
/* loaded from: classes3.dex */
public final class ibg extends ibk {
    public final ViewGroup t;
    public final ajhl u;
    public final acth v;
    public final icr w;
    public final ajin x;
    public String y;
    public iaj z;

    public ibg(ajhl ajhlVar, ajin ajinVar, acth acthVar, icr icrVar, ViewGroup viewGroup, boolean z) {
        super((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.reel_watch_survey_page, viewGroup, false));
        this.u = ajhlVar;
        this.x = ajinVar;
        this.v = acthVar;
        this.w = icrVar;
        this.t = (ViewGroup) this.a.findViewById(R.id.reel_watch_survey_element_container);
        View findViewById = this.a.findViewById(R.id.reel_back_button);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: ibf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ibg.this.w.b();
            }
        });
        hqs.a(findViewById);
        hqs.c(findViewById, z);
    }

    @Override // defpackage.ibk
    public final iaj E() {
        return this.z;
    }

    @Override // defpackage.ibk
    public final void F() {
        iaj iajVar = this.z;
        if (iajVar != null) {
            iajVar.f = null;
            this.z = null;
        }
        this.y = null;
        this.t.removeAllViews();
        this.u.qZ(null);
    }
}
