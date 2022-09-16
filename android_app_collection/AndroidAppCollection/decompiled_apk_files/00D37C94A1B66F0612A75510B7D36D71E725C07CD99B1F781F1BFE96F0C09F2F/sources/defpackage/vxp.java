package defpackage;

import android.os.Bundle;
import android.support.v4.app.Fragment$SavedState;
import com.google.protos.youtube.api.innertube.ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint;
/* compiled from: PG */
/* renamed from: vxp  reason: default package */
/* loaded from: classes4.dex */
public final class vxp implements vxk {
    private final dt a;
    private final yni b;
    private final aadd c;
    private final srv d;
    private final acti e;
    private dh f;
    private dh g;
    private boolean i = true;
    private vxo h = vxo.Wv;

    public vxp(dt dtVar, yni yniVar, srv srvVar, acti actiVar, aadd aaddVar) {
        this.a = dtVar;
        this.b = yniVar;
        this.d = srvVar;
        this.c = aaddVar;
        this.e = actiVar;
    }

    private final void o(dh dhVar, Bundle bundle) {
        bundle.putBundle("fragment_args", dhVar.m);
        bundle.putParcelable("fragment_saved_state", this.a.getSupportFragmentManager().c(dhVar));
    }

    private static final void p(ex exVar, String str, Bundle bundle, dh dhVar) {
        dhVar.ag((Fragment$SavedState) bundle.getParcelable("fragment_saved_state"));
        dhVar.ae(bundle.getBundle("fragment_args"));
        exVar.r(dhVar, str);
        exVar.d();
    }

    @Override // defpackage.vxl
    public final void aF(apzg apzgVar) {
        vxl vxlVar = (vxl) n();
        if (vxlVar != null) {
            vxlVar.aF(apzgVar);
        }
    }

    @Override // defpackage.vyd
    public final void aH(int i, int i2, int i3) {
        vyd vydVar = (vyd) n();
        if (vydVar != null) {
            vydVar.aH(i, i2, i3);
        }
    }

    @Override // defpackage.vxo
    public final void b() {
        this.b.d(new vxm());
        this.h.b();
    }

    @Override // defpackage.vxo
    public final void c() {
        this.h.c();
    }

    @Override // defpackage.vxo
    public final void d() {
        this.b.d(new vxm());
        this.h.d();
    }

    @Override // defpackage.vxk
    public final void e() {
        this.i = true;
    }

    @Override // defpackage.vxk
    public final void f() {
        this.i = false;
    }

    @Override // defpackage.vxk
    public final void g() {
        this.g = null;
    }

    @Override // defpackage.vxk
    public final void h() {
        this.f = null;
        this.d.a();
    }

    @Override // defpackage.vxk
    public final void i(vxo vxoVar) {
        if (vxoVar == null) {
            vxoVar = vxo.Wv;
        }
        this.h = vxoVar;
    }

    @Override // defpackage.vxk
    public final void j(CharSequence charSequence, int i, int i2, int i3, boolean z) {
        if (this.i || m() != null) {
            return;
        }
        boolean z2 = true;
        aqxo.p(charSequence != null && charSequence.length() > 0);
        aqxo.p(i > 0);
        aqxo.p(i2 >= 0 && i2 < 13);
        aqxo.p(i3 > 0 && i3 <= 31);
        if (z && (i % 4 != 0 || (i % 100 == 0 && i % 400 != 0))) {
            z2 = false;
        }
        aqxo.p(z2);
        Bundle bundle = new Bundle();
        bundle.putCharSequence("birthday_picker_title", charSequence);
        bundle.putInt("birthday_picker_year", i);
        bundle.putInt("birthday_picker_month", i2);
        bundle.putInt("birthday_picker_day", i3);
        bundle.putBoolean("birthday_picker_hide_year", z);
        vxb vxbVar = new vxb();
        vxbVar.ae(bundle);
        this.g = vxbVar;
        ex l = this.a.getSupportFragmentManager().l();
        l.r(this.g, "birthday_picker_fragment");
        l.d();
    }

    @Override // defpackage.vxk
    public final void k(apzg apzgVar) {
        apzgVar.getClass();
        aqxo.p(apzgVar.qn(ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint.channelCreationFormEndpoint));
        if (this.i || n() != null) {
            return;
        }
        ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint channelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint = (ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint) apzgVar.qm(ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint.channelCreationFormEndpoint);
        byte[] I = channelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint.c.I();
        int G = almu.G(channelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint.d);
        if (G == 0) {
            G = 1;
        }
        this.f = vxj.aK(I, G, this.e);
        ex l = this.a.getSupportFragmentManager().l();
        l.r(this.f, "channel_creation_fragment");
        l.d();
        this.e.d(acuo.a(124448), apzgVar, null);
    }

    @Override // defpackage.vxk
    public final void l() {
        aowa aowaVar = this.c.a().x;
        if (aowaVar == null) {
            aowaVar = aowa.a;
        }
        if (!aowaVar.b && !this.i && n() != null) {
            Bundle bundle = new Bundle();
            o(n(), bundle);
            ex l = this.a.getSupportFragmentManager().l();
            l.m(this.f);
            vxj vxjVar = new vxj();
            this.f = vxjVar;
            p(l, "channel_creation_fragment", bundle, vxjVar);
        }
        if (this.i || m() == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        o(m(), bundle2);
        ex l2 = this.a.getSupportFragmentManager().l();
        l2.m(this.g);
        vxb vxbVar = new vxb();
        this.g = vxbVar;
        p(l2, "birthday_picker_fragment", bundle2, vxbVar);
    }

    final dh m() {
        dh dhVar = this.g;
        if (dhVar != null) {
            return dhVar;
        }
        dh dhVar2 = (dh) this.a.getSupportFragmentManager().f("birthday_picker_fragment");
        this.g = dhVar2;
        return dhVar2;
    }

    @Override // defpackage.vxo
    public final void mB() {
        this.h.mB();
    }

    final dh n() {
        dh dhVar = this.f;
        if (dhVar != null) {
            return dhVar;
        }
        dh dhVar2 = (dh) this.a.getSupportFragmentManager().f("channel_creation_fragment");
        this.f = dhVar2;
        return dhVar2;
    }
}
