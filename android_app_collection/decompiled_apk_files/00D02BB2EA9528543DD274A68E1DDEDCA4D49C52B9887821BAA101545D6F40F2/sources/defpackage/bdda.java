package defpackage;

import com.google.android.apps.maps.R;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bdda  reason: default package */
/* loaded from: classes3.dex */
final class bdda implements appn {
    final /* synthetic */ bddb a;
    private final String b;

    public bdda(bddb bddbVar, String str) {
        this.a = bddbVar;
        this.b = str;
    }

    @Override // defpackage.appn
    public final void a() {
        this.a.b.h();
    }

    @Override // defpackage.appn
    public final void b() {
        boolean b = this.a.c.b(this.b);
        this.a.c.a(this.b, b ? bbvk.UNMUTED : bbvk.MUTED);
        bddb bddbVar = this.a;
        if (bddbVar.d.c) {
            bddbVar.a.d(true != b ? R.string.MUTE_VIDEO : R.string.UNMUTE_VIDEO);
        }
        bddb bddbVar2 = this.a;
        for (Map.Entry<appo, String> entry : bddbVar2.e.entrySet()) {
            entry.getKey().E(bddbVar2.c.b(entry.getValue()));
        }
    }

    @Override // defpackage.appn
    public final void c(boolean z) {
        this.a.b.c(z);
    }

    @Override // defpackage.appn
    public final void d() {
    }

    @Override // defpackage.appn
    public final void e() {
    }
}
