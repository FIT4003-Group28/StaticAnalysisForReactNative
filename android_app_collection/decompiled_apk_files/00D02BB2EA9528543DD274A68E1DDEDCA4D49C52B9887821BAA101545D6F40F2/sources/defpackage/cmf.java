package defpackage;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
/* compiled from: PG */
/* renamed from: cmf  reason: default package */
/* loaded from: classes5.dex */
final class cmf implements cnfn {
    private final clm a;

    public cmf(clm clmVar) {
        this.a = clmVar;
    }

    @Override // defpackage.cnfn
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        clm clmVar = this.a;
        return (InputConnection) clmVar.b(clmVar.p, editorInfo);
    }

    @Override // defpackage.cnfn
    public final void setCarEditableListener(cnfo cnfoVar) {
    }
}
