package defpackage;

import com.google.android.libraries.youtube.common.ui.RtlAwareViewPager;
/* compiled from: PG */
/* renamed from: zac  reason: default package */
/* loaded from: classes4.dex */
public final class zac implements bpn {
    final /* synthetic */ RtlAwareViewPager a;

    public zac(RtlAwareViewPager rtlAwareViewPager) {
        this.a = rtlAwareViewPager;
    }

    @Override // defpackage.bpn
    public final void a(int i) {
        bpn bpnVar = this.a.k;
        if (bpnVar != null) {
            bpnVar.a(i);
        }
        for (bpn bpnVar2 : this.a.j) {
            bpnVar2.a(i);
        }
    }

    @Override // defpackage.bpn
    public final void b(int i, float f, int i2) {
        RtlAwareViewPager rtlAwareViewPager = this.a;
        bpn bpnVar = rtlAwareViewPager.k;
        if (bpnVar != null) {
            bpnVar.b(rtlAwareViewPager.y(i), f, i2);
        }
        for (bpn bpnVar2 : this.a.j) {
            bpnVar2.b(this.a.y(i), f, i2);
        }
    }

    @Override // defpackage.bpn
    public final void c(int i) {
        RtlAwareViewPager rtlAwareViewPager = this.a;
        bpn bpnVar = rtlAwareViewPager.k;
        if (bpnVar != null) {
            bpnVar.c(rtlAwareViewPager.y(i));
        }
        for (bpn bpnVar2 : this.a.j) {
            bpnVar2.c(this.a.y(i));
        }
    }
}
