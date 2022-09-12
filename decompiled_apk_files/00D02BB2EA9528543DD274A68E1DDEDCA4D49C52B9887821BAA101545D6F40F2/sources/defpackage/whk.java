package defpackage;

import com.google.android.apps.gmm.directions.savedtrips.api.SavedTrip;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: whk  reason: default package */
/* loaded from: classes7.dex */
public final class whk implements wgj {
    public boolean a;
    final /* synthetic */ whl b;
    private final String c;

    public whk(whl whlVar, String str, boolean z) {
        this.b = whlVar;
        this.c = str;
        this.a = z;
    }

    private final degu<Void> f(boolean z) {
        return new whj(this, z);
    }

    @Override // defpackage.wgj
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.wgj
    public final String b() {
        return this.c;
    }

    @Override // defpackage.wgj
    public final dqvj c() {
        return this.b.d.c();
    }

    @Override // defpackage.wgj
    public final dehn<Void> d() {
        this.a = true;
        whl whlVar = this.b;
        dehn<Void> a = whlVar.a.a(SavedTrip.d(this.c, whlVar.d));
        deha.q(a, f(false), this.b.c);
        return a;
    }

    @Override // defpackage.wgj
    public final dehn<Void> e() {
        this.a = false;
        dehn<Void> b = this.b.a.b(this.c);
        deha.q(b, f(true), this.b.c);
        return b;
    }
}
