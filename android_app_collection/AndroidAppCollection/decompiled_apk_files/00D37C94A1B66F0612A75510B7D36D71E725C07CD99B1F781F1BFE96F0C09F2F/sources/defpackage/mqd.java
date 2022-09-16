package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: mqd  reason: default package */
/* loaded from: classes3.dex */
public final class mqd implements mpy {
    public final FrameLayout a;
    public final axnm b;
    public final ajhl c;

    public mqd(ajhl ajhlVar, axnm axnmVar, Context context) {
        this.c = ajhlVar;
        this.b = axnmVar;
        this.a = new FrameLayout(context);
    }

    @Override // defpackage.mpy
    public final void b() {
        this.a.removeAllViews();
    }

    @Override // defpackage.mpy
    public final View oN() {
        return this.a;
    }
}
