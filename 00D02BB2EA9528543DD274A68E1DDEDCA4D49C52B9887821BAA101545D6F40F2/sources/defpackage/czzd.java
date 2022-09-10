package defpackage;

import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
/* compiled from: PG */
/* renamed from: czzd  reason: default package */
/* loaded from: classes5.dex */
public final class czzd implements czzn {
    final /* synthetic */ ExtendedFloatingActionButton a;

    public czzd(ExtendedFloatingActionButton extendedFloatingActionButton) {
        this.a = extendedFloatingActionButton;
    }

    @Override // defpackage.czzn
    public final int a() {
        int measuredWidth = this.a.getMeasuredWidth();
        int i = this.a.i();
        ExtendedFloatingActionButton extendedFloatingActionButton = this.a;
        return (measuredWidth - (i + i)) + extendedFloatingActionButton.j + extendedFloatingActionButton.k;
    }

    @Override // defpackage.czzn
    public final int b() {
        return this.a.getMeasuredHeight();
    }

    @Override // defpackage.czzn
    public final int c() {
        return this.a.j;
    }

    @Override // defpackage.czzn
    public final int d() {
        return this.a.k;
    }

    @Override // defpackage.czzn
    public final ViewGroup.LayoutParams e() {
        return new ViewGroup.LayoutParams(-2, -2);
    }
}
