package defpackage;

import androidx.preference.Preference;
/* compiled from: PG */
/* renamed from: btjx  reason: default package */
/* loaded from: classes4.dex */
final class btjx implements aub {
    final /* synthetic */ btjy a;

    public btjx(btjy btjyVar) {
        this.a = btjyVar;
    }

    @Override // defpackage.aub
    public final boolean a(Preference preference, Object obj) {
        final boolean booleanValue = ((Boolean) obj).booleanValue();
        btlu j = this.a.d.j();
        int i = 2;
        if (dfqg.a(this.a.a.t(bvjk.hM, j, 0)) == 2) {
            this.a.a.T(bvjk.hL, j, !booleanValue);
            this.a.b.b();
            if (this.a.e.e()) {
                if (this.a.f.a()) {
                    btjy.g(new Runnable(this, booleanValue) { // from class: btjv
                        private final btjx a;
                        private final boolean b;

                        {
                            this.a = this;
                            this.b = booleanValue;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.a.f.b().a(btjy.h(this.b));
                        }
                    });
                } else {
                    btjy.g(new Runnable(this, booleanValue) { // from class: btjw
                        private final btjx a;
                        private final boolean b;

                        {
                            this.a = this;
                            this.b = booleanValue;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.a.e.N(btjy.h(this.b));
                        }
                    });
                }
            }
        } else {
            bvjj bvjjVar = this.a.a;
            if (true == booleanValue) {
                i = 3;
            }
            bvjjVar.X(bvjk.hM, j, i);
            this.a.a.T(bvjk.hL, j, !booleanValue);
            this.a.b.b();
        }
        return true;
    }
}
