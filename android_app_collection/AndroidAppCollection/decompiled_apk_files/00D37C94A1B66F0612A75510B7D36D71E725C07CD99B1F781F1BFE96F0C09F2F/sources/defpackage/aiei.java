package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: aiei  reason: default package */
/* loaded from: classes.dex */
final class aiei implements aidq {
    private final String a;
    private final aaox b;

    public aiei(String str, aaox aaoxVar) {
        this.a = str;
        this.b = aaoxVar;
    }

    @Override // defpackage.aidq
    public final void a(PlayerResponseModel playerResponseModel) {
        String valueOf = String.valueOf(this.a);
        if (valueOf.length() != 0) {
            "onResponse taskId=".concat(valueOf);
        }
        aaox aaoxVar = this.b;
        String str = this.a;
        aapb aapbVar = aaoxVar.a;
        if (aapbVar != null) {
            aapbVar.d(str, null);
        }
    }

    @Override // defpackage.aidq
    public final void b(int i) {
        if (i != 2) {
        }
        String.valueOf(this.a).length();
        if (i == 4) {
            aaox aaoxVar = this.b;
            String str = this.a;
            Exception exc = new Exception();
            aapb aapbVar = aaoxVar.a;
            if (aapbVar == null) {
                return;
            }
            aapbVar.d(str, exc);
        }
    }
}
