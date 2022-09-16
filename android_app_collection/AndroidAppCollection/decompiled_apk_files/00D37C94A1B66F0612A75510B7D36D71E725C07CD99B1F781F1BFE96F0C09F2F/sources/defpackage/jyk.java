package defpackage;

import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jyk  reason: default package */
/* loaded from: classes3.dex */
public final class jyk {
    public final dt a;
    public final jxt b;
    public final jyj c;
    public boolean d;

    public jyk(dt dtVar, jyj jyjVar) {
        dtVar.getClass();
        this.a = dtVar;
        this.c = jyjVar;
        jxt jxtVar = new jxt(dtVar.getString(R.string.playback_rate_title), new jyi(this));
        this.b = jxtVar;
        jxtVar.e = zag.f(dtVar, 2131233459, R.attr.ytTextPrimary);
    }

    public final void a(avwa[] avwaVarArr, int i) {
        this.c.b(avwaVarArr, i);
        String str = null;
        if (avwaVarArr != null && i >= 0 && i < avwaVarArr.length) {
            str = ntr.n(avwaVarArr[i]);
        }
        this.b.d(str);
    }

    public final void b(boolean z) {
        this.b.g(z);
    }
}
