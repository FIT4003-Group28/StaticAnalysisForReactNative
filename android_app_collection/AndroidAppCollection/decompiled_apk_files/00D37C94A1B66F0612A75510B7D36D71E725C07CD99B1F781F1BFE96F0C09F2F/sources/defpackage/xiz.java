package defpackage;

import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
/* compiled from: PG */
/* renamed from: xiz  reason: default package */
/* loaded from: classes4.dex */
public final class xiz extends xip {
    private final xew a;
    private final InstreamAdBreak b;
    private boolean c;

    public xiz(wzx wzxVar, xew xewVar, InstreamAdBreak instreamAdBreak) {
        wzxVar.getClass();
        this.a = xewVar;
        instreamAdBreak.getClass();
        this.b = instreamAdBreak;
    }

    @Override // defpackage.xip
    public final void a() {
        this.a.f(this.b.d());
    }

    @Override // defpackage.xip
    public final void b() {
        if (this.c) {
            return;
        }
        this.a.f(this.b.e());
        this.c = true;
    }
}
