package defpackage;

import android.view.View;
import com.google.protos.youtube.api.innertube.ApplicationSettingsEndpointOuterClass;
/* compiled from: PG */
/* renamed from: jpp  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jpp implements View.OnClickListener {
    public final /* synthetic */ jpu a;
    private final /* synthetic */ int b;

    public /* synthetic */ jpp(jpu jpuVar) {
        this.a = jpuVar;
    }

    public /* synthetic */ jpp(jpu jpuVar, int i) {
        this.b = i;
        this.a = jpuVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            aafo aafoVar = this.a.c;
            aopa createBuilder = aphw.a.createBuilder();
            String num = Integer.toString(10013);
            createBuilder.copyOnWrite();
            aphw aphwVar = (aphw) createBuilder.instance;
            num.getClass();
            aphwVar.b |= 8;
            aphwVar.e = num;
            aopc aopcVar = (aopc) apzg.a.createBuilder();
            aopcVar.e(ApplicationSettingsEndpointOuterClass.applicationSettingsEndpoint, (aphw) createBuilder.mo39build());
            aafoVar.c((apzg) aopcVar.mo39build(), null);
            return;
        }
        aafo aafoVar2 = this.a.c;
        aopc aopcVar2 = (aopc) far.a.mo52toBuilder();
        aopg aopgVar = atno.b;
        aopa createBuilder2 = atnp.a.createBuilder();
        int i = actj.OFFLINE_VIDEO_DOWNLOADING_SNACKBAR_VIEW_BUTTON.II;
        createBuilder2.copyOnWrite();
        atnp atnpVar = (atnp) createBuilder2.instance;
        atnpVar.b |= 2;
        atnpVar.d = i;
        aopcVar2.e(aopgVar, (atnp) createBuilder2.mo39build());
        aafoVar2.a((apzg) aopcVar2.mo39build());
    }
}
