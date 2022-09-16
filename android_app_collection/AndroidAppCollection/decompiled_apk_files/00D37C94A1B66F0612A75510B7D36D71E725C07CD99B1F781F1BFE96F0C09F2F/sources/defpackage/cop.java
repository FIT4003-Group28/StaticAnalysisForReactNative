package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;
/* compiled from: PG */
/* renamed from: cop  reason: default package */
/* loaded from: classes3.dex */
public final class cop implements cnq {
    private final cnq a;
    private final /* synthetic */ int b;

    public cop(cnq cnqVar) {
        this.a = cnqVar;
    }

    public cop(cnq cnqVar, int i) {
        this.b = i;
        this.a = cnqVar;
    }

    private static Uri c(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // defpackage.cnq
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        if (this.b == 0) {
            URL url = (URL) obj;
            return true;
        }
        String str = (String) obj;
        return true;
    }

    @Override // defpackage.cnq
    public final /* bridge */ /* synthetic */ cnp a(Object obj, int i, int i2, cic cicVar) {
        Uri c;
        if (this.b == 0) {
            return this.a.a(new cnf((URL) obj), i, i2, cicVar);
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            c = null;
        } else if (str.charAt(0) == '/') {
            c = c(str);
        } else {
            Uri parse = Uri.parse(str);
            c = parse.getScheme() == null ? c(str) : parse;
        }
        if (c != null && this.a.b(c)) {
            return this.a.a(c, i, i2, cicVar);
        }
        return null;
    }
}
