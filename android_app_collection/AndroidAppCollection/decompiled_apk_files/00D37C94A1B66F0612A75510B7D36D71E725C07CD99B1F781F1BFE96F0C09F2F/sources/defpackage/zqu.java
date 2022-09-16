package defpackage;

import android.os.AsyncTask;
/* compiled from: PG */
/* renamed from: zqu  reason: default package */
/* loaded from: classes4.dex */
public final class zqu extends AsyncTask {
    final /* synthetic */ String a;
    final /* synthetic */ zqv b;

    public zqu(zqv zqvVar, String str) {
        this.b = zqvVar;
        this.a = str;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        this.b.g(this.a);
        return null;
    }
}
