package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: iqf  reason: default package */
/* loaded from: classes3.dex */
public final class iqf extends ipd {
    public yzj a;
    public abaz ae;
    public aafo af;
    public ajsg ag;
    public axnm ah;
    public String ai;
    public audx aj;
    public fsx ak;
    public LoadingFrameLayout al;
    public lrp am;
    public yni b;
    public ggb c;
    public afvn d;
    public ajmy e;

    @Override // defpackage.gbd, defpackage.dp
    public final void Y() {
        super.Y();
        if (!this.d.t()) {
            this.at.c(false);
        }
    }

    @Override // defpackage.gbd
    public final fsx lt() {
        if (this.ak == null) {
            this.ak = q();
        }
        return this.ak;
    }

    @Override // defpackage.gbd, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        this.ai = this.m.getString("playlist_id");
    }

    @Override // defpackage.gbd, defpackage.dp
    public final void mS() {
        super.mS();
        this.b.g(this.am);
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) layoutInflater.inflate(R.layout.playlist_editor_collaboration_section_fragment, viewGroup, false);
        this.al = loadingFrameLayout;
        loadingFrameLayout.f(new iqc(this));
        this.am = new lrp(this.ap, this.af, this.ag, this.ai, this.al, this.c, this.e, oi());
        r(this.ai);
        return this.al;
    }

    @Override // defpackage.dp
    public final void my() {
        super.my();
        this.b.m(this.am);
    }

    public final fsx q() {
        final CharSequence charSequence;
        audx audxVar = this.aj;
        if (audxVar != null) {
            arag aragVar = audxVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            charSequence = ajgl.b(aragVar);
        } else {
            charSequence = "";
        }
        fsw a = this.as.a();
        a.m(new ampg() { // from class: iqb
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                frz frzVar = (frz) obj;
                frzVar.a = charSequence;
                frzVar.d(amyg.a);
                return frzVar;
            }
        });
        return a.a();
    }

    public final void r(String str) {
        abaw e = this.ae.e();
        e.t(str);
        e.k(aadi.b);
        this.al.c();
        this.ae.h(e, new iqd(this));
    }
}
