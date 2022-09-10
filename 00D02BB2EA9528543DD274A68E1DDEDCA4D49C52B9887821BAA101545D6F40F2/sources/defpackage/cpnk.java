package defpackage;

import android.content.Context;
import android.widget.RadioGroup;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: cpnk  reason: default package */
/* loaded from: classes5.dex */
public final class cpnk extends cpnu {
    public Context a;
    public String b;
    public cpnm c;
    public TextView d;
    public RadioGroup e;
    public dhab f;
    public String g;
    private dccx<cpnn> h;
    private dcdc<cpnn> i;

    @Override // defpackage.cpnu
    public final dccx<cpnn> a() {
        if (this.h == null) {
            this.h = dcdc.F();
        }
        return this.h;
    }

    @Override // defpackage.cpnu
    public final cpnv b() {
        dccx<cpnn> dccxVar = this.h;
        if (dccxVar != null) {
            this.i = dccxVar.f();
        } else if (this.i == null) {
            this.i = dcdc.e();
        }
        String str = this.a == null ? " context" : "";
        if (this.b == null) {
            str = str.concat(" feedbackLoopId");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" feedbackController");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" feedbackMessage");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" feedbackSuggestions");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" addressLanguage");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cpnl(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.i);
    }
}
