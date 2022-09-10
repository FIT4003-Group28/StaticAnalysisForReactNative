package defpackage;

import android.text.style.ClickableSpan;
import android.util.Pair;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bflk  reason: default package */
/* loaded from: classes3.dex */
public class bflk implements bflj {
    private final bfli a;
    private final bvsx b;
    private final gga c;
    private final String d;
    private final cjtd e;
    private final bflm f;
    private CharSequence g = "";
    @dzsi
    private ilo h;

    public bflk(bfli bfliVar, bvsx bvsxVar, gga ggaVar, String str, cjtd cjtdVar, bflm bflmVar) {
        this.a = bfliVar;
        this.b = bvsxVar;
        this.c = ggaVar;
        this.d = str;
        this.e = cjtdVar;
        this.f = bflmVar;
    }

    @Override // defpackage.bflj
    public CharSequence a() {
        return b().booleanValue() ? this.g : "";
    }

    @Override // defpackage.bflj
    public Boolean b() {
        return Boolean.valueOf(!dbsj.d(this.g.toString()));
    }

    @Override // defpackage.bflj
    public cjtd c() {
        return this.e;
    }

    @Override // defpackage.bflj
    public cqkl d() {
        ilo iloVar = this.h;
        if (iloVar != null) {
            bfli bfliVar = this.a;
            List<dwcg> b = bfli.b(iloVar);
            if (!b.isEmpty()) {
                bfliVar.a(b);
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.bflj
    public String e() {
        return this.c.getString(R.string.ACCESSIBILITY_PLACE_DEPARTMENTS);
    }

    public void f(ilo iloVar, boolean z) {
        bvsv a;
        this.h = iloVar;
        List<Pair<String, ClickableSpan>> a2 = this.f.a(iloVar);
        CharSequence charSequence = "";
        if (z) {
            a = this.b.a(this.d);
            a.g(" ");
        } else {
            a = this.b.a(charSequence);
        }
        for (int i = 0; i < a2.size(); i++) {
            if (i > 0) {
                a.g(", ");
            }
            bvsv a3 = this.b.a(a2.get(i).first);
            a3.k((ClickableSpan) a2.get(i).second);
            a.f(a3);
        }
        if (!a2.isEmpty()) {
            charSequence = a.c();
        }
        this.g = charSequence;
    }

    public void g() {
        this.h = null;
        this.g = "";
    }
}
