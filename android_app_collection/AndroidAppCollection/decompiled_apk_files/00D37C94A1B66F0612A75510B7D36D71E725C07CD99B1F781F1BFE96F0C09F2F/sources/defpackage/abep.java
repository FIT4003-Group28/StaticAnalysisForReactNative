package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: abep  reason: default package */
/* loaded from: classes.dex */
public final class abep extends aaqs {
    public String a;
    public aoob b;

    public abep(aaqf aaqfVar, afvm afvmVar) {
        super("ypc/get_payment_instruments_params", aaqfVar, afvmVar);
        this.a = "";
        this.b = aoob.b;
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = artm.a.createBuilder();
        if (!TextUtils.isEmpty(this.a)) {
            String str = this.a;
            createBuilder.copyOnWrite();
            artm artmVar = (artm) createBuilder.instance;
            str.getClass();
            artmVar.b |= 2;
            artmVar.d = str;
        }
        aoob aoobVar = this.b;
        if (aoobVar != null && !aoobVar.H()) {
            aoob aoobVar2 = this.b;
            createBuilder.copyOnWrite();
            artm artmVar2 = (artm) createBuilder.instance;
            aoobVar2.getClass();
            artmVar2.b |= 4;
            artmVar2.e = aoobVar2;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        aqxo.p(!TextUtils.isEmpty(this.a));
    }
}
