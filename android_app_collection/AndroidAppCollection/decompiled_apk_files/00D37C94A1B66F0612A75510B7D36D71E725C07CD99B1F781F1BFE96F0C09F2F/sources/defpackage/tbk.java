package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: tbk  reason: default package */
/* loaded from: classes4.dex */
public final class tbk {
    public final AtomicBoolean a = new AtomicBoolean();
    public byte[] b;
    final /* synthetic */ tbl c;

    public tbk(tbl tblVar) {
        this.c = tblVar;
    }

    public final void a() {
        this.a.set(false);
        this.c.a.removeCallbacks(new tbj(this));
    }
}
