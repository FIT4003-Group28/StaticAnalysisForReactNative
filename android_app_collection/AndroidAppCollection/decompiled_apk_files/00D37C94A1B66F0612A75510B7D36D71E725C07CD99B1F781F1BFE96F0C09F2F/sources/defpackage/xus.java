package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Toast;
import com.google.protos.youtube.api.innertube.HintRendererOuterClass;
/* compiled from: PG */
/* renamed from: xus  reason: default package */
/* loaded from: classes4.dex */
final class xus implements TextWatcher {
    final /* synthetic */ xuz a;

    public xus(xuz xuzVar) {
        this.a = xuzVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        xuz xuzVar = this.a;
        ampq aF = xuzVar.aF();
        if (aF.h() && xuzVar.aH().matcher(editable).find()) {
            if (xuzVar.bc.getVisibility() == 0) {
                aunb aunbVar = ((auqq) aF.c()).d;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                if (aunbVar.qn(HintRendererOuterClass.hintRenderer)) {
                    akfc akfcVar = xuzVar.ar;
                    aunb aunbVar2 = ((auqq) aF.c()).d;
                    if (aunbVar2 == null) {
                        aunbVar2 = aunb.a;
                    }
                    akfcVar.b((argj) aunbVar2.qm(HintRendererOuterClass.hintRenderer), xuzVar.bc, aF.c(), xuzVar.ak);
                }
            } else {
                aufp aG = xuzVar.aG();
                if (aG != null && (aG.b & 1) != 0) {
                    xuzVar.aM();
                    if ((((auqq) aF.c()).b & 16) != 0) {
                        dt mJ = xuzVar.mJ();
                        arag aragVar = ((auqq) aF.c()).e;
                        if (aragVar == null) {
                            aragVar = arag.a;
                        }
                        Toast.makeText(mJ, ajgl.b(aragVar), 1).show();
                    }
                }
            }
        }
        this.a.aL();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.aO += Math.max(0, i2 - i3);
    }
}
