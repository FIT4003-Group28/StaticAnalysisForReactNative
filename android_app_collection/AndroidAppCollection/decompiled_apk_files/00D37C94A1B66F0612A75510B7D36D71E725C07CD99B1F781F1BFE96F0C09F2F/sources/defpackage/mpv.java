package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mpv  reason: default package */
/* loaded from: classes3.dex */
public final class mpv extends mff {
    public mpv(ajxz ajxzVar, akfb akfbVar, Context context, akbk akbkVar, ViewGroup viewGroup) {
        super(ajxzVar, akfbVar, context, akbkVar, viewGroup, R.layout.slim_metadata_button, R.attr.ytTextPrimary);
    }

    @Override // defpackage.mff
    public final void c(auwy auwyVar, acti actiVar, ajrs ajrsVar) {
        super.c(auwyVar, actiVar, ajrsVar);
        apok apokVar = auwyVar.f;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        apoj apojVar = apokVar.c;
        if (apojVar == null) {
            apojVar = apoj.a;
        }
        this.a.setAlpha(true != apojVar.h ? 1.0f : 0.5f);
    }
}
