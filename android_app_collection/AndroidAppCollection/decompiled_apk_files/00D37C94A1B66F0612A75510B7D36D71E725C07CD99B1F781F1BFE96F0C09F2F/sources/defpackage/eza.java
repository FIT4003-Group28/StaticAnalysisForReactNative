package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: eza  reason: default package */
/* loaded from: classes3.dex */
public final class eza extends eyz {
    private final yni f;
    private final azqb g;

    public eza(azqb azqbVar, snc sncVar, yni yniVar) {
        super(azqbVar, sncVar);
        azqbVar.getClass();
        this.g = azqbVar;
        yniVar.getClass();
        this.f = yniVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eyz
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        arxs arxsVar = (arxs) obj;
        this.f.d(new ewt());
    }

    @Override // defpackage.eyz
    protected final /* bridge */ /* synthetic */ void i(aars aarsVar, aapd aapdVar, afzf afzfVar) {
        abbz abbzVar = (abbz) aarsVar;
        abbv abbvVar = (abbv) aapdVar;
        this.f.d(new ewu());
        abbzVar.b.i(abbvVar, afzfVar);
        abbvVar.p = new abbw(abbzVar);
    }

    public final abbv n(Uri uri, String str) {
        abbz abbzVar = (abbz) this.g.get();
        return new abbv(abbzVar.e, abbzVar.a.c(), uri, str);
    }

    public final void o(Uri uri, String str, afzf afzfVar) {
        h(n(uri, str), afzfVar);
    }
}
