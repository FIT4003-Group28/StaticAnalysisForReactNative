package defpackage;

import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: bcpw  reason: default package */
/* loaded from: classes3.dex */
final class bcpw implements Callable<ImageView> {
    final /* synthetic */ ViewPager a;
    final /* synthetic */ bcpz b;

    public bcpw(bcpz bcpzVar, ViewPager viewPager) {
        this.b = bcpzVar;
        this.a = viewPager;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ ImageView call() {
        ViewPager viewPager = this.a;
        bcpz bcpzVar = this.b;
        return (ImageView) bcpz.q(viewPager, bcpzVar.an.e(bcpzVar.ak.e().intValue()));
    }
}
