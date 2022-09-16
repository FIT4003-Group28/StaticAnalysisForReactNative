package defpackage;

import android.widget.Toast;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hfe  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hfe implements Runnable {
    public final /* synthetic */ hfn a;
    private final /* synthetic */ int b;

    public /* synthetic */ hfe(hfn hfnVar) {
        this.a = hfnVar;
    }

    public /* synthetic */ hfe(hfn hfnVar, int i) {
        this.b = i;
        this.a = hfnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            hfn hfnVar = this.a;
            afus.b(2, 6, "[ShortsCreation][Android][Music]No usable audio streams found in selected music. ");
            hfnVar.f.oi().u(new acte(actj.SHORTS_CREATION_REMIX_AUDIO_DOWNLOAD_ERROR_DIALOG), null);
            Toast.makeText(hfnVar.d, (int) R.string.reel_generic_error_message, 1).show();
            hfnVar.c();
            return;
        }
        hfn hfnVar2 = this.a;
        hew hewVar = hfnVar2.c;
        if (hewVar.e) {
            hewVar.g = 0L;
            hewVar.d = false;
            hewVar.h = 0L;
            pkl pklVar = hewVar.j;
            if (pklVar != null) {
                pklVar.I();
            }
        }
        hfnVar2.c();
    }
}
