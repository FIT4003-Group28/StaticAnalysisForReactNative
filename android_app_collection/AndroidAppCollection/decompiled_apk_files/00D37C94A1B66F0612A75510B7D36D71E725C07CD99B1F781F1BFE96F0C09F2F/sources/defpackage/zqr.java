package defpackage;

import android.content.Context;
import android.os.AsyncTask;
/* compiled from: PG */
/* renamed from: zqr  reason: default package */
/* loaded from: classes4.dex */
public final class zqr extends AsyncTask {
    private final snc a;

    public zqr(snc sncVar) {
        this.a = sncVar;
    }

    static final znh a(Context context, String str, long j, snc sncVar) {
        return new znh(context, 1, str, j, sncVar);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Context[] contextArr = (Context[]) objArr;
        a(contextArr[0], zny.c, zny.g, this.a).a(null);
        a(contextArr[0], zny.d, zny.h, this.a).a(null);
        return null;
    }
}
