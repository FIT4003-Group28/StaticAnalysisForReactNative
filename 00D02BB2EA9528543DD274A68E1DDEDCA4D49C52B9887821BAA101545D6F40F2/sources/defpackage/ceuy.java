package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: ceuy  reason: default package */
/* loaded from: classes4.dex */
public class ceuy implements cetj {
    private final Activity a;
    private final ceuz b;
    private boolean c;

    public ceuy(Activity activity, ceuz ceuzVar, boolean z) {
        this.a = activity;
        this.b = ceuzVar;
        this.c = z;
    }

    @Override // defpackage.jad
    public Boolean a() {
        return true;
    }

    @Override // defpackage.cetj
    public Boolean b() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.jad
    public cqkl c() {
        this.b.h();
        return cqkl.a;
    }

    @Override // defpackage.jad
    public cjtd d() {
        return cjtd.a(dtxl.fD);
    }

    @Override // defpackage.jad
    public CharSequence e() {
        return String.format(Locale.US, " %s ", this.a.getString(R.string.CLEAR_TOPIC_FILTERING_LABEL));
    }

    @Override // defpackage.jad
    public CharSequence f() {
        return "";
    }

    @Override // defpackage.jad
    public cqkl g(cjqm cjqmVar) {
        return jac.b(this);
    }

    @Override // defpackage.jad
    public Boolean h() {
        return jac.a();
    }

    @Override // defpackage.jad
    public cqtd i() {
        return null;
    }

    public void j(Boolean bool) {
        this.c = bool.booleanValue();
    }
}
