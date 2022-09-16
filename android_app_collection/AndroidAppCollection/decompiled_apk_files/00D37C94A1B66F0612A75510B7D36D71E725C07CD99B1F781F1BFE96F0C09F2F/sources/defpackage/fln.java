package defpackage;

import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: fln  reason: default package */
/* loaded from: classes3.dex */
public final class fln implements ajru {
    private final fll a;
    private final /* synthetic */ int b;

    public fln(flm flmVar, int i) {
        this.b = i;
        this.a = flmVar.a(R.layout.message_item_banner);
    }

    @Override // defpackage.ajru
    public final View a() {
        if (this.b != 0) {
        }
        return this.a.a;
    }

    public fln(flm flmVar) {
        this.a = flmVar.a(R.layout.message_item_default);
    }

    public fln(flm flmVar, int i, byte[] bArr) {
        this.b = i;
        this.a = flmVar.a(R.layout.message_item_horizontal);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        int i = this.b;
        if (i == 0) {
            this.a.qZ(ajsaVar);
        } else if (i == 1) {
            this.a.qZ(ajsaVar);
        } else {
            this.a.qZ(ajsaVar);
        }
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        int i = this.b;
        if (i == 0) {
            this.a.oK(ajrsVar, (flp) obj);
        } else if (i == 1) {
            this.a.oK(ajrsVar, (flo) obj);
        } else {
            this.a.oK(ajrsVar, (flq) obj);
        }
    }
}
