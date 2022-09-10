package defpackage;

import android.os.Looper;
import android.util.Pair;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: coea  reason: default package */
/* loaded from: classes5.dex */
public final class coea implements Runnable {
    public final GoogleHelp a;
    public final coeb b;
    private boolean c;

    public coea(GoogleHelp googleHelp, coeb coebVar) {
        this.a = googleHelp;
        this.b = coebVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean a() {
        if (!this.c) {
            this.c = true;
            return true;
        }
        return false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList b;
        this.c = false;
        cojb cojbVar = new cojb(Looper.getMainLooper());
        codz codzVar = new codz(this);
        cojbVar.postDelayed(codzVar, this.a.C);
        try {
            code codeVar = new code();
            codeVar.c();
            b = new ArrayList(1);
            try {
                b.add(Pair.create("gms:googlehelp:sync_help_psd_collection_time_ms", String.valueOf(codeVar.a())));
            } catch (UnsupportedOperationException unused) {
                ArrayList arrayList = new ArrayList(b);
                arrayList.add(Pair.create("gms:googlehelp:sync_help_psd_collection_time_ms", String.valueOf(codeVar.a())));
                b = arrayList;
            }
        } catch (Exception unused2) {
            b = cnxl.b(Pair.create("gms:googlehelp:sync_help_psd_failure", "exception"));
        }
        if (a()) {
            cojbVar.removeCallbacks(codzVar);
            codr.b(b, this.a);
            this.b.a(this.a);
        }
    }
}
