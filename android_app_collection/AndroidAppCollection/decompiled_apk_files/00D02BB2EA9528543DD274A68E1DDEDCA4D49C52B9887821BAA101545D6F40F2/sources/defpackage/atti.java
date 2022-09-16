package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: atti  reason: default package */
/* loaded from: classes2.dex */
public class atti implements atxr {
    private final cqsn a;
    @dzsi
    private final String b;
    private boolean c;
    @dzsi
    private cqtd d;

    public atti(btvo btvoVar, int i, @dzsi String str, @dzsi cqtd cqtdVar, boolean z, boolean z2) {
        this(btvoVar, (cqsn) cqrt.l(R.string.MIDTRIP_UGC_COOLDOWN_HEADER_TEXT), str, cqtdVar, true, z2);
    }

    public atti(btvo btvoVar, cqsn cqsnVar, @dzsi String str, @dzsi cqtd cqtdVar, boolean z, boolean z2) {
        this.a = cqsnVar;
        this.b = str;
        this.d = cqtdVar;
        this.c = true;
    }

    @Override // defpackage.atxr
    public cqsn a() {
        return this.a;
    }

    @Override // defpackage.atxr
    public cqss b() {
        return iva.b(ibl.d(), ibl.n());
    }

    @Override // defpackage.atxr
    @dzsi
    public String c() {
        return this.b;
    }

    @Override // defpackage.atxr
    public cqss d() {
        return iva.b(ibl.b(), ibl.d());
    }

    @Override // defpackage.atxr
    public Boolean e() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.atxr
    public Boolean f() {
        return false;
    }

    @Override // defpackage.atxr
    public cqtd g() {
        cqtd cqtdVar = this.d;
        return cqtdVar == null ? cqtt.c() : cqtdVar;
    }
}
