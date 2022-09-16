package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: mvq  reason: default package */
/* loaded from: classes3.dex */
public final class mvq implements ajry {
    private final Context a;
    private final ajmy b;
    private final aafo c;
    private final ajyc d;
    private final wwk e;
    private final tjv f;
    private final wxc g;
    private final enm h;

    public mvq(Context context, ajmy ajmyVar, aafo aafoVar, ajyc ajycVar, wwk wwkVar, tjv tjvVar, wxc wxcVar, enm enmVar) {
        this.a = context;
        ajmyVar.getClass();
        this.b = ajmyVar;
        aafoVar.getClass();
        this.c = aafoVar;
        this.d = ajycVar;
        wwkVar.getClass();
        this.e = wwkVar;
        tjvVar.getClass();
        this.f = tjvVar;
        wxcVar.getClass();
        this.g = wxcVar;
        enmVar.getClass();
        this.h = enmVar;
    }

    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        return new mvr(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, viewGroup);
    }
}
