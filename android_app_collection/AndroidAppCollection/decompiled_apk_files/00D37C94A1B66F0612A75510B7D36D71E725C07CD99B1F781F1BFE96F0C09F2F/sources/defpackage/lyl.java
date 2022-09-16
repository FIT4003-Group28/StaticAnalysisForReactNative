package defpackage;

import android.content.res.Configuration;
import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: lyl  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lyl implements ayqb {
    public final /* synthetic */ lyn a;
    private final /* synthetic */ int b;

    public /* synthetic */ lyl(lyn lynVar) {
        this.a = lynVar;
    }

    public /* synthetic */ lyl(lyn lynVar, int i) {
        this.b = i;
        this.a = lynVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        fsx fsxVar;
        View view;
        ImageView imageView;
        fsx fsxVar2;
        View view2;
        if (this.b == 0) {
            this.a.q = (amvn) obj;
            return;
        }
        lyn lynVar = this.a;
        Configuration configuration = (Configuration) obj;
        if (eog.aX(lynVar.A) && (fsxVar2 = lynVar.p) != null && (view2 = fsxVar2.a.b) != null) {
            lynVar.h.d(view2);
        }
        boolean z = configuration.screenWidthDp < 320;
        if (lynVar.w == z || (fsxVar = lynVar.p) == null || (view = fsxVar.a.b) == null || (imageView = (ImageView) view.findViewById(R.id.youtube_logo)) == null) {
            return;
        }
        lynVar.w = z;
        lynVar.j(imageView);
    }
}
