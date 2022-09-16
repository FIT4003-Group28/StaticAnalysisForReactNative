package defpackage;

import android.os.AsyncTask;
import java.io.File;
/* compiled from: PG */
/* renamed from: hti  reason: default package */
/* loaded from: classes3.dex */
final class hti extends AsyncTask {
    final /* synthetic */ File a;
    final /* synthetic */ String b;

    public hti(File file, String str) {
        this.a = file;
        this.b = str;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        if (!this.a.exists() || !this.a.delete()) {
            String valueOf = String.valueOf(this.b);
            zep.b(valueOf.length() != 0 ? "Failed to delete text asset: ".concat(valueOf) : new String("Failed to delete text asset: "));
            return null;
        }
        String valueOf2 = String.valueOf(this.b);
        if (valueOf2.length() == 0) {
            return null;
        }
        "Successfully deleted text asset: ".concat(valueOf2);
        return null;
    }
}
