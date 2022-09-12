package defpackage;

import android.text.SpannableStringBuilder;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: axpt  reason: default package */
/* loaded from: classes3.dex */
public class axpt implements axop {
    public final dzsj<gga> a;
    private final axhs b;
    private final Executor c;
    private final cklf d;
    private final String e;
    private final dfqc f;
    private final dqar g;
    private final Runnable h;

    public axpt(dzsj<gga> dzsjVar, axhs axhsVar, Executor executor, cklf cklfVar, String str, dfqc dfqcVar, dqar dqarVar, Runnable runnable) {
        this.a = dzsjVar;
        this.b = axhsVar;
        this.c = executor;
        this.d = cklfVar;
        this.e = str;
        this.f = dfqcVar;
        this.g = dqarVar;
        this.h = runnable;
    }

    @Override // defpackage.axop
    public jic a() {
        String str = this.g.a;
        return new jic(str, jfv.a(str), R.drawable.generic_image_placeholder);
    }

    @Override // defpackage.axop
    public String b() {
        return this.g.b;
    }

    @Override // defpackage.axop
    public CharSequence c() {
        dnoj dnojVar = this.g.c;
        if (dnojVar == null) {
            dnojVar = dnoj.d;
        }
        dnpq dnpqVar = dnojVar.b;
        if (dnpqVar == null) {
            dnpqVar = dnpq.g;
        }
        String str = dnpqVar.d;
        SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) dnojVar.a).append((CharSequence) str).append((CharSequence) dnojVar.c);
        int indexOf = append.toString().indexOf(str);
        int length = str.length() + indexOf;
        cklf cklfVar = this.d;
        dnpq dnpqVar2 = dnojVar.b;
        if (dnpqVar2 == null) {
            dnpqVar2 = dnpq.g;
        }
        append.setSpan(cklfVar.e(dnpqVar2.f), indexOf, length, 33);
        return append;
    }

    @Override // defpackage.axop
    public cqkl d() {
        cklf cklfVar = this.d;
        dnoj dnojVar = this.g.c;
        if (dnojVar == null) {
            dnojVar = dnoj.d;
        }
        dnpq dnpqVar = dnojVar.b;
        if (dnpqVar == null) {
            dnpqVar = dnpq.g;
        }
        cklfVar.a(dnpqVar.f);
        return cqkl.a;
    }

    @Override // defpackage.axop
    public cqkl e() {
        deha.q(this.b.d(this.e, this.f), new axps(this), this.c);
        this.h.run();
        return cqkl.a;
    }

    @Override // defpackage.axop
    public cqkl f() {
        this.h.run();
        return cqkl.a;
    }

    @Override // defpackage.axop
    public cjtd g() {
        return cjtd.a(dtxy.w);
    }

    @Override // defpackage.axop
    public cjtd h() {
        return cjtd.a(dtxy.x);
    }

    @Override // defpackage.axop
    public cjtd i() {
        return cjtd.a(dtxy.z);
    }
}
