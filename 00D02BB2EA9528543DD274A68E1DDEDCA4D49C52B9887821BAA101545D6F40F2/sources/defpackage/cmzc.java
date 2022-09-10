package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cmzc  reason: default package */
/* loaded from: classes5.dex */
public class cmzc extends cmwz {
    public final AtomicReference<cmwz> b;

    public cmzc(int i) {
        super(i);
        this.b = new AtomicReference<>();
    }

    private final cmwz f() {
        cmwz cmwzVar = this.b.get();
        dbsk.m(cmwzVar != null, "Proxy token does not have a subject yet!");
        return cmwzVar;
    }

    @Override // defpackage.cmwc
    public final cnab a() {
        return f().a();
    }

    @Override // defpackage.cmwc
    public boolean b() {
        return f().b();
    }

    @Override // defpackage.cmwz
    public void c() {
        f().c();
    }

    @Override // defpackage.cmwz
    public void d() {
        f().d();
    }
}
