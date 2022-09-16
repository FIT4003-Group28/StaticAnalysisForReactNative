package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: aaxq  reason: default package */
/* loaded from: classes.dex */
public final class aaxq extends aaxp {
    /* JADX INFO: Access modifiers changed from: protected */
    public aaxq(aaqf aaqfVar, afvm afvmVar) {
        super("like/dislike", aaqfVar, afvmVar);
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arvi.a.createBuilder();
        aspc aspcVar = ((aaxp) this).a;
        createBuilder.copyOnWrite();
        arvi arviVar = (arvi) createBuilder.instance;
        aspcVar.getClass();
        arviVar.d = aspcVar;
        arviVar.b |= 2;
        if (!TextUtils.isEmpty(((aaxp) this).b)) {
            String str = ((aaxp) this).b;
            createBuilder.copyOnWrite();
            arvi arviVar2 = (arvi) createBuilder.instance;
            str.getClass();
            arviVar2.b |= 4;
            arviVar2.e = str;
        }
        return createBuilder;
    }
}
