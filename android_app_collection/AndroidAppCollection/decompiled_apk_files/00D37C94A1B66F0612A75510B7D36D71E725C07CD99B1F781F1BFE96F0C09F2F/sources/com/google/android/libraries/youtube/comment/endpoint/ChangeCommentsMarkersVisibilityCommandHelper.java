package com.google.android.libraries.youtube.comment.endpoint;

import android.text.TextUtils;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.ab;
import com.google.android.libraries.youtube.comment.endpoint.ChangeCommentsMarkersVisibilityCommandHelper;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ChangeCommentsMarkersVisibilityCommandHelper implements f {
    public final azqb a;
    public boolean b;
    public String c;
    private final airw d;
    private final aypf e = new aypf();

    public ChangeCommentsMarkersVisibilityCommandHelper(azqb azqbVar, airw airwVar) {
        this.a = azqbVar;
        this.d = airwVar;
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        this.e.c();
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        this.e.d(this.d.V().G(aypa.a()).aa(new ayqb() { // from class: xnu
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                ChangeCommentsMarkersVisibilityCommandHelper changeCommentsMarkersVisibilityCommandHelper = ChangeCommentsMarkersVisibilityCommandHelper.this;
                ahic ahicVar = (ahic) obj;
                if (ahicVar.a() == null) {
                    return;
                }
                String Z = ahicVar.a().Z();
                if (TextUtils.equals(changeCommentsMarkersVisibilityCommandHelper.c, Z)) {
                    return;
                }
                changeCommentsMarkersVisibilityCommandHelper.c = Z;
                changeCommentsMarkersVisibilityCommandHelper.b = false;
            }
        }, ab.q));
    }
}
