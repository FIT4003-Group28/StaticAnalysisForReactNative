package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: abau  reason: default package */
/* loaded from: classes.dex */
public final class abau extends aaqs {
    public String a;

    public abau(aaqf aaqfVar, afvm afvmVar) {
        super("playlist/delete", aaqfVar, afvmVar);
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = asaz.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        asaz asazVar = (asaz) createBuilder.instance;
        str.getClass();
        asazVar.b |= 2;
        asazVar.d = str;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        aqxo.y(!TextUtils.isEmpty(this.a));
    }
}
