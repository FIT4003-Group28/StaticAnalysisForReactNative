package defpackage;

import android.net.Uri;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: afxg  reason: default package */
/* loaded from: classes.dex */
public final class afxg {
    public final azqb a;
    private final azqb b;
    private final azqb c;

    public afxg(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        this.b = azqbVar;
        this.c = azqbVar2;
        this.a = azqbVar3;
    }

    public final void a(Uri uri) {
        ylr.b();
        if (!((yrj) this.b.get()).o()) {
            return;
        }
        long c = ((snc) this.a.get()).c();
        String.format(Locale.US, "Prewarm %s", uri);
        afxf afxfVar = new afxf(this, uri.toString(), new afuv(2), c);
        afxfVar.h = false;
        afxfVar.s();
        ((yqw) this.c.get()).a(afxfVar);
    }
}
