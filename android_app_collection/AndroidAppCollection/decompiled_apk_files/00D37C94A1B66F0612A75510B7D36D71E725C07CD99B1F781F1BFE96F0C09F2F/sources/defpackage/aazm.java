package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: aazm  reason: default package */
/* loaded from: classes.dex */
public final class aazm extends aaqs {
    public String a;

    public aazm(aaqf aaqfVar, afvm afvmVar) {
        super("live/stop_broadcast", aaqfVar, afvmVar);
        i();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = asda.a.createBuilder();
        if (!TextUtils.isEmpty(this.a)) {
            String str = this.a;
            createBuilder.copyOnWrite();
            asda asdaVar = (asda) createBuilder.instance;
            str.getClass();
            asdaVar.b |= 2;
            asdaVar.d = str;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
    }
}
