package defpackage;

import android.os.Bundle;
import android.widget.Toast;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: atbz  reason: default package */
/* loaded from: classes2.dex */
public final class atbz extends atcy {
    static final long a = TimeUnit.MINUTES.toSeconds(10);
    private boolean c;
    private boolean d;
    private final btrm e;
    private final asme f;
    private final atcb g;
    private boolean h;
    private int i;
    private cray j;
    private final boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atbz(atcu atcuVar, atcw atcwVar, btrm btrmVar, asme asmeVar, atls atlsVar, atcb atcbVar) {
        super(atcuVar, atcwVar);
        boolean z = atlsVar.c;
        boolean z2 = atlsVar.d;
        this.e = btrmVar;
        this.f = asmeVar;
        this.k = z;
        this.d = z2;
        this.g = atcbVar;
    }

    @Override // defpackage.atcy, defpackage.asmo
    public final void NZ(@dzsi Bundle bundle) {
        if (bundle != null) {
            this.c = bundle.getBoolean("RNDC_hatsd");
            this.d = bundle.getBoolean("RNDC_usro");
        }
    }

    @Override // defpackage.atcv
    public final void Oc(atlq atlqVar, @dzsi atlq atlqVar2) {
        crqf crqfVar = atlqVar.m;
        if (crqfVar == null) {
            return;
        }
        cray g = crqfVar.g();
        this.j = g;
        if (!this.d) {
            this.d = true;
            atcb atcbVar = this.g;
            atca atcaVar = new atca(atcbVar.a, g.a);
            if (atcaVar.b) {
                atcbVar.b.g().d(cjtd.a(dtxw.aJ));
            } else if (atcaVar.c) {
                atcbVar.b.g().d(cjtd.a(dtxw.bB));
            }
            if (!dbsj.d(atcaVar.a)) {
                Toast.makeText(atcbVar.a, atcaVar.a, 1).show();
            }
        }
        if (this.h) {
            return;
        }
        this.h = true;
        this.i = this.j.b();
        this.f.a();
        if (this.c || this.k) {
            return;
        }
        cray crayVar = this.j;
        dbsk.s(crayVar);
        if (!crayVar.a.an() || this.i < a) {
            return;
        }
        this.e.b(new bznv());
    }

    @Override // defpackage.atcy, defpackage.asmo
    public final void Qr(Bundle bundle) {
        bundle.putBoolean("RNDC_hatsd", true);
        bundle.putBoolean("RNDC_usro", this.d);
    }

    @Override // defpackage.atcy, defpackage.asmo
    public final void b() {
        this.h = false;
    }

    @Override // defpackage.atcy, defpackage.asmo
    public final void c() {
        this.c = true;
    }
}
