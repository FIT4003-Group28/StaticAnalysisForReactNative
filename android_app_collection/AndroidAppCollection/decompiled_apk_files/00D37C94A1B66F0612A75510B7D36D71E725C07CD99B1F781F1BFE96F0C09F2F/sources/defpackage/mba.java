package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: mba  reason: default package */
/* loaded from: classes3.dex */
public final class mba implements ajry {
    private final Context a;
    private final aafo b;
    private final ajmy c;
    private final ajyc d;
    private final /* synthetic */ int e;

    public mba(Context context, aafo aafoVar, ajmy ajmyVar, ajyc ajycVar) {
        this.a = context;
        this.b = aafoVar;
        this.c = ajmyVar;
        this.d = ajycVar;
    }

    public mba(Context context, aafo aafoVar, ajmy ajmyVar, ajyc ajycVar, int i) {
        this.e = i;
        this.a = context;
        this.b = aafoVar;
        this.c = ajmyVar;
        this.d = ajycVar;
    }

    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        int i = this.e;
        if (i != 0) {
            if (i == 1) {
                return new maw(this.a, this.b, this.c, this.d, viewGroup);
            }
            return new mbe(this.a, this.b, this.c, this.d, viewGroup);
        }
        return new mbb(this.a, this.b, this.c, this.d, viewGroup);
    }
}
