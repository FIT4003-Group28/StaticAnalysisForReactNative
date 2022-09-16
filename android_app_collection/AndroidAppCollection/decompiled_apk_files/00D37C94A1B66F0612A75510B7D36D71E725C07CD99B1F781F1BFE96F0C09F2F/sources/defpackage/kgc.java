package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: kgc  reason: default package */
/* loaded from: classes3.dex */
public final class kgc {
    public final Context a;
    public final ajhl b;
    public final axnm c;
    public final ajrs d;
    public final azpm e;
    public View f;
    public TextView g;
    public final kgb h;
    public final kgb i;

    public kgc(Context context, ajhl ajhlVar, axnm axnmVar, acti actiVar) {
        this.a = context;
        this.b = ajhlVar;
        this.c = axnmVar;
        ajrs ajrsVar = new ajrs();
        this.d = ajrsVar;
        ajrsVar.a(actiVar);
        this.e = azpm.e();
        this.h = new kga(this);
        this.i = new kga(this);
    }
}
