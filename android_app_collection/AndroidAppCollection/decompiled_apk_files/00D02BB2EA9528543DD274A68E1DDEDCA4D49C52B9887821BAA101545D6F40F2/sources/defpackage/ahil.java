package defpackage;

import android.view.View;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahil  reason: default package */
/* loaded from: classes2.dex */
public class ahil implements ahaa {
    @dzsi
    public agxe a;
    final /* synthetic */ ahin b;
    private boolean c;
    private final jco d = new jco(this) { // from class: ahik
        private final ahil a;

        {
            this.a = this;
        }

        @Override // defpackage.jco
        public final void a(int i, boolean z) {
            ahil ahilVar = this.a;
            agyk agykVar = ahilVar.b.k;
            if (agykVar.c) {
                agykVar.bF();
                agykVar.c = false;
            }
            agyp agypVar = (agyp) agykVar.b;
            agyp agypVar2 = agyp.r;
            agypVar.a |= 32;
            agypVar.h = i;
            ahilVar.b.f.g(i, z);
            List<agwu> i2 = ahilVar.i();
            if (!z || i < 0 || i >= i2.size()) {
                return;
            }
            for (View view : cqkx.n(i2.get(i))) {
                if (view.isFocusable()) {
                    ahilVar.b.h.c(view, 8);
                    return;
                }
            }
        }

        @Override // defpackage.jco
        public final void b(int i) {
        }
    };

    public ahil(ahin ahinVar) {
        this.b = ahinVar;
    }

    @Override // defpackage.ahaa
    public Boolean a() {
        return Boolean.valueOf(this.a != null);
    }

    @Override // defpackage.ahaa
    @dzsi
    public CharSequence b() {
        agxe agxeVar = this.a;
        if (agxeVar == null) {
            return null;
        }
        cqix<? extends agxd> c = agxeVar.c();
        agxd b = c == null ? null : c.b();
        if (b != null) {
            return b.a();
        }
        return null;
    }

    @Override // defpackage.ahaa
    @dzsi
    public CharSequence c() {
        agxe agxeVar = this.a;
        if (agxeVar == null) {
            return null;
        }
        return agxeVar.d();
    }

    @Override // defpackage.ahaa
    public cqkl d() {
        this.b.f.d();
        return cqkl.a;
    }

    @Override // defpackage.ahaa
    public void e(int i, boolean z) {
        agyk agykVar = this.b.k;
        if (agykVar.c) {
            agykVar.bF();
            agykVar.c = false;
        }
        agyp agypVar = (agyp) agykVar.b;
        agyp agypVar2 = agyp.r;
        agypVar.a |= 32;
        agypVar.h = i;
        this.c = z;
    }

    @Override // defpackage.ahaa
    public Integer f() {
        return Integer.valueOf(((agyp) this.b.k.b).h);
    }

    @Override // defpackage.ahaa
    public Boolean g() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.ahaa
    public jco h() {
        return this.d;
    }

    @Override // defpackage.ahaa
    public List<agwu> i() {
        agxe agxeVar = this.a;
        if (agxeVar == null) {
            return dcdc.e();
        }
        return agxeVar.g();
    }
}
