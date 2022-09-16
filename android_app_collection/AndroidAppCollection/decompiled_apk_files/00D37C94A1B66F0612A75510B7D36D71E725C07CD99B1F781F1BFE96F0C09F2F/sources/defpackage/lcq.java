package defpackage;

import android.content.Intent;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: lcq  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lcq implements ayqb {
    public final /* synthetic */ lcs a;
    private final /* synthetic */ int b;

    public /* synthetic */ lcq(lcs lcsVar, int i) {
        this.b = i;
        this.a = lcsVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            lcs lcsVar = this.a;
            afus.c(2, 32, "VoiceSearchFragment error result", (Throwable) obj);
            BottomSheetBehavior bottomSheetBehavior = lcsVar.n;
            if (bottomSheetBehavior == null || bottomSheetBehavior.t != 3) {
                return;
            }
            bottomSheetBehavior.E(5);
            return;
        }
        lcs lcsVar2 = this.a;
        Intent intent = (Intent) obj;
        lcsVar2.o = null;
        int intExtra = intent.getIntExtra("resultCode", CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        lcsVar2.n.E(5);
        if (intExtra == -1) {
            lcsVar2.b(intent);
        } else {
            lcsVar2.d.l(asny.LATENCY_ACTION_VOICE_ASSISTANT);
        }
    }
}
