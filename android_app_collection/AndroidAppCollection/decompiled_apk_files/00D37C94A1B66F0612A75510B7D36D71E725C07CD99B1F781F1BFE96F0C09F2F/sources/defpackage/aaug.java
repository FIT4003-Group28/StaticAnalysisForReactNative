package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: aaug  reason: default package */
/* loaded from: classes.dex */
public final class aaug extends aaqs {
    public String a;
    public String b;
    public String c;
    private final afvn d;

    public aaug(aaqf aaqfVar, afvn afvnVar) {
        super("channel_edit/validate_channel_handle", aaqfVar, afvnVar.c());
        this.d = afvnVar;
        i();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = asfv.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        asfv asfvVar = (asfv) createBuilder.instance;
        str.getClass();
        asfvVar.b |= 2;
        asfvVar.d = str;
        if (!TextUtils.isEmpty(this.b)) {
            String str2 = this.b;
            createBuilder.copyOnWrite();
            asfv asfvVar2 = (asfv) createBuilder.instance;
            str2.getClass();
            asfvVar2.b |= 4;
            asfvVar2.e = str2;
        }
        String str3 = this.c;
        createBuilder.copyOnWrite();
        asfv asfvVar3 = (asfv) createBuilder.instance;
        str3.getClass();
        asfvVar3.b |= 8;
        asfvVar3.f = str3;
        return createBuilder;
    }

    @Override // defpackage.aapd
    public final void c() {
        aqxo.y(this.d.t());
        aqxo.y(!TextUtils.isEmpty(this.a));
        aqxo.y(!TextUtils.isEmpty(this.c));
    }
}
