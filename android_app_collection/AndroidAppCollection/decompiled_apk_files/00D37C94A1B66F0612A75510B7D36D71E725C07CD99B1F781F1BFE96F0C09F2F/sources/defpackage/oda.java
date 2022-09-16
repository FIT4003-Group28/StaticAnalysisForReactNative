package defpackage;

import android.text.TextUtils;
import java.util.Map;
/* compiled from: PG */
/* renamed from: oda  reason: default package */
/* loaded from: classes3.dex */
public final class oda implements akmh {
    public final aafo a;
    public String b;
    public Map c;
    private final ces d;
    private String e;

    public oda(aafo aafoVar, ces cesVar) {
        this.a = aafoVar;
        this.d = cesVar;
    }

    public final void a() {
        if (!TextUtils.isEmpty(this.e)) {
            this.d.e(this.e);
            this.e = null;
        }
    }

    @Override // defpackage.akmh
    public final void b(String str) {
        if (TextUtils.equals(this.b, str)) {
            this.b = null;
        }
    }

    @Override // defpackage.akmh
    public final void c(String str, String str2) {
        if (TextUtils.equals(this.b, str)) {
            a();
            this.e = str2;
        }
    }
}
