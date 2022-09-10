package defpackage;

import java.util.WeakHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dazh  reason: default package */
/* loaded from: classes.dex */
public final class dazh extends dayz<dazh> implements dazb {
    static final daza a = new daza();
    private final daza b;

    public dazh() {
        super("", dazd.a.b());
        this.b = a;
    }

    @Override // defpackage.dazb
    public final /* bridge */ /* synthetic */ Exception d() {
        return this.b;
    }

    @Override // defpackage.dazn
    public final dazn e(String str, dazm dazmVar) {
        WeakHashMap<Thread, dazz> weakHashMap = dbaa.b;
        return new dazi(str, this, dazmVar);
    }

    @Override // defpackage.dazn
    public final boolean f() {
        return false;
    }

    @Override // defpackage.dazn
    public final void g() {
    }
}
