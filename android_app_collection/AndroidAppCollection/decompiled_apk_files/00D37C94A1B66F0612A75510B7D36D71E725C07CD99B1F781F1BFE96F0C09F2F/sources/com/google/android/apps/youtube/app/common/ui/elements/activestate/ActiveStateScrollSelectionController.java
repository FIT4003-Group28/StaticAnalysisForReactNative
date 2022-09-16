package com.google.android.apps.youtube.app.common.ui.elements.activestate;

import com.google.android.apps.youtube.app.common.ui.scrollselection.ScrollSelectionController;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ActiveStateScrollSelectionController extends ScrollSelectionController {
    private ger c;
    private final aacz d;
    private final ne e = new fxt(this);

    public ActiveStateScrollSelectionController(aacz aaczVar) {
        this.d = aaczVar;
    }

    @Override // com.google.android.apps.youtube.app.common.ui.scrollselection.ScrollSelectionController
    protected final ges g(ger gerVar) {
        return new fxu(this.b, gerVar, this.d);
    }

    @Override // com.google.android.apps.youtube.app.common.ui.scrollselection.ScrollSelectionController
    public final void h(ger gerVar) {
        ger gerVar2 = this.c;
        if (gerVar == gerVar2) {
            return;
        }
        if (gerVar2 != null && gerVar2.k() != null) {
            this.c.k().aG(this.e);
        }
        if (gerVar != null && gerVar.k() != null) {
            gerVar.k().aE(this.e);
        }
        this.c = gerVar;
        super.h(gerVar);
    }
}
