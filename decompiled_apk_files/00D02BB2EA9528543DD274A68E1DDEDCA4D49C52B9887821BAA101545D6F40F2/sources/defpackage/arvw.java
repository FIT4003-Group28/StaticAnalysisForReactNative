package defpackage;

import android.content.Context;
import android.os.AsyncTask;
/* compiled from: PG */
/* renamed from: arvw  reason: default package */
/* loaded from: classes2.dex */
public class arvw {
    public final ckcw a;
    @dzsi
    public dxfd b;
    private final Context c;

    public arvw(Context context, ckcw ckcwVar) {
        dbsk.l(true);
        this.c = context;
        this.a = ckcwVar;
    }

    public final synchronized void a() {
        dxfd dxfdVar = this.b;
        if (dxfdVar != null) {
            dxfd.a(dxfdVar);
            this.b = null;
        }
    }

    public final synchronized void b(arvv arvvVar) {
        dxfd dxfdVar = this.b;
        if (dxfdVar != null && dxfdVar.b) {
            arvvVar.a(this.b);
            return;
        }
        arvu arvuVar = new arvu(this, arvvVar);
        Context context = this.c;
        dxev dxevVar = new dxev();
        dxevVar.a = "http://maps.google.com/maps";
        dxew dxewVar = new dxew(dxevVar.a);
        dxfc dxfcVar = dxfd.g;
        if (!dxfcVar.a.b(context)) {
            arvuVar.a(new dxff());
            return;
        }
        String a = dxfcVar.a.a(context);
        dxgm.a(context);
        dxgm.a(a);
        dxfy dxfyVar = new dxfy(context, dxewVar, a);
        dxfyVar.c = new dxfx(dxfyVar, dxfyVar.e, new dxfb(dxfyVar, arvuVar));
        dxfyVar.c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
