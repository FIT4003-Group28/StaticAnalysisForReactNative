package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: mmo  reason: default package */
/* loaded from: classes3.dex */
public final class mmo implements ajry {
    private final Activity a;
    private final ajmy b;
    private final aafo c;

    public mmo(Activity activity, ajmy ajmyVar, aafo aafoVar) {
        this.a = activity;
        this.b = ajmyVar;
        this.c = aafoVar;
    }

    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        return new mmp(this.a, this.b, this.c, viewGroup);
    }
}
