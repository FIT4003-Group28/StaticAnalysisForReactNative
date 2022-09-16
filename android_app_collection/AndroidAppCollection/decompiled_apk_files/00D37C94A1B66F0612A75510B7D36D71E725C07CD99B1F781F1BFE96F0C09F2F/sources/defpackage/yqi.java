package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: yqi  reason: default package */
/* loaded from: classes4.dex */
public final class yqi {
    public static final yqi a = new yqi();
    public final Uri[] b;

    private yqi() {
        this.b = null;
    }

    public yqi(Uri[] uriArr) {
        uriArr.getClass();
        this.b = uriArr;
        aqxo.q(uriArr.length > 0, "No prewarming urls provided");
        for (Uri uri : uriArr) {
            uri.getClass();
        }
    }

    public final boolean a() {
        Uri[] uriArr = this.b;
        return uriArr != null && uriArr.length > 0;
    }
}
