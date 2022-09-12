package defpackage;

import android.widget.CompoundButton;
import java.util.List;
/* compiled from: PG */
/* renamed from: bpic  reason: default package */
/* loaded from: classes3.dex */
class bpic implements bpws {
    private final ges a;
    private final boxa b;
    private final boxj c;

    public bpic(ges gesVar, boxa boxaVar, boxj boxjVar) {
        this.a = gesVar;
        this.b = boxaVar;
        this.c = boxjVar;
    }

    @Override // defpackage.bpws
    public CompoundButton.OnCheckedChangeListener a() {
        return new CompoundButton.OnCheckedChangeListener(this) { // from class: bpib
            private final bpic a;

            {
                this.a = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                bpic bpicVar = this.a;
                boolean equals = Boolean.TRUE.equals(Boolean.valueOf(z));
                bpicVar.f(equals, equals);
            }
        };
    }

    @Override // defpackage.bpws
    public cqkl b() {
        boolean equals = Boolean.TRUE.equals(this.c.c);
        f(!equals, equals);
        return cqkl.a;
    }

    @Override // defpackage.bpws
    public Boolean c() {
        return this.c.c;
    }

    @Override // defpackage.bpws
    public Boolean d() {
        return this.c.a;
    }

    public void e(dodb dodbVar) {
        boxj boxjVar = this.c;
        int indexOf = boxjVar.b().indexOf(dodbVar);
        boxjVar.d = indexOf;
        boxjVar.c = Boolean.valueOf(indexOf >= 0);
        cqkx.p(this);
    }

    public final void f(boolean z, boolean z2) {
        boolean equals = Boolean.TRUE.equals(this.c.c);
        if (equals == z) {
            if (equals == z2) {
                return;
            }
            cqkx.p(this);
        } else if (!z) {
            e(dodb.d);
        } else {
            List<dodb> b = this.c.b();
            dbsk.l(!b.isEmpty());
            if (b.size() == 1) {
                e((dodb) dcft.c(b));
                return;
            }
            if (z2) {
                this.c.c = true;
                cqkx.p(this);
            }
            this.b.l(b, this.a);
        }
    }
}
