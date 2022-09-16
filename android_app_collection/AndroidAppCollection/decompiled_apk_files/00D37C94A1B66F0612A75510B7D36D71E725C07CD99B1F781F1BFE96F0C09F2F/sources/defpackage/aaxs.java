package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: aaxs  reason: default package */
/* loaded from: classes.dex */
public final class aaxs extends aaxp {
    /* JADX INFO: Access modifiers changed from: protected */
    public aaxs(aaqf aaqfVar, afvm afvmVar) {
        super("like/removelike", aaqfVar, afvmVar);
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arvm.a.createBuilder();
        aspc aspcVar = ((aaxp) this).a;
        createBuilder.copyOnWrite();
        arvm arvmVar = (arvm) createBuilder.instance;
        aspcVar.getClass();
        arvmVar.d = aspcVar;
        arvmVar.b |= 2;
        if (!TextUtils.isEmpty(((aaxp) this).b)) {
            String str = ((aaxp) this).b;
            createBuilder.copyOnWrite();
            arvm arvmVar2 = (arvm) createBuilder.instance;
            str.getClass();
            arvmVar2.b |= 4;
            arvmVar2.e = str;
        }
        return createBuilder;
    }
}
