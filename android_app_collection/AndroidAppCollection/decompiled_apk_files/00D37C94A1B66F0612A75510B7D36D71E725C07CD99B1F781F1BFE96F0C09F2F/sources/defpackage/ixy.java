package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: ixy  reason: default package */
/* loaded from: classes3.dex */
public final class ixy implements ajry {
    private final Context a;
    private final ajmy b;
    private final /* synthetic */ int c;

    public ixy(Context context, ajmy ajmyVar) {
        this.a = context;
        this.b = ajmyVar;
    }

    public ixy(Context context, ajmy ajmyVar, int i) {
        this.c = i;
        context.getClass();
        this.a = context;
        ajmyVar.getClass();
        this.b = ajmyVar;
    }

    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        if (this.c == 0) {
            return new ixz(this.a, this.b);
        }
        return new ebf(this.a, this.b);
    }
}
