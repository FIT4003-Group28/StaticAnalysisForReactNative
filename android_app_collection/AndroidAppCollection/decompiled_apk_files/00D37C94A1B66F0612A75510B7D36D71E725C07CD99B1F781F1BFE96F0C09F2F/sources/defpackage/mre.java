package defpackage;

import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mre  reason: default package */
/* loaded from: classes3.dex */
public final class mre implements ajru {
    private final fjx a;

    public mre(fjy fjyVar) {
        this.a = fjyVar.b(null, null, R.layout.swipe_button);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a.b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        mrd mrdVar = (mrd) obj;
        aopc aopcVar = (aopc) mrdVar.a.mo52toBuilder();
        if (!aopcVar.qn(apoh.b)) {
            aopcVar.e(apoh.b, apoh.a);
        }
        aopa mo52toBuilder = ((apoh) aopcVar.qm(apoh.b)).mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        apoh apohVar = (apoh) mo52toBuilder.instance;
        apohVar.d = 1;
        apohVar.c = 1 | apohVar.c;
        aopcVar.e(apoh.b, (apoh) mo52toBuilder.mo39build());
        mrdVar.a = (apoj) aopcVar.mo39build();
        this.a.oK(ajrsVar, mrdVar.a);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.a.qZ(ajsaVar);
    }
}
