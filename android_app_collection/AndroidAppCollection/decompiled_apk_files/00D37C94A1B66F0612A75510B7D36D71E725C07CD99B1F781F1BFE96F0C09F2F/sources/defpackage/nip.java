package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.vr.LaunchYouTubeVrActivity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nip  reason: default package */
/* loaded from: classes3.dex */
public final class nip implements abv {
    final /* synthetic */ niq a;

    public nip(niq niqVar) {
        this.a = niqVar;
    }

    @Override // defpackage.abv
    public final void a(Context context) {
        niq niqVar = this.a;
        if (!niqVar.a) {
            niqVar.a = true;
            ((LaunchYouTubeVrActivity) niqVar).b = (airr) ((dwq) niqVar.lI()).a.fO.get();
        }
    }
}
