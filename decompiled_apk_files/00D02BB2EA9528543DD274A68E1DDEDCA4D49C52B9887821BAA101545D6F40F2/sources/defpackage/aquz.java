package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: aquz  reason: default package */
/* loaded from: classes2.dex */
abstract class aquz implements aquu {
    private final String a;
    private final String b;
    private final View.OnClickListener c;
    @dzsi
    private final cjtd d;
    private boolean e = true;

    public aquz(String str, String str2, View.OnClickListener onClickListener, @dzsi cjtd cjtdVar) {
        this.a = str;
        this.b = str2;
        this.c = onClickListener;
        this.d = cjtdVar;
    }

    @Override // defpackage.aquu
    @dzsi
    public View.OnClickListener a() {
        if (this.e) {
            return this.c;
        }
        return null;
    }

    @Override // defpackage.aquu
    public String b() {
        return this.a;
    }

    @Override // defpackage.aquu
    public String c() {
        return this.b;
    }

    @Override // defpackage.aquu
    @dzsi
    public cjtd e() {
        return this.d;
    }

    @Override // defpackage.aquu
    public Boolean f() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.aquu
    public void g(boolean z) {
        this.e = z;
    }
}
