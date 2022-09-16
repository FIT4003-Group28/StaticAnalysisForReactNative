package defpackage;

import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.fragments.PlaylistEditorFragment$EditorState;
/* compiled from: PG */
/* renamed from: iqm  reason: default package */
/* loaded from: classes3.dex */
final class iqm implements afzf {
    public PlaylistEditorFragment$EditorState a;
    final /* synthetic */ iqp b;
    private final PaneDescriptor c;

    public iqm(iqp iqpVar) {
        this(iqpVar, null);
    }

    public iqm(iqp iqpVar, PaneDescriptor paneDescriptor) {
        this.b = iqpVar;
        this.c = paneDescriptor;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        iqp iqpVar = this.b;
        iqpVar.ak.b(iqpVar.d.b(cffVar), true);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        aueb auebVar;
        asbf asbfVar = (asbf) obj;
        this.b.oi().D(new acte(asbfVar.d.I()));
        if ((asbfVar.b & 8) != 0) {
            iqp iqpVar = this.b;
            asbg asbgVar = asbfVar.e;
            if (asbgVar == null) {
                asbgVar = asbg.a;
            }
            if (asbgVar.b == 78398567) {
                auebVar = (aueb) asbgVar.c;
            } else {
                auebVar = aueb.a;
            }
            iqpVar.aj = auebVar;
            iqp iqpVar2 = this.b;
            iqpVar2.r(iqpVar2.aj, this.a);
        }
        this.b.ak.a();
        PaneDescriptor paneDescriptor = this.c;
        if (paneDescriptor != null) {
            this.b.at.d(paneDescriptor);
        }
    }
}
