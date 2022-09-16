package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: aftf  reason: default package */
/* loaded from: classes.dex */
public class aftf extends aftk implements aftr {
    public static final Long e(yrb yrbVar) {
        h(yrbVar);
        String a = yrbVar.c.a("Content-Range");
        if (a == null) {
            throw new zhy("Missing content range header");
        }
        int lastIndexOf = a.lastIndexOf("/") + 1;
        if (lastIndexOf <= 0 || lastIndexOf >= a.length()) {
            throw new zhy("Invalid content range header");
        }
        try {
            return Long.valueOf(Long.parseLong(a.substring(lastIndexOf)));
        } catch (NumberFormatException e) {
            throw new zhy(e);
        }
    }

    @Override // defpackage.aftr
    /* renamed from: a */
    public yqv c(Uri uri) {
        uri.getClass();
        yqu b = yqv.b(uri.toString());
        b.b("Range", "bytes=0-1");
        return b.a();
    }

    @Override // defpackage.aftk, defpackage.afts
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        return e((yrb) obj);
    }

    @Override // defpackage.aftk
    public final /* bridge */ /* synthetic */ Object d(yrb yrbVar) {
        return e(yrbVar);
    }
}
