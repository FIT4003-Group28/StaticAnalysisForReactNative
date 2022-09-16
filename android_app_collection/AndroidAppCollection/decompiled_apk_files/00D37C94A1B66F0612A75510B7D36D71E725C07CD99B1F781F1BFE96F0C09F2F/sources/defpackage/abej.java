package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: abej  reason: default package */
/* loaded from: classes.dex */
public final class abej extends aaqs {
    public String a;

    public abej(aaqf aaqfVar, afvm afvmVar) {
        super("ypc/get_fix_instrument_params", aaqfVar, afvmVar);
        this.a = "";
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = artg.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        artg artgVar = (artg) createBuilder.instance;
        str.getClass();
        artgVar.b |= 2;
        artgVar.d = str;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        aqxo.p(!TextUtils.isEmpty(this.a));
    }
}
