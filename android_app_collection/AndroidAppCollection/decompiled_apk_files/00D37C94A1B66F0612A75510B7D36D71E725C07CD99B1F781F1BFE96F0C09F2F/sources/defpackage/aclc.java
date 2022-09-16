package defpackage;

import com.google.android.libraries.youtube.metadataeditor.geo.Place;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: aclc  reason: default package */
/* loaded from: classes.dex */
final class aclc implements afqs {
    final /* synthetic */ acll a;

    public aclc(acll acllVar) {
        this.a = acllVar;
    }

    @Override // defpackage.afqs
    public final void d() {
        this.a.s();
    }

    @Override // defpackage.afqs
    public final void e(Place place) {
        this.a.ai.c(place);
        this.a.aj.c(place);
        this.a.c.b(R.id.pre_stream_content);
    }
}
