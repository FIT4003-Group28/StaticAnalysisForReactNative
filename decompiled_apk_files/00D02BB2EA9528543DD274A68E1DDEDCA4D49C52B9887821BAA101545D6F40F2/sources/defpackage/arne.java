package defpackage;

import android.os.Build;
/* compiled from: PG */
/* renamed from: arne  reason: default package */
/* loaded from: classes2.dex */
public final class arne {
    public final arng a;
    public final dxio<ckcw> b;
    public final bvjj c;
    public long d;
    public int e = 1;
    private final dxio<btvo> f;

    public arne(arng arngVar, dxio<btvo> dxioVar, dxio<ckcw> dxioVar2, bvjj bvjjVar) {
        this.a = arngVar;
        this.f = dxioVar;
        this.b = dxioVar2;
        this.c = bvjjVar;
    }

    public final boolean a() {
        return Build.VERSION.SDK_INT >= 28 && this.f.a().getAssistantParameters().b && this.f.a().getAssistantParameters().c;
    }

    public final void b(int i) {
        ((ckco) this.b.a().a(ckhi.be)).a(i - 1);
    }
}
