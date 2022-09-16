package defpackage;

import android.view.ViewTreeObserver;
import com.google.protos.youtube.api.innertube.FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand;
/* compiled from: PG */
/* renamed from: lwz  reason: default package */
/* loaded from: classes3.dex */
final class lwz implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand a;
    final /* synthetic */ ampq b;
    final /* synthetic */ lxc c;

    public lwz(lxc lxcVar, FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand filterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand, ampq ampqVar) {
        this.c = lxcVar;
        this.a = filterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand;
        this.b = ampqVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.a.d;
        if (i >= 0 && i <= this.c.a.size() && this.b.h()) {
            apvg apvgVar = (apvg) this.b.c();
            this.c.a.add(i, apvgVar);
            lxc lxcVar = this.c;
            lxcVar.e = true;
            if (lxcVar.j.h() && i <= ((Integer) this.c.j.c()).intValue()) {
                lxc lxcVar2 = this.c;
                lxcVar2.j = ampq.j(Integer.valueOf(((Integer) lxcVar2.j.c()).intValue() + 1));
            }
            if (this.c.f.h() && i <= ((Integer) this.c.f.c()).intValue()) {
                lxc lxcVar3 = this.c;
                lxcVar3.f = ampq.j(Integer.valueOf(((Integer) lxcVar3.f.c()).intValue() + 1));
            }
            if (this.a.f) {
                lxc lxcVar4 = this.c;
                ampq ampqVar = lxcVar4.f;
                lxcVar4.f = ampq.j(Integer.valueOf(i));
                if (ampqVar.h()) {
                    this.c.u(((Integer) ampqVar.c()).intValue(), false);
                } else if (this.c.j.h()) {
                    lxc lxcVar5 = this.c;
                    lxcVar5.u(((Integer) lxcVar5.j.c()).intValue(), false);
                }
                this.c.u(i, true);
                lxc lxcVar6 = this.c;
                azpq azpqVar = lxcVar6.k;
                if (azpqVar != null) {
                    ampq ampqVar2 = lxcVar6.f;
                    ampq ampqVar3 = lxcVar6.d;
                    azpqVar.c(lwl.e(ampqVar, ampqVar2, ampqVar3, ampqVar3));
                }
                aafo aafoVar = this.c.b;
                apzg apzgVar = apvgVar.g;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar.c(apzgVar, amup.k("sectionListController", this.c.l));
            }
            FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand filterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand = this.a;
            if ((filterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand.b & 32) != 0) {
                aafo aafoVar2 = this.c.b;
                apzg apzgVar2 = filterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand.e;
                if (apzgVar2 == null) {
                    apzgVar2 = apzg.a;
                }
                aafoVar2.a(apzgVar2);
            }
        }
        this.c.g.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
