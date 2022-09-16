package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: fpn  reason: default package */
/* loaded from: classes3.dex */
public final class fpn implements ajry {
    private final Activity a;
    private final aafo b;
    private final ajmy c;
    private final akbn d;

    public fpn(Activity activity, ajmy ajmyVar, akbn akbnVar, aafo aafoVar) {
        this.a = activity;
        this.c = ajmyVar;
        this.b = aafoVar;
        this.d = akbnVar;
    }

    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        return new fpo(this.a, this.c, this.b, this.d, viewGroup);
    }
}
