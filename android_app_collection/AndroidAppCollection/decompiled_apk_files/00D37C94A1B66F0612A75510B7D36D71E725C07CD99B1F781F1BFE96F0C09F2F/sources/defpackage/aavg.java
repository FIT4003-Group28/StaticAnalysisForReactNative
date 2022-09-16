package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: aavg  reason: default package */
/* loaded from: classes.dex */
public final class aavg extends aaqs {
    public String a;
    private final String b;
    private final String c;
    private final String d;

    public aavg(aaqf aaqfVar, afvm afvmVar) {
        super("comment/get_comments", aaqfVar, afvmVar);
        this.b = "";
        this.a = "";
        this.c = "";
        this.d = "";
        i();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arnt.a.createBuilder();
        String str = this.b;
        createBuilder.copyOnWrite();
        arnt arntVar = (arnt) createBuilder.instance;
        arntVar.b |= 4;
        arntVar.e = str;
        String str2 = this.a;
        createBuilder.copyOnWrite();
        arnt arntVar2 = (arnt) createBuilder.instance;
        str2.getClass();
        arntVar2.b |= 2;
        arntVar2.d = str2;
        String str3 = this.d;
        createBuilder.copyOnWrite();
        arnt arntVar3 = (arnt) createBuilder.instance;
        arntVar3.b |= 8;
        arntVar3.f = str3;
        String str4 = this.c;
        createBuilder.copyOnWrite();
        arnt arntVar4 = (arnt) createBuilder.instance;
        arntVar4.b |= 1024;
        arntVar4.g = str4;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        if (TextUtils.isEmpty(this.b) || TextUtils.isEmpty(this.d)) {
            if (TextUtils.isEmpty(this.a)) {
                return;
            }
            if (TextUtils.isEmpty(this.b) && TextUtils.isEmpty(this.d)) {
                return;
            }
            throw new IllegalArgumentException("CommentServiceRequest: continuation cannot be set if videoId or channelId set.");
        }
        throw new IllegalArgumentException("CommentServiceRequest: Can only set one of channelId and videoId.");
    }
}
