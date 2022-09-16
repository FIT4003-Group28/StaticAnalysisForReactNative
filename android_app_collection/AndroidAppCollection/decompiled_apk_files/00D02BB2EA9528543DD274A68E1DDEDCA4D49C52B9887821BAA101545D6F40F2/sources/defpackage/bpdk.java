package defpackage;

import android.content.Context;
import android.text.format.DateFormat;
import android.widget.CompoundButton;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bpdk  reason: default package */
/* loaded from: classes3.dex */
public class bpdk implements bpvw {
    public final boxe a;
    private final bpdi b;
    private final cztz c;
    private final bptc d;
    private final Context e;

    public bpdk(bpdi bpdiVar, boxe boxeVar, cqhn cqhnVar, cztz cztzVar, bptc bptcVar) {
        this.b = bpdiVar;
        this.a = new boxe(boxeVar.b, boxeVar.c, boxeVar.d);
        this.c = cztzVar;
        this.d = bptcVar;
        this.e = bpdiVar.J();
    }

    @Override // defpackage.bpvw
    public Boolean a() {
        return Boolean.valueOf(DateFormat.is24HourFormat(this.e));
    }

    @Override // defpackage.bpvw
    public Boolean b() {
        return Boolean.valueOf(this.a.b);
    }

    @Override // defpackage.bpvw
    public CompoundButton.OnCheckedChangeListener c() {
        return new CompoundButton.OnCheckedChangeListener(this) { // from class: bpdj
            private final bpdk a;

            {
                this.a = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                bpdk bpdkVar = this.a;
                bpdkVar.a.b = z;
                cqkx.p(bpdkVar);
            }
        };
    }

    @Override // defpackage.bpvw
    public CharSequence d() {
        return bpve.a(this.e, this.a.c.a);
    }

    @Override // defpackage.bpvw
    public CharSequence e() {
        return bpve.b(this.e, this.a.c.a);
    }

    @Override // defpackage.bpvw
    public CharSequence f() {
        return bpve.a(this.e, this.a.d.a);
    }

    @Override // defpackage.bpvw
    public CharSequence g() {
        return bpve.b(this.e, this.a.d.a);
    }

    @Override // defpackage.bpvw
    public cqkl h() {
        this.d.a(this, this.a, true);
        return cqkl.a;
    }

    @Override // defpackage.bpvw
    public cqkl i() {
        this.d.b(this, this.a, true);
        return cqkl.a;
    }

    @Override // defpackage.bpvw
    public cqkl j() {
        this.d.a(this, this.a, false);
        return cqkl.a;
    }

    @Override // defpackage.bpvw
    public cqkl k() {
        this.d.b(this, this.a, false);
        return cqkl.a;
    }

    @Override // defpackage.bpvw
    public cqkl l() {
        this.b.aT();
        return cqkl.a;
    }

    @Override // defpackage.bpvw
    public cqkl m() {
        boxe boxeVar = this.a;
        boolean z = boxeVar.b;
        eaol eaolVar = boxeVar.c;
        eaol eaolVar2 = boxeVar.d;
        if (!z) {
            if (eaolVar2.w(eaol.a()) && eaolVar2.w(eaolVar)) {
                this.b.Ra(bpdh.d(false, eaolVar, eaolVar2));
            }
            cztq a = cztt.a(this.c);
            a.e(R.string.ROAD_CLOSED_SCHEDULE_INVALID, new Object[0]);
            a.c();
        } else {
            if (eaolVar2.w(eaol.a())) {
                this.b.Ra(bpdh.d(true, eaol.a(), eaolVar2));
            }
            cztq a2 = cztt.a(this.c);
            a2.e(R.string.ROAD_CLOSED_SCHEDULE_INVALID, new Object[0]);
            a2.c();
        }
        return cqkl.a;
    }
}
