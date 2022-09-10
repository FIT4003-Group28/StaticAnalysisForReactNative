package defpackage;

import android.graphics.Bitmap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bwuq  reason: default package */
/* loaded from: classes4.dex */
public final class bwuq extends ckqk {
    public final ckcq a;
    public final String b;
    public final bwur c;
    final /* synthetic */ bwus d;

    public bwuq(bwus bwusVar, String str, ckcq ckcqVar, bwur bwurVar) {
        this.d = bwusVar;
        this.a = ckcqVar;
        this.b = str;
        this.c = bwurVar;
    }

    @Override // defpackage.ckqk
    public final void a(Bitmap bitmap) {
        this.d.b.b(new bwup(this, bitmap), bvrj.BACKGROUND_THREADPOOL);
    }

    @Override // defpackage.ckqk
    public final void b() {
        ((ckcn) this.d.a.c.a(ckkd.d)).a();
        this.d.b.b(new Runnable(this) { // from class: bwuo
            private final bwuq a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bwuq bwuqVar = this.a;
                bwuqVar.d.b(bwuqVar.b);
            }
        }, bvrj.UI_THREAD);
    }
}
