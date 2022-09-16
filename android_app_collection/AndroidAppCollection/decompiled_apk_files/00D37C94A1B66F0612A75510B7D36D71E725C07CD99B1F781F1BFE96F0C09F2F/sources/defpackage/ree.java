package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ree  reason: default package */
/* loaded from: classes4.dex */
public final class ree extends rek {
    final /* synthetic */ Bundle a;
    final /* synthetic */ long b;
    final /* synthetic */ GoogleHelp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ree(qsx qsxVar, Bundle bundle, long j, GoogleHelp googleHelp) {
        super(qsxVar);
        this.a = bundle;
        this.b = j;
        this.c = googleHelp;
    }

    @Override // defpackage.rej
    protected final void b(rep repVar) {
        try {
            Bundle bundle = this.a;
            long j = this.b;
            GoogleHelp googleHelp = this.c;
            red redVar = new red(this);
            Parcel pv = repVar.pv();
            dve.g(pv, bundle);
            pv.writeLong(j);
            dve.g(pv, googleHelp);
            dve.i(pv, redVar);
            repVar.py(9, pv);
        } catch (Exception e) {
            Log.e("gH_GoogleHelpApiImpl", "Requesting to save the async feedback psd failed!", e);
            l(rel.a);
        }
    }
}
