package defpackage;

import android.os.AsyncTask;
import java.io.File;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: zow  reason: default package */
/* loaded from: classes4.dex */
public final class zow extends AsyncTask {
    private final znh a;

    public zow(znh znhVar) {
        this.a = znhVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        znh znhVar = this.a;
        ylr.b();
        File file = znhVar.a;
        if (file == null) {
            return null;
        }
        ArrayList<File> arrayList = new ArrayList();
        znh.c(file, arrayList);
        for (File file2 : arrayList) {
            try {
                file2.delete();
            } catch (SecurityException e) {
                zep.d("Exception in deleting existing file", e);
            }
        }
        return null;
    }
}
