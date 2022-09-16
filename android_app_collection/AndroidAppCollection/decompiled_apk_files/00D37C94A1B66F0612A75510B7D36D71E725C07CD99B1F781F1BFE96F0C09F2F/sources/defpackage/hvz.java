package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.CancellationSignal;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hvz  reason: default package */
/* loaded from: classes3.dex */
public final class hvz extends AsyncTask {
    public final CancellationSignal a = new CancellationSignal();
    private int b;
    private final hwb c;
    private final hvo d;

    public hvz(hwb hwbVar, hvo hvoVar) {
        this.c = hwbVar;
        this.d = hvoVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Context context = ((Context[]) objArr)[0];
        for (axak axakVar : this.c.keySet()) {
            hwa hwaVar = (hwa) this.c.get(axakVar);
            if (this.c.a(axakVar) == null && hwaVar.c.h()) {
                akv akvVar = new akv((String) hwaVar.c.c(), R.array.com_google_android_gms_fonts_certs_yt);
                try {
                    String str = (String) hwaVar.c.c();
                    if (str.length() != 0) {
                        "Requesting font: ".concat(str);
                    }
                    alc a = aku.a(context, akvVar, this.a);
                    if (isCancelled()) {
                        return null;
                    }
                    ald[] aldVarArr = a.b;
                    if (aldVarArr == null || aldVarArr.length == 0) {
                        zep.b("fetchFonts failed (empty result)");
                    } else {
                        int i = aldVarArr[0].e;
                        if (i == 0) {
                            Typeface b = akj.b(context, this.a, aldVarArr);
                            if (isCancelled()) {
                                return null;
                            }
                            if (b == null) {
                                zep.b("Failed to create Typeface.");
                            } else {
                                this.c.b(axakVar, b);
                                int i2 = this.b + 1;
                                this.b = i2;
                                if (i2 == 1) {
                                    publishProgress(new Void[0]);
                                }
                            }
                        } else {
                            StringBuilder sb = new StringBuilder(42);
                            sb.append("fetchFonts result is not OK. (");
                            sb.append(i);
                            sb.append(")");
                            zep.b(sb.toString());
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onProgressUpdate(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        hvy hvyVar = this.d.a;
        if (hqs.i(hvyVar.c)) {
            hvyVar.l.setVisibility(0);
        }
    }
}
