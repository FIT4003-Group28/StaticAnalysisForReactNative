package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: abdr  reason: default package */
/* loaded from: classes.dex */
public final class abdr extends aaqs {
    public String a;
    public String b;

    public abdr(aaqf aaqfVar, afvm afvmVar) {
        super("updated_metadata", aaqfVar, afvmVar);
        k(aadi.b);
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = ases.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        ases asesVar = (ases) createBuilder.instance;
        asesVar.b |= 4;
        asesVar.e = g(str);
        String str2 = this.b;
        createBuilder.copyOnWrite();
        ases asesVar2 = (ases) createBuilder.instance;
        asesVar2.b |= 2;
        asesVar2.d = g(str2);
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        if (!TextUtils.isEmpty(this.b)) {
            aqxo.y(TextUtils.isEmpty(this.a));
        }
        if (!TextUtils.isEmpty(this.a)) {
            aqxo.y(TextUtils.isEmpty(this.b));
        }
    }
}
