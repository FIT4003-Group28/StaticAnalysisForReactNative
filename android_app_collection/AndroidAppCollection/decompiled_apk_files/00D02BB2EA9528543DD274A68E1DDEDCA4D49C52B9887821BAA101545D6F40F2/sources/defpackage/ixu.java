package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ixu  reason: default package */
/* loaded from: classes6.dex */
public class ixu implements jbe {
    private static final ddho a = dtya.dS;
    private final Context b;
    private final String c;
    private final bwft d;
    private final ckcw e;
    private final String f;
    private final String g;
    private final String h;
    private final boolean i;

    public ixu(cdjd cdjdVar, String str, boolean z, ff ffVar, bwft bwftVar, ckcw ckcwVar) {
        this.f = (String) cdjdVar.a().b().h(ixs.a).c("");
        this.g = cdjdVar.b().c().c("");
        this.i = z;
        this.h = cdjdVar.a().h().c("");
        this.c = str;
        this.b = ffVar;
        this.d = bwftVar;
        this.e = ckcwVar;
    }

    public ixu(dtol dtolVar, ff ffVar, bwft bwftVar, ckcw ckcwVar) {
        this.f = dtolVar.c;
        this.g = dtolVar.j;
        this.i = dtolVar.d;
        this.c = dtolVar.i;
        this.h = dtolVar.n;
        this.b = ffVar;
        this.d = bwftVar;
        this.e = ckcwVar;
    }

    public static ckco c(ckcw ckcwVar, boolean z) {
        ckgz ckgzVar;
        if (z) {
            ckgzVar = ckjn.a;
        } else {
            ckgzVar = ckjn.b;
        }
        return (ckco) ckcwVar.a(ckgzVar);
    }

    @Override // defpackage.jbe
    public Boolean a() {
        return Boolean.valueOf(!this.g.isEmpty());
    }

    @Override // defpackage.jbe
    public cqkl b() {
        ixt ixtVar = new ixt(this.i);
        c(this.e, this.i).a(ckjm.a(1));
        this.d.d(this.c, this.g, this.h, a, ixtVar);
        return cqkl.a;
    }

    @Override // defpackage.jbe
    @dzsi
    public cjtd d() {
        cjta b = cjtd.b();
        b.g(this.h);
        b.d = a;
        return b.a();
    }

    @Override // defpackage.jbe
    public String e() {
        return this.b.getString(R.string.SHARE_REVIEW_CONTENT_DESCRIPTION, this.c, this.f);
    }

    public boolean equals(@dzsi Object obj) {
        if (!(obj instanceof ixu)) {
            return false;
        }
        return this.g.equals(((ixu) obj).g);
    }

    @Override // defpackage.jbe
    public String f() {
        return this.b.getString(R.string.SHARE_REVIEW_BUTTON_TEXT);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.g});
    }
}
