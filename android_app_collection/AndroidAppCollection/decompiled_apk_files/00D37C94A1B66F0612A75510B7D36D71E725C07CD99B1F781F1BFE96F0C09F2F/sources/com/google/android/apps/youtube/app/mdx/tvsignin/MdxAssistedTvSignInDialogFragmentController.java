package com.google.android.apps.youtube.app.mdx.tvsignin;

import android.content.SharedPreferences;
import com.google.android.apps.youtube.app.common.dialog.DialogFragmentController;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class MdxAssistedTvSignInDialogFragmentController extends DialogFragmentController {
    public final adux a;
    public final SharedPreferences b;
    public final snc c;
    public final int d;
    private final advc e;

    public MdxAssistedTvSignInDialogFragmentController(dt dtVar, advc advcVar, adux aduxVar, SharedPreferences sharedPreferences, acwu acwuVar, snc sncVar) {
        super(dtVar, "MdxAssistedTvSignInDialogFragmentController");
        this.e = advcVar;
        this.a = aduxVar;
        this.b = sharedPreferences;
        this.d = acwuVar.x;
        this.c = sncVar;
    }

    public final void g() {
        advb g = this.e.g();
        if (g != null) {
            this.a.a(g.b, "canceled");
        }
        this.e.i();
    }
}
