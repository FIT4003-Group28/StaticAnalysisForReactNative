package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: abaw  reason: default package */
/* loaded from: classes.dex */
public final class abaw extends aaqs {
    private String a;

    /* JADX INFO: Access modifiers changed from: protected */
    public abaw(aaqf aaqfVar, afvm afvmVar) {
        super("playlist/get_settings_editor", aaqfVar, afvmVar);
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = asbe.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        asbe asbeVar = (asbe) createBuilder.instance;
        str.getClass();
        asbeVar.b |= 2;
        asbeVar.d = str;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        aqxo.y(!TextUtils.isEmpty(this.a));
    }

    public final void t(String str) {
        this.a = g(str);
    }
}
