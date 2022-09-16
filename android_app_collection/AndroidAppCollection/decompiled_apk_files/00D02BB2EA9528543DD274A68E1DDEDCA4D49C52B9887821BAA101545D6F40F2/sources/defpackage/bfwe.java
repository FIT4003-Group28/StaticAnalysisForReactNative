package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bfwe  reason: default package */
/* loaded from: classes3.dex */
public final class bfwe implements bcku {
    private final Activity a;

    public bfwe(Activity activity) {
        this.a = activity;
    }

    @Override // defpackage.bcku
    public final cjtd a(@dzsi ilo iloVar, dbsg<String> dbsgVar) {
        if (iloVar == null) {
            return cjtd.b;
        }
        cjta b = cjtd.b();
        b.d = dtxy.iV;
        b.g = decs.a(iloVar.ai().c);
        b.g((String) ((dbsu) dbsgVar).a);
        return b.a();
    }

    @Override // defpackage.bcku
    public final cjtd b(@dzsi ilo iloVar) {
        if (iloVar == null || iloVar.ai().c == 0) {
            return cjtd.b;
        }
        cjta b = cjtd.b();
        b.d = dtxy.iU;
        b.g = decs.a(iloVar.ai().c);
        return b.a();
    }

    @Override // defpackage.bcku
    public final CharSequence c(String str) {
        return "";
    }

    @Override // defpackage.bcku
    public final CharSequence d(String str) {
        return this.a.getResources().getString(R.string.IMAGE_COLLECTION_THUMBNAIL_ACCESSIBILITY, str);
    }
}
