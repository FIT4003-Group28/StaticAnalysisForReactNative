package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: abch  reason: default package */
/* loaded from: classes.dex */
public final class abch extends aaqs {
    public String a;
    public String b;

    public abch(aaqf aaqfVar, afvm afvmVar) {
        super("suggest", aaqfVar, afvmVar);
        i();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = asbt.a.createBuilder();
        String str = this.a;
        if (str != null) {
            createBuilder.copyOnWrite();
            asbt asbtVar = (asbt) createBuilder.instance;
            asbtVar.b |= 2;
            asbtVar.d = str;
        }
        if (TextUtils.isEmpty(null)) {
            if (!TextUtils.isEmpty(this.b)) {
                String str2 = this.b;
                createBuilder.copyOnWrite();
                asbt asbtVar2 = (asbt) createBuilder.instance;
                str2.getClass();
                asbtVar2.b |= 8;
                asbtVar2.e = str2;
            }
            return createBuilder;
        }
        createBuilder.copyOnWrite();
        asbt asbtVar3 = (asbt) createBuilder.instance;
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        this.a.getClass();
    }
}
