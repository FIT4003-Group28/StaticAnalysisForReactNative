package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cbcd  reason: default package */
/* loaded from: classes4.dex */
public class cbcd implements cbrc {
    @dzsi
    ilo a;
    private final cbcl c;
    private final ff d;
    public boolean b = false;
    private boolean e = false;

    public cbcd(cbcl cbclVar, @dzsi ilo iloVar, cqhn cqhnVar, ff ffVar) {
        this.c = cbclVar;
        this.a = iloVar;
        this.d = ffVar;
    }

    @Override // defpackage.cbrc
    public Boolean a() {
        boolean z = false;
        if (this.a != null && this.b) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cbrc
    public Boolean b() {
        return Boolean.valueOf(this.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(boolean z) {
        this.e = z;
        cqkx.p(this);
    }

    @Override // defpackage.cbrc
    public String d() {
        ilo iloVar = this.a;
        if (iloVar == null) {
            return "";
        }
        String n = iloVar.n();
        return (!cbqf.b(this.a) || dbsj.d(n)) ? this.d.getString(R.string.UGC_EVENTS_LATLNG_DROPPED_PIN_TEXT) : n;
    }

    @Override // defpackage.cbrc
    public Boolean e() {
        boolean z = false;
        if (this.a != null && !this.b && !this.e) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cbrc
    public cqkl f() {
        this.c.Nw(this.a);
        return cqkl.a;
    }

    @Override // defpackage.cbrc
    public cjtd g() {
        return cjtd.a(dtyd.g);
    }
}
