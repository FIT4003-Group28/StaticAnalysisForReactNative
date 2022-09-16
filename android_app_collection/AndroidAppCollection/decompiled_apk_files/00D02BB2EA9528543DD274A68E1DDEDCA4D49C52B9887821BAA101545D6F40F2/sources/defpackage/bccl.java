package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bccl  reason: default package */
/* loaded from: classes3.dex */
final class bccl implements bcku {
    final /* synthetic */ bccn a;

    public bccl(bccn bccnVar) {
        this.a = bccnVar;
    }

    @Override // defpackage.bcku
    public final cjtd a(@dzsi ilo iloVar, dbsg<String> dbsgVar) {
        if (iloVar == null) {
            return cjtd.b;
        }
        cjta b = cjtd.b();
        b.g = decs.a(iloVar.ai().c);
        b.g((String) ((dbsu) dbsgVar).a);
        b.d = dtxy.bR;
        return b.a();
    }

    @Override // defpackage.bcku
    public final cjtd b(@dzsi ilo iloVar) {
        if (iloVar == null || iloVar.ai().c == 0) {
            return cjtd.b;
        }
        cjta b = cjtd.b();
        b.d = dtxy.bS;
        b.g = decs.a(iloVar.ai().c);
        return b.a();
    }

    @Override // defpackage.bcku
    public final CharSequence c(String str) {
        Context H = this.a.H();
        return H == null ? "" : H.getResources().getString(R.string.GALLERY_COLLECTIONS_SELECTED_COLLECTION_THUMBNAIL_ACCESSIBILITY, str);
    }

    @Override // defpackage.bcku
    public final CharSequence d(String str) {
        Context H = this.a.H();
        return H == null ? "" : H.getResources().getString(R.string.GALLERY_COLLECTIONS_NON_SELECTED_COLLECTION_THUMBNAIL_ACCESSIBILITY, str);
    }
}
