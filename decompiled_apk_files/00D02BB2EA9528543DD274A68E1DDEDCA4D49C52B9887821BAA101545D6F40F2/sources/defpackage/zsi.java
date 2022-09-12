package defpackage;

import android.content.Context;
import android.text.Spanned;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zsi  reason: default package */
/* loaded from: classes7.dex */
public class zsi implements zfq {
    private final int a;
    private final Context b;
    private final boolean c;
    private final boolean d;
    private final String e;
    @dzsi
    private Spanned f;
    @dzsi
    private final zfc g;

    public zsi(int i, Context context, boolean z, boolean z2, boolean z3, String str, @dzsi Spanned spanned, Spanned spanned2, @dzsi zfc zfcVar, @dzsi doub doubVar, @dzsi doxl doxlVar) {
        this.a = i;
        this.b = context;
        this.d = z2;
        this.c = z3;
        this.e = str;
        this.f = spanned;
        this.g = zfcVar;
    }

    @Override // defpackage.zfq
    @dzsi
    public Spanned a() {
        return this.f;
    }

    @Override // defpackage.zfq
    public Boolean b() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.zfq
    public Boolean c() {
        boolean z = false;
        if (this.c && this.g != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zfq
    public Integer d() {
        return Integer.valueOf(this.a);
    }

    @Override // defpackage.zfq
    @dzsi
    public String e() {
        return this.e;
    }

    @Override // defpackage.zfq
    public cqkl f(cjqm cjqmVar) {
        if (this.g != null) {
            dbsk.m(c().booleanValue(), "Waypoint is not removable.");
            this.g.q(this.a, cjqmVar);
        }
        return cqkl.a;
    }

    @Override // defpackage.zfq
    public String g() {
        return this.b.getString(R.string.ACCESSIBILITY_REMOVE_WAYPOINT, this.e);
    }

    @Override // defpackage.zfq
    @dzsi
    public String h() {
        return null;
    }

    @Override // defpackage.zfq
    public void i(@dzsi doub doubVar) {
    }

    @Override // defpackage.zfq
    public void j(@dzsi Spanned spanned) {
        this.f = spanned;
    }

    @Override // defpackage.zfq
    public void k(Spanned spanned) {
    }
}
