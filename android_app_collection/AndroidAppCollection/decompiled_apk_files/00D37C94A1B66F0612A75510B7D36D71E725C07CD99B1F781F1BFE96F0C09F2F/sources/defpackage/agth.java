package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: agth  reason: default package */
/* loaded from: classes.dex */
final class agth implements ankb {
    private final agpt a;
    private final String b;
    private final int c;

    public agth(agpt agptVar, String str, int i) {
        this.b = str;
        this.a = agptVar;
        this.c = i;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
    }

    @Override // defpackage.ankb
    public final void b(Object obj) {
        this.a.e(TextUtils.isEmpty(this.b) ? amon.a : ampq.j(this.b), this.c, 2);
    }
}
