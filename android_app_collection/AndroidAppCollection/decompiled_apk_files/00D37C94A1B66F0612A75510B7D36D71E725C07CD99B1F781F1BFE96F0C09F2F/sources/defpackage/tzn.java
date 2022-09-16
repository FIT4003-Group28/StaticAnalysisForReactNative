package defpackage;

import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: tzn  reason: default package */
/* loaded from: classes4.dex */
public final class tzn implements vke {
    public final AtomicLong a = new AtomicLong();
    final /* synthetic */ tzo b;
    public final aaek c;
    private final String d;

    public tzn(tzo tzoVar, String str, aaek aaekVar) {
        this.b = tzoVar;
        this.d = str;
        this.c = aaekVar;
    }

    @Override // defpackage.vke
    public final void a(int i) {
        this.a.getAndAdd(i);
        this.a.get();
        int i2 = typ.a;
    }

    @Override // defpackage.vke
    public final void b() {
        synchronized (tzo.class) {
            if (this.b.d.containsKey(this.d)) {
                this.b.b.execute(new Runnable() { // from class: tzm
                    @Override // java.lang.Runnable
                    public final void run() {
                        tzn.this.a.get();
                    }
                });
            }
        }
    }
}
