package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: avuh  reason: default package */
/* loaded from: classes3.dex */
public class avuh implements avue {
    public final ff a;
    public final ges b;
    @dzsi
    public final alad c;
    @dzsi
    public final String d;
    public final dxio<avik> e;
    private final akfc f;
    private final jbk g;

    public avuh(ff ffVar, ges gesVar, akfc akfcVar, @dzsi alad aladVar, @dzsi String str, dxio<avik> dxioVar) {
        this.a = ffVar;
        this.b = gesVar;
        this.f = akfcVar;
        this.c = aladVar;
        this.d = str;
        this.e = dxioVar;
        jhz a = jhz.a();
        a.a = ffVar.getString(R.string.OFFLINE_SIGN_IN_TITLE);
        a.f(new jmn(avua.class));
        final jib b = a.b();
        this.g = new jbk(b) { // from class: avuf
            private final jib a;

            {
                this.a = b;
            }

            @Override // defpackage.jbk
            public jib NC() {
                return this.a;
            }
        };
    }

    @Override // defpackage.avue
    public jbk a() {
        return this.g;
    }

    @Override // defpackage.avue
    public cqkl b() {
        if (!this.b.aD) {
            return cqkl.a;
        }
        this.f.k(new avug(this), null);
        return cqkl.a;
    }
}
