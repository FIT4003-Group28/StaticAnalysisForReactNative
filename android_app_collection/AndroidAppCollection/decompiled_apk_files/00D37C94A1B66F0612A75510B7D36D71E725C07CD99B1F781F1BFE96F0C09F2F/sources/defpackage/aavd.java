package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: aavd  reason: default package */
/* loaded from: classes.dex */
public final class aavd extends aaqs {
    public String a;
    public String b;
    private final String c;
    private String d;

    public aavd(aaqf aaqfVar, afvm afvmVar) {
        super("comment/create_comment_reply", aaqfVar, afvmVar);
        this.a = "";
        this.c = "";
        this.d = "";
        this.b = "";
        i();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arnv.a.createBuilder();
        String str = this.a;
        if (str != null) {
            createBuilder.copyOnWrite();
            arnv arnvVar = (arnv) createBuilder.instance;
            arnvVar.b |= 2;
            arnvVar.f = str;
        }
        String str2 = this.c;
        createBuilder.copyOnWrite();
        arnv arnvVar2 = (arnv) createBuilder.instance;
        arnvVar2.b |= 8;
        arnvVar2.h = str2;
        String str3 = this.d;
        createBuilder.copyOnWrite();
        arnv arnvVar3 = (arnv) createBuilder.instance;
        str3.getClass();
        arnvVar3.b |= 4;
        arnvVar3.g = str3;
        if (!TextUtils.isEmpty(this.b)) {
            aopa createBuilder2 = arnl.a.createBuilder();
            String str4 = this.b;
            createBuilder2.copyOnWrite();
            arnl arnlVar = (arnl) createBuilder2.instance;
            str4.getClass();
            arnlVar.b |= 1;
            arnlVar.c = str4;
            createBuilder.copyOnWrite();
            arnv arnvVar4 = (arnv) createBuilder.instance;
            arnl arnlVar2 = (arnl) createBuilder2.mo39build();
            arnlVar2.getClass();
            arnvVar4.d = arnlVar2;
            arnvVar4.c = 7;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        String valueOf = String.valueOf(this.a);
        String str = this.c;
        zgh.m(str.length() != 0 ? valueOf.concat(str) : new String(valueOf));
        zgh.m(this.d);
    }

    public final void t(String str) {
        this.d = g(str);
    }
}
