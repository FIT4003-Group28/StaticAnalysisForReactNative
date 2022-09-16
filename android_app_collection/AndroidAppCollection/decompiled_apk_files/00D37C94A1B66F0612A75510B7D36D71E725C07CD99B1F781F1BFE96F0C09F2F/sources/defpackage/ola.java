package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.android.apps.youtube.app.offline.ui.UploadArrowView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer;
/* compiled from: PG */
/* renamed from: ola  reason: default package */
/* loaded from: classes3.dex */
final class ola implements mdx {
    private final zap a;
    private final ilz b;

    public ola(imq imqVar, Context context, UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer) {
        ViewStub viewStub = new ViewStub(context);
        viewStub.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        viewStub.setLayoutResource(R.layout.pivot_bar_upload_indicator);
        zap b = zap.b(viewStub, UploadArrowView.class);
        this.a = b;
        ayor ayorVar = (ayor) imqVar.a.get();
        ayorVar.getClass();
        Context context2 = (Context) imqVar.b.get();
        context2.getClass();
        aagi aagiVar = (aagi) imqVar.c.get();
        aagiVar.getClass();
        ilv ilvVar = (ilv) imqVar.d.get();
        ilvVar.getClass();
        ilu iluVar = (ilu) imqVar.e.get();
        iluVar.getClass();
        aacz aaczVar = (aacz) imqVar.f.get();
        aaczVar.getClass();
        this.b = new imp(ayorVar, context2, aagiVar, ilvVar, iluVar, aaczVar, new imi(b), uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer);
    }

    @Override // defpackage.mdx
    public final View a() {
        this.b.b(true);
        zap zapVar = this.a;
        View view = zapVar.b;
        return view != null ? view : zapVar.a;
    }

    @Override // defpackage.mdx
    public final aynx b() {
        imp impVar = (imp) this.b;
        return impVar.b.C(new imb(impVar, 2)).C(oav.s);
    }

    @Override // defpackage.mdx
    public final aynx c() {
        return ((imp) this.b).b.C(ilt.k).n();
    }

    @Override // defpackage.mdx
    public final void d() {
        this.b.c(ily.FORCE_GONE);
        this.b.a(true);
    }

    @Override // defpackage.mdx
    public final void e() {
        this.b.c(ily.ALLOW_VISIBLE);
        this.b.a(false);
    }

    @Override // defpackage.zdx
    public final void j() {
        this.b.b(false);
    }
}
