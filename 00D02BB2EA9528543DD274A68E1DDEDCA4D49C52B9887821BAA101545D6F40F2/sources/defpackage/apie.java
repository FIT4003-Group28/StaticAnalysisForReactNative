package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: apie  reason: default package */
/* loaded from: classes2.dex */
public class apie implements aphp {
    private final String a;
    private final jic b;
    private final gga c;
    private final bwqv d;
    private final bwrs<aoyg> e;
    @dzsi
    private final ddho f;
    @dzsi
    private final CharSequence g;
    private final cqtd h;

    public apie(String str, @dzsi CharSequence charSequence, String str2, int i, gga ggaVar, bwqv bwqvVar, bwrs<aoyg> bwrsVar, @dzsi ddho ddhoVar) {
        this.a = str;
        this.g = charSequence;
        this.h = cqrt.g(i, ibm.x());
        this.b = new jic(str2, ckqc.FULLY_QUALIFIED, cqrt.f(R.color.qu_grey_200), 250);
        this.c = ggaVar;
        this.d = bwqvVar;
        this.e = bwrsVar;
        this.f = ddhoVar;
    }

    @Override // defpackage.aphp
    public String a() {
        return this.a;
    }

    @Override // defpackage.aphp
    @dzsi
    public CharSequence b() {
        return this.g;
    }

    @Override // defpackage.aphp
    public jic c() {
        return this.b;
    }

    @Override // defpackage.aphp
    public cqtd d() {
        return this.h;
    }

    @Override // defpackage.aphp
    public cqkl e() {
        this.c.D(apdh.g(this.d, this.e));
        return cqkl.a;
    }

    @Override // defpackage.aphp
    @dzsi
    public cjtd f() {
        ddho ddhoVar = this.f;
        if (ddhoVar == null) {
            return null;
        }
        return cjtd.a(ddhoVar);
    }
}
