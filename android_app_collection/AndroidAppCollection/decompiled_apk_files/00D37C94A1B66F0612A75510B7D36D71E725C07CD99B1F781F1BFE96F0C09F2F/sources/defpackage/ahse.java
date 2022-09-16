package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.player.features.gl.vr.VrWelcomeActivity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahse  reason: default package */
/* loaded from: classes.dex */
public final class ahse implements abv {
    final /* synthetic */ ahsf a;

    public ahse(ahsf ahsfVar) {
        this.a = ahsfVar;
    }

    @Override // defpackage.abv
    public final void a(Context context) {
        ahsf ahsfVar = this.a;
        if (!ahsfVar.a) {
            ahsfVar.a = true;
            ((VrWelcomeActivity) ahsfVar).b = (yve) ((dwq) ahsfVar.lI()).a.wM.get();
        }
    }
}
