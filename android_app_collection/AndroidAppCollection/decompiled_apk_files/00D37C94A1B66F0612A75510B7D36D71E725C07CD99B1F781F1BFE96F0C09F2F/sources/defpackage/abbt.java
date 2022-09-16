package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: abbt  reason: default package */
/* loaded from: classes.dex */
public final class abbt extends aaqs {
    public String a;

    public abbt(aaqf aaqfVar, afvm afvmVar) {
        super("flag/get_form", aaqfVar, afvmVar);
        this.a = "";
        i();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = asbh.a.createBuilder();
        if (!TextUtils.isEmpty(this.a)) {
            String str = this.a;
            createBuilder.copyOnWrite();
            asbh asbhVar = (asbh) createBuilder.instance;
            str.getClass();
            asbhVar.b |= 2;
            asbhVar.d = str;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        if (!amps.e(this.a)) {
            return;
        }
        String str = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 62 + "null".length());
        sb.append("Exactly one of params (");
        sb.append(str);
        sb.append(") or clientSideParams (");
        sb.append("null");
        sb.append(") has to be set.");
        throw new IllegalArgumentException(sb.toString());
    }
}
