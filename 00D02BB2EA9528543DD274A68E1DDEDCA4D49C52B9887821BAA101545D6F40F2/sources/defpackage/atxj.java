package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: atxj  reason: default package */
/* loaded from: classes2.dex */
final class atxj implements ajxz {
    final /* synthetic */ atxm a;

    public atxj(atxm atxmVar) {
        this.a = atxmVar;
    }

    @Override // defpackage.ajxz
    public final boolean a() {
        return true;
    }

    @Override // defpackage.ajxz
    public final cxsz b() {
        boolean b = this.a.b.b();
        cxsy a = cxsz.a();
        a.b();
        a.b = R.dimen.journey_sharing_ui_face_row_item_size;
        a.c = R.dimen.journey_sharing_ui_face_row_text_size;
        a.e = ajus.d(b);
        a.c();
        return a.a();
    }

    @Override // defpackage.ajxz
    public final cxsq c() {
        return ajus.d(this.a.b.b());
    }
}
