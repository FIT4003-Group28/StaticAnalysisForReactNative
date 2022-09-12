package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: amn  reason: default package */
/* loaded from: classes2.dex */
public abstract class amn extends amk {
    private final int a;
    public final int j;
    public final LayoutInflater k;

    @Deprecated
    public amn(Context context, int i) {
        super(context);
        this.a = i;
        this.j = i;
        this.k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // defpackage.amk
    public View f(ViewGroup viewGroup) {
        throw null;
    }

    @Override // defpackage.amk
    public final View h(ViewGroup viewGroup) {
        return this.k.inflate(this.a, viewGroup, false);
    }
}
