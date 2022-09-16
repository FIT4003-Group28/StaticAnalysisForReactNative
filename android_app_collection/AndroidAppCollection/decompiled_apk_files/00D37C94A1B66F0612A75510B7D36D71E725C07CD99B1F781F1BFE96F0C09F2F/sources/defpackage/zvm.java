package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
/* compiled from: PG */
/* renamed from: zvm  reason: default package */
/* loaded from: classes4.dex */
final class zvm extends AsyncTask {
    private final Context a;
    private final zvo b;
    private final zvn c;
    private final DeviceLocalFile d;
    private final zvp e;
    private final int f;
    private final CancellationSignal g;

    public zvm(Context context, zvo zvoVar, zvn zvnVar, DeviceLocalFile deviceLocalFile, zvp zvpVar, int i) {
        this.a = context;
        this.b = zvoVar;
        this.c = zvnVar;
        deviceLocalFile.getClass();
        this.d = deviceLocalFile;
        zvpVar.getClass();
        this.e = zvpVar;
        this.f = i;
        this.g = new CancellationSignal();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        super.cancel(false);
        this.g.cancel();
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        if (isCancelled()) {
            return null;
        }
        try {
            return zvr.a(this.a, this.d, this.g);
        } catch (Exception e) {
            if (e instanceof OperationCanceledException) {
                return null;
            }
            String valueOf = String.valueOf(this.d.f());
            String valueOf2 = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31 + String.valueOf(valueOf2).length());
            sb.append("Failed to load thumbnail for ");
            sb.append(valueOf);
            sb.append(": ");
            sb.append(valueOf2);
            zep.l(sb.toString());
            return null;
        }
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        zvp zvpVar = this.e;
        if (zvpVar.d == this) {
            zvpVar.d = null;
        }
        this.c.d(this.d, ampq.i(bitmap));
        this.b.ok(this.f);
    }
}
