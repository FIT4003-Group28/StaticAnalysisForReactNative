package defpackage;

import android.view.KeyEvent;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ahzf  reason: default package */
/* loaded from: classes.dex */
public final class ahzf implements ahyp {
    private final List a;

    public ahzf(ahyp... ahypVarArr) {
        List asList = Arrays.asList(ahypVarArr);
        asList.getClass();
        this.a = asList;
    }

    @Override // defpackage.ahyp
    public final void f(ControlsState controlsState) {
        for (ahyp ahypVar : this.a) {
            ahypVar.f(controlsState);
        }
    }

    @Override // defpackage.ahyp
    public final void i(ahyo ahyoVar) {
        for (ahyp ahypVar : this.a) {
            ahypVar.i(ahyoVar);
        }
    }

    @Override // defpackage.ahyp
    public final void j(boolean z) {
        for (ahyp ahypVar : this.a) {
            ahypVar.j(z);
        }
    }

    @Override // defpackage.ahyp
    public final void l(ControlsOverlayStyle controlsOverlayStyle) {
        for (ahyp ahypVar : this.a) {
            ahypVar.l(controlsOverlayStyle);
        }
    }

    @Override // defpackage.ahyp
    public final void nN(CharSequence charSequence) {
        for (ahyp ahypVar : this.a) {
            ahypVar.nN(charSequence);
        }
    }

    @Override // defpackage.ahyp
    public final void nO(boolean z) {
        for (ahyp ahypVar : this.a) {
            ahypVar.nO(z);
        }
    }

    @Override // defpackage.ahyp
    public final void nP(Map map) {
        for (ahyp ahypVar : this.a) {
            ahypVar.nP(map);
        }
    }

    @Override // defpackage.ahyp
    public final void nf() {
        for (ahyp ahypVar : this.a) {
            ahypVar.nf();
        }
    }

    @Override // defpackage.ahyp
    public final void ng() {
        for (ahyp ahypVar : this.a) {
            ahypVar.ng();
        }
    }

    @Override // defpackage.ahyp
    public final void nh(String str, boolean z) {
        for (ahyp ahypVar : this.a) {
            ahypVar.nh(str, z);
        }
    }

    @Override // defpackage.ahyp
    public final void ni(boolean z) {
        for (ahyp ahypVar : this.a) {
            ahypVar.ni(z);
        }
    }

    @Override // defpackage.ahyp
    public final void nj(boolean z) {
        for (ahyp ahypVar : this.a) {
            ahypVar.nj(z);
        }
    }

    @Override // defpackage.ahyp
    public final void ny() {
        for (ahyp ahypVar : this.a) {
            ahypVar.ny();
        }
    }

    @Override // defpackage.ahyp
    public final void o(long j, long j2, long j3, long j4) {
        for (ahyp ahypVar : this.a) {
            ahypVar.o(j, j2, j3, j4);
        }
    }

    @Override // defpackage.ahyp
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.ahyp
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.ahyp
    public final void pI() {
        for (ahyp ahypVar : this.a) {
            ahypVar.pI();
        }
    }

    @Override // defpackage.ahyp
    public final void pJ() {
        for (ahyp ahypVar : this.a) {
            ahypVar.pJ();
        }
    }

    @Override // defpackage.ahyp
    public final /* synthetic */ void x() {
        ahfo.a(this);
    }

    @Override // defpackage.ahyp
    public final void y(auad auadVar, boolean z) {
        for (ahyp ahypVar : this.a) {
            ahypVar.y(auadVar, z);
        }
    }
}
