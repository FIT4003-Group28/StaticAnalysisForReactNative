package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: aaup  reason: default package */
/* loaded from: classes.dex */
public final class aaup extends aaqs {
    public String a;

    public aaup(aaqf aaqfVar, afvm afvmVar) {
        super("connections/get_contact_menu", aaqfVar, afvmVar);
        i();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = aroo.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        aroo arooVar = (aroo) createBuilder.instance;
        str.getClass();
        arooVar.b |= 2;
        arooVar.d = str;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        aqxo.p(!TextUtils.isEmpty(this.a));
    }
}
