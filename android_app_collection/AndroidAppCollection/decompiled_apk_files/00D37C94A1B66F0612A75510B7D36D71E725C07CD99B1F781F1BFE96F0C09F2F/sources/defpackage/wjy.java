package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: wjy  reason: default package */
/* loaded from: classes4.dex */
public final class wjy {
    public View a;
    private final tjp b;

    public wjy(tjp tjpVar) {
        this.b = tjpVar;
    }

    public final wka a(tjq tjqVar) {
        View view = this.a;
        if (view == null) {
            if (!tjqVar.a) {
                return null;
            }
            return new wka(tjqVar);
        }
        return new wka(this.b, view, tjqVar);
    }
}
