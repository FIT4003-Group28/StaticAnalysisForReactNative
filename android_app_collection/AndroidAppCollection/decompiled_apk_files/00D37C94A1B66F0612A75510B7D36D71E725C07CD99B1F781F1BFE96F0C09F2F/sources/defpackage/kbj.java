package defpackage;

import android.util.Pair;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
/* compiled from: PG */
/* renamed from: kbj  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kbj implements ayqb {
    public final /* synthetic */ kbk a;
    private final /* synthetic */ int b;

    public /* synthetic */ kbj(kbk kbkVar, int i) {
        this.b = i;
        this.a = kbkVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                this.a.og(((Boolean) obj).booleanValue());
                return;
            case 1:
                kbk kbkVar = this.a;
                Pair pair = (Pair) obj;
                if (((Boolean) pair.first).booleanValue()) {
                    kbkVar.nL(((Boolean) pair.second).booleanValue());
                    return;
                } else {
                    kbkVar.b(((Boolean) pair.second).booleanValue());
                    return;
                }
            case 2:
                this.a.p(((Boolean) obj).booleanValue());
                return;
            case 3:
                this.a.q(((Boolean) obj).booleanValue());
                return;
            case 4:
                this.a.l((ezx) obj);
                return;
            case 5:
                this.a.nG((zbb) obj);
                return;
            case 6:
                this.a.i((ControlsOverlayStyle) obj);
                return;
            case 7:
                this.a.od((ControlsState) obj);
                return;
            case 8:
                this.a.nx(((Boolean) obj).booleanValue());
                return;
            case 9:
                this.a.j(((Boolean) obj).booleanValue());
                return;
            case 10:
                this.a.k(((Boolean) obj).booleanValue());
                return;
            case 11:
                this.a.m(((Boolean) obj).booleanValue());
                return;
            default:
                this.a.oe(((Boolean) obj).booleanValue());
                return;
        }
    }
}
