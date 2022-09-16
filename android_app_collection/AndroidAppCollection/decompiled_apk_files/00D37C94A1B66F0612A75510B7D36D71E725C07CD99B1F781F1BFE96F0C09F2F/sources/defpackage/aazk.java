package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: aazk  reason: default package */
/* loaded from: classes.dex */
public final class aazk extends aaqs {
    public String a;

    public aazk(aaqf aaqfVar, afvm afvmVar) {
        super("live/start_broadcast", aaqfVar, afvmVar);
        i();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = ascw.a.createBuilder();
        if (!TextUtils.isEmpty(this.a)) {
            String str = this.a;
            createBuilder.copyOnWrite();
            ascw ascwVar = (ascw) createBuilder.instance;
            str.getClass();
            ascwVar.b |= 2;
            ascwVar.d = str;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
    }
}
