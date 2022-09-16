package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
/* loaded from: classes.dex */
class FragmentStateAdapter$5 implements g {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Handler f2166a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Runnable f2167b;

    @Override // androidx.lifecycle.g
    public void a(i iVar, f.a aVar) {
        if (aVar == f.a.ON_DESTROY) {
            this.f2166a.removeCallbacks(this.f2167b);
            iVar.a().b(this);
        }
    }
}
