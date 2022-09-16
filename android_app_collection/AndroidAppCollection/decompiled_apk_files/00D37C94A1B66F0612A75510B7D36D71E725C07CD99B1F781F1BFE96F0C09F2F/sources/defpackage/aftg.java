package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: aftg  reason: default package */
/* loaded from: classes.dex */
public final class aftg extends aftk implements aftr {
    public static final Long a(yrb yrbVar) {
        h(yrbVar);
        String a = yrbVar.c.a("Content-Length");
        if (a == null) {
            throw new zhy("Missing content length header");
        }
        try {
            return Long.valueOf(Long.parseLong(a));
        } catch (NumberFormatException e) {
            throw new zhy(e);
        }
    }

    @Override // defpackage.aftk, defpackage.afts
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        return a((yrb) obj);
    }

    @Override // defpackage.aftr
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        Uri uri = (Uri) obj;
        uri.getClass();
        String uri2 = uri.toString();
        yqu a = yqv.a();
        a.c = 5;
        a.a = uri2;
        return a.a();
    }

    @Override // defpackage.aftk
    public final /* bridge */ /* synthetic */ Object d(yrb yrbVar) {
        return a(yrbVar);
    }
}
