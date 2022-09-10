package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: booa  reason: default package */
/* loaded from: classes3.dex */
public class booa implements boqg {
    private final cklf a;
    private final ff b;
    private CharSequence c;

    public booa(ff ffVar, cklf cklfVar) {
        this.b = ffVar;
        this.a = cklfVar;
    }

    @Override // defpackage.boqg
    public CharSequence a() {
        if (this.c == null) {
            bvsx bvsxVar = new bvsx(this.b.getResources());
            bvsu c = bvsxVar.c(R.string.LEGAL_DISCLAIMER);
            bvsv a = bvsxVar.a(this.b.getString(R.string.LEARN_MORE));
            a.l(ibm.x().b(this.b));
            c.a(a);
            this.c = c.c();
        }
        CharSequence charSequence = this.c;
        dbsk.s(charSequence);
        return charSequence;
    }

    @Override // defpackage.boqg
    public cqkl b() {
        this.a.a("android_rap");
        return cqkl.a;
    }
}
