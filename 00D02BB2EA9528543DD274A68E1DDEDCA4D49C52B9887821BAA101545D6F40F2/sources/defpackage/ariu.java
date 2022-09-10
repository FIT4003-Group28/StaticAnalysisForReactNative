package defpackage;

import com.google.android.apps.maps.R;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ariu  reason: default package */
/* loaded from: classes2.dex */
public class ariu implements arjf {
    private final dvcl a;
    private final int b;
    private final dvcn c;
    private final jic d;

    public ariu(dvcl dvclVar, int i) {
        this.a = dvclVar;
        this.b = i;
        dvcn dvcnVar = dvclVar.f.get(i);
        this.c = dvcnVar;
        this.d = new jic(dvcnVar.a, ckqc.FULLY_QUALIFIED, R.drawable.ic_blank_replacement);
    }

    @Override // defpackage.arjf
    public jic a() {
        return this.d;
    }

    @Override // defpackage.arjf
    public CharSequence b() {
        return this.c.b;
    }

    public boolean equals(@dzsi Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ariu)) {
            return false;
        }
        ariu ariuVar = (ariu) obj;
        return dbsd.a(this.a.bR(), ariuVar.a.bR()) && dbsd.a(Integer.valueOf(this.b), Integer.valueOf(ariuVar.b));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a.bR(), Integer.valueOf(this.b)});
    }
}
