package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: amf  reason: default package */
/* loaded from: classes.dex */
public abstract class amf extends amc {
    private final int a;
    public final int h;
    public final LayoutInflater i;

    @Deprecated
    public amf(Context context, int i) {
        this.a = i;
        this.h = i;
        this.i = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // defpackage.amc
    public View f(ViewGroup viewGroup) {
        throw null;
    }

    @Override // defpackage.amc
    public final View h(ViewGroup viewGroup) {
        return this.i.inflate(this.a, viewGroup, false);
    }
}
