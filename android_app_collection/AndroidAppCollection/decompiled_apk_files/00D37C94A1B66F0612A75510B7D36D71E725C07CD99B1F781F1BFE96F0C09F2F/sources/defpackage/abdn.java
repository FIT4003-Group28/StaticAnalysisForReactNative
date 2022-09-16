package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: abdn  reason: default package */
/* loaded from: classes.dex */
public final class abdn extends aaqs {
    public String a;
    public String b;
    public int c;

    public abdn(aaqf aaqfVar, afvm afvmVar) {
        super("thumbnails", aaqfVar, afvmVar);
        i();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = asdz.a.createBuilder();
        int i = this.c;
        createBuilder.copyOnWrite();
        asdz asdzVar = (asdz) createBuilder.instance;
        asdzVar.b |= 8;
        asdzVar.f = i;
        String str = this.a;
        if (str != null) {
            createBuilder.copyOnWrite();
            asdz asdzVar2 = (asdz) createBuilder.instance;
            asdzVar2.b |= 2;
            asdzVar2.d = str;
        } else {
            String str2 = this.b;
            if (str2 != null) {
                createBuilder.copyOnWrite();
                asdz asdzVar3 = (asdz) createBuilder.instance;
                asdzVar3.b |= 4;
                asdzVar3.e = str2;
            }
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        aqxo.y((!TextUtils.isEmpty(this.a)) ^ (!TextUtils.isEmpty(this.b)));
    }
}
