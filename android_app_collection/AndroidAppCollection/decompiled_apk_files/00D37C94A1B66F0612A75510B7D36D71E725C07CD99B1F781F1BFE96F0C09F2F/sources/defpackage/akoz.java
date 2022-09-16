package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: akoz  reason: default package */
/* loaded from: classes.dex */
public final class akoz implements ajry {
    private final Context a;
    private final akpa b;
    private final ajmy c;

    public akoz(Context context, akpa akpaVar, ajmy ajmyVar) {
        this.a = context;
        this.b = akpaVar;
        this.c = ajmyVar;
    }

    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        return new akpb(this.a, this.b, this.c);
    }
}
