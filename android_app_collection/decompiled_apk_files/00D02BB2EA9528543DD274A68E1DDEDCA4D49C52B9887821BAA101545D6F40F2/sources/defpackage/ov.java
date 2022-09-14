package defpackage;

import android.os.Build;
import android.view.View;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ov  reason: default package */
/* loaded from: classes7.dex */
public class ov {
    static final ow c;
    final ow d;

    static {
        op omVar;
        if (Build.VERSION.SDK_INT >= 30) {
            omVar = new oo();
        } else if (Build.VERSION.SDK_INT >= 29) {
            omVar = new on();
        } else {
            omVar = new om();
        }
        c = ol.a(omVar).k().j().h();
    }

    public ov(ow owVar) {
        this.d = owVar;
    }

    public boolean a() {
        return false;
    }

    public kd b() {
        return kd.a;
    }

    public ow c(int i, int i2, int i3, int i4) {
        return c;
    }

    public void d(View view) {
    }

    public void e() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov)) {
            return false;
        }
        ov ovVar = (ov) obj;
        return a() == ovVar.a() && f() == ovVar.f() && Objects.equals(b(), ovVar.b()) && Objects.equals(i(), ovVar.i()) && Objects.equals(j(), ovVar.j());
    }

    public boolean f() {
        return false;
    }

    public ow g() {
        return this.d;
    }

    public ow h() {
        return this.d;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(a()), Boolean.valueOf(f()), b(), i(), j());
    }

    public kd i() {
        return kd.a;
    }

    public ng j() {
        return null;
    }

    public ow k() {
        return this.d;
    }

    public kd l() {
        return b();
    }

    public kd m() {
        return b();
    }
}
