package defpackage;

import android.net.Uri;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: adbg  reason: default package */
/* loaded from: classes.dex */
final class adbg implements adwb {
    final /* synthetic */ adbl a;
    final /* synthetic */ adqe b;
    final /* synthetic */ adit c;

    public adbg(adbl adblVar, adit aditVar, adqe adqeVar) {
        this.a = adblVar;
        this.c = aditVar;
        this.b = adqeVar;
    }

    @Override // defpackage.adwb
    public final void a(IOException iOException) {
        this.b.b(-1, 4, -1);
    }

    @Override // defpackage.adwb
    public final void i(yrb yrbVar) {
        int i = yrbVar.a;
        if (i < 200 || i >= 400) {
            if (i >= 400 && i < 500) {
                this.b.b(i, 2, -1);
                return;
            } else if (i >= 500) {
                this.b.b(i, 0, -1);
                return;
            } else {
                this.b.b(i, 5, -1);
                return;
            }
        }
        this.a.b.a(new adbj(-1, this.c, this.b));
        Uri uri = null;
        Uri parse = yrbVar.c.a("LOCATION") != null ? Uri.parse(yrbVar.c.a("LOCATION")) : null;
        if (parse == null || parse.getHost() != null) {
            uri = parse;
        }
        adqe adqeVar = this.b;
        adqeVar.a.ak.c(5);
        String str = adqh.a;
        String valueOf = String.valueOf(adqeVar.a.m);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
        sb.append("Successfully launched YouTube TV on DIAL device ");
        sb.append(valueOf);
        zep.h(str, sb.toString());
        adqeVar.a.l = uri;
    }
}
