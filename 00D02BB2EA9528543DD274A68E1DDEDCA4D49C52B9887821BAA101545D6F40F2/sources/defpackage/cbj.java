package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
/* compiled from: PG */
/* renamed from: cbj  reason: default package */
/* loaded from: classes.dex */
public final class cbj<Data> implements cap<String, Data> {
    private final cap<Uri, Data> a;

    public cbj(cap<Uri, Data> capVar) {
        this.a = capVar;
    }

    private static Uri c(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // defpackage.cap
    public final /* bridge */ /* synthetic */ boolean a(String str) {
        return true;
    }

    @Override // defpackage.cap
    public final /* bridge */ /* synthetic */ cao b(String str, int i, int i2, bua buaVar) {
        Uri uri;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            uri = null;
        } else {
            if (str2.charAt(0) != '/') {
                Uri parse = Uri.parse(str2);
                if (parse.getScheme() != null) {
                    uri = parse;
                }
            }
            uri = c(str2);
        }
        if (uri == null || !this.a.a(uri)) {
            return null;
        }
        return this.a.b(uri, i, i2, buaVar);
    }
}
