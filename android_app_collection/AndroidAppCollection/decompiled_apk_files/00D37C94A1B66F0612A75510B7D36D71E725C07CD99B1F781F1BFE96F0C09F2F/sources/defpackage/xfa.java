package defpackage;

import android.net.Uri;
import java.util.List;
/* compiled from: PG */
/* renamed from: xfa  reason: default package */
/* loaded from: classes4.dex */
public final class xfa implements Runnable {
    final /* synthetic */ Uri a;
    final /* synthetic */ List b;
    final /* synthetic */ boolean c;
    final /* synthetic */ xfb d;

    public xfa(xfb xfbVar, Uri uri, List list, boolean z) {
        this.d = xfbVar;
        this.a = uri;
        this.b = list;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String.valueOf(String.valueOf(this.a)).length();
        afwt h = this.d.h(this.a, this.b, this.c);
        aalj aaljVar = this.d.e;
        if (aaljVar != null) {
            h.d = aaljVar.b();
            h.e = this.d.e.a();
        }
        xey xeyVar = this.d.d;
        cez cezVar = afzr.a;
        if (xeyVar.a.matcher(h.b.toString()).find()) {
            xeyVar.b.a(h, cezVar);
        } else {
            xeyVar.b(h, cezVar);
        }
    }
}
