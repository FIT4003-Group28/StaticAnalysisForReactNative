package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bvig  reason: default package */
/* loaded from: classes4.dex */
final class bvig implements ckqf {
    public final bvij a;
    public boolean b = false;
    private final dehq c;

    public bvig(bvij bvijVar, dehq dehqVar) {
        this.a = bvijVar;
        this.c = dehqVar;
    }

    @Override // defpackage.ckqf
    public final void a(ckqg ckqgVar) {
        this.c.execute(new Runnable(this) { // from class: bvid
            private final bvig a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bvig bvigVar = this.a;
                bvigVar.b = false;
                bvigVar.a.a();
            }
        });
    }

    @Override // defpackage.ckqf
    public final void b(ckqg ckqgVar) {
    }

    @Override // defpackage.ckqf
    public final void c(final ckqg ckqgVar) {
        this.c.execute(new Runnable(this, ckqgVar) { // from class: bvif
            private final bvig a;
            private final ckqg b;

            {
                this.a = this;
                this.b = ckqgVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bvig bvigVar = this.a;
                ckqg ckqgVar2 = this.b;
                bvigVar.b = false;
                bvigVar.a.a();
                ckqgVar2.setImageResource(R.drawable.guide_no_image_blue);
            }
        });
    }

    @Override // defpackage.ckqf
    public final void d(ckqg ckqgVar) {
        this.c.execute(new Runnable(this) { // from class: bvie
            private final bvig a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bvig bvigVar = this.a;
                bvigVar.b = true;
                bvigVar.a.a();
            }
        });
    }
}
