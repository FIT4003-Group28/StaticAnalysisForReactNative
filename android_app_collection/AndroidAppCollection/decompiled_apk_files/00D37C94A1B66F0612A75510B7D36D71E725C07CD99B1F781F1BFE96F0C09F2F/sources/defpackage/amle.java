package defpackage;

import java.util.WeakHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amle  reason: default package */
/* loaded from: classes.dex */
public final class amle extends amkk implements amkx {
    static final amkw c = new amkw();
    private final amkw d;

    public amle() {
        super("", amky.a.b());
        this.d = c;
    }

    @Override // defpackage.amkx
    public final amlv d(String str, amlt amltVar, boolean z) {
        if (z) {
            WeakHashMap weakHashMap = amna.a;
        }
        return new amlf(str, this, amltVar, z);
    }

    @Override // defpackage.amkx
    public final /* bridge */ /* synthetic */ Exception e() {
        return this.d;
    }

    @Override // defpackage.amlv
    public final amlv f(String str, amlt amltVar) {
        WeakHashMap weakHashMap = amna.a;
        return d(str, amltVar, true);
    }

    @Override // defpackage.amlv
    public final void g(boolean z) {
    }
}
