package defpackage;

import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import com.google.research.xeno.effect.Control;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: hdi  reason: default package */
/* loaded from: classes3.dex */
public final class hdi implements znn {
    public boolean a = false;
    float b = 0.0f;
    public float c = 0.0f;
    public String d = "";
    public final HashMap e = new HashMap();
    public FilterMapTable$FilterDescriptor f;
    public hdh g;
    public hdg h;
    public boolean i;
    public vne j;

    @Override // defpackage.znn
    public final void a() {
        d();
        f();
        e();
        h();
        g();
        c();
    }

    public final void c() {
        hdg hdgVar = this.h;
        if (hdgVar == null || !this.i) {
            return;
        }
        FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor = this.f;
        boolean z = true;
        final boolean z2 = filterMapTable$FilterDescriptor != null && filterMapTable$FilterDescriptor.f("skin_smoothing_intensity");
        final hdl hdlVar = (hdl) hdgVar;
        hdlVar.d.runOnUiThread(new Runnable() { // from class: hdk
            @Override // java.lang.Runnable
            public final void run() {
                hdl.this.a.setVisibility(true != z2 ? 8 : 0);
            }
        });
        hdg hdgVar2 = this.h;
        FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor2 = this.f;
        if (filterMapTable$FilterDescriptor2 == null || !filterMapTable$FilterDescriptor2.f("relight_intensity")) {
            z = false;
        }
        hdl hdlVar2 = (hdl) hdgVar2;
        hdlVar2.j = z;
        hdlVar2.b();
    }

    public final void d() {
        Control b;
        FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor = this.f;
        if (filterMapTable$FilterDescriptor == null || (b = filterMapTable$FilterDescriptor.b("green_screen_enabled")) == null) {
            return;
        }
        Control.nativeSetBoolValue(b.a.a, this.a);
    }

    public final void e() {
        hdh hdhVar = this.g;
        if (hdhVar != null) {
            FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor = this.f;
            final boolean z = false;
            if (filterMapTable$FilterDescriptor != null && filterMapTable$FilterDescriptor.f("green_screen_enabled") && this.f.f("green_screen_bg_img_path")) {
                z = true;
            }
            final gxs gxsVar = (gxs) hdhVar;
            if (gxsVar.f && ((z && gxsVar.d.getVisibility() == 8) || (!z && gxsVar.d.getVisibility() == 0))) {
                gyo a = gxsVar.e.a(actj.SHORTS_CREATION_GREEN_SCREEN_BUTTON);
                a.h(z);
                a.g();
            }
            gxsVar.h.runOnUiThread(new Runnable() { // from class: gxp
                @Override // java.lang.Runnable
                public final void run() {
                    gxs.this.d.setVisibility(true != z ? 8 : 0);
                }
            });
        }
    }

    public final void f() {
        Control b;
        FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor = this.f;
        if (filterMapTable$FilterDescriptor == null || (b = filterMapTable$FilterDescriptor.b("green_screen_bg_img_path")) == null) {
            return;
        }
        Control.nativeSetStringValue(b.c.a, this.d);
    }

    public final void g() {
        Control b;
        FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor = this.f;
        if (filterMapTable$FilterDescriptor == null || (b = filterMapTable$FilterDescriptor.b("relight_intensity")) == null) {
            return;
        }
        b.b.a(this.c);
    }

    public final void h() {
        Control b;
        FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor = this.f;
        if (filterMapTable$FilterDescriptor == null || !this.i || (b = filterMapTable$FilterDescriptor.b("skin_smoothing_intensity")) == null) {
            return;
        }
        b.b.a(this.b);
    }

    public final void b(String str) {
        if (str == null) {
            this.d = "";
        } else {
            this.d = str;
            if (!this.e.containsKey(str)) {
                HashMap hashMap = this.e;
                hashMap.put(this.d, Integer.valueOf(hashMap.size()));
            }
        }
        f();
    }
}
