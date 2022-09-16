package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
/* compiled from: PG */
/* renamed from: nvi  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class nvi implements ayqb {
    public final /* synthetic */ nvp a;
    private final /* synthetic */ int b;

    public /* synthetic */ nvi(nvp nvpVar) {
        this.a = nvpVar;
    }

    public /* synthetic */ nvi(nvp nvpVar, int i) {
        this.b = i;
        this.a = nvpVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                this.a.v.c(Boolean.valueOf(aiqa.d(((aikd) obj).i)));
                return;
            }
            nvp nvpVar = this.a;
            int intValue = ((Integer) obj).intValue();
            if (intValue == -1) {
                return;
            }
            nvpVar.i.e(intValue);
            return;
        }
        nvp nvpVar2 = this.a;
        int intValue2 = ((Integer) obj).intValue();
        int i2 = nvpVar2.b;
        if (intValue2 == i2) {
            return;
        }
        if (i2 == 1) {
            nvpVar2.B = null;
        }
        nvpVar2.b = intValue2;
        if (intValue2 == 0) {
            nvpVar2.j.i(ControlsOverlayStyle.a);
            nvpVar2.E.a(false, true);
            nvpVar2.d();
        } else if (intValue2 != 1) {
        } else {
            nvpVar2.j.i(ControlsOverlayStyle.i);
            nvpVar2.E.a(true, true);
            nvpVar2.f(nvpVar2.B);
            nvpVar2.h.b(null);
        }
    }
}
