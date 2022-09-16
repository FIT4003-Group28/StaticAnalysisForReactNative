package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: aaxr  reason: default package */
/* loaded from: classes.dex */
public final class aaxr extends aaxp {
    /* JADX INFO: Access modifiers changed from: protected */
    public aaxr(aaqf aaqfVar, afvm afvmVar) {
        super("like/like", aaqfVar, afvmVar);
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arvk.a.createBuilder();
        aspc aspcVar = ((aaxp) this).a;
        createBuilder.copyOnWrite();
        arvk arvkVar = (arvk) createBuilder.instance;
        aspcVar.getClass();
        arvkVar.d = aspcVar;
        arvkVar.b |= 2;
        if (!TextUtils.isEmpty(((aaxp) this).b)) {
            String str = ((aaxp) this).b;
            createBuilder.copyOnWrite();
            arvk arvkVar2 = (arvk) createBuilder.instance;
            str.getClass();
            arvkVar2.b |= 4;
            arvkVar2.e = str;
        }
        return createBuilder;
    }
}
