package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: aauq  reason: default package */
/* loaded from: classes.dex */
public final class aauq extends aaqs {
    public String a;

    public aauq(aaqf aaqfVar, afvm afvmVar) {
        super("conversation/get", aaqfVar, afvmVar);
        i();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = armv.a.createBuilder();
        String str = this.a;
        if (str != null) {
            createBuilder.copyOnWrite();
            armv armvVar = (armv) createBuilder.instance;
            armvVar.b |= 16;
            armvVar.d = str;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        boolean z = true;
        if (TextUtils.isEmpty(null) && TextUtils.isEmpty(this.a)) {
            z = false;
        }
        aqxo.y(z);
    }
}
