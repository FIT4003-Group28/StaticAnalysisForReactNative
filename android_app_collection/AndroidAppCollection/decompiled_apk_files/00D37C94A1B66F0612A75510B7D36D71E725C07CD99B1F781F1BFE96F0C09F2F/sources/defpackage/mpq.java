package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: mpq  reason: default package */
/* loaded from: classes3.dex */
public final class mpq extends mff {
    public final aagi b;
    public auwy c;
    public auwy d;
    public aypg e;
    public acti f;
    public ajrs g;

    public mpq(ajxz ajxzVar, akfb akfbVar, Context context, akbk akbkVar, aagi aagiVar, ViewGroup viewGroup) {
        super(ajxzVar, akfbVar, context, akbkVar, viewGroup, R.layout.slim_metadata_button, R.attr.ytTextPrimary);
        this.b = aagiVar;
    }

    @Override // defpackage.mff, defpackage.mpy
    public final void b() {
        super.b();
        this.c = null;
        this.d = null;
        this.g = null;
        this.f = null;
        aypg aypgVar = this.e;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
            this.e = null;
        }
    }

    public final void d(boolean z) {
        auwy auwyVar;
        if (!z || (auwyVar = this.c) == null) {
            auwyVar = this.d;
        }
        if (auwyVar == null) {
            zep.b("SlimMetadataAccountLinkButtonController does not have a button to show.");
        } else {
            super.c(auwyVar, this.f, this.g);
        }
    }
}
