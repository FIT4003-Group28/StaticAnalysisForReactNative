package defpackage;

import android.content.Intent;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: xgx  reason: default package */
/* loaded from: classes7.dex */
public final class xgx {
    private final ckcw a;

    public xgx(ckcw ckcwVar) {
        this.a = ckcwVar;
        new coud();
    }

    public final Intent a(String str) {
        Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse(str));
        ((ckco) this.a.a(ckkm.r)).a(0);
        return data;
    }
}
